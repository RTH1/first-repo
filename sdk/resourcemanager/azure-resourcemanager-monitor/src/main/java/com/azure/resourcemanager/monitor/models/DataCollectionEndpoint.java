// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Definition of data collection endpoint. */
@Fluent
public class DataCollectionEndpoint {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataCollectionEndpoint.class);

    /*
     * Description of the data collection endpoint.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The immutable ID of this data collection endpoint resource. This
     * property is READ-ONLY.
     */
    @JsonProperty(value = "immutableId")
    private String immutableId;

    /*
     * The endpoint used by agents to access their configuration.
     */
    @JsonProperty(value = "configurationAccess")
    private DataCollectionEndpointConfigurationAccess configurationAccess;

    /*
     * The endpoint used by clients to ingest logs.
     */
    @JsonProperty(value = "logsIngestion")
    private DataCollectionEndpointLogsIngestion logsIngestion;

    /*
     * Network access control rules for the endpoints.
     */
    @JsonProperty(value = "networkAcls")
    private DataCollectionEndpointNetworkAcls networkAcls;

    /*
     * The resource provisioning state. This property is READ-ONLY.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private KnownDataCollectionEndpointProvisioningState provisioningState;

    /**
     * Get the description property: Description of the data collection endpoint.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the data collection endpoint.
     *
     * @param description the description value to set.
     * @return the DataCollectionEndpoint object itself.
     */
    public DataCollectionEndpoint withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the immutableId property: The immutable ID of this data collection endpoint resource. This property is
     * READ-ONLY.
     *
     * @return the immutableId value.
     */
    public String immutableId() {
        return this.immutableId;
    }

    /**
     * Set the immutableId property: The immutable ID of this data collection endpoint resource. This property is
     * READ-ONLY.
     *
     * @param immutableId the immutableId value to set.
     * @return the DataCollectionEndpoint object itself.
     */
    public DataCollectionEndpoint withImmutableId(String immutableId) {
        this.immutableId = immutableId;
        return this;
    }

    /**
     * Get the configurationAccess property: The endpoint used by agents to access their configuration.
     *
     * @return the configurationAccess value.
     */
    public DataCollectionEndpointConfigurationAccess configurationAccess() {
        return this.configurationAccess;
    }

    /**
     * Set the configurationAccess property: The endpoint used by agents to access their configuration.
     *
     * @param configurationAccess the configurationAccess value to set.
     * @return the DataCollectionEndpoint object itself.
     */
    public DataCollectionEndpoint withConfigurationAccess(
        DataCollectionEndpointConfigurationAccess configurationAccess) {
        this.configurationAccess = configurationAccess;
        return this;
    }

    /**
     * Get the logsIngestion property: The endpoint used by clients to ingest logs.
     *
     * @return the logsIngestion value.
     */
    public DataCollectionEndpointLogsIngestion logsIngestion() {
        return this.logsIngestion;
    }

    /**
     * Set the logsIngestion property: The endpoint used by clients to ingest logs.
     *
     * @param logsIngestion the logsIngestion value to set.
     * @return the DataCollectionEndpoint object itself.
     */
    public DataCollectionEndpoint withLogsIngestion(DataCollectionEndpointLogsIngestion logsIngestion) {
        this.logsIngestion = logsIngestion;
        return this;
    }

    /**
     * Get the networkAcls property: Network access control rules for the endpoints.
     *
     * @return the networkAcls value.
     */
    public DataCollectionEndpointNetworkAcls networkAcls() {
        return this.networkAcls;
    }

    /**
     * Set the networkAcls property: Network access control rules for the endpoints.
     *
     * @param networkAcls the networkAcls value to set.
     * @return the DataCollectionEndpoint object itself.
     */
    public DataCollectionEndpoint withNetworkAcls(DataCollectionEndpointNetworkAcls networkAcls) {
        this.networkAcls = networkAcls;
        return this;
    }

    /**
     * Get the provisioningState property: The resource provisioning state. This property is READ-ONLY.
     *
     * @return the provisioningState value.
     */
    public KnownDataCollectionEndpointProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configurationAccess() != null) {
            configurationAccess().validate();
        }
        if (logsIngestion() != null) {
            logsIngestion().validate();
        }
        if (networkAcls() != null) {
            networkAcls().validate();
        }
    }
}
