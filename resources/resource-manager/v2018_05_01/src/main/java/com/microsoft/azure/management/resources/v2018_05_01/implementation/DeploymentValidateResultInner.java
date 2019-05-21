/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_05_01.implementation;

import com.microsoft.azure.management.resources.v2018_05_01.ResourceManagementErrorWithDetails;
import com.microsoft.azure.management.resources.v2018_05_01.DeploymentPropertiesExtended;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information from validate template deployment response.
 */
public class DeploymentValidateResultInner {
    /**
     * Validation error.
     */
    @JsonProperty(value = "error")
    private ResourceManagementErrorWithDetails error;

    /**
     * The template deployment properties.
     */
    @JsonProperty(value = "properties")
    private DeploymentPropertiesExtended properties;

    /**
     * Get validation error.
     *
     * @return the error value
     */
    public ResourceManagementErrorWithDetails error() {
        return this.error;
    }

    /**
     * Set validation error.
     *
     * @param error the error value to set
     * @return the DeploymentValidateResultInner object itself.
     */
    public DeploymentValidateResultInner withError(ResourceManagementErrorWithDetails error) {
        this.error = error;
        return this;
    }

    /**
     * Get the template deployment properties.
     *
     * @return the properties value
     */
    public DeploymentPropertiesExtended properties() {
        return this.properties;
    }

    /**
     * Set the template deployment properties.
     *
     * @param properties the properties value to set
     * @return the DeploymentValidateResultInner object itself.
     */
    public DeploymentValidateResultInner withProperties(DeploymentPropertiesExtended properties) {
        this.properties = properties;
        return this;
    }

}
