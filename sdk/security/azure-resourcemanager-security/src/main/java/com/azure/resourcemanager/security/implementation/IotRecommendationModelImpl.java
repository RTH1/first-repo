// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.resourcemanager.security.fluent.models.IotRecommendationModelInner;
import com.azure.resourcemanager.security.models.IotRecommendationModel;

public final class IotRecommendationModelImpl implements IotRecommendationModel {
    private IotRecommendationModelInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    IotRecommendationModelImpl(
        IotRecommendationModelInner innerObject, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String deviceId() {
        return this.innerModel().deviceId();
    }

    public String recommendationType() {
        return this.innerModel().recommendationType();
    }

    public String discoveredTimeUtc() {
        return this.innerModel().discoveredTimeUtc();
    }

    public Object recommendationAdditionalData() {
        return this.innerModel().recommendationAdditionalData();
    }

    public IotRecommendationModelInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
