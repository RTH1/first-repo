// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Check name availability response A response saying whether the workspace name is available. */
@Fluent
public final class CheckNameAvailabilityResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CheckNameAvailabilityResponseInner.class);

    /*
     * Validation message
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Whether the workspace name is available
     */
    @JsonProperty(value = "available")
    private Boolean available;

    /*
     * Reason the workspace name is or is not available
     */
    @JsonProperty(value = "reason")
    private String reason;

    /*
     * Workspace name
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the message property: Validation message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Validation message.
     *
     * @param message the message value to set.
     * @return the CheckNameAvailabilityResponseInner object itself.
     */
    public CheckNameAvailabilityResponseInner withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the available property: Whether the workspace name is available.
     *
     * @return the available value.
     */
    public Boolean available() {
        return this.available;
    }

    /**
     * Set the available property: Whether the workspace name is available.
     *
     * @param available the available value to set.
     * @return the CheckNameAvailabilityResponseInner object itself.
     */
    public CheckNameAvailabilityResponseInner withAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    /**
     * Get the reason property: Reason the workspace name is or is not available.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: Reason the workspace name is or is not available.
     *
     * @param reason the reason value to set.
     * @return the CheckNameAvailabilityResponseInner object itself.
     */
    public CheckNameAvailabilityResponseInner withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the name property: Workspace name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Workspace name.
     *
     * @param name the name value to set.
     * @return the CheckNameAvailabilityResponseInner object itself.
     */
    public CheckNameAvailabilityResponseInner withName(String name) {
        this.name = name;
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
