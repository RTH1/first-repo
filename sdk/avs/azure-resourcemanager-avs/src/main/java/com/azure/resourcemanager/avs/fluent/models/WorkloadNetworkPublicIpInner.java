// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.models.WorkloadNetworkPublicIpProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** NSX Public IP Block. */
@JsonFlatten
@Fluent
public class WorkloadNetworkPublicIpInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkloadNetworkPublicIpInner.class);

    /*
     * Display name of the Public IP Block.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /*
     * Number of Public IPs requested.
     */
    @JsonProperty(value = "properties.numberOfPublicIPs")
    private Long numberOfPublicIPs;

    /*
     * CIDR Block of the Public IP Block.
     */
    @JsonProperty(value = "properties.publicIPBlock", access = JsonProperty.Access.WRITE_ONLY)
    private String publicIpBlock;

    /*
     * The provisioning state
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private WorkloadNetworkPublicIpProvisioningState provisioningState;

    /**
     * Get the displayName property: Display name of the Public IP Block.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of the Public IP Block.
     *
     * @param displayName the displayName value to set.
     * @return the WorkloadNetworkPublicIpInner object itself.
     */
    public WorkloadNetworkPublicIpInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the numberOfPublicIPs property: Number of Public IPs requested.
     *
     * @return the numberOfPublicIPs value.
     */
    public Long numberOfPublicIPs() {
        return this.numberOfPublicIPs;
    }

    /**
     * Set the numberOfPublicIPs property: Number of Public IPs requested.
     *
     * @param numberOfPublicIPs the numberOfPublicIPs value to set.
     * @return the WorkloadNetworkPublicIpInner object itself.
     */
    public WorkloadNetworkPublicIpInner withNumberOfPublicIPs(Long numberOfPublicIPs) {
        this.numberOfPublicIPs = numberOfPublicIPs;
        return this;
    }

    /**
     * Get the publicIpBlock property: CIDR Block of the Public IP Block.
     *
     * @return the publicIpBlock value.
     */
    public String publicIpBlock() {
        return this.publicIpBlock;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public WorkloadNetworkPublicIpProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
