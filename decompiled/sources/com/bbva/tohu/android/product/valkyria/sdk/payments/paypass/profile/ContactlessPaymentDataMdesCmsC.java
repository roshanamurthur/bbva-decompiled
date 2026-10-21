package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile;

import com.adobe.marketing.mobile.EventDataKeys;
import flexjson.JSON;

/* JADX INFO: loaded from: classes6.dex */
public class ContactlessPaymentDataMdesCmsC {

    @JSON(name = EventDataKeys.Analytics.ANALYTICS_ID)
    private String aid;

    @JSON(name = "alternateContactlessPaymentData")
    private AlternateContactlessPaymentDataMdesCmsC alternateContactlessPaymentData;

    @JSON(name = "cdol1RelatedDataLength")
    private String cdol1RelatedDataLength;

    @JSON(name = "ciacDecline")
    private String ciacDecline;

    @JSON(name = "ciacDeclineOnPpms")
    private String ciacDeclineOnPpms;

    @JSON(name = "cvrMaskAnd")
    private String cvrMaskAnd;

    @JSON(name = "gpoResponse")
    private String gpoResponse;

    @JSON(name = "iccPrivateKeyCrtComponents")
    private IccPrivateKeyCrtComponentsMdesCmsC iccPrivateKeyCrtComponents;

    @JSON(name = "issuerApplicationData")
    private String issuerApplicationData;

    @JSON(name = "paymentFci")
    private String paymentFci;

    @JSON(name = "pinIvCvc3Track2")
    private String pinIvCvc3Track2;

    @JSON(name = "ppseFci")
    private String ppseFci;

    @JSON(name = "records")
    private RecordsMdesCmsC[] records;

    public String getAid() {
        return this.aid;
    }

    public AlternateContactlessPaymentDataMdesCmsC getAlternateContactlessPaymentData() {
        return this.alternateContactlessPaymentData;
    }

    public String getCdol1RelatedDataLength() {
        return this.cdol1RelatedDataLength;
    }

    public String getCiacDecline() {
        return this.ciacDecline;
    }

    public String getCiacDeclineOnPpms() {
        return this.ciacDeclineOnPpms;
    }

    public String getCvrMaskAnd() {
        return this.cvrMaskAnd;
    }

    public String getGpoResponse() {
        return this.gpoResponse;
    }

    public IccPrivateKeyCrtComponentsMdesCmsC getIccPrivateKeyCrtComponents() {
        return this.iccPrivateKeyCrtComponents;
    }

    public String getIssuerApplicationData() {
        return this.issuerApplicationData;
    }

    public String getPaymentFci() {
        return this.paymentFci;
    }

    public String getPinIvCvc3Track2() {
        return this.pinIvCvc3Track2;
    }

    public String getPpseFci() {
        return this.ppseFci;
    }

    public RecordsMdesCmsC[] getRecords() {
        return this.records;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAlternateContactlessPaymentData(AlternateContactlessPaymentDataMdesCmsC alternateContactlessPaymentDataMdesCmsC) {
        this.alternateContactlessPaymentData = alternateContactlessPaymentDataMdesCmsC;
    }

    public void setCdol1RelatedDataLength(String str) {
        this.cdol1RelatedDataLength = str;
    }

    public void setCiacDecline(String str) {
        this.ciacDecline = str;
    }

    public void setCiacDeclineOnPpms(String str) {
        this.ciacDeclineOnPpms = str;
    }

    public void setCvrMaskAnd(String str) {
        this.cvrMaskAnd = str;
    }

    public void setGpoResponse(String str) {
        this.gpoResponse = str;
    }

    public void setIccPrivateKeyCrtComponents(IccPrivateKeyCrtComponentsMdesCmsC iccPrivateKeyCrtComponentsMdesCmsC) {
        this.iccPrivateKeyCrtComponents = iccPrivateKeyCrtComponentsMdesCmsC;
    }

    public void setIssuerApplicationData(String str) {
        this.issuerApplicationData = str;
    }

    public void setPaymentFci(String str) {
        this.paymentFci = str;
    }

    public void setPinIvCvc3Track2(String str) {
        this.pinIvCvc3Track2 = str;
    }

    public void setPpseFci(String str) {
        this.ppseFci = str;
    }

    public void setRecords(RecordsMdesCmsC[] recordsMdesCmsCArr) {
        this.records = recordsMdesCmsCArr;
    }
}
