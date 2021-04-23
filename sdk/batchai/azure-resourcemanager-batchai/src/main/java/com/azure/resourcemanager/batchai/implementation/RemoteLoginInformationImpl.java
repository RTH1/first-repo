// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.implementation;

import com.azure.resourcemanager.batchai.fluent.models.RemoteLoginInformationInner;
import com.azure.resourcemanager.batchai.models.RemoteLoginInformation;

public final class RemoteLoginInformationImpl implements RemoteLoginInformation {
    private RemoteLoginInformationInner innerObject;

    private final com.azure.resourcemanager.batchai.BatchAIManager serviceManager;

    RemoteLoginInformationImpl(
        RemoteLoginInformationInner innerObject, com.azure.resourcemanager.batchai.BatchAIManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String nodeId() {
        return this.innerModel().nodeId();
    }

    public String ipAddress() {
        return this.innerModel().ipAddress();
    }

    public Integer port() {
        return this.innerModel().port();
    }

    public RemoteLoginInformationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.batchai.BatchAIManager manager() {
        return this.serviceManager;
    }
}
