// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.security.attestation.models.AttestOpenEnclaveRequest;
import com.azure.security.attestation.models.AttestSgxEnclaveRequest;
import com.azure.security.attestation.models.AttestationResponse;
import com.azure.security.attestation.models.CloudErrorException;
import com.azure.security.attestation.models.TpmAttestationRequest;
import com.azure.security.attestation.models.TpmAttestationResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Attestations. */
public final class AttestationsImpl {
    /** The proxy service used to perform REST calls. */
    private final AttestationsService service;

    /** The service client containing this operation class. */
    private final AttestationClientImpl client;

    /**
     * Initializes an instance of AttestationsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    AttestationsImpl(AttestationClientImpl client) {
        this.service =
                RestProxy.create(AttestationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AttestationClientAttestations to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{instanceUrl}")
    @ServiceInterface(name = "AttestationClientAtt")
    private interface AttestationsService {
        @Post("/attest/OpenEnclave")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<AttestationResponse>> attestOpenEnclave(
                @HostParam("instanceUrl") String instanceUrl,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") AttestOpenEnclaveRequest request,
                Context context);

        @Post("/attest/SgxEnclave")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<AttestationResponse>> attestSgxEnclave(
                @HostParam("instanceUrl") String instanceUrl,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") AttestSgxEnclaveRequest request,
                Context context);

        @Post("/attest/Tpm")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<TpmAttestationResponse>> attestTpm(
                @HostParam("instanceUrl") String instanceUrl,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") TpmAttestationRequest request,
                Context context);
    }

    /**
     * Processes an OpenEnclave report , producing an artifact. The type of artifact produced is dependent upon
     * attestation policy.
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AttestationResponse>> attestOpenEnclaveWithResponseAsync(AttestOpenEnclaveRequest request) {
        if (this.client.getInstanceUrl() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getInstanceUrl() is required and cannot be null."));
        }
        if (request == null) {
            return Mono.error(new IllegalArgumentException("Parameter request is required and cannot be null."));
        } else {
            request.validate();
        }
        return FluxUtil.withContext(
                context ->
                        service.attestOpenEnclave(
                                this.client.getInstanceUrl(), this.client.getApiVersion(), request, context));
    }

    /**
     * Processes an OpenEnclave report , producing an artifact. The type of artifact produced is dependent upon
     * attestation policy.
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AttestationResponse>> attestOpenEnclaveWithResponseAsync(
            AttestOpenEnclaveRequest request, Context context) {
        if (this.client.getInstanceUrl() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getInstanceUrl() is required and cannot be null."));
        }
        if (request == null) {
            return Mono.error(new IllegalArgumentException("Parameter request is required and cannot be null."));
        } else {
            request.validate();
        }
        return service.attestOpenEnclave(this.client.getInstanceUrl(), this.client.getApiVersion(), request, context);
    }

    /**
     * Processes an OpenEnclave report , producing an artifact. The type of artifact produced is dependent upon
     * attestation policy.
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AttestationResponse> attestOpenEnclaveAsync(AttestOpenEnclaveRequest request) {
        return attestOpenEnclaveWithResponseAsync(request)
                .flatMap(
                        (Response<AttestationResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Processes an OpenEnclave report , producing an artifact. The type of artifact produced is dependent upon
     * attestation policy.
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AttestationResponse> attestOpenEnclaveAsync(AttestOpenEnclaveRequest request, Context context) {
        return attestOpenEnclaveWithResponseAsync(request, context)
                .flatMap(
                        (Response<AttestationResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Processes an OpenEnclave report , producing an artifact. The type of artifact produced is dependent upon
     * attestation policy.
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AttestationResponse attestOpenEnclave(AttestOpenEnclaveRequest request) {
        return attestOpenEnclaveAsync(request).block();
    }

    /**
     * Processes an OpenEnclave report , producing an artifact. The type of artifact produced is dependent upon
     * attestation policy.
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AttestationResponse> attestOpenEnclaveWithResponse(
            AttestOpenEnclaveRequest request, Context context) {
        return attestOpenEnclaveWithResponseAsync(request, context).block();
    }

    /**
     * Processes an SGX enclave quote, producing an artifact. The type of artifact produced is dependent upon
     * attestation policy.
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AttestationResponse>> attestSgxEnclaveWithResponseAsync(AttestSgxEnclaveRequest request) {
        if (this.client.getInstanceUrl() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getInstanceUrl() is required and cannot be null."));
        }
        if (request == null) {
            return Mono.error(new IllegalArgumentException("Parameter request is required and cannot be null."));
        } else {
            request.validate();
        }
        return FluxUtil.withContext(
                context ->
                        service.attestSgxEnclave(
                                this.client.getInstanceUrl(), this.client.getApiVersion(), request, context));
    }

    /**
     * Processes an SGX enclave quote, producing an artifact. The type of artifact produced is dependent upon
     * attestation policy.
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AttestationResponse>> attestSgxEnclaveWithResponseAsync(
            AttestSgxEnclaveRequest request, Context context) {
        if (this.client.getInstanceUrl() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getInstanceUrl() is required and cannot be null."));
        }
        if (request == null) {
            return Mono.error(new IllegalArgumentException("Parameter request is required and cannot be null."));
        } else {
            request.validate();
        }
        return service.attestSgxEnclave(this.client.getInstanceUrl(), this.client.getApiVersion(), request, context);
    }

    /**
     * Processes an SGX enclave quote, producing an artifact. The type of artifact produced is dependent upon
     * attestation policy.
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AttestationResponse> attestSgxEnclaveAsync(AttestSgxEnclaveRequest request) {
        return attestSgxEnclaveWithResponseAsync(request)
                .flatMap(
                        (Response<AttestationResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Processes an SGX enclave quote, producing an artifact. The type of artifact produced is dependent upon
     * attestation policy.
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AttestationResponse> attestSgxEnclaveAsync(AttestSgxEnclaveRequest request, Context context) {
        return attestSgxEnclaveWithResponseAsync(request, context)
                .flatMap(
                        (Response<AttestationResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Processes an SGX enclave quote, producing an artifact. The type of artifact produced is dependent upon
     * attestation policy.
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AttestationResponse attestSgxEnclave(AttestSgxEnclaveRequest request) {
        return attestSgxEnclaveAsync(request).block();
    }

    /**
     * Processes an SGX enclave quote, producing an artifact. The type of artifact produced is dependent upon
     * attestation policy.
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AttestationResponse> attestSgxEnclaveWithResponse(
            AttestSgxEnclaveRequest request, Context context) {
        return attestSgxEnclaveWithResponseAsync(request, context).block();
    }

    /**
     * Processes attestation evidence from a VBS enclave, producing an attestation result. The attestation result
     * produced is dependent upon the attestation policy.
     *
     * @param request Attestation request for Trusted Platform Module (TPM) attestation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation response for Trusted Platform Module (TPM) attestation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TpmAttestationResponse>> attestTpmWithResponseAsync(TpmAttestationRequest request) {
        if (this.client.getInstanceUrl() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getInstanceUrl() is required and cannot be null."));
        }
        if (request == null) {
            return Mono.error(new IllegalArgumentException("Parameter request is required and cannot be null."));
        } else {
            request.validate();
        }
        return FluxUtil.withContext(
                context ->
                        service.attestTpm(this.client.getInstanceUrl(), this.client.getApiVersion(), request, context));
    }

    /**
     * Processes attestation evidence from a VBS enclave, producing an attestation result. The attestation result
     * produced is dependent upon the attestation policy.
     *
     * @param request Attestation request for Trusted Platform Module (TPM) attestation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation response for Trusted Platform Module (TPM) attestation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TpmAttestationResponse>> attestTpmWithResponseAsync(
            TpmAttestationRequest request, Context context) {
        if (this.client.getInstanceUrl() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getInstanceUrl() is required and cannot be null."));
        }
        if (request == null) {
            return Mono.error(new IllegalArgumentException("Parameter request is required and cannot be null."));
        } else {
            request.validate();
        }
        return service.attestTpm(this.client.getInstanceUrl(), this.client.getApiVersion(), request, context);
    }

    /**
     * Processes attestation evidence from a VBS enclave, producing an attestation result. The attestation result
     * produced is dependent upon the attestation policy.
     *
     * @param request Attestation request for Trusted Platform Module (TPM) attestation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation response for Trusted Platform Module (TPM) attestation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TpmAttestationResponse> attestTpmAsync(TpmAttestationRequest request) {
        return attestTpmWithResponseAsync(request)
                .flatMap(
                        (Response<TpmAttestationResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Processes attestation evidence from a VBS enclave, producing an attestation result. The attestation result
     * produced is dependent upon the attestation policy.
     *
     * @param request Attestation request for Trusted Platform Module (TPM) attestation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation response for Trusted Platform Module (TPM) attestation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TpmAttestationResponse> attestTpmAsync(TpmAttestationRequest request, Context context) {
        return attestTpmWithResponseAsync(request, context)
                .flatMap(
                        (Response<TpmAttestationResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Processes attestation evidence from a VBS enclave, producing an attestation result. The attestation result
     * produced is dependent upon the attestation policy.
     *
     * @param request Attestation request for Trusted Platform Module (TPM) attestation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation response for Trusted Platform Module (TPM) attestation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TpmAttestationResponse attestTpm(TpmAttestationRequest request) {
        return attestTpmAsync(request).block();
    }

    /**
     * Processes attestation evidence from a VBS enclave, producing an attestation result. The attestation result
     * produced is dependent upon the attestation policy.
     *
     * @param request Attestation request for Trusted Platform Module (TPM) attestation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation response for Trusted Platform Module (TPM) attestation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<TpmAttestationResponse> attestTpmWithResponse(TpmAttestationRequest request, Context context) {
        return attestTpmWithResponseAsync(request, context).block();
    }
}