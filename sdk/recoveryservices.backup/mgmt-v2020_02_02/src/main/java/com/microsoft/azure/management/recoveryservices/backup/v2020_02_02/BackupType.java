/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for BackupType.
 */
public final class BackupType extends ExpandableStringEnum<BackupType> {
    /** Static value Invalid for BackupType. */
    public static final BackupType INVALID = fromString("Invalid");

    /** Static value Full for BackupType. */
    public static final BackupType FULL = fromString("Full");

    /** Static value Differential for BackupType. */
    public static final BackupType DIFFERENTIAL = fromString("Differential");

    /** Static value Log for BackupType. */
    public static final BackupType LOG = fromString("Log");

    /** Static value CopyOnlyFull for BackupType. */
    public static final BackupType COPY_ONLY_FULL = fromString("CopyOnlyFull");

    /**
     * Creates or finds a BackupType from its string representation.
     * @param name a name to look for
     * @return the corresponding BackupType
     */
    @JsonCreator
    public static BackupType fromString(String name) {
        return fromString(name, BackupType.class);
    }

    /**
     * @return known BackupType values
     */
    public static Collection<BackupType> values() {
        return values(BackupType.class);
    }
}
