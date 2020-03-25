/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.SecurityPINs;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.TokenInformation;

class SecurityPINsImpl extends WrapperImpl<SecurityPINsInner> implements SecurityPINs {
    private final RecoveryServicesManager manager;

    SecurityPINsImpl(RecoveryServicesManager manager) {
        super(manager.inner().securityPINs());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<TokenInformation> getAsync(String vaultName, String resourceGroupName) {
        SecurityPINsInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName)
        .map(new Func1<TokenInformationInner, TokenInformation>() {
            @Override
            public TokenInformation call(TokenInformationInner inner) {
                return new TokenInformationImpl(inner, manager());
            }
        });
    }

}
