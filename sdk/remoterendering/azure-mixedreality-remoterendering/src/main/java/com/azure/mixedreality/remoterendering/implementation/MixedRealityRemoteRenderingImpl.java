// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.mixedreality.remoterendering.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** Initializes a new instance of the MixedRealityRemoteRendering type. */
public final class MixedRealityRemoteRenderingImpl {
    /**
     * The endpoint to use e.g. https://remoterendering.eastus.mixedreality.azure.com. A list can be found at
     * https://docs.microsoft.com/azure/remote-rendering/reference/regions.
     */
    private final String endpoint;

    /**
     * Gets The endpoint to use e.g. https://remoterendering.eastus.mixedreality.azure.com. A list can be found at
     * https://docs.microsoft.com/azure/remote-rendering/reference/regions.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The RemoteRenderingsImpl object to access its operations. */
    private final RemoteRenderingsImpl remoteRenderings;

    /**
     * Gets the RemoteRenderingsImpl object to access its operations.
     *
     * @return the RemoteRenderingsImpl object.
     */
    public RemoteRenderingsImpl getRemoteRenderings() {
        return this.remoteRenderings;
    }

    /**
     * Initializes an instance of MixedRealityRemoteRendering client.
     *
     * @param endpoint The endpoint to use e.g. https://remoterendering.eastus.mixedreality.azure.com. A list can be
     *     found at https://docs.microsoft.com/azure/remote-rendering/reference/regions.
     */
    MixedRealityRemoteRenderingImpl(String endpoint) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                endpoint);
    }

    /**
     * Initializes an instance of MixedRealityRemoteRendering client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint The endpoint to use e.g. https://remoterendering.eastus.mixedreality.azure.com. A list can be
     *     found at https://docs.microsoft.com/azure/remote-rendering/reference/regions.
     */
    MixedRealityRemoteRenderingImpl(HttpPipeline httpPipeline, String endpoint) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint);
    }

    /**
     * Initializes an instance of MixedRealityRemoteRendering client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint The endpoint to use e.g. https://remoterendering.eastus.mixedreality.azure.com. A list can be
     *     found at https://docs.microsoft.com/azure/remote-rendering/reference/regions.
     */
    MixedRealityRemoteRenderingImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.apiVersion = "2021-01-01-preview";
        this.remoteRenderings = new RemoteRenderingsImpl(this);
    }
}
