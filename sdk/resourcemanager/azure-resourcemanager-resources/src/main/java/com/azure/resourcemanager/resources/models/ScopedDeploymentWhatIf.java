// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment What-if operation parameters.
 */
@Fluent
public final class ScopedDeploymentWhatIf {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ScopedDeploymentWhatIf.class);

    /*
     * The location to store the deployment data.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * The deployment properties.
     */
    @JsonProperty(value = "properties", required = true)
    private DeploymentWhatIfProperties properties;

    /**
     * Get the location property: The location to store the deployment data.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location to store the deployment data.
     * 
     * @param location the location value to set.
     * @return the ScopedDeploymentWhatIf object itself.
     */
    public ScopedDeploymentWhatIf withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the properties property: The deployment properties.
     * 
     * @return the properties value.
     */
    public DeploymentWhatIfProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The deployment properties.
     * 
     * @param properties the properties value to set.
     * @return the ScopedDeploymentWhatIf object itself.
     */
    public ScopedDeploymentWhatIf withProperties(DeploymentWhatIfProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Missing required property location in model ScopedDeploymentWhatIf"));
        }
        if (properties() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Missing required property properties in model ScopedDeploymentWhatIf"));
        } else {
            properties().validate();
        }
    }
}
