/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import org.joda.time.Period;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.JobInner;

/**
 * Azure storage specific job.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobType", defaultImpl = AzureWorkloadJob.class)
@JsonTypeName("AzureWorkloadJob")
public class AzureWorkloadJob extends JobInner {
    /**
     * Workload type of the job.
     */
    @JsonProperty(value = "workloadType")
    private String workloadType;

    /**
     * Time elapsed during the execution of this job.
     */
    @JsonProperty(value = "duration")
    private Period duration;

    /**
     * Gets or sets the state/actions applicable on this job like cancel/retry.
     */
    @JsonProperty(value = "actionsInfo")
    private List<JobSupportedAction> actionsInfo;

    /**
     * Error details on execution of this job.
     */
    @JsonProperty(value = "errorDetails")
    private List<AzureWorkloadErrorInfo> errorDetails;

    /**
     * Additional information about the job.
     */
    @JsonProperty(value = "extendedInfo")
    private AzureWorkloadJobExtendedInfo extendedInfo;

    /**
     * Get workload type of the job.
     *
     * @return the workloadType value
     */
    public String workloadType() {
        return this.workloadType;
    }

    /**
     * Set workload type of the job.
     *
     * @param workloadType the workloadType value to set
     * @return the AzureWorkloadJob object itself.
     */
    public AzureWorkloadJob withWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * Get time elapsed during the execution of this job.
     *
     * @return the duration value
     */
    public Period duration() {
        return this.duration;
    }

    /**
     * Set time elapsed during the execution of this job.
     *
     * @param duration the duration value to set
     * @return the AzureWorkloadJob object itself.
     */
    public AzureWorkloadJob withDuration(Period duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get gets or sets the state/actions applicable on this job like cancel/retry.
     *
     * @return the actionsInfo value
     */
    public List<JobSupportedAction> actionsInfo() {
        return this.actionsInfo;
    }

    /**
     * Set gets or sets the state/actions applicable on this job like cancel/retry.
     *
     * @param actionsInfo the actionsInfo value to set
     * @return the AzureWorkloadJob object itself.
     */
    public AzureWorkloadJob withActionsInfo(List<JobSupportedAction> actionsInfo) {
        this.actionsInfo = actionsInfo;
        return this;
    }

    /**
     * Get error details on execution of this job.
     *
     * @return the errorDetails value
     */
    public List<AzureWorkloadErrorInfo> errorDetails() {
        return this.errorDetails;
    }

    /**
     * Set error details on execution of this job.
     *
     * @param errorDetails the errorDetails value to set
     * @return the AzureWorkloadJob object itself.
     */
    public AzureWorkloadJob withErrorDetails(List<AzureWorkloadErrorInfo> errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    /**
     * Get additional information about the job.
     *
     * @return the extendedInfo value
     */
    public AzureWorkloadJobExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set additional information about the job.
     *
     * @param extendedInfo the extendedInfo value to set
     * @return the AzureWorkloadJob object itself.
     */
    public AzureWorkloadJob withExtendedInfo(AzureWorkloadJobExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

}
