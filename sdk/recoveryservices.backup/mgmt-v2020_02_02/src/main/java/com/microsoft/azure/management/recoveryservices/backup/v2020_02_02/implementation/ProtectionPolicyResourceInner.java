/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Base class for backup policy. Workload-specific backup policies are derived
 * from this class.
 */
@SkipParentValidation
public class ProtectionPolicyResourceInner extends Resource {
    /**
     * ProtectionPolicyResource properties.
     */
    @JsonProperty(value = "properties")
    private ProtectionPolicyInner properties;

    /**
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * Get protectionPolicyResource properties.
     *
     * @return the properties value
     */
    public ProtectionPolicyInner properties() {
        return this.properties;
    }

    /**
     * Set protectionPolicyResource properties.
     *
     * @param properties the properties value to set
     * @return the ProtectionPolicyResourceInner object itself.
     */
    public ProtectionPolicyResourceInner withProperties(ProtectionPolicyInner properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get optional ETag.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set optional ETag.
     *
     * @param eTag the eTag value to set
     * @return the ProtectionPolicyResourceInner object itself.
     */
    public ProtectionPolicyResourceInner withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}
