/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import rx.Observable;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.WorkspaceManagedIdentitySqlControlSettingsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing WorkspaceManagedIdentitySqlControlSettings.
 */
public interface WorkspaceManagedIdentitySqlControlSettings extends HasInner<WorkspaceManagedIdentitySqlControlSettingsInner> {
    /**
     * Get Managed Identity Sql Control Settings.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagedIdentitySqlControlSettingsModel> getAsync(String resourceGroupName, String workspaceName);

    /**
     * Create or update Managed Identity Sql Control Settings.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagedIdentitySqlControlSettingsModel> createOrUpdateAsync(String resourceGroupName, String workspaceName);

}
