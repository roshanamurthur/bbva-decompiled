package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo;

/* JADX INFO: loaded from: classes6.dex */
public class TokenInfo {
    private String appPrgrmID;
    private String encTokenInfo;
    private ExpirationDate expirationDate;
    private HceData hceData;
    private String lang;
    private String last4;
    private Mst mst;
    private String sdPersoScript;
    private String tokenReferenceID;
    private String tokenRequestorID;
    private String tokenStatus;

    public String getAppPrgrmID() {
        return this.appPrgrmID;
    }

    public String getEncTokenInfo() {
        return this.encTokenInfo;
    }

    public ExpirationDate getExpirationDate() {
        return this.expirationDate;
    }

    public HceData getHceData() {
        return this.hceData;
    }

    public String getLang() {
        return this.lang;
    }

    public String getLast4() {
        return this.last4;
    }

    public Mst getMst() {
        return this.mst;
    }

    public String getSdPersoScript() {
        return this.sdPersoScript;
    }

    public String getTokenReferenceID() {
        return this.tokenReferenceID;
    }

    public String getTokenRequestorID() {
        return this.tokenRequestorID;
    }

    public String getTokenStatus() {
        return this.tokenStatus;
    }

    public void setAppPrgrmID(String str) {
        this.appPrgrmID = str;
    }

    public void setEncTokenInfo(String str) {
        this.encTokenInfo = str;
    }

    public void setExpirationDate(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setHceData(HceData hceData) {
        this.hceData = hceData;
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public void setLast4(String str) {
        this.last4 = str;
    }

    public void setMst(Mst mst) {
        this.mst = mst;
    }

    public void setSdPersoScript(String str) {
        this.sdPersoScript = str;
    }

    public void setTokenReferenceID(String str) {
        this.tokenReferenceID = str;
    }

    public void setTokenRequestorID(String str) {
        this.tokenRequestorID = str;
    }

    public void setTokenStatus(String str) {
        this.tokenStatus = str;
    }
}
