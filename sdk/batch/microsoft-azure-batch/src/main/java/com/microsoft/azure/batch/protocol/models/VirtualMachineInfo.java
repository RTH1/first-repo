/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Info about the current state of the virtual machine.
 */
public class VirtualMachineInfo {
    /**
     * The reference to the Azure Virtual Machine's Marketplace Image.
     */
    @JsonProperty(value = "imageReference")
    private ImageReference imageReference;

    /**
     * Get the imageReference value.
     *
     * @return the imageReference value
     */
    public ImageReference imageReference() {
        return this.imageReference;
    }

    /**
     * Set the imageReference value.
     *
     * @param imageReference the imageReference value to set
     * @return the VirtualMachineInfo object itself.
     */
    public VirtualMachineInfo withImageReference(ImageReference imageReference) {
        this.imageReference = imageReference;
        return this;
    }

}
