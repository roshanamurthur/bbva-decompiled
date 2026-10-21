package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.RemotePayment;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;

/* JADX INFO: loaded from: classes6.dex */
public class RemotePaymentDataImplTest implements RemotePaymentData {
    RemotePayment remotePayment;

    public RemotePaymentDataImplTest(RemotePayment remotePayment) {
        this.remotePayment = remotePayment;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData
    public byte[] getAip() {
        return McmLiteUtils.byteArrayFromHexString(this.remotePayment.getAip());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData
    public byte[] getApplicationExpiryDate() {
        return McmLiteUtils.byteArrayFromHexString(this.remotePayment.getApplicationExpiryDate());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData
    public byte[] getCiacDecline() {
        return McmLiteUtils.byteArrayFromHexString(this.remotePayment.getCiacDecline());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData
    public byte[] getCvrMaskAnd() {
        return McmLiteUtils.byteArrayFromHexString(this.remotePayment.getCvrMaskAnd());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData
    public byte[] getIssuerApplicationData() {
        return McmLiteUtils.byteArrayFromHexString(this.remotePayment.getIssuerApplicationData());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData
    public byte[] getPan() {
        return McmLiteUtils.byteArrayFromHexString(this.remotePayment.getPan());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData
    public byte[] getPanSequenceNumber() {
        return McmLiteUtils.byteArrayFromHexString(this.remotePayment.getPanSequenceNumber());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData
    public byte[] getTrack2EquivalentData() {
        return McmLiteUtils.byteArrayFromHexString(this.remotePayment.getTrack2Equivalent());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData
    public void wipe() {
    }
}
