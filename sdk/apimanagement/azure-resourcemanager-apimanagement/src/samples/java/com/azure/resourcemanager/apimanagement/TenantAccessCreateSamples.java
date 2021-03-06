// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.resourcemanager.apimanagement.models.AccessIdName;

/** Samples for TenantAccess Create. */
public final class TenantAccessCreateSamples {
    /*
     * operationId: TenantAccess_Create
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateTenantAccess
     */
    /**
     * Sample code: ApiManagementCreateTenantAccess.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateTenantAccess(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .tenantAccess()
            .define(AccessIdName.ACCESS)
            .withExistingService("rg1", "apimService1")
            .withEnabled(true)
            .withIfMatch("*")
            .create();
    }
}
