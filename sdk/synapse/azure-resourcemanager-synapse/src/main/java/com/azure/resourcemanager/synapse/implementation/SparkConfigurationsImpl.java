// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.SparkConfigurationsClient;
import com.azure.resourcemanager.synapse.fluent.models.SparkConfigurationResourceInner;
import com.azure.resourcemanager.synapse.models.SparkConfigurationResource;
import com.azure.resourcemanager.synapse.models.SparkConfigurations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SparkConfigurationsImpl implements SparkConfigurations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SparkConfigurationsImpl.class);

    private final SparkConfigurationsClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public SparkConfigurationsImpl(
        SparkConfigurationsClient innerClient, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public SparkConfigurationResource get(
        String resourceGroupName, String sparkConfigurationName, String workspaceName) {
        SparkConfigurationResourceInner inner =
            this.serviceClient().get(resourceGroupName, sparkConfigurationName, workspaceName);
        if (inner != null) {
            return new SparkConfigurationResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SparkConfigurationResource> getWithResponse(
        String resourceGroupName, String sparkConfigurationName, String workspaceName, Context context) {
        Response<SparkConfigurationResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, sparkConfigurationName, workspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SparkConfigurationResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private SparkConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
