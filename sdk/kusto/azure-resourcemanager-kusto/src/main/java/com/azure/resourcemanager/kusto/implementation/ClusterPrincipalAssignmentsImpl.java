// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.kusto.fluent.ClusterPrincipalAssignmentsClient;
import com.azure.resourcemanager.kusto.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.kusto.fluent.models.ClusterPrincipalAssignmentInner;
import com.azure.resourcemanager.kusto.models.CheckNameResult;
import com.azure.resourcemanager.kusto.models.ClusterPrincipalAssignment;
import com.azure.resourcemanager.kusto.models.ClusterPrincipalAssignmentCheckNameRequest;
import com.azure.resourcemanager.kusto.models.ClusterPrincipalAssignments;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ClusterPrincipalAssignmentsImpl implements ClusterPrincipalAssignments {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterPrincipalAssignmentsImpl.class);

    private final ClusterPrincipalAssignmentsClient innerClient;

    private final com.azure.resourcemanager.kusto.KustoManager serviceManager;

    public ClusterPrincipalAssignmentsImpl(
        ClusterPrincipalAssignmentsClient innerClient, com.azure.resourcemanager.kusto.KustoManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CheckNameResult checkNameAvailability(
        String resourceGroupName,
        String clusterName,
        ClusterPrincipalAssignmentCheckNameRequest principalAssignmentName) {
        CheckNameResultInner inner =
            this.serviceClient().checkNameAvailability(resourceGroupName, clusterName, principalAssignmentName);
        if (inner != null) {
            return new CheckNameResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameResult> checkNameAvailabilityWithResponse(
        String resourceGroupName,
        String clusterName,
        ClusterPrincipalAssignmentCheckNameRequest principalAssignmentName,
        Context context) {
        Response<CheckNameResultInner> inner =
            this
                .serviceClient()
                .checkNameAvailabilityWithResponse(resourceGroupName, clusterName, principalAssignmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ClusterPrincipalAssignment get(
        String resourceGroupName, String clusterName, String principalAssignmentName) {
        ClusterPrincipalAssignmentInner inner =
            this.serviceClient().get(resourceGroupName, clusterName, principalAssignmentName);
        if (inner != null) {
            return new ClusterPrincipalAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ClusterPrincipalAssignment> getWithResponse(
        String resourceGroupName, String clusterName, String principalAssignmentName, Context context) {
        Response<ClusterPrincipalAssignmentInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, clusterName, principalAssignmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ClusterPrincipalAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String principalAssignmentName) {
        this.serviceClient().delete(resourceGroupName, clusterName, principalAssignmentName);
    }

    public void delete(String resourceGroupName, String clusterName, String principalAssignmentName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, principalAssignmentName, context);
    }

    public PagedIterable<ClusterPrincipalAssignment> list(String resourceGroupName, String clusterName) {
        PagedIterable<ClusterPrincipalAssignmentInner> inner =
            this.serviceClient().list(resourceGroupName, clusterName);
        return Utils.mapPage(inner, inner1 -> new ClusterPrincipalAssignmentImpl(inner1, this.manager()));
    }

    public PagedIterable<ClusterPrincipalAssignment> list(
        String resourceGroupName, String clusterName, Context context) {
        PagedIterable<ClusterPrincipalAssignmentInner> inner =
            this.serviceClient().list(resourceGroupName, clusterName, context);
        return Utils.mapPage(inner, inner1 -> new ClusterPrincipalAssignmentImpl(inner1, this.manager()));
    }

    public ClusterPrincipalAssignment getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String principalAssignmentName = Utils.getValueFromIdByName(id, "principalAssignments");
        if (principalAssignmentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'principalAssignments'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, principalAssignmentName, Context.NONE).getValue();
    }

    public Response<ClusterPrincipalAssignment> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String principalAssignmentName = Utils.getValueFromIdByName(id, "principalAssignments");
        if (principalAssignmentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'principalAssignments'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, principalAssignmentName, context);
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
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String principalAssignmentName = Utils.getValueFromIdByName(id, "principalAssignments");
        if (principalAssignmentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'principalAssignments'.",
                                id)));
        }
        this.delete(resourceGroupName, clusterName, principalAssignmentName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String principalAssignmentName = Utils.getValueFromIdByName(id, "principalAssignments");
        if (principalAssignmentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'principalAssignments'.",
                                id)));
        }
        this.delete(resourceGroupName, clusterName, principalAssignmentName, context);
    }

    private ClusterPrincipalAssignmentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.kusto.KustoManager manager() {
        return this.serviceManager;
    }

    public ClusterPrincipalAssignmentImpl define(String name) {
        return new ClusterPrincipalAssignmentImpl(name, this.manager());
    }
}
