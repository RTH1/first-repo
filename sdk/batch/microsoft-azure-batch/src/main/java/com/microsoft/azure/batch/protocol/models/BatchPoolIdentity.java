/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The identity of the Batch pool, if configured.
 * The identity of the Batch pool, if configured.
 */
public class BatchPoolIdentity {
    /**
     * The identity of the Batch pool, if configured.
     * The list of user identities associated with the Batch pool. The user
     * identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * Possible values include: 'UserAssigned', 'None'.
     */
    @JsonProperty(value = "type", required = true)
    private PoolIdentityType type;

    /**
     * The list of user identities associated with the Batch account.
     * The user identity dictionary key references will be ARM resource ids in
     * the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     */
    @JsonProperty(value = "userAssignedIdentities")
    private List<UserAssignedIdentity> userAssignedIdentities;

    /**
     * Get the list of user identities associated with the Batch pool. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'. Possible values include: 'UserAssigned', 'None'.
     *
     * @return the type value
     */
    public PoolIdentityType type() {
        return this.type;
    }

    /**
     * Set the list of user identities associated with the Batch pool. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'. Possible values include: 'UserAssigned', 'None'.
     *
     * @param type the type value to set
     * @return the BatchPoolIdentity object itself.
     */
    public BatchPoolIdentity withType(PoolIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @return the userAssignedIdentities value
     */
    public List<UserAssignedIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set
     * @return the BatchPoolIdentity object itself.
     */
    public BatchPoolIdentity withUserAssignedIdentities(List<UserAssignedIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

}
