/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2020_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerinstance.v2020_11_01.implementation.CapabilitiesInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerinstance.v2020_11_01.implementation.ContainerInstanceManager;

/**
 * Type representing Capabilities.
 */
public interface Capabilities extends HasInner<CapabilitiesInner>, HasManager<ContainerInstanceManager> {
    /**
     * @return the capabilities value.
     */
    CapabilitiesCapabilities capabilities();

    /**
     * @return the gpu value.
     */
    String gpu();

    /**
     * @return the ipAddressType value.
     */
    String ipAddressType();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the osType value.
     */
    String osType();

    /**
     * @return the resourceType value.
     */
    String resourceType();

}
