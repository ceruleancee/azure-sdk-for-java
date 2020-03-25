/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.BackupManagementType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for container with backup items. Containers with specific
 * workloads are derived from this class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "containerType", defaultImpl = ProtectionContainerInner.class)
@JsonTypeName("ProtectionContainer")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureSqlContainer", value = AzureSqlContainer.class),
    @JsonSubTypes.Type(name = "StorageContainer", value = AzureStorageContainer.class),
    @JsonSubTypes.Type(name = "AzureWorkloadContainer", value = AzureWorkloadContainer.class),
    @JsonSubTypes.Type(name = "DPMContainer", value = DpmContainer.class),
    @JsonSubTypes.Type(name = "GenericContainer", value = GenericContainer.class),
    @JsonSubTypes.Type(name = "IaaSVMContainer", value = IaaSVMContainer.class),
    @JsonSubTypes.Type(name = "Windows", value = MabContainer.class)
})
public class ProtectionContainerInner {
    /**
     * Friendly name of the container.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * Type of backup management for the container. Possible values include:
     * 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql',
     * 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     */
    @JsonProperty(value = "backupManagementType")
    private BackupManagementType backupManagementType;

    /**
     * Status of registration of the container with the Recovery Services
     * Vault.
     */
    @JsonProperty(value = "registrationStatus")
    private String registrationStatus;

    /**
     * Status of health of the container.
     */
    @JsonProperty(value = "healthStatus")
    private String healthStatus;

    /**
     * Get friendly name of the container.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of the container.
     *
     * @param friendlyName the friendlyName value to set
     * @return the ProtectionContainerInner object itself.
     */
    public ProtectionContainerInner withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get type of backup management for the container. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql', 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     *
     * @return the backupManagementType value
     */
    public BackupManagementType backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set type of backup management for the container. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql', 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     *
     * @param backupManagementType the backupManagementType value to set
     * @return the ProtectionContainerInner object itself.
     */
    public ProtectionContainerInner withBackupManagementType(BackupManagementType backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get status of registration of the container with the Recovery Services Vault.
     *
     * @return the registrationStatus value
     */
    public String registrationStatus() {
        return this.registrationStatus;
    }

    /**
     * Set status of registration of the container with the Recovery Services Vault.
     *
     * @param registrationStatus the registrationStatus value to set
     * @return the ProtectionContainerInner object itself.
     */
    public ProtectionContainerInner withRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
        return this;
    }

    /**
     * Get status of health of the container.
     *
     * @return the healthStatus value
     */
    public String healthStatus() {
        return this.healthStatus;
    }

    /**
     * Set status of health of the container.
     *
     * @param healthStatus the healthStatus value to set
     * @return the ProtectionContainerInner object itself.
     */
    public ProtectionContainerInner withHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

}
