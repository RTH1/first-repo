// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;

/** Samples for AssetFilters Get. */
public final class AssetFiltersGetSamples {
    /**
     * Sample code: Get an Asset Filter by name.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void getAnAssetFilterByName(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager
            .assetFilters()
            .getWithResponse(
                "contoso", "contosomedia", "ClimbingMountRainer", "assetFilterWithTimeWindowAndTrack", Context.NONE);
    }
}
