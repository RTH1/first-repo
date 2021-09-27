// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;

/** Samples for PartnerTopics GetByResourceGroup. */
public final class PartnerTopicsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-06-01-preview/examples/PartnerTopics_Get.json
     */
    /**
     * Sample code: PartnerTopics_Get.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void partnerTopicsGet(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.partnerTopics().getByResourceGroupWithResponse("examplerg", "examplePartnerTopicName1", Context.NONE);
    }
}
