/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.OperationStatusValues;
import org.joda.time.DateTime;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.OperationStatusError;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.OperationStatusExtendedInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Operation status.
 */
public class OperationStatusInner {
    /**
     * ID of the operation.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Name of the operation.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Operation status. Possible values include: 'Invalid', 'InProgress',
     * 'Succeeded', 'Failed', 'Canceled'.
     */
    @JsonProperty(value = "status")
    private OperationStatusValues status;

    /**
     * Operation start time. Format: ISO-8601.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * Operation end time. Format: ISO-8601.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * Error information related to this operation.
     */
    @JsonProperty(value = "error")
    private OperationStatusError error;

    /**
     * Additional information associated with this operation.
     */
    @JsonProperty(value = "properties")
    private OperationStatusExtendedInfo properties;

    /**
     * Get iD of the operation.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set iD of the operation.
     *
     * @param id the id value to set
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get name of the operation.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the operation.
     *
     * @param name the name value to set
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get operation status. Possible values include: 'Invalid', 'InProgress', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @return the status value
     */
    public OperationStatusValues status() {
        return this.status;
    }

    /**
     * Set operation status. Possible values include: 'Invalid', 'InProgress', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @param status the status value to set
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withStatus(OperationStatusValues status) {
        this.status = status;
        return this;
    }

    /**
     * Get operation start time. Format: ISO-8601.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set operation start time. Format: ISO-8601.
     *
     * @param startTime the startTime value to set
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get operation end time. Format: ISO-8601.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set operation end time. Format: ISO-8601.
     *
     * @param endTime the endTime value to set
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get error information related to this operation.
     *
     * @return the error value
     */
    public OperationStatusError error() {
        return this.error;
    }

    /**
     * Set error information related to this operation.
     *
     * @param error the error value to set
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withError(OperationStatusError error) {
        this.error = error;
        return this;
    }

    /**
     * Get additional information associated with this operation.
     *
     * @return the properties value
     */
    public OperationStatusExtendedInfo properties() {
        return this.properties;
    }

    /**
     * Set additional information associated with this operation.
     *
     * @param properties the properties value to set
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withProperties(OperationStatusExtendedInfo properties) {
        this.properties = properties;
        return this;
    }

}
