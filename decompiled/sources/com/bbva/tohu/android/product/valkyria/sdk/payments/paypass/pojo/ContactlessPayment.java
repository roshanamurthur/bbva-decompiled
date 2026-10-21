package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo;

/* JADX INFO: loaded from: classes6.dex */
public class ContactlessPayment {
    private String aid;
    private AlternateContactlessPayment alternateContactlessPayment;
    private String cdol1RelatedDataLength;
    private String ciacDecline;
    private String ciacDeclineOnPpms;
    private String cvrMaskAnd;
    private String gpoResponse;
    private IccPrivateKeyCrtComponents iccPrivateKeyCrtComponents;
    private String issuerApplicationData;
    private String paymentFci;
    private String pinIvCvc3Track2;
    private String ppseFci;
    private Record[] records;

    public String getAid() {
        return this.aid;
    }

    public AlternateContactlessPayment getAlternateContactlessPayment() {
        return this.alternateContactlessPayment;
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

    public IccPrivateKeyCrtComponents getIccPrivateKeyCrtComponents() {
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

    public Record[] getRecords() {
        return this.records;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAlternateContactlessPayment(AlternateContactlessPayment alternateContactlessPayment) {
        this.alternateContactlessPayment = alternateContactlessPayment;
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

    public void setIccPrivateKeyCrtComponents(IccPrivateKeyCrtComponents iccPrivateKeyCrtComponents) {
        this.iccPrivateKeyCrtComponents = iccPrivateKeyCrtComponents;
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

    public void setRecords(Record[] recordArr) {
        this.records = recordArr;
    }
}
