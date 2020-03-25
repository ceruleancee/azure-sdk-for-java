/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.BackupResourceConfig;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The resource storage details.
 */
@SkipParentValidation
public class BackupResourceConfigResourceInner extends Resource {
    /**
     * BackupResourceConfigResource properties.
     */
    @JsonProperty(value = "properties")
    private BackupResourceConfig properties;

    /**
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * Get backupResourceConfigResource properties.
     *
     * @return the properties value
     */
    public BackupResourceConfig properties() {
        return this.properties;
    }

    /**
     * Set backupResourceConfigResource properties.
     *
     * @param properties the properties value to set
     * @return the BackupResourceConfigResourceInner object itself.
     */
    public BackupResourceConfigResourceInner withProperties(BackupResourceConfig properties) {
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
     * @return the BackupResourceConfigResourceInner object itself.
     */
    public BackupResourceConfigResourceInner withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}
