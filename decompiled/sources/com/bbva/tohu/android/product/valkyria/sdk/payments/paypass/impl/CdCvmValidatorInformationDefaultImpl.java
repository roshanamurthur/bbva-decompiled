package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl;

import com.bbva.tohu.android.core.utils.DeviceInfo;
import com.bbva.tohu.android.product.valkyria.sdk.payments.auth.AuthenticationManager;
import com.bbva.tohu.android.product.valkyria.sdk.payments.auth.AuthenticationToken;
import com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation;

/* JADX INFO: loaded from: classes6.dex */
public class CdCvmValidatorInformationDefaultImpl implements CdCvmValidatorInformation {
    private AuthenticationManager authenticationManager;
    private DeviceInfo deviceInfo;

    public CdCvmValidatorInformationDefaultImpl(AuthenticationManager authenticationManager, DeviceInfo deviceInfo) {
        this.authenticationManager = authenticationManager;
        this.deviceInfo = deviceInfo;
    }

    private boolean isCdcvmValidated() {
        if (this.deviceInfo.isDeviceSecure() && !this.deviceInfo.isDeviceLocked()) {
            return isUnlockAuthenticationAllowed() || isUserAuthenticated();
        }
        return false;
    }

    private boolean isUnlockAuthenticationAllowed() {
        AuthenticationToken authenticationTokenRetrieveDeviceAuthentication = this.authenticationManager.retrieveDeviceAuthentication();
        return authenticationTokenRetrieveDeviceAuthentication != null && authenticationTokenRetrieveDeviceAuthentication.isValid();
    }

    private boolean isUserAuthenticated() {
        AuthenticationToken authenticationTokenRetrieveUserAuthentication = this.authenticationManager.retrieveUserAuthentication();
        return authenticationTokenRetrieveUserAuthentication != null && authenticationTokenRetrieveUserAuthentication.isValid();
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation
    public String getDescription() {
        return "";
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation
    public long getLastSuccessfulAuthenticationTimeInMilliseconds() {
        if (isCdcvmValidated()) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation
    public CdCvmValidatorInformation.UmdValidity getUmdValidity() {
        return CdCvmValidatorInformation.UmdValidity.CONDITIONAL_TO_CD_CVM;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation
    public boolean isAuthenticated() {
        return isCdcvmValidated();
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation
    public boolean isOnDeviceCvmEnabled() {
        return true;
    }
}
