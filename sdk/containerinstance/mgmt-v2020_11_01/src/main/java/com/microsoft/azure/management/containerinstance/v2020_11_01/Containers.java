/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2020_11_01;

import rx.Observable;

/**
 * Type representing Containers.
 */
public interface Containers {
    /**
     * Get the logs for a specified container instance.
     * Get the logs for a specified container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Logs> listLogsAsync(String resourceGroupName, String containerGroupName, String containerName);

    /**
     * Executes a command in a specific container instance.
     * Executes a command for a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param containerExecRequest The request for the exec command.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ContainerExecResponse> executeCommandAsync(String resourceGroupName, String containerGroupName, String containerName, ContainerExecRequest containerExecRequest);

    /**
     * Attach to the output of a specific container instance.
     * Attach to the output stream of a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ContainerAttachResponse> attachAsync(String resourceGroupName, String containerGroupName, String containerName);

}
