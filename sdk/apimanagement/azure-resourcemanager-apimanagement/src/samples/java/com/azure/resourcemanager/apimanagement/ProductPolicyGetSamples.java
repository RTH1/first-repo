// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.PolicyIdName;

/** Samples for ProductPolicy Get. */
public final class ProductPolicyGetSamples {
    /*
     * operationId: ProductPolicy_Get
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementGetProductPolicy
     */
    /**
     * Sample code: ApiManagementGetProductPolicy.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetProductPolicy(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .productPolicies()
            .getWithResponse(
                "rg1", "apimService1", "kjoshiarmTemplateProduct4", PolicyIdName.POLICY, null, Context.NONE);
    }
}
