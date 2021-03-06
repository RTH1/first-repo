// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The URL to download the generated report. */
@Fluent
public final class ReportUrl {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReportUrl.class);

    /*
     * The URL to download the generated report.
     */
    @JsonProperty(value = "reportUrl")
    private String reportUrl;

    /*
     * The time at which report URL becomes invalid.
     */
    @JsonProperty(value = "validUntil")
    private OffsetDateTime validUntil;

    /**
     * Get the reportUrl property: The URL to download the generated report.
     *
     * @return the reportUrl value.
     */
    public String reportUrl() {
        return this.reportUrl;
    }

    /**
     * Set the reportUrl property: The URL to download the generated report.
     *
     * @param reportUrl the reportUrl value to set.
     * @return the ReportUrl object itself.
     */
    public ReportUrl withReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
        return this;
    }

    /**
     * Get the validUntil property: The time at which report URL becomes invalid.
     *
     * @return the validUntil value.
     */
    public OffsetDateTime validUntil() {
        return this.validUntil;
    }

    /**
     * Set the validUntil property: The time at which report URL becomes invalid.
     *
     * @param validUntil the validUntil value to set.
     * @return the ReportUrl object itself.
     */
    public ReportUrl withValidUntil(OffsetDateTime validUntil) {
        this.validUntil = validUntil;
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
