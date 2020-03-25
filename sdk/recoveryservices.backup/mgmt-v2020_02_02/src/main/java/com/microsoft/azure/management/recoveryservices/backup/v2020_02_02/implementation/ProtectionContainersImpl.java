/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.ProtectionContainers;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.BackupFabricVaultProtectionContainerResource;

class ProtectionContainersImpl extends WrapperImpl<ProtectionContainersInner> implements ProtectionContainers {
    private final RecoveryServicesManager manager;

    ProtectionContainersImpl(RecoveryServicesManager manager) {
        super(manager.inner().protectionContainers());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public BackupFabricVaultProtectionContainerResourceImpl define(String name) {
        return wrapModel(name);
    }

    private BackupFabricVaultProtectionContainerResourceImpl wrapModel(ProtectionContainerResourceInner inner) {
        return  new BackupFabricVaultProtectionContainerResourceImpl(inner, manager());
    }

    private BackupFabricVaultProtectionContainerResourceImpl wrapModel(String name) {
        return new BackupFabricVaultProtectionContainerResourceImpl(name, this.manager());
    }

    @Override
    public Completable inquireAsync(String vaultName, String resourceGroupName, String fabricName, String containerName) {
        ProtectionContainersInner client = this.inner();
        return client.inquireAsync(vaultName, resourceGroupName, fabricName, containerName).toCompletable();
    }

    @Override
    public Observable<BackupFabricVaultProtectionContainerResource> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName) {
        ProtectionContainersInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName, fabricName, containerName)
        .flatMap(new Func1<ProtectionContainerResourceInner, Observable<BackupFabricVaultProtectionContainerResource>>() {
            @Override
            public Observable<BackupFabricVaultProtectionContainerResource> call(ProtectionContainerResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((BackupFabricVaultProtectionContainerResource)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable unregisterAsync(String vaultName, String resourceGroupName, String fabricName, String containerName) {
        ProtectionContainersInner client = this.inner();
        return client.unregisterAsync(vaultName, resourceGroupName, fabricName, containerName).toCompletable();
    }

    @Override
    public Completable refreshAsync(String vaultName, String resourceGroupName, String fabricName) {
        ProtectionContainersInner client = this.inner();
        return client.refreshAsync(vaultName, resourceGroupName, fabricName).toCompletable();
    }

}
