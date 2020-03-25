/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.RecoveryServicesManager;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.ValidateOperationsResponseInner;

/**
 * Type representing ValidateOperationsResponse.
 */
public interface ValidateOperationsResponse extends HasInner<ValidateOperationsResponseInner>, HasManager<RecoveryServicesManager> {
    /**
     * @return the validateOperationResponse value.
     */
    ValidateOperationResponse validateOperationResponse();

}
