// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.avs.fluent.models.GlobalReachConnectionInner;

/** An instance of this class provides access to all the operations defined in GlobalReachConnectionsClient. */
public interface GlobalReachConnectionsClient {
    /**
     * List global reach connections in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paged list of global reach connections.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GlobalReachConnectionInner> list(String resourceGroupName, String privateCloudName);

    /**
     * List global reach connections in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paged list of global reach connections.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GlobalReachConnectionInner> list(String resourceGroupName, String privateCloudName, Context context);

    /**
     * Get a global reach connection by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param globalReachConnectionName Name of the global reach connection in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a global reach connection by name in a private cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GlobalReachConnectionInner get(String resourceGroupName, String privateCloudName, String globalReachConnectionName);

    /**
     * Get a global reach connection by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param globalReachConnectionName Name of the global reach connection in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a global reach connection by name in a private cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GlobalReachConnectionInner> getWithResponse(
        String resourceGroupName, String privateCloudName, String globalReachConnectionName, Context context);

    /**
     * Create or update a global reach connection in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param globalReachConnectionName Name of the global reach connection in the private cloud.
     * @param globalReachConnection A global reach connection in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a global reach connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<GlobalReachConnectionInner>, GlobalReachConnectionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String privateCloudName,
        String globalReachConnectionName,
        GlobalReachConnectionInner globalReachConnection);

    /**
     * Create or update a global reach connection in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param globalReachConnectionName Name of the global reach connection in the private cloud.
     * @param globalReachConnection A global reach connection in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a global reach connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<GlobalReachConnectionInner>, GlobalReachConnectionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String privateCloudName,
        String globalReachConnectionName,
        GlobalReachConnectionInner globalReachConnection,
        Context context);

    /**
     * Create or update a global reach connection in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param globalReachConnectionName Name of the global reach connection in the private cloud.
     * @param globalReachConnection A global reach connection in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a global reach connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GlobalReachConnectionInner createOrUpdate(
        String resourceGroupName,
        String privateCloudName,
        String globalReachConnectionName,
        GlobalReachConnectionInner globalReachConnection);

    /**
     * Create or update a global reach connection in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param globalReachConnectionName Name of the global reach connection in the private cloud.
     * @param globalReachConnection A global reach connection in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a global reach connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GlobalReachConnectionInner createOrUpdate(
        String resourceGroupName,
        String privateCloudName,
        String globalReachConnectionName,
        GlobalReachConnectionInner globalReachConnection,
        Context context);

    /**
     * Delete a global reach connection in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param globalReachConnectionName Name of the global reach connection in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String privateCloudName, String globalReachConnectionName);

    /**
     * Delete a global reach connection in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param globalReachConnectionName Name of the global reach connection in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String privateCloudName, String globalReachConnectionName, Context context);

    /**
     * Delete a global reach connection in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param globalReachConnectionName Name of the global reach connection in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String privateCloudName, String globalReachConnectionName);

    /**
     * Delete a global reach connection in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param globalReachConnectionName Name of the global reach connection in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String privateCloudName, String globalReachConnectionName, Context context);
}
