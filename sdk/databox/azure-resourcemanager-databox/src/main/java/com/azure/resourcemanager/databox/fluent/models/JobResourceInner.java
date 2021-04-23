// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databox.models.CloudError;
import com.azure.resourcemanager.databox.models.JobDeliveryInfo;
import com.azure.resourcemanager.databox.models.JobDeliveryType;
import com.azure.resourcemanager.databox.models.JobDetails;
import com.azure.resourcemanager.databox.models.ResourceIdentity;
import com.azure.resourcemanager.databox.models.Sku;
import com.azure.resourcemanager.databox.models.StageName;
import com.azure.resourcemanager.databox.models.TransferType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Job Resource. */
@JsonFlatten
@Fluent
public class JobResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobResourceInner.class);

    /*
     * Name of the object.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Id of the object.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Type of the object.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Type of the data transfer.
     */
    @JsonProperty(value = "properties.transferType", required = true)
    private TransferType transferType;

    /*
     * Describes whether the job is cancellable or not.
     */
    @JsonProperty(value = "properties.isCancellable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isCancellable;

    /*
     * Describes whether the job is deletable or not.
     */
    @JsonProperty(value = "properties.isDeletable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDeletable;

    /*
     * Describes whether the shipping address is editable or not.
     */
    @JsonProperty(value = "properties.isShippingAddressEditable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isShippingAddressEditable;

    /*
     * Is Prepare To Ship Enabled on this job
     */
    @JsonProperty(value = "properties.isPrepareToShipEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isPrepareToShipEnabled;

    /*
     * Name of the stage which is in progress.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private StageName status;

    /*
     * Time at which the job was started in UTC ISO 8601 format.
     */
    @JsonProperty(value = "properties.startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * Top level error for the job.
     */
    @JsonProperty(value = "properties.error", access = JsonProperty.Access.WRITE_ONLY)
    private CloudError error;

    /*
     * Details of a job run. This field will only be sent for expand details
     * filter.
     */
    @JsonProperty(value = "properties.details")
    private JobDetails details;

    /*
     * Reason for cancellation.
     */
    @JsonProperty(value = "properties.cancellationReason", access = JsonProperty.Access.WRITE_ONLY)
    private String cancellationReason;

    /*
     * Delivery type of Job.
     */
    @JsonProperty(value = "properties.deliveryType")
    private JobDeliveryType deliveryType;

    /*
     * Delivery Info of Job.
     */
    @JsonProperty(value = "properties.deliveryInfo")
    private JobDeliveryInfo deliveryInfo;

    /*
     * Flag to indicate cancellation of scheduled job.
     */
    @JsonProperty(value = "properties.isCancellableWithoutFee", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isCancellableWithoutFee;

    /*
     * The sku type.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * Msi identity of the resource
     */
    @JsonProperty(value = "identity")
    private ResourceIdentity identity;

    /**
     * Get the name property: Name of the object.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Id of the object.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the type property: Type of the object.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
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
     * Get the transferType property: Type of the data transfer.
     *
     * @return the transferType value.
     */
    public TransferType transferType() {
        return this.transferType;
    }

    /**
     * Set the transferType property: Type of the data transfer.
     *
     * @param transferType the transferType value to set.
     * @return the JobResourceInner object itself.
     */
    public JobResourceInner withTransferType(TransferType transferType) {
        this.transferType = transferType;
        return this;
    }

    /**
     * Get the isCancellable property: Describes whether the job is cancellable or not.
     *
     * @return the isCancellable value.
     */
    public Boolean isCancellable() {
        return this.isCancellable;
    }

    /**
     * Get the isDeletable property: Describes whether the job is deletable or not.
     *
     * @return the isDeletable value.
     */
    public Boolean isDeletable() {
        return this.isDeletable;
    }

    /**
     * Get the isShippingAddressEditable property: Describes whether the shipping address is editable or not.
     *
     * @return the isShippingAddressEditable value.
     */
    public Boolean isShippingAddressEditable() {
        return this.isShippingAddressEditable;
    }

    /**
     * Get the isPrepareToShipEnabled property: Is Prepare To Ship Enabled on this job.
     *
     * @return the isPrepareToShipEnabled value.
     */
    public Boolean isPrepareToShipEnabled() {
        return this.isPrepareToShipEnabled;
    }

    /**
     * Get the status property: Name of the stage which is in progress.
     *
     * @return the status value.
     */
    public StageName status() {
        return this.status;
    }

    /**
     * Get the startTime property: Time at which the job was started in UTC ISO 8601 format.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the error property: Top level error for the job.
     *
     * @return the error value.
     */
    public CloudError error() {
        return this.error;
    }

    /**
     * Get the details property: Details of a job run. This field will only be sent for expand details filter.
     *
     * @return the details value.
     */
    public JobDetails details() {
        return this.details;
    }

    /**
     * Set the details property: Details of a job run. This field will only be sent for expand details filter.
     *
     * @param details the details value to set.
     * @return the JobResourceInner object itself.
     */
    public JobResourceInner withDetails(JobDetails details) {
        this.details = details;
        return this;
    }

    /**
     * Get the cancellationReason property: Reason for cancellation.
     *
     * @return the cancellationReason value.
     */
    public String cancellationReason() {
        return this.cancellationReason;
    }

    /**
     * Get the deliveryType property: Delivery type of Job.
     *
     * @return the deliveryType value.
     */
    public JobDeliveryType deliveryType() {
        return this.deliveryType;
    }

    /**
     * Set the deliveryType property: Delivery type of Job.
     *
     * @param deliveryType the deliveryType value to set.
     * @return the JobResourceInner object itself.
     */
    public JobResourceInner withDeliveryType(JobDeliveryType deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }

    /**
     * Get the deliveryInfo property: Delivery Info of Job.
     *
     * @return the deliveryInfo value.
     */
    public JobDeliveryInfo deliveryInfo() {
        return this.deliveryInfo;
    }

    /**
     * Set the deliveryInfo property: Delivery Info of Job.
     *
     * @param deliveryInfo the deliveryInfo value to set.
     * @return the JobResourceInner object itself.
     */
    public JobResourceInner withDeliveryInfo(JobDeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
        return this;
    }

    /**
     * Get the isCancellableWithoutFee property: Flag to indicate cancellation of scheduled job.
     *
     * @return the isCancellableWithoutFee value.
     */
    public Boolean isCancellableWithoutFee() {
        return this.isCancellableWithoutFee;
    }

    /**
     * Get the sku property: The sku type.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku type.
     *
     * @param sku the sku value to set.
     * @return the JobResourceInner object itself.
     */
    public JobResourceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity property: Msi identity of the resource.
     *
     * @return the identity value.
     */
    public ResourceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Msi identity of the resource.
     *
     * @param identity the identity value to set.
     * @return the JobResourceInner object itself.
     */
    public JobResourceInner withIdentity(ResourceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JobResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JobResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (transferType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property transferType in model JobResourceInner"));
        }
        if (error() != null) {
            error().validate();
        }
        if (details() != null) {
            details().validate();
        }
        if (deliveryInfo() != null) {
            deliveryInfo().validate();
        }
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model JobResourceInner"));
        } else {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
