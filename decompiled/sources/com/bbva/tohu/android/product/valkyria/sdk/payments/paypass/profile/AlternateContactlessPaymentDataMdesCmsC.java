package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile;

import com.adobe.marketing.mobile.EventDataKeys;
import flexjson.JSON;

/* JADX INFO: loaded from: classes6.dex */
public class AlternateContactlessPaymentDataMdesCmsC {

    @JSON(name = EventDataKeys.Analytics.ANALYTICS_ID)
    private String aid;

    @JSON(name = "ciacDecline")
    private String ciacDecline;

    @JSON(name = "cvrMaskAnd")
    private String cvrMaskAnd;

    @JSON(name = "gpoResponse")
    private String gpoResponse;

    @JSON(name = "paymentFci")
    private String paymentFci;

    public String getAid() {
        return this.aid;
    }

    public String getCiacDecline() {
        return this.ciacDecline;
    }

    public String getCvrMaskAnd() {
        return this.cvrMaskAnd;
    }

    public String getGpoResponse() {
        return this.gpoResponse;
    }

    public String getPaymentFci() {
        return this.paymentFci;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setCiacDecline(String str) {
        this.ciacDecline = str;
    }

    public void setCvrMaskAnd(String str) {
        this.cvrMaskAnd = str;
    }

    public void setGpoResponse(String str) {
        this.gpoResponse = str;
    }

    public void setPaymentFci(String str) {
        this.paymentFci = str;
    }
}
