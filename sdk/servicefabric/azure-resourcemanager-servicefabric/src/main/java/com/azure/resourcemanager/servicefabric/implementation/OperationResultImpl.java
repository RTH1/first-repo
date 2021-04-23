// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.implementation;

import com.azure.resourcemanager.servicefabric.fluent.models.OperationResultInner;
import com.azure.resourcemanager.servicefabric.models.AvailableOperationDisplay;
import com.azure.resourcemanager.servicefabric.models.OperationResult;

public final class OperationResultImpl implements OperationResult {
    private OperationResultInner innerObject;

    private final com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager;

    OperationResultImpl(
        OperationResultInner innerObject, com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public AvailableOperationDisplay display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public OperationResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.servicefabric.ServiceFabricManager manager() {
        return this.serviceManager;
    }
}
