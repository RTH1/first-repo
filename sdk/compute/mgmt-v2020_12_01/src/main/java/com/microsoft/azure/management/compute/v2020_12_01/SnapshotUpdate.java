/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Snapshot update resource.
 */
@JsonFlatten
public class SnapshotUpdate {
    /**
     * the Operating System type. Possible values include: 'Windows', 'Linux'.
     */
    @JsonProperty(value = "properties.osType")
    private OperatingSystemTypes osType;

    /**
     * If creationData.createOption is Empty, this field is mandatory and it
     * indicates the size of the disk to create. If this field is present for
     * updates or creation with other options, it indicates a resize. Resizes
     * are only allowed if the disk is not attached to a running VM, and can
     * only increase the disk's size.
     */
    @JsonProperty(value = "properties.diskSizeGB")
    private Integer diskSizeGB;

    /**
     * Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     */
    @JsonProperty(value = "properties.encryptionSettingsCollection")
    private EncryptionSettingsCollection encryptionSettingsCollection;

    /**
     * Encryption property can be used to encrypt data at rest with customer
     * managed keys or platform managed keys.
     */
    @JsonProperty(value = "properties.encryption")
    private Encryption encryption;

    /**
     * Possible values include: 'AllowAll', 'AllowPrivate', 'DenyAll'.
     */
    @JsonProperty(value = "properties.networkAccessPolicy")
    private NetworkAccessPolicy networkAccessPolicy;

    /**
     * ARM id of the DiskAccess resource for using private endpoints on disks.
     */
    @JsonProperty(value = "properties.diskAccessId")
    private String diskAccessId;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The sku property.
     */
    @JsonProperty(value = "sku")
    private SnapshotSku sku;

    /**
     * Get the Operating System type. Possible values include: 'Windows', 'Linux'.
     *
     * @return the osType value
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the Operating System type. Possible values include: 'Windows', 'Linux'.
     *
     * @param osType the osType value to set
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get if creationData.createOption is Empty, this field is mandatory and it indicates the size of the disk to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's size.
     *
     * @return the diskSizeGB value
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set if creationData.createOption is Empty, this field is mandatory and it indicates the size of the disk to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's size.
     *
     * @param diskSizeGB the diskSizeGB value to set
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get encryption settings collection used be Azure Disk Encryption, can contain multiple encryption settings per disk or snapshot.
     *
     * @return the encryptionSettingsCollection value
     */
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.encryptionSettingsCollection;
    }

    /**
     * Set encryption settings collection used be Azure Disk Encryption, can contain multiple encryption settings per disk or snapshot.
     *
     * @param encryptionSettingsCollection the encryptionSettingsCollection value to set
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        this.encryptionSettingsCollection = encryptionSettingsCollection;
        return this;
    }

    /**
     * Get encryption property can be used to encrypt data at rest with customer managed keys or platform managed keys.
     *
     * @return the encryption value
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set encryption property can be used to encrypt data at rest with customer managed keys or platform managed keys.
     *
     * @param encryption the encryption value to set
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get possible values include: 'AllowAll', 'AllowPrivate', 'DenyAll'.
     *
     * @return the networkAccessPolicy value
     */
    public NetworkAccessPolicy networkAccessPolicy() {
        return this.networkAccessPolicy;
    }

    /**
     * Set possible values include: 'AllowAll', 'AllowPrivate', 'DenyAll'.
     *
     * @param networkAccessPolicy the networkAccessPolicy value to set
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy) {
        this.networkAccessPolicy = networkAccessPolicy;
        return this;
    }

    /**
     * Get aRM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @return the diskAccessId value
     */
    public String diskAccessId() {
        return this.diskAccessId;
    }

    /**
     * Set aRM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @param diskAccessId the diskAccessId value to set
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withDiskAccessId(String diskAccessId) {
        this.diskAccessId = diskAccessId;
        return this;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public SnapshotSku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withSku(SnapshotSku sku) {
        this.sku = sku;
        return this;
    }

}