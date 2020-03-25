/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Weekly retention schedule.
 */
public class WeeklyRetentionSchedule {
    /**
     * List of days of week for weekly retention policy.
     */
    @JsonProperty(value = "daysOfTheWeek")
    private List<DayOfWeek> daysOfTheWeek;

    /**
     * Retention times of retention policy.
     */
    @JsonProperty(value = "retentionTimes")
    private List<DateTime> retentionTimes;

    /**
     * Retention duration of retention Policy.
     */
    @JsonProperty(value = "retentionDuration")
    private RetentionDuration retentionDuration;

    /**
     * Get list of days of week for weekly retention policy.
     *
     * @return the daysOfTheWeek value
     */
    public List<DayOfWeek> daysOfTheWeek() {
        return this.daysOfTheWeek;
    }

    /**
     * Set list of days of week for weekly retention policy.
     *
     * @param daysOfTheWeek the daysOfTheWeek value to set
     * @return the WeeklyRetentionSchedule object itself.
     */
    public WeeklyRetentionSchedule withDaysOfTheWeek(List<DayOfWeek> daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
        return this;
    }

    /**
     * Get retention times of retention policy.
     *
     * @return the retentionTimes value
     */
    public List<DateTime> retentionTimes() {
        return this.retentionTimes;
    }

    /**
     * Set retention times of retention policy.
     *
     * @param retentionTimes the retentionTimes value to set
     * @return the WeeklyRetentionSchedule object itself.
     */
    public WeeklyRetentionSchedule withRetentionTimes(List<DateTime> retentionTimes) {
        this.retentionTimes = retentionTimes;
        return this;
    }

    /**
     * Get retention duration of retention Policy.
     *
     * @return the retentionDuration value
     */
    public RetentionDuration retentionDuration() {
        return this.retentionDuration;
    }

    /**
     * Set retention duration of retention Policy.
     *
     * @param retentionDuration the retentionDuration value to set
     * @return the WeeklyRetentionSchedule object itself.
     */
    public WeeklyRetentionSchedule withRetentionDuration(RetentionDuration retentionDuration) {
        this.retentionDuration = retentionDuration;
        return this;
    }

}
