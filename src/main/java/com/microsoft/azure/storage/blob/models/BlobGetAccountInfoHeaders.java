/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.microsoft.rest.v2.DateTimeRfc1123;
import java.time.OffsetDateTime;

/**
 * Defines headers for GetAccountInfo operation.
 */
@JacksonXmlRootElement(localName = "Blob-GetAccountInfo-Headers")
public final class BlobGetAccountInfoHeaders {
    /**
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /**
     * Indicates the version of the Blob service used to execute the request.
     * This header is returned for requests made against version 2009-09-19 and
     * above.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /**
     * UTC date/time value generated by the service that indicates the time at
     * which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 date;

    /**
     * Identifies the sku name of the account. Possible values include:
     * 'Standard_LRS', 'Standard_GRS', 'Standard_RAGRS', 'Standard_ZRS',
     * 'Premium_LRS'.
     */
    @JsonProperty(value = "x-ms-sku-name")
    private SkuName skuName;

    /**
     * Identifies the account kind. Possible values include: 'Storage',
     * 'BlobStorage', 'StorageV2'.
     */
    @JsonProperty(value = "x-ms-account-kind")
    private AccountKind accountKind;

    /**
     * Get the requestId value.
     *
     * @return the requestId value.
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId value.
     *
     * @param requestId the requestId value to set.
     * @return the BlobGetAccountInfoHeaders object itself.
     */
    public BlobGetAccountInfoHeaders withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set.
     * @return the BlobGetAccountInfoHeaders object itself.
     */
    public BlobGetAccountInfoHeaders withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the date value.
     *
     * @return the date value.
     */
    public OffsetDateTime date() {
        if (this.date == null) {
            return null;
        }
        return this.date.dateTime();
    }

    /**
     * Set the date value.
     *
     * @param date the date value to set.
     * @return the BlobGetAccountInfoHeaders object itself.
     */
    public BlobGetAccountInfoHeaders withDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }

    /**
     * Get the skuName value.
     *
     * @return the skuName value.
     */
    public SkuName skuName() {
        return this.skuName;
    }

    /**
     * Set the skuName value.
     *
     * @param skuName the skuName value to set.
     * @return the BlobGetAccountInfoHeaders object itself.
     */
    public BlobGetAccountInfoHeaders withSkuName(SkuName skuName) {
        this.skuName = skuName;
        return this;
    }

    /**
     * Get the accountKind value.
     *
     * @return the accountKind value.
     */
    public AccountKind accountKind() {
        return this.accountKind;
    }

    /**
     * Set the accountKind value.
     *
     * @param accountKind the accountKind value to set.
     * @return the BlobGetAccountInfoHeaders object itself.
     */
    public BlobGetAccountInfoHeaders withAccountKind(AccountKind accountKind) {
        this.accountKind = accountKind;
        return this;
    }
}
