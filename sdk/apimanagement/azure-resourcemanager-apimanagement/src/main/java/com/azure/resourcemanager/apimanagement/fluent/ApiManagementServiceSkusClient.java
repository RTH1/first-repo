// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.ResourceSkuResultInner;

/** An instance of this class provides access to all the operations defined in ApiManagementServiceSkusClient. */
public interface ApiManagementServiceSkusClient {
    /**
     * Gets all available SKU for a given API Management service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available SKU for a given API Management service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceSkuResultInner> listAvailableServiceSkus(String resourceGroupName, String serviceName);

    /**
     * Gets all available SKU for a given API Management service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available SKU for a given API Management service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceSkuResultInner> listAvailableServiceSkus(
        String resourceGroupName, String serviceName, Context context);
}