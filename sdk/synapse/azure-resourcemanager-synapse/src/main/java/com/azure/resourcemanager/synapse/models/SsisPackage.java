// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Ssis Package. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Package")
@Fluent
public final class SsisPackage extends SsisObjectMetadata {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SsisPackage.class);

    /*
     * Folder id which contains package.
     */
    @JsonProperty(value = "folderId")
    private Long folderId;

    /*
     * Project version which contains package.
     */
    @JsonProperty(value = "projectVersion")
    private Long projectVersion;

    /*
     * Project id which contains package.
     */
    @JsonProperty(value = "projectId")
    private Long projectId;

    /*
     * Parameters in package
     */
    @JsonProperty(value = "parameters")
    private List<SsisParameter> parameters;

    /**
     * Get the folderId property: Folder id which contains package.
     *
     * @return the folderId value.
     */
    public Long folderId() {
        return this.folderId;
    }

    /**
     * Set the folderId property: Folder id which contains package.
     *
     * @param folderId the folderId value to set.
     * @return the SsisPackage object itself.
     */
    public SsisPackage withFolderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }

    /**
     * Get the projectVersion property: Project version which contains package.
     *
     * @return the projectVersion value.
     */
    public Long projectVersion() {
        return this.projectVersion;
    }

    /**
     * Set the projectVersion property: Project version which contains package.
     *
     * @param projectVersion the projectVersion value to set.
     * @return the SsisPackage object itself.
     */
    public SsisPackage withProjectVersion(Long projectVersion) {
        this.projectVersion = projectVersion;
        return this;
    }

    /**
     * Get the projectId property: Project id which contains package.
     *
     * @return the projectId value.
     */
    public Long projectId() {
        return this.projectId;
    }

    /**
     * Set the projectId property: Project id which contains package.
     *
     * @param projectId the projectId value to set.
     * @return the SsisPackage object itself.
     */
    public SsisPackage withProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Get the parameters property: Parameters in package.
     *
     * @return the parameters value.
     */
    public List<SsisParameter> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Parameters in package.
     *
     * @param parameters the parameters value to set.
     * @return the SsisPackage object itself.
     */
    public SsisPackage withParameters(List<SsisParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SsisPackage withId(Long id) {
        super.withId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SsisPackage withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SsisPackage withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (parameters() != null) {
            parameters().forEach(e -> e.validate());
        }
    }
}
