// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.cdn.fluent.models.SecurityPolicyInner;
import com.azure.resourcemanager.cdn.models.SecurityPolicyParameters;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SecurityPoliciesClient. */
public interface SecurityPoliciesClient {
    /**
     * Lists security policies associated with the profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list security policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SecurityPolicyInner> listByProfileAsync(String resourceGroupName, String profileName);

    /**
     * Lists security policies associated with the profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list security policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityPolicyInner> listByProfile(String resourceGroupName, String profileName);

    /**
     * Lists security policies associated with the profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list security policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityPolicyInner> listByProfile(String resourceGroupName, String profileName, Context context);

    /**
     * Gets an existing security policy within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing security policy within a profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SecurityPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String profileName, String securityPolicyName);

    /**
     * Gets an existing security policy within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing security policy within a profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SecurityPolicyInner> getAsync(String resourceGroupName, String profileName, String securityPolicyName);

    /**
     * Gets an existing security policy within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing security policy within a profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityPolicyInner get(String resourceGroupName, String profileName, String securityPolicyName);

    /**
     * Gets an existing security policy within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing security policy within a profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecurityPolicyInner> getWithResponse(
        String resourceGroupName, String profileName, String securityPolicyName, Context context);

    /**
     * Creates a new security policy within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @param parameters object which contains security policy parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return securityPolicy association for AzureFrontDoor profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(
        String resourceGroupName, String profileName, String securityPolicyName, SecurityPolicyParameters parameters);

    /**
     * Creates a new security policy within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @param parameters object which contains security policy parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return securityPolicy association for AzureFrontDoor profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<SecurityPolicyInner>, SecurityPolicyInner> beginCreateAsync(
        String resourceGroupName, String profileName, String securityPolicyName, SecurityPolicyParameters parameters);

    /**
     * Creates a new security policy within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @param parameters object which contains security policy parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return securityPolicy association for AzureFrontDoor profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SecurityPolicyInner>, SecurityPolicyInner> beginCreate(
        String resourceGroupName, String profileName, String securityPolicyName, SecurityPolicyParameters parameters);

    /**
     * Creates a new security policy within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @param parameters object which contains security policy parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return securityPolicy association for AzureFrontDoor profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SecurityPolicyInner>, SecurityPolicyInner> beginCreate(
        String resourceGroupName,
        String profileName,
        String securityPolicyName,
        SecurityPolicyParameters parameters,
        Context context);

    /**
     * Creates a new security policy within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @param parameters object which contains security policy parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return securityPolicy association for AzureFrontDoor profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SecurityPolicyInner> createAsync(
        String resourceGroupName, String profileName, String securityPolicyName, SecurityPolicyParameters parameters);

    /**
     * Creates a new security policy within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return securityPolicy association for AzureFrontDoor profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SecurityPolicyInner> createAsync(String resourceGroupName, String profileName, String securityPolicyName);

    /**
     * Creates a new security policy within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @param parameters object which contains security policy parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return securityPolicy association for AzureFrontDoor profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityPolicyInner create(
        String resourceGroupName, String profileName, String securityPolicyName, SecurityPolicyParameters parameters);

    /**
     * Creates a new security policy within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return securityPolicy association for AzureFrontDoor profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityPolicyInner create(String resourceGroupName, String profileName, String securityPolicyName);

    /**
     * Creates a new security policy within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @param parameters object which contains security policy parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return securityPolicy association for AzureFrontDoor profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityPolicyInner create(
        String resourceGroupName,
        String profileName,
        String securityPolicyName,
        SecurityPolicyParameters parameters,
        Context context);

    /**
     * Updates an existing Secret within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @param parameters object which contains security policy parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return securityPolicy association for AzureFrontDoor profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> patchWithResponseAsync(
        String resourceGroupName, String profileName, String securityPolicyName, SecurityPolicyParameters parameters);

    /**
     * Updates an existing Secret within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @param parameters object which contains security policy parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return securityPolicy association for AzureFrontDoor profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<SecurityPolicyInner>, SecurityPolicyInner> beginPatchAsync(
        String resourceGroupName, String profileName, String securityPolicyName, SecurityPolicyParameters parameters);

    /**
     * Updates an existing Secret within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @param parameters object which contains security policy parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return securityPolicy association for AzureFrontDoor profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SecurityPolicyInner>, SecurityPolicyInner> beginPatch(
        String resourceGroupName, String profileName, String securityPolicyName, SecurityPolicyParameters parameters);

    /**
     * Updates an existing Secret within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @param parameters object which contains security policy parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return securityPolicy association for AzureFrontDoor profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SecurityPolicyInner>, SecurityPolicyInner> beginPatch(
        String resourceGroupName,
        String profileName,
        String securityPolicyName,
        SecurityPolicyParameters parameters,
        Context context);

    /**
     * Updates an existing Secret within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @param parameters object which contains security policy parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return securityPolicy association for AzureFrontDoor profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SecurityPolicyInner> patchAsync(
        String resourceGroupName, String profileName, String securityPolicyName, SecurityPolicyParameters parameters);

    /**
     * Updates an existing Secret within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return securityPolicy association for AzureFrontDoor profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SecurityPolicyInner> patchAsync(String resourceGroupName, String profileName, String securityPolicyName);

    /**
     * Updates an existing Secret within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @param parameters object which contains security policy parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return securityPolicy association for AzureFrontDoor profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityPolicyInner patch(
        String resourceGroupName, String profileName, String securityPolicyName, SecurityPolicyParameters parameters);

    /**
     * Updates an existing Secret within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return securityPolicy association for AzureFrontDoor profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityPolicyInner patch(String resourceGroupName, String profileName, String securityPolicyName);

    /**
     * Updates an existing Secret within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @param parameters object which contains security policy parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return securityPolicy association for AzureFrontDoor profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityPolicyInner patch(
        String resourceGroupName,
        String profileName,
        String securityPolicyName,
        SecurityPolicyParameters parameters,
        Context context);

    /**
     * Deletes an existing security policy within profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the Secret under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String profileName, String securityPolicyName);

    /**
     * Deletes an existing security policy within profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the Secret under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String profileName, String securityPolicyName);

    /**
     * Deletes an existing security policy within profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the Secret under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String profileName, String securityPolicyName);

    /**
     * Deletes an existing security policy within profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the Secret under the profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String profileName, String securityPolicyName, Context context);

    /**
     * Deletes an existing security policy within profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the Secret under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String profileName, String securityPolicyName);

    /**
     * Deletes an existing security policy within profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the Secret under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String profileName, String securityPolicyName);

    /**
     * Deletes an existing security policy within profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the Secret under the profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String profileName, String securityPolicyName, Context context);
}