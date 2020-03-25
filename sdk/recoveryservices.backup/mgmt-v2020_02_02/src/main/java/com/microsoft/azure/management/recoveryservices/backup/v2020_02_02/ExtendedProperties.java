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
 * Extended Properties for Azure IaasVM Backup.
 */
public class ExtendedProperties {
    /**
     * Extended Properties for Disk Exclusion.
     */
    @JsonProperty(value = "diskExclusionProperties")
    private DiskExclusionProperties diskExclusionProperties;

    /**
     * Get extended Properties for Disk Exclusion.
     *
     * @return the diskExclusionProperties value
     */
    public DiskExclusionProperties diskExclusionProperties() {
        return this.diskExclusionProperties;
    }

    /**
     * Set extended Properties for Disk Exclusion.
     *
     * @param diskExclusionProperties the diskExclusionProperties value to set
     * @return the ExtendedProperties object itself.
     */
    public ExtendedProperties withDiskExclusionProperties(DiskExclusionProperties diskExclusionProperties) {
        this.diskExclusionProperties = diskExclusionProperties;
        return this;
    }

}
