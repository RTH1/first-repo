// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for WorkspaceManagedSqlServerExtendedBlobAuditingPolicies ListByWorkspace. */
public final class WorkspaceManagedSqlServerExtendedBlobAuditingPoliciesListByWorkspaceSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-06-01/examples/ListWorkspaceManagedSqlServerExtendedBlobAuditingSettings.json
     */
    /**
     * Sample code: Get workspace managed sql server's extended blob auditing settings.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void getWorkspaceManagedSqlServerSExtendedBlobAuditingSettings(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .workspaceManagedSqlServerExtendedBlobAuditingPolicies()
            .listByWorkspace("wsg-7398", "testWorkspace", Context.NONE);
    }
}
