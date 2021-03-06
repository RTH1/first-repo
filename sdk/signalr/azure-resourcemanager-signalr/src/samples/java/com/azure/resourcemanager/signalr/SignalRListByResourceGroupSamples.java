// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr;

import com.azure.core.util.Context;

/** Samples for SignalR ListByResourceGroup. */
public final class SignalRListByResourceGroupSamples {
    /**
     * Sample code: SignalR_ListByResourceGroup.
     *
     * @param signalRManager Entry point to SignalRManager. REST API for Azure SignalR Service.
     */
    public static void signalRListByResourceGroup(com.azure.resourcemanager.signalr.SignalRManager signalRManager) {
        signalRManager.signalRs().listByResourceGroup("myResourceGroup", Context.NONE);
    }
}
