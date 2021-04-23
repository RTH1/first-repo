// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.resourcemanager.synapse.fluent.models.ReplaceAllFirewallRulesOperationResponseInner;

/** An immutable client-side representation of ReplaceAllFirewallRulesOperationResponse. */
public interface ReplaceAllFirewallRulesOperationResponse {
    /**
     * Gets the operationId property: The operation ID.
     *
     * @return the operationId value.
     */
    String operationId();

    /**
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.ReplaceAllFirewallRulesOperationResponseInner
     * object.
     *
     * @return the inner object.
     */
    ReplaceAllFirewallRulesOperationResponseInner innerModel();
}
