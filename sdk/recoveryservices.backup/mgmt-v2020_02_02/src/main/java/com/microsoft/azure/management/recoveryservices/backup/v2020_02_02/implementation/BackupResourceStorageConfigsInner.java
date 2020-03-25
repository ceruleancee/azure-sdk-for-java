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
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BackupResourceStorageConfigs.
 */
public class BackupResourceStorageConfigsInner {
    /** The Retrofit service to perform REST calls. */
    private BackupResourceStorageConfigsService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of BackupResourceStorageConfigsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BackupResourceStorageConfigsInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(BackupResourceStorageConfigsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BackupResourceStorageConfigs to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BackupResourceStorageConfigsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.BackupResourceStorageConfigs get" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupstorageconfig/vaultstorageconfig")
        Observable<Response<ResponseBody>> get(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.BackupResourceStorageConfigs update" })
        @PUT("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupstorageconfig/vaultstorageconfig")
        Observable<Response<ResponseBody>> update(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Body BackupResourceConfigResourceInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.BackupResourceStorageConfigs patch" })
        @PATCH("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupstorageconfig/vaultstorageconfig")
        Observable<Response<ResponseBody>> patch(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Body BackupResourceConfigResourceInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Fetches resource storage config.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BackupResourceConfigResourceInner object if successful.
     */
    public BackupResourceConfigResourceInner get(String vaultName, String resourceGroupName) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName).toBlocking().single().body();
    }

    /**
     * Fetches resource storage config.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BackupResourceConfigResourceInner> getAsync(String vaultName, String resourceGroupName, final ServiceCallback<BackupResourceConfigResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(vaultName, resourceGroupName), serviceCallback);
    }

    /**
     * Fetches resource storage config.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BackupResourceConfigResourceInner object
     */
    public Observable<BackupResourceConfigResourceInner> getAsync(String vaultName, String resourceGroupName) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName).map(new Func1<ServiceResponse<BackupResourceConfigResourceInner>, BackupResourceConfigResourceInner>() {
            @Override
            public BackupResourceConfigResourceInner call(ServiceResponse<BackupResourceConfigResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Fetches resource storage config.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BackupResourceConfigResourceInner object
     */
    public Observable<ServiceResponse<BackupResourceConfigResourceInner>> getWithServiceResponseAsync(String vaultName, String resourceGroupName) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-12-01";
        return service.get(vaultName, resourceGroupName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BackupResourceConfigResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<BackupResourceConfigResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BackupResourceConfigResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BackupResourceConfigResourceInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BackupResourceConfigResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BackupResourceConfigResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates vault storage model type.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param parameters Vault storage config request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BackupResourceConfigResourceInner object if successful.
     */
    public BackupResourceConfigResourceInner update(String vaultName, String resourceGroupName, BackupResourceConfigResourceInner parameters) {
        return updateWithServiceResponseAsync(vaultName, resourceGroupName, parameters).toBlocking().single().body();
    }

    /**
     * Updates vault storage model type.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param parameters Vault storage config request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BackupResourceConfigResourceInner> updateAsync(String vaultName, String resourceGroupName, BackupResourceConfigResourceInner parameters, final ServiceCallback<BackupResourceConfigResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(vaultName, resourceGroupName, parameters), serviceCallback);
    }

    /**
     * Updates vault storage model type.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param parameters Vault storage config request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BackupResourceConfigResourceInner object
     */
    public Observable<BackupResourceConfigResourceInner> updateAsync(String vaultName, String resourceGroupName, BackupResourceConfigResourceInner parameters) {
        return updateWithServiceResponseAsync(vaultName, resourceGroupName, parameters).map(new Func1<ServiceResponse<BackupResourceConfigResourceInner>, BackupResourceConfigResourceInner>() {
            @Override
            public BackupResourceConfigResourceInner call(ServiceResponse<BackupResourceConfigResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates vault storage model type.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param parameters Vault storage config request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BackupResourceConfigResourceInner object
     */
    public Observable<ServiceResponse<BackupResourceConfigResourceInner>> updateWithServiceResponseAsync(String vaultName, String resourceGroupName, BackupResourceConfigResourceInner parameters) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2016-12-01";
        return service.update(vaultName, resourceGroupName, this.client.subscriptionId(), apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BackupResourceConfigResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<BackupResourceConfigResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BackupResourceConfigResourceInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BackupResourceConfigResourceInner> updateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BackupResourceConfigResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BackupResourceConfigResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates vault storage model type.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param parameters Vault storage config request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void patch(String vaultName, String resourceGroupName, BackupResourceConfigResourceInner parameters) {
        patchWithServiceResponseAsync(vaultName, resourceGroupName, parameters).toBlocking().single().body();
    }

    /**
     * Updates vault storage model type.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param parameters Vault storage config request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> patchAsync(String vaultName, String resourceGroupName, BackupResourceConfigResourceInner parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(patchWithServiceResponseAsync(vaultName, resourceGroupName, parameters), serviceCallback);
    }

    /**
     * Updates vault storage model type.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param parameters Vault storage config request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> patchAsync(String vaultName, String resourceGroupName, BackupResourceConfigResourceInner parameters) {
        return patchWithServiceResponseAsync(vaultName, resourceGroupName, parameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates vault storage model type.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param parameters Vault storage config request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> patchWithServiceResponseAsync(String vaultName, String resourceGroupName, BackupResourceConfigResourceInner parameters) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2016-12-01";
        return service.patch(vaultName, resourceGroupName, this.client.subscriptionId(), apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = patchDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> patchDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
