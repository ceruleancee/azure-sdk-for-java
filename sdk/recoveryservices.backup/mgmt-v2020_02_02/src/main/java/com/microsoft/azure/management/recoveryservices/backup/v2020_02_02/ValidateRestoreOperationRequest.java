/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * AzureRestoreValidation request.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType", defaultImpl = ValidateRestoreOperationRequest.class)
@JsonTypeName("ValidateRestoreOperationRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ValidateIaasVMRestoreOperationRequest", value = ValidateIaasVMRestoreOperationRequest.class)
})
public class ValidateRestoreOperationRequest extends ValidateOperationRequest {
    /**
     * Sets restore request to be validated.
     */
    @JsonProperty(value = "restoreRequest")
    private RestoreRequest restoreRequest;

    /**
     * Get sets restore request to be validated.
     *
     * @return the restoreRequest value
     */
    public RestoreRequest restoreRequest() {
        return this.restoreRequest;
    }

    /**
     * Set sets restore request to be validated.
     *
     * @param restoreRequest the restoreRequest value to set
     * @return the ValidateRestoreOperationRequest object itself.
     */
    public ValidateRestoreOperationRequest withRestoreRequest(RestoreRequest restoreRequest) {
        this.restoreRequest = restoreRequest;
        return this;
    }

}
