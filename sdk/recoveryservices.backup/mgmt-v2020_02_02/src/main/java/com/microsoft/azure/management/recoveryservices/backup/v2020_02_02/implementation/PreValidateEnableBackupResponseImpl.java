/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.PreValidateEnableBackupResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.ValidationStatus;

class PreValidateEnableBackupResponseImpl extends WrapperImpl<PreValidateEnableBackupResponseInner> implements PreValidateEnableBackupResponse {
    private final RecoveryServicesManager manager;
    PreValidateEnableBackupResponseImpl(PreValidateEnableBackupResponseInner inner, RecoveryServicesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public String containerName() {
        return this.inner().containerName();
    }

    @Override
    public String errorCode() {
        return this.inner().errorCode();
    }

    @Override
    public String errorMessage() {
        return this.inner().errorMessage();
    }

    @Override
    public String protectedItemName() {
        return this.inner().protectedItemName();
    }

    @Override
    public String recommendation() {
        return this.inner().recommendation();
    }

    @Override
    public ValidationStatus status() {
        return this.inner().status();
    }

}
