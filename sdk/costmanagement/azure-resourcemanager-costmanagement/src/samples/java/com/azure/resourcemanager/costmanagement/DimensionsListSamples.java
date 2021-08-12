// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement;

import com.azure.core.util.Context;

/** Samples for Dimensions List. */
public final class DimensionsListSamples {
    /**
     * Sample code: DepartmentDimensionsList-Legacy.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void departmentDimensionsListLegacy(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Billing/billingAccounts/100/departments/123",
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /**
     * Sample code: CustomerDimensionsList-Modern.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void customerDimensionsListModern(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Billing/billingAccounts/12345:6789/customers/5678",
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /**
     * Sample code: ManagementGroupDimensionsListWithFilter-Legacy.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void managementGroupDimensionsListWithFilterLegacy(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Management/managementGroups/MyMgId",
                "properties/category eq 'resourceId'",
                "properties/data",
                null,
                5,
                Context.NONE);
    }

    /**
     * Sample code: BillingAccountDimensionsList-Legacy.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void billingAccountDimensionsListLegacy(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list("providers/Microsoft.Billing/billingAccounts/100", null, null, null, null, Context.NONE);
    }

    /**
     * Sample code: ManagementGroupDimensionsListExpandAndTop-Legacy.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void managementGroupDimensionsListExpandAndTopLegacy(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Management/managementGroups/MyMgId",
                null,
                "properties/data",
                null,
                5,
                Context.NONE);
    }

    /**
     * Sample code: DepartmentDimensionsListExpandAndTop-Legacy.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void departmentDimensionsListExpandAndTopLegacy(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Billing/billingAccounts/100/departments/123",
                null,
                "properties/data",
                null,
                5,
                Context.NONE);
    }

    /**
     * Sample code: EnrollmentAccountDimensionsList-Legacy.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void enrollmentAccountDimensionsListLegacy(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Billing/billingAccounts/100/enrollmentAccounts/456",
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /**
     * Sample code: BillingAccountDimensionsListWithFilter-Legacy.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void billingAccountDimensionsListWithFilterLegacy(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Billing/billingAccounts/100",
                "properties/category eq 'resourceId'",
                "properties/data",
                null,
                5,
                Context.NONE);
    }

    /**
     * Sample code: CustomerDimensionsListExpandAndTop-Modern.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void customerDimensionsListExpandAndTopModern(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Billing/billingAccounts/12345:6789/customers/5678",
                null,
                "properties/data",
                null,
                5,
                Context.NONE);
    }

    /**
     * Sample code: ResourceGroupDimensionsList-Legacy.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void resourceGroupDimensionsListLegacy(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/system.orlando",
                null,
                "properties/data",
                null,
                5,
                Context.NONE);
    }

    /**
     * Sample code: InvoiceSectionDimensionsListExpandAndTop-Modern.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void invoiceSectionDimensionsListExpandAndTopModern(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Billing/billingAccounts/12345:6789/billingProfiles/13579/invoiceSections/9876",
                null,
                "properties/data",
                null,
                5,
                Context.NONE);
    }

    /**
     * Sample code: CustomerDimensionsListWithFilter-Modern.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void customerDimensionsListWithFilterModern(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Billing/billingAccounts/12345:6789/customers/5678",
                "properties/category eq 'resourceId'",
                "properties/data",
                null,
                5,
                Context.NONE);
    }

    /**
     * Sample code: SubscriptionDimensionsList-Legacy.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void subscriptionDimensionsListLegacy(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list("subscriptions/00000000-0000-0000-0000-000000000000", null, "properties/data", null, 5, Context.NONE);
    }

    /**
     * Sample code: BillingAccountDimensionsListExpandAndTop-Legacy.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void billingAccountDimensionsListExpandAndTopLegacy(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list("providers/Microsoft.Billing/billingAccounts/100", null, "properties/data", null, 5, Context.NONE);
    }

    /**
     * Sample code: EnrollmentAccountDimensionsListExpandAndTop-Legacy.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void enrollmentAccountDimensionsListExpandAndTopLegacy(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Billing/billingAccounts/100/enrollmentAccounts/456",
                null,
                "properties/data",
                null,
                5,
                Context.NONE);
    }

    /**
     * Sample code: DepartmentDimensionsListWithFilter-Legacy.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void departmentDimensionsListWithFilterLegacy(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Billing/billingAccounts/100/departments/123",
                "properties/category eq 'resourceId'",
                "properties/data",
                null,
                5,
                Context.NONE);
    }

    /**
     * Sample code: BillingAccountDimensionsListExpandAndTop-Modern.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void billingAccountDimensionsListExpandAndTopModern(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Billing/billingAccounts/12345:6789",
                null,
                "properties/data",
                null,
                5,
                Context.NONE);
    }

    /**
     * Sample code: BillingProfileDimensionsListExpandAndTop-Modern.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void billingProfileDimensionsListExpandAndTopModern(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Billing/billingAccounts/12345:6789/billingProfiles/13579",
                null,
                "properties/data",
                null,
                5,
                Context.NONE);
    }

    /**
     * Sample code: BillingProfileDimensionsList-Modern.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void billingProfileDimensionsListModern(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Billing/billingAccounts/12345:6789/billingProfiles/13579",
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /**
     * Sample code: ManagementGroupDimensionsList-Legacy.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void managementGroupDimensionsListLegacy(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list("providers/Microsoft.Management/managementGroups/MyMgId", null, null, null, null, Context.NONE);
    }

    /**
     * Sample code: BillingAccountDimensionsListWithFilter-Modern.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void billingAccountDimensionsListWithFilterModern(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Billing/billingAccounts/12345:6789",
                "properties/category eq 'resourceId'",
                "properties/data",
                null,
                5,
                Context.NONE);
    }

    /**
     * Sample code: BillingProfileDimensionsListWithFilter-Modern.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void billingProfileDimensionsListWithFilterModern(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Billing/billingAccounts/12345:6789/billingProfiles/13579",
                "properties/category eq 'resourceId'",
                "properties/data",
                null,
                5,
                Context.NONE);
    }

    /**
     * Sample code: BillingAccountDimensionsList-Modern.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void billingAccountDimensionsListModern(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list("providers/Microsoft.Billing/billingAccounts/12345:6789", null, null, null, null, Context.NONE);
    }

    /**
     * Sample code: InvoiceSectionDimensionsListWithFilter-Modern.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void invoiceSectionDimensionsListWithFilterModern(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Billing/billingAccounts/12345:6789/billingProfiles/13579/invoiceSections/9876",
                "properties/category eq 'resourceId'",
                "properties/data",
                null,
                5,
                Context.NONE);
    }

    /**
     * Sample code: EnrollmentAccountDimensionsListWithFilter-Legacy.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void enrollmentAccountDimensionsListWithFilterLegacy(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Billing/billingAccounts/100/enrollmentAccounts/456",
                "properties/category eq 'resourceId'",
                "properties/data",
                null,
                5,
                Context.NONE);
    }

    /**
     * Sample code: InvoiceSectionDimensionsList-Modern.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void invoiceSectionDimensionsListModern(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .dimensions()
            .list(
                "providers/Microsoft.Billing/billingAccounts/12345:6789/billingProfiles/13579/invoiceSections/9876",
                null,
                null,
                null,
                null,
                Context.NONE);
    }
}
