// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Common Data Service for Apps entity dataset properties. */
@Fluent
public final class CommonDataServiceForAppsEntityDatasetTypeProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(CommonDataServiceForAppsEntityDatasetTypeProperties.class);

    /*
     * The logical name of the entity. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "entityName")
    private Object entityName;

    /**
     * Get the entityName property: The logical name of the entity. Type: string (or Expression with resultType string).
     *
     * @return the entityName value.
     */
    public Object entityName() {
        return this.entityName;
    }

    /**
     * Set the entityName property: The logical name of the entity. Type: string (or Expression with resultType string).
     *
     * @param entityName the entityName value to set.
     * @return the CommonDataServiceForAppsEntityDatasetTypeProperties object itself.
     */
    public CommonDataServiceForAppsEntityDatasetTypeProperties withEntityName(Object entityName) {
        this.entityName = entityName;
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
