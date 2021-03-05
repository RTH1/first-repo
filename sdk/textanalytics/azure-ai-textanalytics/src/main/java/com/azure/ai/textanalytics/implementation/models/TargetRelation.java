// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TargetRelation model. */
@Fluent
public final class TargetRelation {
    /*
     * The type related to the target.
     */
    @JsonProperty(value = "relationType", required = true)
    private TargetRelationType relationType;

    /*
     * The JSON pointer indicating the linked object.
     */
    @JsonProperty(value = "ref", required = true)
    private String ref;

    /**
     * Get the relationType property: The type related to the target.
     *
     * @return the relationType value.
     */
    public TargetRelationType getRelationType() {
        return this.relationType;
    }

    /**
     * Set the relationType property: The type related to the target.
     *
     * @param relationType the relationType value to set.
     * @return the TargetRelation object itself.
     */
    public TargetRelation setRelationType(TargetRelationType relationType) {
        this.relationType = relationType;
        return this;
    }

    /**
     * Get the ref property: The JSON pointer indicating the linked object.
     *
     * @return the ref value.
     */
    public String getRef() {
        return this.ref;
    }

    /**
     * Set the ref property: The JSON pointer indicating the linked object.
     *
     * @param ref the ref value to set.
     * @return the TargetRelation object itself.
     */
    public TargetRelation setRef(String ref) {
        this.ref = ref;
        return this;
    }
}