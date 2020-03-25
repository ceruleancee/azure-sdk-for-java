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

/**
 * DPM workload-specific error information.
 */
public class DpmErrorInfo {
    /**
     * Localized error string.
     */
    @JsonProperty(value = "errorString")
    private String errorString;

    /**
     * List of localized recommendations for above error code.
     */
    @JsonProperty(value = "recommendations")
    private List<String> recommendations;

    /**
     * Get localized error string.
     *
     * @return the errorString value
     */
    public String errorString() {
        return this.errorString;
    }

    /**
     * Set localized error string.
     *
     * @param errorString the errorString value to set
     * @return the DpmErrorInfo object itself.
     */
    public DpmErrorInfo withErrorString(String errorString) {
        this.errorString = errorString;
        return this;
    }

    /**
     * Get list of localized recommendations for above error code.
     *
     * @return the recommendations value
     */
    public List<String> recommendations() {
        return this.recommendations;
    }

    /**
     * Set list of localized recommendations for above error code.
     *
     * @param recommendations the recommendations value to set
     * @return the DpmErrorInfo object itself.
     */
    public DpmErrorInfo withRecommendations(List<String> recommendations) {
        this.recommendations = recommendations;
        return this;
    }

}
