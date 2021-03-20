// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Get User Token response details. */
@Fluent
public final class UserTokenResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserTokenResultInner.class);

    /*
     * Shared Access Authorization token for the User.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the value property: Shared Access Authorization token for the User.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Shared Access Authorization token for the User.
     *
     * @param value the value value to set.
     * @return the UserTokenResultInner object itself.
     */
    public UserTokenResultInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}