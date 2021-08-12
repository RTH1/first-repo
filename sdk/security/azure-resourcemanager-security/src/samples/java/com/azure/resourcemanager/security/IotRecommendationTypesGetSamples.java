// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for IotRecommendationTypes Get. */
public final class IotRecommendationTypesGetSamples {
    /**
     * Sample code: Get IoT Recommendation Type.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getIoTRecommendationType(com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.iotRecommendationTypes().getWithResponse("IoT_VulnerableTLSCipherSuite", Context.NONE);
    }
}
