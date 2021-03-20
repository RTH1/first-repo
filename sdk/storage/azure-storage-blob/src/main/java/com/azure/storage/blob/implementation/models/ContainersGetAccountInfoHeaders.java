// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.storage.blob.models.AccountKind;
import com.azure.storage.blob.models.SkuName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** The ContainersGetAccountInfoHeaders model. */
@JacksonXmlRootElement(localName = "null")
@Fluent
public final class ContainersGetAccountInfoHeaders {
    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The x-ms-account-kind property.
     */
    @JsonProperty(value = "x-ms-account-kind")
    private AccountKind xMsAccountKind;

    /*
     * The x-ms-sku-name property.
     */
    @JsonProperty(value = "x-ms-sku-name")
    private SkuName xMsSkuName;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The x-ms-client-request-id property.
     */
    @JsonProperty(value = "x-ms-client-request-id")
    private String xMsClientRequestId;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /**
     * Get the xMsVersion property: The x-ms-version property.
     *
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     *
     * @param xMsVersion the xMsVersion value to set.
     * @return the ContainersGetAccountInfoHeaders object itself.
     */
    public ContainersGetAccountInfoHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsAccountKind property: The x-ms-account-kind property.
     *
     * @return the xMsAccountKind value.
     */
    public AccountKind getXMsAccountKind() {
        return this.xMsAccountKind;
    }

    /**
     * Set the xMsAccountKind property: The x-ms-account-kind property.
     *
     * @param xMsAccountKind the xMsAccountKind value to set.
     * @return the ContainersGetAccountInfoHeaders object itself.
     */
    public ContainersGetAccountInfoHeaders setXMsAccountKind(AccountKind xMsAccountKind) {
        this.xMsAccountKind = xMsAccountKind;
        return this;
    }

    /**
     * Get the xMsSkuName property: The x-ms-sku-name property.
     *
     * @return the xMsSkuName value.
     */
    public SkuName getXMsSkuName() {
        return this.xMsSkuName;
    }

    /**
     * Set the xMsSkuName property: The x-ms-sku-name property.
     *
     * @param xMsSkuName the xMsSkuName value to set.
     * @return the ContainersGetAccountInfoHeaders object itself.
     */
    public ContainersGetAccountInfoHeaders setXMsSkuName(SkuName xMsSkuName) {
        this.xMsSkuName = xMsSkuName;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     *
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the ContainersGetAccountInfoHeaders object itself.
     */
    public ContainersGetAccountInfoHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsClientRequestId property: The x-ms-client-request-id property.
     *
     * @return the xMsClientRequestId value.
     */
    public String getXMsClientRequestId() {
        return this.xMsClientRequestId;
    }

    /**
     * Set the xMsClientRequestId property: The x-ms-client-request-id property.
     *
     * @param xMsClientRequestId the xMsClientRequestId value to set.
     * @return the ContainersGetAccountInfoHeaders object itself.
     */
    public ContainersGetAccountInfoHeaders setXMsClientRequestId(String xMsClientRequestId) {
        this.xMsClientRequestId = xMsClientRequestId;
        return this;
    }

    /**
     * Get the dateProperty property: The Date property.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: The Date property.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the ContainersGetAccountInfoHeaders object itself.
     */
    public ContainersGetAccountInfoHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }
}