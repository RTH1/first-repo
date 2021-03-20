// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayCertificateAuthorityContractInner;
import com.azure.resourcemanager.apimanagement.models.GatewayCertificateAuthorityContract;

public final class GatewayCertificateAuthorityContractImpl
    implements GatewayCertificateAuthorityContract,
        GatewayCertificateAuthorityContract.Definition,
        GatewayCertificateAuthorityContract.Update {
    private GatewayCertificateAuthorityContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Boolean isTrusted() {
        return this.innerModel().isTrusted();
    }

    public GatewayCertificateAuthorityContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    private String gatewayId;

    private String certificateId;

    private String createIfMatch;

    private String updateIfMatch;

    public GatewayCertificateAuthorityContractImpl withExistingGateway(
        String resourceGroupName, String serviceName, String gatewayId) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.gatewayId = gatewayId;
        return this;
    }

    public GatewayCertificateAuthorityContract create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGatewayCertificateAuthorities()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    serviceName,
                    gatewayId,
                    certificateId,
                    this.innerModel(),
                    createIfMatch,
                    Context.NONE)
                .getValue();
        return this;
    }

    public GatewayCertificateAuthorityContract create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGatewayCertificateAuthorities()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceName, gatewayId, certificateId, this.innerModel(), createIfMatch, context)
                .getValue();
        return this;
    }

    GatewayCertificateAuthorityContractImpl(
        String name, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = new GatewayCertificateAuthorityContractInner();
        this.serviceManager = serviceManager;
        this.certificateId = name;
        this.createIfMatch = null;
    }

    public GatewayCertificateAuthorityContractImpl update() {
        this.updateIfMatch = null;
        return this;
    }

    public GatewayCertificateAuthorityContract apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGatewayCertificateAuthorities()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    serviceName,
                    gatewayId,
                    certificateId,
                    this.innerModel(),
                    updateIfMatch,
                    Context.NONE)
                .getValue();
        return this;
    }

    public GatewayCertificateAuthorityContract apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGatewayCertificateAuthorities()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceName, gatewayId, certificateId, this.innerModel(), updateIfMatch, context)
                .getValue();
        return this;
    }

    GatewayCertificateAuthorityContractImpl(
        GatewayCertificateAuthorityContractInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "service");
        this.gatewayId = Utils.getValueFromIdByName(innerObject.id(), "gateways");
        this.certificateId = Utils.getValueFromIdByName(innerObject.id(), "certificateAuthorities");
    }

    public GatewayCertificateAuthorityContract refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGatewayCertificateAuthorities()
                .getWithResponse(resourceGroupName, serviceName, gatewayId, certificateId, Context.NONE)
                .getValue();
        return this;
    }

    public GatewayCertificateAuthorityContract refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGatewayCertificateAuthorities()
                .getWithResponse(resourceGroupName, serviceName, gatewayId, certificateId, context)
                .getValue();
        return this;
    }

    public GatewayCertificateAuthorityContractImpl withIsTrusted(Boolean isTrusted) {
        this.innerModel().withIsTrusted(isTrusted);
        return this;
    }

    public GatewayCertificateAuthorityContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}