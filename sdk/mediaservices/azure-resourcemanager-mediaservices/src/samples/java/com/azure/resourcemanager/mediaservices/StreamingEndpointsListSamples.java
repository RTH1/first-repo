// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;

/** Samples for StreamingEndpoints List. */
public final class StreamingEndpointsListSamples {
    /**
     * Sample code: List all streaming endpoints.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void listAllStreamingEndpoints(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager.streamingEndpoints().list("mediaresources", "slitestmedia10", Context.NONE);
    }
}
