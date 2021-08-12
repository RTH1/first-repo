// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.State;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Regulatory compliance control details and state. */
@JsonFlatten
@Fluent
public class RegulatoryComplianceControlInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegulatoryComplianceControlInner.class);

    /*
     * The description of the regulatory compliance control
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Aggregative state based on the control's supported assessments states
     */
    @JsonProperty(value = "properties.state")
    private State state;

    /*
     * The number of supported regulatory compliance assessments of the given
     * control with a passed state
     */
    @JsonProperty(value = "properties.passedAssessments", access = JsonProperty.Access.WRITE_ONLY)
    private Integer passedAssessments;

    /*
     * The number of supported regulatory compliance assessments of the given
     * control with a failed state
     */
    @JsonProperty(value = "properties.failedAssessments", access = JsonProperty.Access.WRITE_ONLY)
    private Integer failedAssessments;

    /*
     * The number of supported regulatory compliance assessments of the given
     * control with a skipped state
     */
    @JsonProperty(value = "properties.skippedAssessments", access = JsonProperty.Access.WRITE_ONLY)
    private Integer skippedAssessments;

    /**
     * Get the description property: The description of the regulatory compliance control.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the state property: Aggregative state based on the control's supported assessments states.
     *
     * @return the state value.
     */
    public State state() {
        return this.state;
    }

    /**
     * Set the state property: Aggregative state based on the control's supported assessments states.
     *
     * @param state the state value to set.
     * @return the RegulatoryComplianceControlInner object itself.
     */
    public RegulatoryComplianceControlInner withState(State state) {
        this.state = state;
        return this;
    }

    /**
     * Get the passedAssessments property: The number of supported regulatory compliance assessments of the given
     * control with a passed state.
     *
     * @return the passedAssessments value.
     */
    public Integer passedAssessments() {
        return this.passedAssessments;
    }

    /**
     * Get the failedAssessments property: The number of supported regulatory compliance assessments of the given
     * control with a failed state.
     *
     * @return the failedAssessments value.
     */
    public Integer failedAssessments() {
        return this.failedAssessments;
    }

    /**
     * Get the skippedAssessments property: The number of supported regulatory compliance assessments of the given
     * control with a skipped state.
     *
     * @return the skippedAssessments value.
     */
    public Integer skippedAssessments() {
        return this.skippedAssessments;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
