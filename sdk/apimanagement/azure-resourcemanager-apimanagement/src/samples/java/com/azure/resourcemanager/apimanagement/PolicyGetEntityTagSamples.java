// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.PolicyIdName;

/** Samples for Policy GetEntityTag. */
public final class PolicyGetEntityTagSamples {
    /*
     * operationId: Policy_GetEntityTag
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementHeadPolicy
     */
    /**
     * Sample code: ApiManagementHeadPolicy.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementHeadPolicy(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.policies().getEntityTagWithResponse("rg1", "apimService1", PolicyIdName.POLICY, Context.NONE);
    }
}
