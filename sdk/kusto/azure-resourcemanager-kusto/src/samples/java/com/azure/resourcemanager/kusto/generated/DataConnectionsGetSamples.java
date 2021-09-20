// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.Context;

/** Samples for DataConnections Get. */
public final class DataConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2021-08-27/examples/KustoDataConnectionsGet.json
     */
    /**
     * Sample code: KustoDataConnectionsGet.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoDataConnectionsGet(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .dataConnections()
            .getWithResponse("kustorptest", "kustoclusterrptest4", "KustoDatabase8", "DataConnections8", Context.NONE);
    }
}
