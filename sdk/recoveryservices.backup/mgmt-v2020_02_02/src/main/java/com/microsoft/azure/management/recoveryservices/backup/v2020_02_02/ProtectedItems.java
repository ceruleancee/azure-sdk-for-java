/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.ProtectedItemsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ProtectedItems.
 */
public interface ProtectedItems extends SupportsCreating<ProtectionContainerBackupFabricVaultProtectedItemResource.DefinitionStages.Blank>, HasInner<ProtectedItemsInner> {
    /**
     * Provides the details of the backed up item. This is an asynchronous operation. To know the status of the operation,
    call the GetItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up item.
     * @param containerName Container name associated with the backed up item.
     * @param protectedItemName Backed up item name whose details are to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProtectionContainerBackupFabricVaultProtectedItemResource> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName);

    /**
     * Used to disable backup of an item within a container. This is an asynchronous operation. To know the status of the
    request, call the GetItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up item.
     * @param containerName Container name associated with the backed up item.
     * @param protectedItemName Backed up item to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName);

}
