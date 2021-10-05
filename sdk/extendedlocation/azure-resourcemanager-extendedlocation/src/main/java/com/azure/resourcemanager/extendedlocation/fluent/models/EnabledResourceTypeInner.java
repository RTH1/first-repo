// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.extendedlocation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.extendedlocation.models.EnabledResourceTypePropertiesTypesMetadataItem;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** EnabledResourceType definition. */
@Fluent
public final class EnabledResourceTypeInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EnabledResourceTypeInner.class);

    /*
     * The set of properties for EnabledResourceType specific to a Custom
     * Location
     */
    @JsonProperty(value = "properties")
    private EnabledResourceTypeProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: The set of properties for EnabledResourceType specific to a Custom Location.
     *
     * @return the innerProperties value.
     */
    private EnabledResourceTypeProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the clusterExtensionId property: Cluster Extension ID.
     *
     * @return the clusterExtensionId value.
     */
    public String clusterExtensionId() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterExtensionId();
    }

    /**
     * Set the clusterExtensionId property: Cluster Extension ID.
     *
     * @param clusterExtensionId the clusterExtensionId value to set.
     * @return the EnabledResourceTypeInner object itself.
     */
    public EnabledResourceTypeInner withClusterExtensionId(String clusterExtensionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EnabledResourceTypeProperties();
        }
        this.innerProperties().withClusterExtensionId(clusterExtensionId);
        return this;
    }

    /**
     * Get the extensionType property: Cluster Extension Type.
     *
     * @return the extensionType value.
     */
    public String extensionType() {
        return this.innerProperties() == null ? null : this.innerProperties().extensionType();
    }

    /**
     * Set the extensionType property: Cluster Extension Type.
     *
     * @param extensionType the extensionType value to set.
     * @return the EnabledResourceTypeInner object itself.
     */
    public EnabledResourceTypeInner withExtensionType(String extensionType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EnabledResourceTypeProperties();
        }
        this.innerProperties().withExtensionType(extensionType);
        return this;
    }

    /**
     * Get the typesMetadata property: Metadata of the Resource Type.
     *
     * @return the typesMetadata value.
     */
    public List<EnabledResourceTypePropertiesTypesMetadataItem> typesMetadata() {
        return this.innerProperties() == null ? null : this.innerProperties().typesMetadata();
    }

    /**
     * Set the typesMetadata property: Metadata of the Resource Type.
     *
     * @param typesMetadata the typesMetadata value to set.
     * @return the EnabledResourceTypeInner object itself.
     */
    public EnabledResourceTypeInner withTypesMetadata(
        List<EnabledResourceTypePropertiesTypesMetadataItem> typesMetadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EnabledResourceTypeProperties();
        }
        this.innerProperties().withTypesMetadata(typesMetadata);
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
