// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.synapse.fluent.models.WorkspaceInner;
import com.azure.resourcemanager.synapse.models.WorkspacePatchInfo;

/** An instance of this class provides access to all the operations defined in WorkspacesClient. */
public interface WorkspacesClient {
    /**
     * Returns a list of workspaces in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of workspaces.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Returns a list of workspaces in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of workspaces.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner getByResourceGroup(String resourceGroupName, String workspaceName);

    /**
     * Gets a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkspaceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Updates a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param workspacePatchInfo Workspace patch request properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<WorkspaceInner>, WorkspaceInner> beginUpdate(
        String resourceGroupName, String workspaceName, WorkspacePatchInfo workspacePatchInfo);

    /**
     * Updates a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param workspacePatchInfo Workspace patch request properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<WorkspaceInner>, WorkspaceInner> beginUpdate(
        String resourceGroupName, String workspaceName, WorkspacePatchInfo workspacePatchInfo, Context context);

    /**
     * Updates a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param workspacePatchInfo Workspace patch request properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner update(String resourceGroupName, String workspaceName, WorkspacePatchInfo workspacePatchInfo);

    /**
     * Updates a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param workspacePatchInfo Workspace patch request properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner update(
        String resourceGroupName, String workspaceName, WorkspacePatchInfo workspacePatchInfo, Context context);

    /**
     * Creates or updates a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param workspaceInfo Workspace create or update request properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<WorkspaceInner>, WorkspaceInner> beginCreateOrUpdate(
        String resourceGroupName, String workspaceName, WorkspaceInner workspaceInfo);

    /**
     * Creates or updates a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param workspaceInfo Workspace create or update request properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<WorkspaceInner>, WorkspaceInner> beginCreateOrUpdate(
        String resourceGroupName, String workspaceName, WorkspaceInner workspaceInfo, Context context);

    /**
     * Creates or updates a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param workspaceInfo Workspace create or update request properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner createOrUpdate(String resourceGroupName, String workspaceName, WorkspaceInner workspaceInfo);

    /**
     * Creates or updates a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param workspaceInfo Workspace create or update request properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner createOrUpdate(
        String resourceGroupName, String workspaceName, WorkspaceInner workspaceInfo, Context context);

    /**
     * Deletes a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Object>, Object> beginDelete(String resourceGroupName, String workspaceName);

    /**
     * Deletes a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Object>, Object> beginDelete(String resourceGroupName, String workspaceName, Context context);

    /**
     * Deletes a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object delete(String resourceGroupName, String workspaceName);

    /**
     * Deletes a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object delete(String resourceGroupName, String workspaceName, Context context);

    /**
     * Returns a list of workspaces in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of workspaces.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> list();

    /**
     * Returns a list of workspaces in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of workspaces.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> list(Context context);
}
