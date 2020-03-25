/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sub-protection policy which includes schedule and retention.
 */
public class SubProtectionPolicy {
    /**
     * Type of backup policy type. Possible values include: 'Invalid', 'Full',
     * 'Differential', 'Log', 'CopyOnlyFull'.
     */
    @JsonProperty(value = "policyType")
    private PolicyType policyType;

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
     * Get type of backup policy type. Possible values include: 'Invalid', 'Full', 'Differential', 'Log', 'CopyOnlyFull'.
     *
     * @return the policyType value
     */
    public PolicyType policyType() {
        return this.policyType;
    }

    /**
     * Set type of backup policy type. Possible values include: 'Invalid', 'Full', 'Differential', 'Log', 'CopyOnlyFull'.
     *
     * @param policyType the policyType value to set
     * @return the SubProtectionPolicy object itself.
     */
    public SubProtectionPolicy withPolicyType(PolicyType policyType) {
        this.policyType = policyType;
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
     * @return the SubProtectionPolicy object itself.
     */
    public SubProtectionPolicy withSchedulePolicy(SchedulePolicy schedulePolicy) {
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
     * @return the SubProtectionPolicy object itself.
     */
    public SubProtectionPolicy withRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

}
