// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.administration;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CollectionsListChildCollectionNames {
    public static void main(String[] args) {
        CollectionsClient client =
                new PurviewAccountClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildCollectionsClient();
        PagedIterable<BinaryData> response = client.listChildCollectionNames("myCollection1", null);
    }
}
