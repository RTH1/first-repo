// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for PrivateClouds ListByResourceGroup. */
public final class PrivateCloudsListByResourceGroupSamples {
    /**
     * Sample code: PrivateClouds_List.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void privateCloudsList(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.privateClouds().listByResourceGroup("group1", Context.NONE);
    }
}
