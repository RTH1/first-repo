// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.deploymentmanager.fluent.ArtifactSourcesClient;
import com.azure.resourcemanager.deploymentmanager.fluent.models.ArtifactSourceInner;
import com.azure.resourcemanager.deploymentmanager.models.ArtifactSource;
import com.azure.resourcemanager.deploymentmanager.models.ArtifactSources;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ArtifactSourcesImpl implements ArtifactSources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ArtifactSourcesImpl.class);

    private final ArtifactSourcesClient innerClient;

    private final com.azure.resourcemanager.deploymentmanager.DeploymentManager serviceManager;

    public ArtifactSourcesImpl(
        ArtifactSourcesClient innerClient,
        com.azure.resourcemanager.deploymentmanager.DeploymentManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ArtifactSource getByResourceGroup(String resourceGroupName, String artifactSourceName) {
        ArtifactSourceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, artifactSourceName);
        if (inner != null) {
            return new ArtifactSourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ArtifactSource> getByResourceGroupWithResponse(
        String resourceGroupName, String artifactSourceName, Context context) {
        Response<ArtifactSourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, artifactSourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ArtifactSourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String artifactSourceName) {
        this.serviceClient().delete(resourceGroupName, artifactSourceName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String artifactSourceName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, artifactSourceName, context);
    }

    public List<ArtifactSource> list(String resourceGroupName) {
        List<ArtifactSourceInner> inner = this.serviceClient().list(resourceGroupName);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ArtifactSourceImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<ArtifactSource>> listWithResponse(String resourceGroupName, Context context) {
        Response<List<ArtifactSourceInner>> inner = this.serviceClient().listWithResponse(resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new ArtifactSourceImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public ArtifactSource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String artifactSourceName = Utils.getValueFromIdByName(id, "artifactSources");
        if (artifactSourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'artifactSources'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, artifactSourceName, Context.NONE).getValue();
    }

    public Response<ArtifactSource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String artifactSourceName = Utils.getValueFromIdByName(id, "artifactSources");
        if (artifactSourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'artifactSources'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, artifactSourceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String artifactSourceName = Utils.getValueFromIdByName(id, "artifactSources");
        if (artifactSourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'artifactSources'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, artifactSourceName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String artifactSourceName = Utils.getValueFromIdByName(id, "artifactSources");
        if (artifactSourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'artifactSources'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, artifactSourceName, context);
    }

    private ArtifactSourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.deploymentmanager.DeploymentManager manager() {
        return this.serviceManager;
    }

    public ArtifactSourceImpl define(String name) {
        return new ArtifactSourceImpl(name, this.manager());
    }
}
