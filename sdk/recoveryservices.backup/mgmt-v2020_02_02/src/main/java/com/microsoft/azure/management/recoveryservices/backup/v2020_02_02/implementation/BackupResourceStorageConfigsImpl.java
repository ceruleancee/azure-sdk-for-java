/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.BackupResourceStorageConfigs;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.BackupResourceConfigResource;

class BackupResourceStorageConfigsImpl extends WrapperImpl<BackupResourceStorageConfigsInner> implements BackupResourceStorageConfigs {
    private final RecoveryServicesManager manager;

    BackupResourceStorageConfigsImpl(RecoveryServicesManager manager) {
        super(manager.inner().backupResourceStorageConfigs());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BackupResourceConfigResource> getAsync(String vaultName, String resourceGroupName) {
        BackupResourceStorageConfigsInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName)
        .map(new Func1<BackupResourceConfigResourceInner, BackupResourceConfigResource>() {
            @Override
            public BackupResourceConfigResource call(BackupResourceConfigResourceInner inner) {
                return new BackupResourceConfigResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BackupResourceConfigResource> updateAsync(String vaultName, String resourceGroupName, BackupResourceConfigResourceInner parameters) {
        BackupResourceStorageConfigsInner client = this.inner();
        return client.updateAsync(vaultName, resourceGroupName, parameters)
        .map(new Func1<BackupResourceConfigResourceInner, BackupResourceConfigResource>() {
            @Override
            public BackupResourceConfigResource call(BackupResourceConfigResourceInner inner) {
                return new BackupResourceConfigResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable patchAsync(String vaultName, String resourceGroupName, BackupResourceConfigResourceInner parameters) {
        BackupResourceStorageConfigsInner client = this.inner();
        return client.patchAsync(vaultName, resourceGroupName, parameters).toCompletable();
    }

}
