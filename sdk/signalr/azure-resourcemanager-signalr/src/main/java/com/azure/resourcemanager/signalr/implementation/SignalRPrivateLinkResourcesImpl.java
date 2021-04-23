// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.signalr.fluent.SignalRPrivateLinkResourcesClient;
import com.azure.resourcemanager.signalr.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.signalr.models.PrivateLinkResource;
import com.azure.resourcemanager.signalr.models.SignalRPrivateLinkResources;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SignalRPrivateLinkResourcesImpl implements SignalRPrivateLinkResources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SignalRPrivateLinkResourcesImpl.class);

    private final SignalRPrivateLinkResourcesClient innerClient;

    private final com.azure.resourcemanager.signalr.SignalRManager serviceManager;

    public SignalRPrivateLinkResourcesImpl(
        SignalRPrivateLinkResourcesClient innerClient,
        com.azure.resourcemanager.signalr.SignalRManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateLinkResource> list(String resourceGroupName, String resourceName) {
        PagedIterable<PrivateLinkResourceInner> inner = this.serviceClient().list(resourceGroupName, resourceName);
        return Utils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateLinkResource> list(String resourceGroupName, String resourceName, Context context) {
        PagedIterable<PrivateLinkResourceInner> inner =
            this.serviceClient().list(resourceGroupName, resourceName, context);
        return Utils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    private SignalRPrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.signalr.SignalRManager manager() {
        return this.serviceManager;
    }
}
