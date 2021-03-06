// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for GatewayApi Delete. */
public final class GatewayApiDeleteSamples {
    /*
     * operationId: GatewayApi_Delete
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementDeleteGatewayApi
     */
    /**
     * Sample code: ApiManagementDeleteGatewayApi.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementDeleteGatewayApi(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.gatewayApis().deleteWithResponse("rg1", "apimService1", "gw1", "echo-api", Context.NONE);
    }
}
