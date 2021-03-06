// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes an Azure resource with kind. */
@Fluent
public class Kind {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Kind.class);

    /*
     * Kind of the resource
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get the kind property: Kind of the resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of the resource.
     *
     * @param kind the kind value to set.
     * @return the Kind object itself.
     */
    public Kind withKind(String kind) {
        this.kind = kind;
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
