/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import com.microsoft.azure.management.appservice.v2020_09_01.SwiftVirtualNetwork;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2020_09_01.SystemData;

class SwiftVirtualNetworkImpl extends WrapperImpl<SwiftVirtualNetworkInner> implements SwiftVirtualNetwork {
    private final AppServiceManager manager;
    SwiftVirtualNetworkImpl(SwiftVirtualNetworkInner inner, AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String subnetResourceId() {
        return this.inner().subnetResourceId();
    }

    @Override
    public Boolean swiftSupported() {
        return this.inner().swiftSupported();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}