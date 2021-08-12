// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details about a user assigned identity. */
@Fluent
public class UserAssignedIdentity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserAssignedIdentity.class);

    /*
     * The resource ID of the user assigned identity.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * The client ID of the user assigned identity.
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /*
     * The object ID of the user assigned identity.
     */
    @JsonProperty(value = "objectId")
    private String objectId;

    /**
     * Get the resourceId property: The resource ID of the user assigned identity.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The resource ID of the user assigned identity.
     *
     * @param resourceId the resourceId value to set.
     * @return the UserAssignedIdentity object itself.
     */
    public UserAssignedIdentity withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the clientId property: The client ID of the user assigned identity.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client ID of the user assigned identity.
     *
     * @param clientId the clientId value to set.
     * @return the UserAssignedIdentity object itself.
     */
    public UserAssignedIdentity withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the objectId property: The object ID of the user assigned identity.
     *
     * @return the objectId value.
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set the objectId property: The object ID of the user assigned identity.
     *
     * @param objectId the objectId value to set.
     * @return the UserAssignedIdentity object itself.
     */
    public UserAssignedIdentity withObjectId(String objectId) {
        this.objectId = objectId;
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
