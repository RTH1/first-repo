/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import rx.Observable;
import com.microsoft.azure.management.synapse.v2020_12_01.implementation.SqlPoolConnectionPoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SqlPoolConnectionPolicies.
 */
public interface SqlPoolConnectionPolicies extends HasInner<SqlPoolConnectionPoliciesInner> {
    /**
     * Get a Sql pool's connection policy, which is used with table auditing.
     * Get a Sql pool's connection policy, which is used with table auditing.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlPoolConnectionPolicy> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName);

}