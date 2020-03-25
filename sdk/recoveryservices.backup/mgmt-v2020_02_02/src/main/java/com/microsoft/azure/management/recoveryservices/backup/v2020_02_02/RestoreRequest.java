/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for restore request. Workload-specific restore requests are
 * derived from this class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType", defaultImpl = RestoreRequest.class)
@JsonTypeName("RestoreRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureFileShareRestoreRequest", value = AzureFileShareRestoreRequest.class),
    @JsonSubTypes.Type(name = "AzureWorkloadRestoreRequest", value = AzureWorkloadRestoreRequest.class),
    @JsonSubTypes.Type(name = "IaasVMRestoreRequest", value = IaasVMRestoreRequest.class)
})
public class RestoreRequest {
}
