/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.ProtectedItemResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.RecoveryServicesManager;
import java.util.Map;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.ProtectedItemInner;

/**
 * Type representing ProtectionContainerBackupFabricVaultProtectedItemResource.
 */
public interface ProtectionContainerBackupFabricVaultProtectedItemResource extends HasInner<ProtectedItemResourceInner>, Indexable, Refreshable<ProtectionContainerBackupFabricVaultProtectedItemResource>, Updatable<ProtectionContainerBackupFabricVaultProtectedItemResource.Update>, HasManager<RecoveryServicesManager> {
    /**
     * @return the eTag value.
     */
    String eTag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    ProtectedItemInner properties();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ProtectionContainerBackupFabricVaultProtectedItemResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithProtectionContainer, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ProtectionContainerBackupFabricVaultProtectedItemResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ProtectionContainerBackupFabricVaultProtectedItemResource definition.
         */
        interface Blank extends WithProtectionContainer {
        }

        /**
         * The stage of the protectioncontainerbackupfabricvaultprotecteditemresource definition allowing to specify ProtectionContainer.
         */
        interface WithProtectionContainer {
           /**
            * Specifies vaultName, resourceGroupName, fabricName, containerName.
            * @param vaultName The name of the recovery services vault
            * @param resourceGroupName The name of the resource group where the recovery services vault is present
            * @param fabricName Fabric name associated with the backup item
            * @param containerName Container name associated with the backup item
            * @return the next definition stage
            */
            WithCreate withExistingProtectionContainer(String vaultName, String resourceGroupName, String fabricName, String containerName);
        }

        /**
         * The stage of the protectioncontainerbackupfabricvaultprotecteditemresource definition allowing to specify ETag.
         */
        interface WithETag {
            /**
             * Specifies eTag.
             * @param eTag Optional ETag
             * @return the next definition stage
             */
            WithCreate withETag(String eTag);
        }

        /**
         * The stage of the protectioncontainerbackupfabricvaultprotecteditemresource definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Resource location
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the protectioncontainerbackupfabricvaultprotecteditemresource definition allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties ProtectedItemResource properties
             * @return the next definition stage
             */
            WithCreate withProperties(ProtectedItemInner properties);
        }

        /**
         * The stage of the protectioncontainerbackupfabricvaultprotecteditemresource definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ProtectionContainerBackupFabricVaultProtectedItemResource>, DefinitionStages.WithETag, DefinitionStages.WithLocation, DefinitionStages.WithProperties, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a ProtectionContainerBackupFabricVaultProtectedItemResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ProtectionContainerBackupFabricVaultProtectedItemResource>, UpdateStages.WithETag, UpdateStages.WithLocation, UpdateStages.WithProperties, UpdateStages.WithTags {
    }

    /**
     * Grouping of ProtectionContainerBackupFabricVaultProtectedItemResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the protectioncontainerbackupfabricvaultprotecteditemresource update allowing to specify ETag.
         */
        interface WithETag {
            /**
             * Specifies eTag.
             * @param eTag Optional ETag
             * @return the next update stage
             */
            Update withETag(String eTag);
        }

        /**
         * The stage of the protectioncontainerbackupfabricvaultprotecteditemresource update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Resource location
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the protectioncontainerbackupfabricvaultprotecteditemresource update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties ProtectedItemResource properties
             * @return the next update stage
             */
            Update withProperties(ProtectedItemInner properties);
        }

        /**
         * The stage of the protectioncontainerbackupfabricvaultprotecteditemresource update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
