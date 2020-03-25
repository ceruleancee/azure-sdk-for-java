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
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.BackupRequestResource;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Backups.
 */
public class BackupsInner {
    /** The Retrofit service to perform REST calls. */
    private BackupsService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of BackupsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BackupsInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(BackupsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Backups to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BackupsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.Backups trigger" })
        @POST("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupFabrics/{fabricName}/protectionContainers/{containerName}/protectedItems/{protectedItemName}/backup")
        Observable<Response<ResponseBody>> trigger(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("fabricName") String fabricName, @Path("containerName") String containerName, @Path("protectedItemName") String protectedItemName, @Query("api-version") String apiVersion, @Body BackupRequestResource parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Triggers backup for specified backed up item. This is an asynchronous operation. To know the status of the
     operation, call GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backup item.
     * @param containerName Container name associated with the backup item.
     * @param protectedItemName Backup item for which backup needs to be triggered.
     * @param parameters resource backup request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void trigger(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, BackupRequestResource parameters) {
        triggerWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, parameters).toBlocking().single().body();
    }

    /**
     * Triggers backup for specified backed up item. This is an asynchronous operation. To know the status of the
     operation, call GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backup item.
     * @param containerName Container name associated with the backup item.
     * @param protectedItemName Backup item for which backup needs to be triggered.
     * @param parameters resource backup request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> triggerAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, BackupRequestResource parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(triggerWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, parameters), serviceCallback);
    }

    /**
     * Triggers backup for specified backed up item. This is an asynchronous operation. To know the status of the
     operation, call GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backup item.
     * @param containerName Container name associated with the backup item.
     * @param protectedItemName Backup item for which backup needs to be triggered.
     * @param parameters resource backup request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> triggerAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, BackupRequestResource parameters) {
        return triggerWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, parameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Triggers backup for specified backed up item. This is an asynchronous operation. To know the status of the
     operation, call GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backup item.
     * @param containerName Container name associated with the backup item.
     * @param protectedItemName Backup item for which backup needs to be triggered.
     * @param parameters resource backup request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> triggerWithServiceResponseAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, BackupRequestResource parameters) {
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
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2016-12-01";
        return service.trigger(vaultName, resourceGroupName, this.client.subscriptionId(), fabricName, containerName, protectedItemName, apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = triggerDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> triggerDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
