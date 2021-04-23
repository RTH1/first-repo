// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.implementation;

import com.azure.resourcemanager.iotcentral.fluent.models.AppTemplateInner;
import com.azure.resourcemanager.iotcentral.models.AppTemplate;
import com.azure.resourcemanager.iotcentral.models.AppTemplateLocations;
import java.util.Collections;
import java.util.List;

public final class AppTemplateImpl implements AppTemplate {
    private AppTemplateInner innerObject;

    private final com.azure.resourcemanager.iotcentral.IotCentralManager serviceManager;

    AppTemplateImpl(
        AppTemplateInner innerObject, com.azure.resourcemanager.iotcentral.IotCentralManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String manifestId() {
        return this.innerModel().manifestId();
    }

    public String manifestVersion() {
        return this.innerModel().manifestVersion();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String title() {
        return this.innerModel().title();
    }

    public Float order() {
        return this.innerModel().order();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String industry() {
        return this.innerModel().industry();
    }

    public List<AppTemplateLocations> locations() {
        List<AppTemplateLocations> inner = this.innerModel().locations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AppTemplateInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.iotcentral.IotCentralManager manager() {
        return this.serviceManager;
    }
}
