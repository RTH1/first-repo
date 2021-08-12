// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.costmanagement.models.CacheItem;
import com.azure.resourcemanager.costmanagement.models.ProxySettingResource;
import com.azure.resourcemanager.costmanagement.models.SettingsPropertiesStartOn;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** State of the myscope setting. */
@Fluent
public final class SettingInner extends ProxySettingResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SettingInner.class);

    /*
     * The properties of the setting.
     */
    @JsonProperty(value = "properties")
    private SettingsProperties innerProperties;

    /**
     * Get the innerProperties property: The properties of the setting.
     *
     * @return the innerProperties value.
     */
    private SettingsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the scope property: Sets the default scope the current user will see when they sign into Azure Cost
     * Management in the Azure portal.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Set the scope property: Sets the default scope the current user will see when they sign into Azure Cost
     * Management in the Azure portal.
     *
     * @param scope the scope value to set.
     * @return the SettingInner object itself.
     */
    public SettingInner withScope(String scope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SettingsProperties();
        }
        this.innerProperties().withScope(scope);
        return this;
    }

    /**
     * Get the startOn property: Indicates what scope Cost Management in the Azure portal should default to. Allowed
     * values: LastUsed.
     *
     * @return the startOn value.
     */
    public SettingsPropertiesStartOn startOn() {
        return this.innerProperties() == null ? null : this.innerProperties().startOn();
    }

    /**
     * Set the startOn property: Indicates what scope Cost Management in the Azure portal should default to. Allowed
     * values: LastUsed.
     *
     * @param startOn the startOn value to set.
     * @return the SettingInner object itself.
     */
    public SettingInner withStartOn(SettingsPropertiesStartOn startOn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SettingsProperties();
        }
        this.innerProperties().withStartOn(startOn);
        return this;
    }

    /**
     * Get the cache property: Array of scopes with additional details used by Cost Management in the Azure portal.
     *
     * @return the cache value.
     */
    public List<CacheItem> cache() {
        return this.innerProperties() == null ? null : this.innerProperties().cache();
    }

    /**
     * Set the cache property: Array of scopes with additional details used by Cost Management in the Azure portal.
     *
     * @param cache the cache value to set.
     * @return the SettingInner object itself.
     */
    public SettingInner withCache(List<CacheItem> cache) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SettingsProperties();
        }
        this.innerProperties().withCache(cache);
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
