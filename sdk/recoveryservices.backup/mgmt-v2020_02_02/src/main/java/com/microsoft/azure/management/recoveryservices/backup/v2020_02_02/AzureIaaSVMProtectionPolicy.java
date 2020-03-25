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
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.ProtectionPolicyInner;

/**
 * IaaS VM workload-specific backup policy.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "backupManagementType", defaultImpl = AzureIaaSVMProtectionPolicy.class)
@JsonTypeName("AzureIaasVM")
public class AzureIaaSVMProtectionPolicy extends ProtectionPolicyInner {
    /**
     * The instantRPDetails property.
     */
    @JsonProperty(value = "instantRPDetails")
    private InstantRPAdditionalDetails instantRPDetails;

    /**
     * Backup schedule specified as part of backup policy.
     */
    @JsonProperty(value = "schedulePolicy")
    private SchedulePolicy schedulePolicy;

    /**
     * Retention policy with the details on backup copy retention ranges.
     */
    @JsonProperty(value = "retentionPolicy")
    private RetentionPolicy retentionPolicy;

    /**
     * Instant RP retention policy range in days.
     */
    @JsonProperty(value = "instantRpRetentionRangeInDays")
    private Integer instantRpRetentionRangeInDays;

    /**
     * TimeZone optional input as string. For example: TimeZone = "Pacific
     * Standard Time".
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /**
     * Get the instantRPDetails value.
     *
     * @return the instantRPDetails value
     */
    public InstantRPAdditionalDetails instantRPDetails() {
        return this.instantRPDetails;
    }

    /**
     * Set the instantRPDetails value.
     *
     * @param instantRPDetails the instantRPDetails value to set
     * @return the AzureIaaSVMProtectionPolicy object itself.
     */
    public AzureIaaSVMProtectionPolicy withInstantRPDetails(InstantRPAdditionalDetails instantRPDetails) {
        this.instantRPDetails = instantRPDetails;
        return this;
    }

    /**
     * Get backup schedule specified as part of backup policy.
     *
     * @return the schedulePolicy value
     */
    public SchedulePolicy schedulePolicy() {
        return this.schedulePolicy;
    }

    /**
     * Set backup schedule specified as part of backup policy.
     *
     * @param schedulePolicy the schedulePolicy value to set
     * @return the AzureIaaSVMProtectionPolicy object itself.
     */
    public AzureIaaSVMProtectionPolicy withSchedulePolicy(SchedulePolicy schedulePolicy) {
        this.schedulePolicy = schedulePolicy;
        return this;
    }

    /**
     * Get retention policy with the details on backup copy retention ranges.
     *
     * @return the retentionPolicy value
     */
    public RetentionPolicy retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set retention policy with the details on backup copy retention ranges.
     *
     * @param retentionPolicy the retentionPolicy value to set
     * @return the AzureIaaSVMProtectionPolicy object itself.
     */
    public AzureIaaSVMProtectionPolicy withRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * Get instant RP retention policy range in days.
     *
     * @return the instantRpRetentionRangeInDays value
     */
    public Integer instantRpRetentionRangeInDays() {
        return this.instantRpRetentionRangeInDays;
    }

    /**
     * Set instant RP retention policy range in days.
     *
     * @param instantRpRetentionRangeInDays the instantRpRetentionRangeInDays value to set
     * @return the AzureIaaSVMProtectionPolicy object itself.
     */
    public AzureIaaSVMProtectionPolicy withInstantRpRetentionRangeInDays(Integer instantRpRetentionRangeInDays) {
        this.instantRpRetentionRangeInDays = instantRpRetentionRangeInDays;
        return this;
    }

    /**
     * Get timeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     *
     * @return the timeZone value
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set timeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     *
     * @param timeZone the timeZone value to set
     * @return the AzureIaaSVMProtectionPolicy object itself.
     */
    public AzureIaaSVMProtectionPolicy withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

}
