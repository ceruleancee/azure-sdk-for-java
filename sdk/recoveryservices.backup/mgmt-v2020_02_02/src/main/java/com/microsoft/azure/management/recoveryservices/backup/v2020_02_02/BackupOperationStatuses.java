/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.BackupOperationStatusesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BackupOperationStatuses.
 */
public interface BackupOperationStatuses extends HasInner<BackupOperationStatusesInner> {
    /**
     * Fetches the status of an operation such as triggering a backup, restore. The status can be in progress, completed
    or failed. You can refer to the OperationStatus enum for all the possible states of an operation. Some operations
    create jobs. This method returns the list of jobs when the operation is complete.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param operationId OperationID which represents the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VaultOperationStatus> getAsync(String vaultName, String resourceGroupName, String operationId);

}
