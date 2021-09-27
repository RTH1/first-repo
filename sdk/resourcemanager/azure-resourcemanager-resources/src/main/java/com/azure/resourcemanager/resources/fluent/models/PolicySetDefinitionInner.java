// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.models.ParameterDefinitionsValue;
import com.azure.resourcemanager.resources.models.PolicyDefinitionGroup;
import com.azure.resourcemanager.resources.models.PolicyDefinitionReference;
import com.azure.resourcemanager.resources.models.PolicyType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The policy set definition. */
@Fluent
public final class PolicySetDefinitionInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicySetDefinitionInner.class);

    /*
     * The policy definition properties.
     */
    @JsonProperty(value = "properties")
    private PolicySetDefinitionProperties innerProperties;

    /*
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: The policy definition properties.
     *
     * @return the innerProperties value.
     */
    private PolicySetDefinitionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the policyType property: The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom,
     * and Static.
     *
     * @return the policyType value.
     */
    public PolicyType policyType() {
        return this.innerProperties() == null ? null : this.innerProperties().policyType();
    }

    /**
     * Set the policyType property: The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom,
     * and Static.
     *
     * @param policyType the policyType value to set.
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withPolicyType(PolicyType policyType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicySetDefinitionProperties();
        }
        this.innerProperties().withPolicyType(policyType);
        return this;
    }

    /**
     * Get the displayName property: The display name of the policy set definition.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name of the policy set definition.
     *
     * @param displayName the displayName value to set.
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicySetDefinitionProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the description property: The policy set definition description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The policy set definition description.
     *
     * @param description the description value to set.
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicySetDefinitionProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the metadata property: The policy set definition metadata. Metadata is an open ended object and is typically
     * a collection of key value pairs.
     *
     * @return the metadata value.
     */
    public Object metadata() {
        return this.innerProperties() == null ? null : this.innerProperties().metadata();
    }

    /**
     * Set the metadata property: The policy set definition metadata. Metadata is an open ended object and is typically
     * a collection of key value pairs.
     *
     * @param metadata the metadata value to set.
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withMetadata(Object metadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicySetDefinitionProperties();
        }
        this.innerProperties().withMetadata(metadata);
        return this;
    }

    /**
     * Get the parameters property: The policy set definition parameters that can be used in policy definition
     * references.
     *
     * @return the parameters value.
     */
    public Map<String, ParameterDefinitionsValue> parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: The policy set definition parameters that can be used in policy definition
     * references.
     *
     * @param parameters the parameters value to set.
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withParameters(Map<String, ParameterDefinitionsValue> parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicySetDefinitionProperties();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Get the policyDefinitions property: An array of policy definition references.
     *
     * @return the policyDefinitions value.
     */
    public List<PolicyDefinitionReference> policyDefinitions() {
        return this.innerProperties() == null ? null : this.innerProperties().policyDefinitions();
    }

    /**
     * Set the policyDefinitions property: An array of policy definition references.
     *
     * @param policyDefinitions the policyDefinitions value to set.
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withPolicyDefinitions(List<PolicyDefinitionReference> policyDefinitions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicySetDefinitionProperties();
        }
        this.innerProperties().withPolicyDefinitions(policyDefinitions);
        return this;
    }

    /**
     * Get the policyDefinitionGroups property: The metadata describing groups of policy definition references within
     * the policy set definition.
     *
     * @return the policyDefinitionGroups value.
     */
    public List<PolicyDefinitionGroup> policyDefinitionGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().policyDefinitionGroups();
    }

    /**
     * Set the policyDefinitionGroups property: The metadata describing groups of policy definition references within
     * the policy set definition.
     *
     * @param policyDefinitionGroups the policyDefinitionGroups value to set.
     * @return the PolicySetDefinitionInner object itself.
     */
    public PolicySetDefinitionInner withPolicyDefinitionGroups(List<PolicyDefinitionGroup> policyDefinitionGroups) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicySetDefinitionProperties();
        }
        this.innerProperties().withPolicyDefinitionGroups(policyDefinitionGroups);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
