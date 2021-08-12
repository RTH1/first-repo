// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.CredentialReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Key Vault linked service properties. */
@Fluent
public final class AzureKeyVaultLinkedServiceTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureKeyVaultLinkedServiceTypeProperties.class);

    /*
     * The base URL of the Azure Key Vault. e.g. https://myakv.vault.azure.net
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "baseUrl", required = true)
    private Object baseUrl;

    /*
     * The credential reference containing authentication information.
     */
    @JsonProperty(value = "credential")
    private CredentialReference credential;

    /**
     * Get the baseUrl property: The base URL of the Azure Key Vault. e.g. https://myakv.vault.azure.net Type: string
     * (or Expression with resultType string).
     *
     * @return the baseUrl value.
     */
    public Object baseUrl() {
        return this.baseUrl;
    }

    /**
     * Set the baseUrl property: The base URL of the Azure Key Vault. e.g. https://myakv.vault.azure.net Type: string
     * (or Expression with resultType string).
     *
     * @param baseUrl the baseUrl value to set.
     * @return the AzureKeyVaultLinkedServiceTypeProperties object itself.
     */
    public AzureKeyVaultLinkedServiceTypeProperties withBaseUrl(Object baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     *
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.credential;
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     *
     * @param credential the credential value to set.
     * @return the AzureKeyVaultLinkedServiceTypeProperties object itself.
     */
    public AzureKeyVaultLinkedServiceTypeProperties withCredential(CredentialReference credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (baseUrl() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property baseUrl in model AzureKeyVaultLinkedServiceTypeProperties"));
        }
        if (credential() != null) {
            credential().validate();
        }
    }
}
