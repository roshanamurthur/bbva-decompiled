package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl;

import com.bbva.tohu.android.core.exceptions.InternalErrorException;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.crypto.CryptoUtils;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.IccPrivateKeyCrtComponents;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public class IccPrivateKeyCrtComponentsDefaultImpl implements IccPrivateKeyCrtComponents {
    byte[] iccKek;
    private com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.IccPrivateKeyCrtComponents iccPrivateKeyCrtComponents;

    public IccPrivateKeyCrtComponentsDefaultImpl(com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.IccPrivateKeyCrtComponents iccPrivateKeyCrtComponents, byte[] bArr) {
        this.iccPrivateKeyCrtComponents = iccPrivateKeyCrtComponents;
        this.iccKek = bArr;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.IccPrivateKeyCrtComponents
    public byte[] getDp() {
        try {
            return CryptoUtils.decryptIccComponent(McmLiteUtils.byteArrayFromHexString(this.iccPrivateKeyCrtComponents.getDpValue()), this.iccKek);
        } catch (InternalErrorException | GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.IccPrivateKeyCrtComponents
    public byte[] getDq() {
        try {
            return CryptoUtils.decryptIccComponent(McmLiteUtils.byteArrayFromHexString(this.iccPrivateKeyCrtComponents.getDqValue()), this.iccKek);
        } catch (InternalErrorException | GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.IccPrivateKeyCrtComponents
    public byte[] getP() {
        try {
            return CryptoUtils.decryptIccComponent(McmLiteUtils.byteArrayFromHexString(this.iccPrivateKeyCrtComponents.getpValue()), this.iccKek);
        } catch (InternalErrorException | GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.IccPrivateKeyCrtComponents
    public byte[] getQ() {
        try {
            return CryptoUtils.decryptIccComponent(McmLiteUtils.byteArrayFromHexString(this.iccPrivateKeyCrtComponents.getqValue()), this.iccKek);
        } catch (InternalErrorException | GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.IccPrivateKeyCrtComponents
    public byte[] getU() {
        try {
            return CryptoUtils.decryptIccComponent(McmLiteUtils.byteArrayFromHexString(this.iccPrivateKeyCrtComponents.getuValue()), this.iccKek);
        } catch (InternalErrorException | GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.IccPrivateKeyCrtComponents
    public void wipe() {
    }
}
