/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

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
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in RecoveryPoints.
 */
public class RecoveryPointsInner {
    /** The Retrofit service to perform REST calls. */
    private RecoveryPointsService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of RecoveryPointsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RecoveryPointsInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(RecoveryPointsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoveryPoints to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RecoveryPointsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.RecoveryPoints list" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupFabrics/{fabricName}/protectionContainers/{containerName}/protectedItems/{protectedItemName}/recoveryPoints")
        Observable<Response<ResponseBody>> list(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("fabricName") String fabricName, @Path("containerName") String containerName, @Path("protectedItemName") String protectedItemName, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.RecoveryPoints get" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupFabrics/{fabricName}/protectionContainers/{containerName}/protectedItems/{protectedItemName}/recoveryPoints/{recoveryPointId}")
        Observable<Response<ResponseBody>> get(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("fabricName") String fabricName, @Path("containerName") String containerName, @Path("protectedItemName") String protectedItemName, @Path("recoveryPointId") String recoveryPointId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.RecoveryPoints listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists the backup copies for the backed up item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up item.
     * @param containerName Container name associated with the backed up item.
     * @param protectedItemName Backed up item whose backup copies are to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RecoveryPointResourceInner&gt; object if successful.
     */
    public PagedList<RecoveryPointResourceInner> list(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName, final String protectedItemName) {
        ServiceResponse<Page<RecoveryPointResourceInner>> response = listSinglePageAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName).toBlocking().single();
        return new PagedList<RecoveryPointResourceInner>(response.body()) {
            @Override
            public Page<RecoveryPointResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the backup copies for the backed up item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up item.
     * @param containerName Container name associated with the backed up item.
     * @param protectedItemName Backed up item whose backup copies are to be fetched.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RecoveryPointResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName, final String protectedItemName, final ListOperationCallback<RecoveryPointResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName),
            new Func1<String, Observable<ServiceResponse<Page<RecoveryPointResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecoveryPointResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the backup copies for the backed up item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up item.
     * @param containerName Container name associated with the backed up item.
     * @param protectedItemName Backed up item whose backup copies are to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RecoveryPointResourceInner&gt; object
     */
    public Observable<Page<RecoveryPointResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName, final String protectedItemName) {
        return listWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName)
            .map(new Func1<ServiceResponse<Page<RecoveryPointResourceInner>>, Page<RecoveryPointResourceInner>>() {
                @Override
                public Page<RecoveryPointResourceInner> call(ServiceResponse<Page<RecoveryPointResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the backup copies for the backed up item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up item.
     * @param containerName Container name associated with the backed up item.
     * @param protectedItemName Backed up item whose backup copies are to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RecoveryPointResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<RecoveryPointResourceInner>>> listWithServiceResponseAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName, final String protectedItemName) {
        return listSinglePageAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName)
            .concatMap(new Func1<ServiceResponse<Page<RecoveryPointResourceInner>>, Observable<ServiceResponse<Page<RecoveryPointResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecoveryPointResourceInner>>> call(ServiceResponse<Page<RecoveryPointResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the backup copies for the backed up item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up item.
     * @param containerName Container name associated with the backed up item.
     * @param protectedItemName Backed up item whose backup copies are to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RecoveryPointResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RecoveryPointResourceInner>>> listSinglePageAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName, final String protectedItemName) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (fabricName == null) {
            throw new IllegalArgumentException("Parameter fabricName is required and cannot be null.");
        }
        if (containerName == null) {
            throw new IllegalArgumentException("Parameter containerName is required and cannot be null.");
        }
        if (protectedItemName == null) {
            throw new IllegalArgumentException("Parameter protectedItemName is required and cannot be null.");
        }
        final String apiVersion = "2019-06-15";
        final String filter = null;
        return service.list(vaultName, resourceGroupName, this.client.subscriptionId(), fabricName, containerName, protectedItemName, apiVersion, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RecoveryPointResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecoveryPointResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RecoveryPointResourceInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RecoveryPointResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists the backup copies for the backed up item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up item.
     * @param containerName Container name associated with the backed up item.
     * @param protectedItemName Backed up item whose backup copies are to be fetched.
     * @param filter OData filter options.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RecoveryPointResourceInner&gt; object if successful.
     */
    public PagedList<RecoveryPointResourceInner> list(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName, final String protectedItemName, final String filter) {
        ServiceResponse<Page<RecoveryPointResourceInner>> response = listSinglePageAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, filter).toBlocking().single();
        return new PagedList<RecoveryPointResourceInner>(response.body()) {
            @Override
            public Page<RecoveryPointResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the backup copies for the backed up item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up item.
     * @param containerName Container name associated with the backed up item.
     * @param protectedItemName Backed up item whose backup copies are to be fetched.
     * @param filter OData filter options.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RecoveryPointResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName, final String protectedItemName, final String filter, final ListOperationCallback<RecoveryPointResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, filter),
            new Func1<String, Observable<ServiceResponse<Page<RecoveryPointResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecoveryPointResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the backup copies for the backed up item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up item.
     * @param containerName Container name associated with the backed up item.
     * @param protectedItemName Backed up item whose backup copies are to be fetched.
     * @param filter OData filter options.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RecoveryPointResourceInner&gt; object
     */
    public Observable<Page<RecoveryPointResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName, final String protectedItemName, final String filter) {
        return listWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, filter)
            .map(new Func1<ServiceResponse<Page<RecoveryPointResourceInner>>, Page<RecoveryPointResourceInner>>() {
                @Override
                public Page<RecoveryPointResourceInner> call(ServiceResponse<Page<RecoveryPointResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the backup copies for the backed up item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up item.
     * @param containerName Container name associated with the backed up item.
     * @param protectedItemName Backed up item whose backup copies are to be fetched.
     * @param filter OData filter options.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RecoveryPointResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<RecoveryPointResourceInner>>> listWithServiceResponseAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName, final String protectedItemName, final String filter) {
        return listSinglePageAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, filter)
            .concatMap(new Func1<ServiceResponse<Page<RecoveryPointResourceInner>>, Observable<ServiceResponse<Page<RecoveryPointResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecoveryPointResourceInner>>> call(ServiceResponse<Page<RecoveryPointResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the backup copies for the backed up item.
     *
    ServiceResponse<PageImpl<RecoveryPointResourceInner>> * @param vaultName The name of the recovery services vault.
    ServiceResponse<PageImpl<RecoveryPointResourceInner>> * @param resourceGroupName The name of the resource group where the recovery services vault is present.
    ServiceResponse<PageImpl<RecoveryPointResourceInner>> * @param fabricName Fabric name associated with the backed up item.
    ServiceResponse<PageImpl<RecoveryPointResourceInner>> * @param containerName Container name associated with the backed up item.
    ServiceResponse<PageImpl<RecoveryPointResourceInner>> * @param protectedItemName Backed up item whose backup copies are to be fetched.
    ServiceResponse<PageImpl<RecoveryPointResourceInner>> * @param filter OData filter options.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RecoveryPointResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RecoveryPointResourceInner>>> listSinglePageAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName, final String protectedItemName, final String filter) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (fabricName == null) {
            throw new IllegalArgumentException("Parameter fabricName is required and cannot be null.");
        }
        if (containerName == null) {
            throw new IllegalArgumentException("Parameter containerName is required and cannot be null.");
        }
        if (protectedItemName == null) {
            throw new IllegalArgumentException("Parameter protectedItemName is required and cannot be null.");
        }
        final String apiVersion = "2019-06-15";
        return service.list(vaultName, resourceGroupName, this.client.subscriptionId(), fabricName, containerName, protectedItemName, apiVersion, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RecoveryPointResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecoveryPointResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RecoveryPointResourceInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RecoveryPointResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RecoveryPointResourceInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RecoveryPointResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RecoveryPointResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Provides the information of the backed up data identified using RecoveryPointID. This is an asynchronous operation.
     To know the status of the operation, call the GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with backed up item.
     * @param containerName Container name associated with backed up item.
     * @param protectedItemName Backed up item name whose backup data needs to be fetched.
     * @param recoveryPointId RecoveryPointID represents the backed up data to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RecoveryPointResourceInner object if successful.
     */
    public RecoveryPointResourceInner get(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId).toBlocking().single().body();
    }

    /**
     * Provides the information of the backed up data identified using RecoveryPointID. This is an asynchronous operation.
     To know the status of the operation, call the GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with backed up item.
     * @param containerName Container name associated with backed up item.
     * @param protectedItemName Backed up item name whose backup data needs to be fetched.
     * @param recoveryPointId RecoveryPointID represents the backed up data to be fetched.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RecoveryPointResourceInner> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId, final ServiceCallback<RecoveryPointResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId), serviceCallback);
    }

    /**
     * Provides the information of the backed up data identified using RecoveryPointID. This is an asynchronous operation.
     To know the status of the operation, call the GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with backed up item.
     * @param containerName Container name associated with backed up item.
     * @param protectedItemName Backed up item name whose backup data needs to be fetched.
     * @param recoveryPointId RecoveryPointID represents the backed up data to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RecoveryPointResourceInner object
     */
    public Observable<RecoveryPointResourceInner> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId).map(new Func1<ServiceResponse<RecoveryPointResourceInner>, RecoveryPointResourceInner>() {
            @Override
            public RecoveryPointResourceInner call(ServiceResponse<RecoveryPointResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Provides the information of the backed up data identified using RecoveryPointID. This is an asynchronous operation.
     To know the status of the operation, call the GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with backed up item.
     * @param containerName Container name associated with backed up item.
     * @param protectedItemName Backed up item name whose backup data needs to be fetched.
     * @param recoveryPointId RecoveryPointID represents the backed up data to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RecoveryPointResourceInner object
     */
    public Observable<ServiceResponse<RecoveryPointResourceInner>> getWithServiceResponseAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (fabricName == null) {
            throw new IllegalArgumentException("Parameter fabricName is required and cannot be null.");
        }
        if (containerName == null) {
            throw new IllegalArgumentException("Parameter containerName is required and cannot be null.");
        }
        if (protectedItemName == null) {
            throw new IllegalArgumentException("Parameter protectedItemName is required and cannot be null.");
        }
        if (recoveryPointId == null) {
            throw new IllegalArgumentException("Parameter recoveryPointId is required and cannot be null.");
        }
        final String apiVersion = "2019-06-15";
        return service.get(vaultName, resourceGroupName, this.client.subscriptionId(), fabricName, containerName, protectedItemName, recoveryPointId, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RecoveryPointResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<RecoveryPointResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RecoveryPointResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RecoveryPointResourceInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RecoveryPointResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RecoveryPointResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists the backup copies for the backed up item.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RecoveryPointResourceInner&gt; object if successful.
     */
    public PagedList<RecoveryPointResourceInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<RecoveryPointResourceInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<RecoveryPointResourceInner>(response.body()) {
            @Override
            public Page<RecoveryPointResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the backup copies for the backed up item.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RecoveryPointResourceInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<RecoveryPointResourceInner>> serviceFuture, final ListOperationCallback<RecoveryPointResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<RecoveryPointResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecoveryPointResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the backup copies for the backed up item.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RecoveryPointResourceInner&gt; object
     */
    public Observable<Page<RecoveryPointResourceInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<RecoveryPointResourceInner>>, Page<RecoveryPointResourceInner>>() {
                @Override
                public Page<RecoveryPointResourceInner> call(ServiceResponse<Page<RecoveryPointResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the backup copies for the backed up item.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RecoveryPointResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<RecoveryPointResourceInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<RecoveryPointResourceInner>>, Observable<ServiceResponse<Page<RecoveryPointResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecoveryPointResourceInner>>> call(ServiceResponse<Page<RecoveryPointResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the backup copies for the backed up item.
     *
    ServiceResponse<PageImpl<RecoveryPointResourceInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RecoveryPointResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RecoveryPointResourceInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RecoveryPointResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecoveryPointResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RecoveryPointResourceInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RecoveryPointResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RecoveryPointResourceInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RecoveryPointResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RecoveryPointResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
