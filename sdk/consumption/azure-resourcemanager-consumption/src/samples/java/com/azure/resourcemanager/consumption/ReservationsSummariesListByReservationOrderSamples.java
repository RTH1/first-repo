// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption;

import com.azure.core.util.Context;
import com.azure.resourcemanager.consumption.models.Datagrain;

/** Samples for ReservationsSummaries ListByReservationOrder. */
public final class ReservationsSummariesListByReservationOrderSamples {
    /**
     * Sample code: ReservationSummariesMonthly.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void reservationSummariesMonthly(
        com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager
            .reservationsSummaries()
            .listByReservationOrder("00000000-0000-0000-0000-000000000000", Datagrain.MONTHLY, null, Context.NONE);
    }

    /**
     * Sample code: ReservationSummariesDaily.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void reservationSummariesDaily(
        com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager
            .reservationsSummaries()
            .listByReservationOrder(
                "00000000-0000-0000-0000-000000000000",
                Datagrain.DAILY,
                "properties/usageDate ge 2017-10-01 AND properties/usageDate le 2017-11-20",
                Context.NONE);
    }
}
