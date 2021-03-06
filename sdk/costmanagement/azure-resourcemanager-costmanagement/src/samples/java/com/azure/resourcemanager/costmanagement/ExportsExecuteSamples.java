// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement;

import com.azure.core.util.Context;

/** Samples for Exports Execute. */
public final class ExportsExecuteSamples {
    /**
     * Sample code: EnrollmentAccountExecuteExport.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void enrollmentAccountExecuteExport(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .exports()
            .executeWithResponse(
                "providers/Microsoft.Billing/billingAccounts/100/enrollmentAccounts/456", "TestExport", Context.NONE);
    }

    /**
     * Sample code: BillingAccountExecuteExport.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void billingAccountExecuteExport(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .exports()
            .executeWithResponse("providers/Microsoft.Billing/billingAccounts/123456", "TestExport", Context.NONE);
    }

    /**
     * Sample code: ResourceGroupExecuteExport.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void resourceGroupExecuteExport(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .exports()
            .executeWithResponse(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/MYDEVTESTRG",
                "TestExport",
                Context.NONE);
    }

    /**
     * Sample code: SubscriptionExecuteExport.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void subscriptionExecuteExport(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .exports()
            .executeWithResponse("subscriptions/00000000-0000-0000-0000-000000000000", "TestExport", Context.NONE);
    }

    /**
     * Sample code: DepartmentExecuteExport.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void departmentExecuteExport(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .exports()
            .executeWithResponse(
                "providers/Microsoft.Billing/billingAccounts/12/departments/1234", "TestExport", Context.NONE);
    }

    /**
     * Sample code: ManagementGroupExecuteExport.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void managementGroupExecuteExport(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .exports()
            .executeWithResponse("providers/Microsoft.Management/managementGroups/TestMG", "TestExport", Context.NONE);
    }
}
