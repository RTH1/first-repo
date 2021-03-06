// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview;

import com.azure.core.util.Context;

/** Samples for PrivateLinkResources ListByAccount. */
public final class PrivateLinkResourcesListByAccountSamples {
    /*
     * operationId: PrivateLinkResources_ListByAccount
     * api-version: 2021-07-01
     * x-ms-examples: PrivateLinkResources_ListByAccount
     */
    /**
     * Sample code: PrivateLinkResources_ListByAccount.
     *
     * @param manager Entry point to PurviewManager.
     */
    public static void privateLinkResourcesListByAccount(com.azure.resourcemanager.purview.PurviewManager manager) {
        manager.privateLinkResources().listByAccount("SampleResourceGroup", "account1", Context.NONE);
    }
}
