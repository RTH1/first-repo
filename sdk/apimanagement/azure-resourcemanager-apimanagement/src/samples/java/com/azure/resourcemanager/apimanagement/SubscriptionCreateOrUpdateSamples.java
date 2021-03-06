// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.SubscriptionCreateParameters;

/** Samples for Subscription CreateOrUpdate. */
public final class SubscriptionCreateOrUpdateSamples {
    /*
     * operationId: Subscription_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateSubscription
     */
    /**
     * Sample code: ApiManagementCreateSubscription.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateSubscription(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .subscriptions()
            .createOrUpdateWithResponse(
                "rg1",
                "apimService1",
                "testsub",
                new SubscriptionCreateParameters()
                    .withOwnerId(
                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/users/57127d485157a511ace86ae7")
                    .withScope(
                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/products/5600b59475ff190048060002")
                    .withDisplayName("testsub"),
                null,
                null,
                null,
                Context.NONE);
    }
}
