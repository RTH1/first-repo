// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkFunctionVendorInner;
import java.util.List;

/** An immutable client-side representation of NetworkFunctionVendor. */
public interface NetworkFunctionVendor {
    /**
     * Gets the vendorName property: The network function vendor name.
     *
     * @return the vendorName value.
     */
    String vendorName();

    /**
     * Gets the skuList property: The network function sku list.
     *
     * @return the skuList value.
     */
    List<SkuOverview> skuList();

    /**
     * Gets the inner com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkFunctionVendorInner object.
     *
     * @return the inner object.
     */
    NetworkFunctionVendorInner innerModel();
}
