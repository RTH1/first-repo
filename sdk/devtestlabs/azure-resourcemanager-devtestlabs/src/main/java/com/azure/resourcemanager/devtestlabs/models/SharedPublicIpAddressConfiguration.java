// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of a virtual machine that determine how it is connected to a load balancer. */
@Fluent
public final class SharedPublicIpAddressConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SharedPublicIpAddressConfiguration.class);

    /*
     * The incoming NAT rules
     */
    @JsonProperty(value = "inboundNatRules")
    private List<InboundNatRule> inboundNatRules;

    /**
     * Get the inboundNatRules property: The incoming NAT rules.
     *
     * @return the inboundNatRules value.
     */
    public List<InboundNatRule> inboundNatRules() {
        return this.inboundNatRules;
    }

    /**
     * Set the inboundNatRules property: The incoming NAT rules.
     *
     * @param inboundNatRules the inboundNatRules value to set.
     * @return the SharedPublicIpAddressConfiguration object itself.
     */
    public SharedPublicIpAddressConfiguration withInboundNatRules(List<InboundNatRule> inboundNatRules) {
        this.inboundNatRules = inboundNatRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inboundNatRules() != null) {
            inboundNatRules().forEach(e -> e.validate());
        }
    }
}
