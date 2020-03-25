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
 * in ProtectableContainers.
 */
public class ProtectableContainersInner {
    /** The Retrofit service to perform REST calls. */
    private ProtectableContainersService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of ProtectableContainersInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ProtectableContainersInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(ProtectableContainersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ProtectableContainers to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ProtectableContainersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.ProtectableContainers list" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupFabrics/{fabricName}/protectableContainers")
        Observable<Response<ResponseBody>> list(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("fabricName") String fabricName, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.ProtectableContainers listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists the containers that can be registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ProtectableContainerResourceInner&gt; object if successful.
     */
    public PagedList<ProtectableContainerResourceInner> list(final String vaultName, final String resourceGroupName, final String fabricName) {
        ServiceResponse<Page<ProtectableContainerResourceInner>> response = listSinglePageAsync(vaultName, resourceGroupName, fabricName).toBlocking().single();
        return new PagedList<ProtectableContainerResourceInner>(response.body()) {
            @Override
            public Page<ProtectableContainerResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the containers that can be registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ProtectableContainerResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String fabricName, final ListOperationCallback<ProtectableContainerResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(vaultName, resourceGroupName, fabricName),
            new Func1<String, Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the containers that can be registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ProtectableContainerResourceInner&gt; object
     */
    public Observable<Page<ProtectableContainerResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String fabricName) {
        return listWithServiceResponseAsync(vaultName, resourceGroupName, fabricName)
            .map(new Func1<ServiceResponse<Page<ProtectableContainerResourceInner>>, Page<ProtectableContainerResourceInner>>() {
                @Override
                public Page<ProtectableContainerResourceInner> call(ServiceResponse<Page<ProtectableContainerResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the containers that can be registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ProtectableContainerResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>> listWithServiceResponseAsync(final String vaultName, final String resourceGroupName, final String fabricName) {
        return listSinglePageAsync(vaultName, resourceGroupName, fabricName)
            .concatMap(new Func1<ServiceResponse<Page<ProtectableContainerResourceInner>>, Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>> call(ServiceResponse<Page<ProtectableContainerResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the containers that can be registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ProtectableContainerResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>> listSinglePageAsync(final String vaultName, final String resourceGroupName, final String fabricName) {
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
        final String apiVersion = "2016-12-01";
        final String filter = null;
        return service.list(vaultName, resourceGroupName, this.client.subscriptionId(), fabricName, apiVersion, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ProtectableContainerResourceInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ProtectableContainerResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists the containers that can be registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName the String value
     * @param filter OData filter options.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ProtectableContainerResourceInner&gt; object if successful.
     */
    public PagedList<ProtectableContainerResourceInner> list(final String vaultName, final String resourceGroupName, final String fabricName, final String filter) {
        ServiceResponse<Page<ProtectableContainerResourceInner>> response = listSinglePageAsync(vaultName, resourceGroupName, fabricName, filter).toBlocking().single();
        return new PagedList<ProtectableContainerResourceInner>(response.body()) {
            @Override
            public Page<ProtectableContainerResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the containers that can be registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName the String value
     * @param filter OData filter options.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ProtectableContainerResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String filter, final ListOperationCallback<ProtectableContainerResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(vaultName, resourceGroupName, fabricName, filter),
            new Func1<String, Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the containers that can be registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName the String value
     * @param filter OData filter options.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ProtectableContainerResourceInner&gt; object
     */
    public Observable<Page<ProtectableContainerResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String filter) {
        return listWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, filter)
            .map(new Func1<ServiceResponse<Page<ProtectableContainerResourceInner>>, Page<ProtectableContainerResourceInner>>() {
                @Override
                public Page<ProtectableContainerResourceInner> call(ServiceResponse<Page<ProtectableContainerResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the containers that can be registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName the String value
     * @param filter OData filter options.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ProtectableContainerResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>> listWithServiceResponseAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String filter) {
        return listSinglePageAsync(vaultName, resourceGroupName, fabricName, filter)
            .concatMap(new Func1<ServiceResponse<Page<ProtectableContainerResourceInner>>, Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>> call(ServiceResponse<Page<ProtectableContainerResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the containers that can be registered to Recovery Services Vault.
     *
    ServiceResponse<PageImpl<ProtectableContainerResourceInner>> * @param vaultName The name of the recovery services vault.
    ServiceResponse<PageImpl<ProtectableContainerResourceInner>> * @param resourceGroupName The name of the resource group where the recovery services vault is present.
    ServiceResponse<PageImpl<ProtectableContainerResourceInner>> * @param fabricName the String value
    ServiceResponse<PageImpl<ProtectableContainerResourceInner>> * @param filter OData filter options.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ProtectableContainerResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>> listSinglePageAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String filter) {
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
        final String apiVersion = "2016-12-01";
        return service.list(vaultName, resourceGroupName, this.client.subscriptionId(), fabricName, apiVersion, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ProtectableContainerResourceInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ProtectableContainerResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ProtectableContainerResourceInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ProtectableContainerResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ProtectableContainerResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists the containers that can be registered to Recovery Services Vault.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ProtectableContainerResourceInner&gt; object if successful.
     */
    public PagedList<ProtectableContainerResourceInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<ProtectableContainerResourceInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ProtectableContainerResourceInner>(response.body()) {
            @Override
            public Page<ProtectableContainerResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the containers that can be registered to Recovery Services Vault.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ProtectableContainerResourceInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<ProtectableContainerResourceInner>> serviceFuture, final ListOperationCallback<ProtectableContainerResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the containers that can be registered to Recovery Services Vault.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ProtectableContainerResourceInner&gt; object
     */
    public Observable<Page<ProtectableContainerResourceInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ProtectableContainerResourceInner>>, Page<ProtectableContainerResourceInner>>() {
                @Override
                public Page<ProtectableContainerResourceInner> call(ServiceResponse<Page<ProtectableContainerResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the containers that can be registered to Recovery Services Vault.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ProtectableContainerResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ProtectableContainerResourceInner>>, Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>> call(ServiceResponse<Page<ProtectableContainerResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the containers that can be registered to Recovery Services Vault.
     *
    ServiceResponse<PageImpl<ProtectableContainerResourceInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ProtectableContainerResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProtectableContainerResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ProtectableContainerResourceInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ProtectableContainerResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ProtectableContainerResourceInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ProtectableContainerResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ProtectableContainerResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
