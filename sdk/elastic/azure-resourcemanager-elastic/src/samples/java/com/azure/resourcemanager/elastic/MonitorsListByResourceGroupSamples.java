// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic;

import com.azure.core.util.Context;

/** Samples for Monitors ListByResourceGroup. */
public final class MonitorsListByResourceGroupSamples {
    /**
     * Sample code: Monitors_ListByResourceGroup.
     *
     * @param elasticManager Entry point to ElasticManager.
     */
    public static void monitorsListByResourceGroup(com.azure.resourcemanager.elastic.ElasticManager elasticManager) {
        elasticManager.monitors().listByResourceGroup("myResourceGroup", Context.NONE);
    }
}
