/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Provides details for log ranges.
 */
public class PointInTimeRange {
    /**
     * Start time of the time range for log recovery.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * End time of the time range for log recovery.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * Get start time of the time range for log recovery.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set start time of the time range for log recovery.
     *
     * @param startTime the startTime value to set
     * @return the PointInTimeRange object itself.
     */
    public PointInTimeRange withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get end time of the time range for log recovery.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set end time of the time range for log recovery.
     *
     * @param endTime the endTime value to set
     * @return the PointInTimeRange object itself.
     */
    public PointInTimeRange withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

}
