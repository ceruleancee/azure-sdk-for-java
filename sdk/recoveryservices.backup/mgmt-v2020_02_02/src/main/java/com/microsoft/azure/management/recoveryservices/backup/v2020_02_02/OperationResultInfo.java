/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Operation result info.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType", defaultImpl = OperationResultInfo.class)
@JsonTypeName("OperationResultInfo")
public class OperationResultInfo extends OperationResultInfoBase {
    /**
     * List of jobs created by this operation.
     */
    @JsonProperty(value = "jobList")
    private List<String> jobList;

    /**
     * Get list of jobs created by this operation.
     *
     * @return the jobList value
     */
    public List<String> jobList() {
        return this.jobList;
    }

    /**
     * Set list of jobs created by this operation.
     *
     * @param jobList the jobList value to set
     * @return the OperationResultInfo object itself.
     */
    public OperationResultInfo withJobList(List<String> jobList) {
        this.jobList = jobList;
        return this;
    }

}
