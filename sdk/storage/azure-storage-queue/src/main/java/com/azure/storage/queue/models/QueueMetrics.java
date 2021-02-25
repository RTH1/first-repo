// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The QueueMetrics model. */
@JacksonXmlRootElement(localName = "Metrics")
@Fluent
public final class QueueMetrics {
    /*
     * The version of Storage Analytics to configure.
     */
    @JsonProperty(value = "Version")
    private String version;

    /*
     * Indicates whether metrics are enabled for the Queue service.
     */
    @JsonProperty(value = "Enabled", required = true)
    private boolean enabled;

    /*
     * the retention policy
     */
    @JsonProperty(value = "RetentionPolicy")
    private QueueRetentionPolicy retentionPolicy;

    /*
     * Indicates whether metrics should generate summary statistics for called
     * API operations.
     */
    @JsonProperty(value = "IncludeAPIs")
    private Boolean includeApis;

    /**
     * Get the version property: The version of Storage Analytics to configure.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of Storage Analytics to configure.
     *
     * @param version the version value to set.
     * @return the QueueMetrics object itself.
     */
    public QueueMetrics setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether metrics are enabled for the Queue service.
     *
     * @return the enabled value.
     */
    public boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether metrics are enabled for the Queue service.
     *
     * @param enabled the enabled value to set.
     * @return the QueueMetrics object itself.
     */
    public QueueMetrics setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the retentionPolicy property: the retention policy.
     *
     * @return the retentionPolicy value.
     */
    public QueueRetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: the retention policy.
     *
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the QueueMetrics object itself.
     */
    public QueueMetrics setRetentionPolicy(QueueRetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * Get the includeApis property: Indicates whether metrics should generate summary statistics for called API
     * operations.
     *
     * @return the includeApis value.
     */
    public Boolean isIncludeApis() {
        return this.includeApis;
    }

    /**
     * Set the includeApis property: Indicates whether metrics should generate summary statistics for called API
     * operations.
     *
     * @param includeApis the includeApis value to set.
     * @return the QueueMetrics object itself.
     */
    public QueueMetrics setIncludeApis(Boolean includeApis) {
        this.includeApis = includeApis;
        return this;
    }
}
