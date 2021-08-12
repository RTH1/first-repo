// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for Authorizations Delete. */
public final class AuthorizationsDeleteSamples {
    /**
     * Sample code: Authorizations_Delete.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void authorizationsDelete(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.authorizations().delete("group1", "cloud1", "authorization1", Context.NONE);
    }
}
