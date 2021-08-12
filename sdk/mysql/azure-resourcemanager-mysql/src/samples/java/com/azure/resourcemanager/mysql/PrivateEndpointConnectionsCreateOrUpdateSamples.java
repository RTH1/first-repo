// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql;

import com.azure.resourcemanager.mysql.models.PrivateLinkServiceConnectionStateProperty;

/** Samples for PrivateEndpointConnections CreateOrUpdate. */
public final class PrivateEndpointConnectionsCreateOrUpdateSamples {
    /**
     * Sample code: Approve or reject a private endpoint connection with a given name.
     *
     * @param mySqlManager Entry point to MySqlManager. The Microsoft Azure management API provides create, read,
     *     update, and delete functionality for Azure MySQL resources including servers, databases, firewall rules, VNET
     *     rules, log files and configurations with new business model.
     */
    public static void approveOrRejectAPrivateEndpointConnectionWithAGivenName(
        com.azure.resourcemanager.mysql.MySqlManager mySqlManager) {
        mySqlManager
            .privateEndpointConnections()
            .define("private-endpoint-connection-name")
            .withExistingServer("Default", "test-svr")
            .withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionStateProperty()
                    .withStatus("Approved")
                    .withDescription("Approved by johndoe@contoso.com"))
            .create();
    }
}
