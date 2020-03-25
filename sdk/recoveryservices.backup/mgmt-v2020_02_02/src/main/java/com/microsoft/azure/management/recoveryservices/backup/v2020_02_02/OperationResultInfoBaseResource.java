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
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.OperationResultInfoBaseResourceInner;
import java.util.Map;
import java.util.List;

/**
 * Type representing OperationResultInfoBaseResource.
 */
public interface OperationResultInfoBaseResource extends HasInner<OperationResultInfoBaseResourceInner>, HasManager<RecoveryServicesManager> {
    /**
     * @return the headers value.
     */
    Map<String, List<String>> headers();

    /**
     * @return the operation value.
     */
    OperationResultInfoBase operation();

    /**
     * @return the statusCode value.
     */
    HttpStatusCode statusCode();

}
