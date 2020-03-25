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
 * Azure IaaS VM workload-specific Health Details.
 */
public class AzureIaaSVMHealthDetails {
    /**
     * Health Code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private Integer code;

    /**
     * Health Title.
     */
    @JsonProperty(value = "title", access = JsonProperty.Access.WRITE_ONLY)
    private String title;

    /**
     * Health Message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Health Recommended Actions.
     */
    @JsonProperty(value = "recommendations", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> recommendations;

    /**
     * Get health Code.
     *
     * @return the code value
     */
    public Integer code() {
        return this.code;
    }

    /**
     * Get health Title.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Get health Message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get health Recommended Actions.
     *
     * @return the recommendations value
     */
    public List<String> recommendations() {
        return this.recommendations;
    }

}
