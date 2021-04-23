// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.subscription.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.subscription.models.PutAliasResponseProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Subscription Information with the alias. */
@Fluent
public final class PutAliasResponseInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PutAliasResponseInner.class);

    /*
     * Put Alias response properties.
     */
    @JsonProperty(value = "properties")
    private PutAliasResponseProperties properties;

    /**
     * Get the properties property: Put Alias response properties.
     *
     * @return the properties value.
     */
    public PutAliasResponseProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Put Alias response properties.
     *
     * @param properties the properties value to set.
     * @return the PutAliasResponseInner object itself.
     */
    public PutAliasResponseInner withProperties(PutAliasResponseProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
