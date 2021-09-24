// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.administration;

import com.azure.analytics.purview.administration.implementation.MetadataPoliciesImpl;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous PurviewMetadataClient type. */
@ServiceClient(builder = PurviewMetadataClientBuilder.class)
public final class MetadataPolicyClient {
    private final MetadataPoliciesImpl serviceClient;

    /**
     * Initializes an instance of MetadataPolicies client.
     *
     * @param serviceClient the service client implementation.
     */
    MetadataPolicyClient(MetadataPoliciesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * List or Get metadata policies.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>collectionName</td><td>String</td><td>No</td><td>The name of an existing collection for which one policy needs to be fetched.</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             name: String
     *             id: String
     *             version: Integer
     *             properties: {
     *                 description: String
     *                 decisionRules: [
     *                     {
     *                         kind: String(decisionrule/attributerule)
     *                         effect: String(Deny/Permit)
     *                         dnfCondition: [
     *                             [
     *                                 {
     *                                     attributeName: String
     *                                     attributeValueIncludes: String
     *                                     attributeValueIncludedIn: [
     *                                         String
     *                                     ]
     *                                     attributeValueExcludes: String
     *                                     attributeValueExcludedIn: [
     *                                         String
     *                                     ]
     *                                 }
     *                             ]
     *                         ]
     *                     }
     *                 ]
     *                 attributeRules: [
     *                     {
     *                         kind: String(decisionrule/attributerule)
     *                         id: String
     *                         name: String
     *                         dnfCondition: [
     *                             [
     *                                 (recursive schema, see above)
     *                             ]
     *                         ]
     *                     }
     *                 ]
     *                 collection: {
     *                     type: String
     *                     referenceName: String
     *                 }
     *                 parentCollectionName: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return list of Metadata Policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listAll(RequestOptions requestOptions) {
        return this.serviceClient.listAll(requestOptions);
    }
}
