// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

/** Samples for HcxEnterpriseSites CreateOrUpdate. */
public final class HcxEnterpriseSitesCreateOrUpdateSamples {
    /**
     * Sample code: HcxEnterpriseSites_CreateOrUpdate.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void hcxEnterpriseSitesCreateOrUpdate(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.hcxEnterpriseSites().define("site1").withExistingPrivateCloud("group1", "cloud1").create();
    }
}
