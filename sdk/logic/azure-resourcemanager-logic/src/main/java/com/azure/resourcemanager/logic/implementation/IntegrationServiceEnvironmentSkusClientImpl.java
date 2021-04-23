// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.fluent.IntegrationServiceEnvironmentSkusClient;
import com.azure.resourcemanager.logic.fluent.models.IntegrationServiceEnvironmentSkuDefinitionInner;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentSkuList;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in IntegrationServiceEnvironmentSkusClient.
 */
public final class IntegrationServiceEnvironmentSkusClientImpl implements IntegrationServiceEnvironmentSkusClient {
    private final ClientLogger logger = new ClientLogger(IntegrationServiceEnvironmentSkusClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final IntegrationServiceEnvironmentSkusService service;

    /** The service client containing this operation class. */
    private final LogicManagementClientImpl client;

    /**
     * Initializes an instance of IntegrationServiceEnvironmentSkusClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    IntegrationServiceEnvironmentSkusClientImpl(LogicManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    IntegrationServiceEnvironmentSkusService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for LogicManagementClientIntegrationServiceEnvironmentSkus to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "LogicManagementClien")
    private interface IntegrationServiceEnvironmentSkusService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Logic"
                + "/integrationServiceEnvironments/{integrationServiceEnvironmentName}/skus")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<IntegrationServiceEnvironmentSkuList>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroup") String resourceGroup,
            @PathParam("integrationServiceEnvironmentName") String integrationServiceEnvironmentName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<IntegrationServiceEnvironmentSkuList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets a list of integration service environment Skus.
     *
     * @param resourceGroup The resource group.
     * @param integrationServiceEnvironmentName The integration service environment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration service environment Skus.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<IntegrationServiceEnvironmentSkuDefinitionInner>> listSinglePageAsync(
        String resourceGroup, String integrationServiceEnvironmentName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroup == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceGroup is required and cannot be null."));
        }
        if (integrationServiceEnvironmentName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter integrationServiceEnvironmentName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroup,
                            integrationServiceEnvironmentName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<IntegrationServiceEnvironmentSkuDefinitionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a list of integration service environment Skus.
     *
     * @param resourceGroup The resource group.
     * @param integrationServiceEnvironmentName The integration service environment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration service environment Skus.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<IntegrationServiceEnvironmentSkuDefinitionInner>> listSinglePageAsync(
        String resourceGroup, String integrationServiceEnvironmentName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroup == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceGroup is required and cannot be null."));
        }
        if (integrationServiceEnvironmentName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter integrationServiceEnvironmentName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroup,
                integrationServiceEnvironmentName,
                this.client.getApiVersion(),
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Gets a list of integration service environment Skus.
     *
     * @param resourceGroup The resource group.
     * @param integrationServiceEnvironmentName The integration service environment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration service environment Skus.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<IntegrationServiceEnvironmentSkuDefinitionInner> listAsync(
        String resourceGroup, String integrationServiceEnvironmentName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroup, integrationServiceEnvironmentName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of integration service environment Skus.
     *
     * @param resourceGroup The resource group.
     * @param integrationServiceEnvironmentName The integration service environment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration service environment Skus.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<IntegrationServiceEnvironmentSkuDefinitionInner> listAsync(
        String resourceGroup, String integrationServiceEnvironmentName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroup, integrationServiceEnvironmentName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets a list of integration service environment Skus.
     *
     * @param resourceGroup The resource group.
     * @param integrationServiceEnvironmentName The integration service environment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration service environment Skus.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<IntegrationServiceEnvironmentSkuDefinitionInner> list(
        String resourceGroup, String integrationServiceEnvironmentName) {
        return new PagedIterable<>(listAsync(resourceGroup, integrationServiceEnvironmentName));
    }

    /**
     * Gets a list of integration service environment Skus.
     *
     * @param resourceGroup The resource group.
     * @param integrationServiceEnvironmentName The integration service environment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration service environment Skus.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<IntegrationServiceEnvironmentSkuDefinitionInner> list(
        String resourceGroup, String integrationServiceEnvironmentName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroup, integrationServiceEnvironmentName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of integration service environment skus.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<IntegrationServiceEnvironmentSkuDefinitionInner>> listNextSinglePageAsync(
        String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<IntegrationServiceEnvironmentSkuDefinitionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of integration service environment skus.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<IntegrationServiceEnvironmentSkuDefinitionInner>> listNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
