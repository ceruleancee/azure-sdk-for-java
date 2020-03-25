/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.BackupUsageSummariesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BackupUsageSummaries.
 */
public interface BackupUsageSummaries extends HasInner<BackupUsageSummariesInner> {
    /**
     * Fetches the backup management usage summaries of the vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BackupManagementUsage> listAsync(String vaultName, String resourceGroupName);

}
