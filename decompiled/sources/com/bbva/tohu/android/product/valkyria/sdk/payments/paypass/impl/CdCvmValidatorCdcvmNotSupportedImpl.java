package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl;

import com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation;

/* JADX INFO: loaded from: classes6.dex */
public class CdCvmValidatorCdcvmNotSupportedImpl implements CdCvmValidatorInformation {
    @Override // com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation
    public String getDescription() {
        return "";
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation
    public long getLastSuccessfulAuthenticationTimeInMilliseconds() {
        return 0L;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation
    public CdCvmValidatorInformation.UmdValidity getUmdValidity() {
        return CdCvmValidatorInformation.UmdValidity.ALWAYS;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation
    public boolean isAuthenticated() {
        return true;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation
    public boolean isOnDeviceCvmEnabled() {
        return false;
    }
}
