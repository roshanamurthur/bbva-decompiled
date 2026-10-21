package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile;

import com.bbva.google.pay.GoogleTapAndPay;
import flexjson.JSON;

/* JADX INFO: loaded from: classes6.dex */
class RemotePaymentDataMdesCmsC {

    @JSON(name = "aip")
    private String aip;

    @JSON(name = "applicationExpiryDate")
    private String applicationExpiryDate;

    @JSON(name = "ciacDecline")
    private String ciacDecline;

    @JSON(name = "cvrMaskAnd")
    private String cvrMaskAnd;

    @JSON(name = "issuerApplicationData")
    private String issuerApplicationData;

    @JSON(name = GoogleTapAndPay.KEY_PAN)
    private String pan;

    @JSON(name = "panSequenceNumber")
    private String panSequenceNumber;

    @JSON(name = "track2Equivalent")
    private String track2Equivalent;

    public String getAip() {
        return this.aip;
    }

    public String getApplicationExpiryDate() {
        return this.applicationExpiryDate;
    }

    public String getCiacDecline() {
        return this.ciacDecline;
    }

    public String getCvrMaskAnd() {
        return this.cvrMaskAnd;
    }

    public String getIssuerApplicationData() {
        return this.issuerApplicationData;
    }

    public String getPan() {
        return this.pan;
    }

    public String getPanSequenceNumber() {
        return this.panSequenceNumber;
    }

    public String getTrack2Equivalent() {
        return this.track2Equivalent;
    }

    public void setAip(String str) {
        this.aip = str;
    }

    public void setApplicationExpiryDate(String str) {
        this.applicationExpiryDate = str;
    }

    public void setCiacDecline(String str) {
        this.ciacDecline = str;
    }

    public void setCvrMaskAnd(String str) {
        this.cvrMaskAnd = str;
    }

    public void setIssuerApplicationData(String str) {
        this.issuerApplicationData = str;
    }

    public void setPan(String str) {
        this.pan = str;
    }

    public void setPanSequenceNumber(String str) {
        this.panSequenceNumber = str;
    }

    public void setTrack2Equivalent(String str) {
        this.track2Equivalent = str;
    }
}
