// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for AzureDigitalTwinsManagementClient class. */
public interface AzureDigitalTwinsManagementClient {
    /**
     * Gets The subscription identifier.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the DigitalTwinsClient object to access its operations.
     *
     * @return the DigitalTwinsClient object.
     */
    DigitalTwinsClient getDigitalTwins();

    /**
     * Gets the DigitalTwinsEndpointsClient object to access its operations.
     *
     * @return the DigitalTwinsEndpointsClient object.
     */
    DigitalTwinsEndpointsClient getDigitalTwinsEndpoints();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();
}