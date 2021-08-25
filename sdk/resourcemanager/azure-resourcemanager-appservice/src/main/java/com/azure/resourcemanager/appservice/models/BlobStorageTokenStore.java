// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.fluent.models.BlobStorageTokenStoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The configuration settings of the storage of the tokens if blob storage is used. */
@Fluent
public final class BlobStorageTokenStore extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BlobStorageTokenStore.class);

    /*
     * BlobStorageTokenStore resource specific properties
     */
    @JsonProperty(value = "properties")
    private BlobStorageTokenStoreProperties innerProperties;

    /**
     * Get the innerProperties property: BlobStorageTokenStore resource specific properties.
     *
     * @return the innerProperties value.
     */
    private BlobStorageTokenStoreProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public BlobStorageTokenStore withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the sasUrlSettingName property: The name of the app setting containing the SAS URL of the blob storage
     * containing the tokens.
     *
     * @return the sasUrlSettingName value.
     */
    public String sasUrlSettingName() {
        return this.innerProperties() == null ? null : this.innerProperties().sasUrlSettingName();
    }

    /**
     * Set the sasUrlSettingName property: The name of the app setting containing the SAS URL of the blob storage
     * containing the tokens.
     *
     * @param sasUrlSettingName the sasUrlSettingName value to set.
     * @return the BlobStorageTokenStore object itself.
     */
    public BlobStorageTokenStore withSasUrlSettingName(String sasUrlSettingName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BlobStorageTokenStoreProperties();
        }
        this.innerProperties().withSasUrlSettingName(sasUrlSettingName);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
