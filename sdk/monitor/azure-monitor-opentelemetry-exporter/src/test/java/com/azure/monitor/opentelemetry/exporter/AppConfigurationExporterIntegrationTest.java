// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.monitor.opentelemetry.exporter;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.data.appconfiguration.ConfigurationClient;
import com.azure.data.appconfiguration.ConfigurationClientBuilder;
import com.azure.data.appconfiguration.models.ConfigurationSetting;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static com.azure.core.util.tracing.Tracer.DISABLE_TRACING_KEY;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppConfigurationExporterIntegrationTest extends AzureMonitorTraceExporterTestBase {

    @Test
    public void setConfigurationTest() throws InterruptedException {
        CountDownLatch appConfigCountDown = new CountDownLatch(1);
        CountDownLatch exporterCountDown = new CountDownLatch(1);

        Tracer tracer = configureAzureMonitorExporter(new ValidationPolicy(exporterCountDown, "AppConfig.setKey"));
        ConfigurationClient client = getConfigurationClient(appConfigCountDown);

        Span span = tracer.spanBuilder("set-config-exporter-testing").startSpan();
        final Scope scope = span.makeCurrent();
        try {
            // Thread bound (sync) calls will automatically pick up the parent span and you don't need to pass it explicitly.
            ConfigurationSetting configurationSetting = client.setConfigurationSetting("hello", "text", "World");
        } finally {
            span.end();
            scope.close();
        }
        assertTrue(appConfigCountDown.await(60, TimeUnit.SECONDS));
        assertTrue(exporterCountDown.await(60, TimeUnit.SECONDS));
    }

    @Disabled("Multiple tests fail to trigger end span - https://github.com/Azure/azure-sdk-for-java/issues/23567")
    @Test
    public void testDisableTracing() throws InterruptedException {
        CountDownLatch appConfigCountDown = new CountDownLatch(1);
        CountDownLatch exporterCountDown = new CountDownLatch(1);

        Tracer tracer = configureAzureMonitorExporter(new ValidationPolicy(exporterCountDown,
                "disable-config-exporter-testing"));
        ConfigurationClient client = getConfigurationClient(appConfigCountDown);

        Span span = tracer.spanBuilder("disable-config-exporter-testing").startSpan();
        final Scope scope = span.makeCurrent();
        try {
            ConfigurationSetting configurationSetting = new ConfigurationSetting()
                .setKey("hello")
                .setLabel("text")
                .setValue("World");
            client.setConfigurationSettingWithResponse(configurationSetting, false,
                Context.NONE.addData(DISABLE_TRACING_KEY, true));
        } finally {
            span.end();
            scope.close();
        }
        assertTrue(appConfigCountDown.await(60, TimeUnit.SECONDS));
        assertTrue(exporterCountDown.await(60, TimeUnit.SECONDS));
    }

    private ConfigurationClient getConfigurationClient(CountDownLatch appConfigCountDown) {
        ConfigurationClient client = new ConfigurationClientBuilder()
            .connectionString(System.getenv("AZURE_APPCONFIG_CONNECTION_STRING"))
            .addPolicy((context, next) -> {
                Optional<Object> data = context.getData(com.azure.core.util.tracing.Tracer.AZ_TRACING_NAMESPACE_KEY);
                if (data.isPresent() && data.get().equals("Microsoft.AppConfiguration")) {
                    appConfigCountDown.countDown();
                }
                return next.process();
            })
            .buildClient();
        return client;
    }

    static class ValidationPolicy implements HttpPipelinePolicy {

        private final CountDownLatch countDown;
        private final String expectedSpanName;

        ValidationPolicy(CountDownLatch countDown, String expectedSpanName) {
            this.countDown = countDown;
            this.expectedSpanName = expectedSpanName;
        }

        @Override
        public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
            Mono<String> asyncString = FluxUtil.collectBytesInByteBufferStream(context.getHttpRequest().getBody())
                    .map(bytes -> new String(bytes, StandardCharsets.UTF_8));
            asyncString.subscribe(value -> {
                if (value.contains(expectedSpanName)) {
                    countDown.countDown();
                }
            });
            return next.process();
        }
    }
}
