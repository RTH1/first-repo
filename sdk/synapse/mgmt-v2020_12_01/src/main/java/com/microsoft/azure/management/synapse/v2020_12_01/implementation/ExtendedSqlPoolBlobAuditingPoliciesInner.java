/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ExtendedSqlPoolBlobAuditingPolicies.
 */
public class ExtendedSqlPoolBlobAuditingPoliciesInner {
    /** The Retrofit service to perform REST calls. */
    private ExtendedSqlPoolBlobAuditingPoliciesService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of ExtendedSqlPoolBlobAuditingPoliciesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ExtendedSqlPoolBlobAuditingPoliciesInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(ExtendedSqlPoolBlobAuditingPoliciesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ExtendedSqlPoolBlobAuditingPolicies to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ExtendedSqlPoolBlobAuditingPoliciesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.ExtendedSqlPoolBlobAuditingPolicies get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/extendedAuditingSettings/{blobAuditingPolicyName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Path("blobAuditingPolicyName") String blobAuditingPolicyName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.ExtendedSqlPoolBlobAuditingPolicies createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/extendedAuditingSettings/{blobAuditingPolicyName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Path("blobAuditingPolicyName") String blobAuditingPolicyName, @Query("api-version") String apiVersion, @Body ExtendedSqlPoolBlobAuditingPolicyInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.ExtendedSqlPoolBlobAuditingPolicies listBySqlPool" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/extendedAuditingSettings")
        Observable<Response<ResponseBody>> listBySqlPool(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.ExtendedSqlPoolBlobAuditingPolicies listBySqlPoolNext" })
        @GET
        Observable<Response<ResponseBody>> listBySqlPoolNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets an extended Sql pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExtendedSqlPoolBlobAuditingPolicyInner object if successful.
     */
    public ExtendedSqlPoolBlobAuditingPolicyInner get(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName).toBlocking().single().body();
    }

    /**
     * Gets an extended Sql pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ExtendedSqlPoolBlobAuditingPolicyInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, final ServiceCallback<ExtendedSqlPoolBlobAuditingPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName), serviceCallback);
    }

    /**
     * Gets an extended Sql pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExtendedSqlPoolBlobAuditingPolicyInner object
     */
    public Observable<ExtendedSqlPoolBlobAuditingPolicyInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName).map(new Func1<ServiceResponse<ExtendedSqlPoolBlobAuditingPolicyInner>, ExtendedSqlPoolBlobAuditingPolicyInner>() {
            @Override
            public ExtendedSqlPoolBlobAuditingPolicyInner call(ServiceResponse<ExtendedSqlPoolBlobAuditingPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets an extended Sql pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExtendedSqlPoolBlobAuditingPolicyInner object
     */
    public Observable<ServiceResponse<ExtendedSqlPoolBlobAuditingPolicyInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String blobAuditingPolicyName = "default";
        return service.get(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, blobAuditingPolicyName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ExtendedSqlPoolBlobAuditingPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<ExtendedSqlPoolBlobAuditingPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ExtendedSqlPoolBlobAuditingPolicyInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ExtendedSqlPoolBlobAuditingPolicyInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ExtendedSqlPoolBlobAuditingPolicyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ExtendedSqlPoolBlobAuditingPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates or updates an extended Sql pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param parameters The extended Sql pool blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExtendedSqlPoolBlobAuditingPolicyInner object if successful.
     */
    public ExtendedSqlPoolBlobAuditingPolicyInner createOrUpdate(String resourceGroupName, String workspaceName, String sqlPoolName, ExtendedSqlPoolBlobAuditingPolicyInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, parameters).toBlocking().single().body();
    }

    /**
     * Creates or updates an extended Sql pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param parameters The extended Sql pool blob auditing policy.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ExtendedSqlPoolBlobAuditingPolicyInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, ExtendedSqlPoolBlobAuditingPolicyInner parameters, final ServiceCallback<ExtendedSqlPoolBlobAuditingPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, parameters), serviceCallback);
    }

    /**
     * Creates or updates an extended Sql pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param parameters The extended Sql pool blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExtendedSqlPoolBlobAuditingPolicyInner object
     */
    public Observable<ExtendedSqlPoolBlobAuditingPolicyInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, ExtendedSqlPoolBlobAuditingPolicyInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, parameters).map(new Func1<ServiceResponse<ExtendedSqlPoolBlobAuditingPolicyInner>, ExtendedSqlPoolBlobAuditingPolicyInner>() {
            @Override
            public ExtendedSqlPoolBlobAuditingPolicyInner call(ServiceResponse<ExtendedSqlPoolBlobAuditingPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates an extended Sql pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param parameters The extended Sql pool blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExtendedSqlPoolBlobAuditingPolicyInner object
     */
    public Observable<ServiceResponse<ExtendedSqlPoolBlobAuditingPolicyInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName, ExtendedSqlPoolBlobAuditingPolicyInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String blobAuditingPolicyName = "default";
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, blobAuditingPolicyName, this.client.apiVersion(), parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ExtendedSqlPoolBlobAuditingPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<ExtendedSqlPoolBlobAuditingPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ExtendedSqlPoolBlobAuditingPolicyInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ExtendedSqlPoolBlobAuditingPolicyInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ExtendedSqlPoolBlobAuditingPolicyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ExtendedSqlPoolBlobAuditingPolicyInner>() { }.getType())
                .register(201, new TypeToken<ExtendedSqlPoolBlobAuditingPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists extended auditing settings of a Sql pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ExtendedSqlPoolBlobAuditingPolicyInner&gt; object if successful.
     */
    public PagedList<ExtendedSqlPoolBlobAuditingPolicyInner> listBySqlPool(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>> response = listBySqlPoolSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName).toBlocking().single();
        return new PagedList<ExtendedSqlPoolBlobAuditingPolicyInner>(response.body()) {
            @Override
            public Page<ExtendedSqlPoolBlobAuditingPolicyInner> nextPage(String nextPageLink) {
                return listBySqlPoolNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists extended auditing settings of a Sql pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ExtendedSqlPoolBlobAuditingPolicyInner>> listBySqlPoolAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final ListOperationCallback<ExtendedSqlPoolBlobAuditingPolicyInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listBySqlPoolSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName),
            new Func1<String, Observable<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>> call(String nextPageLink) {
                    return listBySqlPoolNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists extended auditing settings of a Sql pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExtendedSqlPoolBlobAuditingPolicyInner&gt; object
     */
    public Observable<Page<ExtendedSqlPoolBlobAuditingPolicyInner>> listBySqlPoolAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        return listBySqlPoolWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName)
            .map(new Func1<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>, Page<ExtendedSqlPoolBlobAuditingPolicyInner>>() {
                @Override
                public Page<ExtendedSqlPoolBlobAuditingPolicyInner> call(ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists extended auditing settings of a Sql pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExtendedSqlPoolBlobAuditingPolicyInner&gt; object
     */
    public Observable<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>> listBySqlPoolWithServiceResponseAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        return listBySqlPoolSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName)
            .concatMap(new Func1<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>, Observable<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>> call(ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listBySqlPoolNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists extended auditing settings of a Sql pool.
     *
    ServiceResponse<PageImpl<ExtendedSqlPoolBlobAuditingPolicyInner>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl<ExtendedSqlPoolBlobAuditingPolicyInner>> * @param workspaceName The name of the workspace
    ServiceResponse<PageImpl<ExtendedSqlPoolBlobAuditingPolicyInner>> * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ExtendedSqlPoolBlobAuditingPolicyInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>> listBySqlPoolSinglePageAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listBySqlPool(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ExtendedSqlPoolBlobAuditingPolicyInner>> result = listBySqlPoolDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ExtendedSqlPoolBlobAuditingPolicyInner>> listBySqlPoolDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ExtendedSqlPoolBlobAuditingPolicyInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ExtendedSqlPoolBlobAuditingPolicyInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists extended auditing settings of a Sql pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ExtendedSqlPoolBlobAuditingPolicyInner&gt; object if successful.
     */
    public PagedList<ExtendedSqlPoolBlobAuditingPolicyInner> listBySqlPoolNext(final String nextPageLink) {
        ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>> response = listBySqlPoolNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ExtendedSqlPoolBlobAuditingPolicyInner>(response.body()) {
            @Override
            public Page<ExtendedSqlPoolBlobAuditingPolicyInner> nextPage(String nextPageLink) {
                return listBySqlPoolNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists extended auditing settings of a Sql pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ExtendedSqlPoolBlobAuditingPolicyInner>> listBySqlPoolNextAsync(final String nextPageLink, final ServiceFuture<List<ExtendedSqlPoolBlobAuditingPolicyInner>> serviceFuture, final ListOperationCallback<ExtendedSqlPoolBlobAuditingPolicyInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listBySqlPoolNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>> call(String nextPageLink) {
                    return listBySqlPoolNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists extended auditing settings of a Sql pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExtendedSqlPoolBlobAuditingPolicyInner&gt; object
     */
    public Observable<Page<ExtendedSqlPoolBlobAuditingPolicyInner>> listBySqlPoolNextAsync(final String nextPageLink) {
        return listBySqlPoolNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>, Page<ExtendedSqlPoolBlobAuditingPolicyInner>>() {
                @Override
                public Page<ExtendedSqlPoolBlobAuditingPolicyInner> call(ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists extended auditing settings of a Sql pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExtendedSqlPoolBlobAuditingPolicyInner&gt; object
     */
    public Observable<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>> listBySqlPoolNextWithServiceResponseAsync(final String nextPageLink) {
        return listBySqlPoolNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>, Observable<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>> call(ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listBySqlPoolNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists extended auditing settings of a Sql pool.
     *
    ServiceResponse<PageImpl<ExtendedSqlPoolBlobAuditingPolicyInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ExtendedSqlPoolBlobAuditingPolicyInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>> listBySqlPoolNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listBySqlPoolNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ExtendedSqlPoolBlobAuditingPolicyInner>> result = listBySqlPoolNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ExtendedSqlPoolBlobAuditingPolicyInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ExtendedSqlPoolBlobAuditingPolicyInner>> listBySqlPoolNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ExtendedSqlPoolBlobAuditingPolicyInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ExtendedSqlPoolBlobAuditingPolicyInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}