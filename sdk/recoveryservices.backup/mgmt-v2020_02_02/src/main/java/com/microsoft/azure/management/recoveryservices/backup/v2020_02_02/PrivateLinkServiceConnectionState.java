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
 * Private Link Service Connection State.
 */
public class PrivateLinkServiceConnectionState {
    /**
     * Gets or sets the status. Possible values include: 'Pending', 'Approved',
     * 'Rejected', 'Disconnected'.
     */
    @JsonProperty(value = "status")
    private PrivateEndpointConnectionStatus status;

    /**
     * Gets or sets description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Gets or sets actions required.
     */
    @JsonProperty(value = "actionRequired")
    private String actionRequired;

    /**
     * Get gets or sets the status. Possible values include: 'Pending', 'Approved', 'Rejected', 'Disconnected'.
     *
     * @return the status value
     */
    public PrivateEndpointConnectionStatus status() {
        return this.status;
    }

    /**
     * Set gets or sets the status. Possible values include: 'Pending', 'Approved', 'Rejected', 'Disconnected'.
     *
     * @param status the status value to set
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withStatus(PrivateEndpointConnectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get gets or sets description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set gets or sets description.
     *
     * @param description the description value to set
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get gets or sets actions required.
     *
     * @return the actionRequired value
     */
    public String actionRequired() {
        return this.actionRequired;
    }

    /**
     * Set gets or sets actions required.
     *
     * @param actionRequired the actionRequired value to set
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withActionRequired(String actionRequired) {
        this.actionRequired = actionRequired;
        return this;
    }

}
