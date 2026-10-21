package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.AlternateContactlessPayment;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.AlternateContactlessPaymentData;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;

/* JADX INFO: loaded from: classes6.dex */
public class AlternateContactlessPaymentDataDefaultImpl implements AlternateContactlessPaymentData {
    private AlternateContactlessPayment alternateContactlessPayment;

    public AlternateContactlessPaymentDataDefaultImpl(AlternateContactlessPayment alternateContactlessPayment) {
        this.alternateContactlessPayment = alternateContactlessPayment;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.AlternateContactlessPaymentData
    public byte[] getAid() {
        AlternateContactlessPayment alternateContactlessPayment = this.alternateContactlessPayment;
        if (alternateContactlessPayment == null) {
            return new byte[0];
        }
        String aid = alternateContactlessPayment.getAid();
        return (aid == null || aid.length() == 0) ? new byte[0] : McmLiteUtils.byteArrayFromHexString(this.alternateContactlessPayment.getAid());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.AlternateContactlessPaymentData
    public byte[] getCiacDecline() {
        AlternateContactlessPayment alternateContactlessPayment = this.alternateContactlessPayment;
        if (alternateContactlessPayment == null) {
            return new byte[0];
        }
        String ciacDecline = alternateContactlessPayment.getCiacDecline();
        return (ciacDecline == null || ciacDecline.length() == 0) ? new byte[0] : McmLiteUtils.byteArrayFromHexString(this.alternateContactlessPayment.getCiacDecline());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.AlternateContactlessPaymentData
    public byte[] getCvrMaskAnd() {
        AlternateContactlessPayment alternateContactlessPayment = this.alternateContactlessPayment;
        if (alternateContactlessPayment == null) {
            return new byte[0];
        }
        String cvrMaskAnd = alternateContactlessPayment.getCvrMaskAnd();
        return (cvrMaskAnd == null || cvrMaskAnd.length() == 0) ? new byte[0] : McmLiteUtils.byteArrayFromHexString(this.alternateContactlessPayment.getCvrMaskAnd());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.AlternateContactlessPaymentData
    public byte[] getGpoResponse() {
        AlternateContactlessPayment alternateContactlessPayment = this.alternateContactlessPayment;
        if (alternateContactlessPayment == null) {
            return new byte[0];
        }
        String gpoResponse = alternateContactlessPayment.getGpoResponse();
        return (gpoResponse == null || gpoResponse.length() == 0) ? new byte[0] : McmLiteUtils.byteArrayFromHexString(this.alternateContactlessPayment.getGpoResponse());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.AlternateContactlessPaymentData
    public byte[] getPaymentFci() {
        AlternateContactlessPayment alternateContactlessPayment = this.alternateContactlessPayment;
        if (alternateContactlessPayment == null) {
            return new byte[0];
        }
        String paymentFci = alternateContactlessPayment.getPaymentFci();
        return (paymentFci == null || paymentFci.length() == 0) ? new byte[0] : McmLiteUtils.byteArrayFromHexString(this.alternateContactlessPayment.getPaymentFci());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.AlternateContactlessPaymentData
    public void wipe() {
    }
}
