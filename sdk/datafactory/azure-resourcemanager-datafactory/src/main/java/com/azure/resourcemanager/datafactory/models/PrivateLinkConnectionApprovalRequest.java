// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A request to approve or reject a private endpoint connection. */
@Fluent
public final class PrivateLinkConnectionApprovalRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkConnectionApprovalRequest.class);

    /*
     * The state of a private link connection
     */
    @JsonProperty(value = "privateLinkServiceConnectionState")
    private PrivateLinkConnectionState privateLinkServiceConnectionState;

    /**
     * Get the privateLinkServiceConnectionState property: The state of a private link connection.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: The state of a private link connection.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateLinkConnectionApprovalRequest object itself.
     */
    public PrivateLinkConnectionApprovalRequest withPrivateLinkServiceConnectionState(
        PrivateLinkConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateLinkServiceConnectionState() != null) {
            privateLinkServiceConnectionState().validate();
        }
    }
}
