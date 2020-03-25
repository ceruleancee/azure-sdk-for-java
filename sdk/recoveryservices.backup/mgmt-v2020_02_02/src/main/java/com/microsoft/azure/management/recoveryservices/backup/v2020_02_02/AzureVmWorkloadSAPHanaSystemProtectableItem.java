/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Azure VM workload-specific protectable item representing SAP HANA System.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectableItemType", defaultImpl = AzureVmWorkloadSAPHanaSystemProtectableItem.class)
@JsonTypeName("SAPHanaSystem")
public class AzureVmWorkloadSAPHanaSystemProtectableItem extends AzureVmWorkloadProtectableItem {
}
