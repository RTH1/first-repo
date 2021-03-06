// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ApplicationTypeVersionsCleanupPolicy model. */
@Fluent
public final class ApplicationTypeVersionsCleanupPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationTypeVersionsCleanupPolicy.class);

    /*
     * Number of unused versions per application type to keep.
     */
    @JsonProperty(value = "maxUnusedVersionsToKeep", required = true)
    private long maxUnusedVersionsToKeep;

    /**
     * Get the maxUnusedVersionsToKeep property: Number of unused versions per application type to keep.
     *
     * @return the maxUnusedVersionsToKeep value.
     */
    public long maxUnusedVersionsToKeep() {
        return this.maxUnusedVersionsToKeep;
    }

    /**
     * Set the maxUnusedVersionsToKeep property: Number of unused versions per application type to keep.
     *
     * @param maxUnusedVersionsToKeep the maxUnusedVersionsToKeep value to set.
     * @return the ApplicationTypeVersionsCleanupPolicy object itself.
     */
    public ApplicationTypeVersionsCleanupPolicy withMaxUnusedVersionsToKeep(long maxUnusedVersionsToKeep) {
        this.maxUnusedVersionsToKeep = maxUnusedVersionsToKeep;
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
