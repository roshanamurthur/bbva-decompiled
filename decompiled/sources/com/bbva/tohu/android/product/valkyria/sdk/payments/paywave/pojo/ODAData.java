package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo;

/* JADX INFO: loaded from: classes6.dex */
public class ODAData {
    private String appFileLocator;
    private String appProfile;
    private String caPubKeyIndex;
    private String enciccPrivateKey;
    private GenericPubKeyCert iccPubKeyCert;
    private GenericPubKeyCert tokenBinPubKeyCert;

    public String getAppFileLocator() {
        return this.appFileLocator;
    }

    public String getAppProfile() {
        return this.appProfile;
    }

    public String getCaPubKeyIndex() {
        return this.caPubKeyIndex;
    }

    public String getEnciccPrivateKey() {
        return this.enciccPrivateKey;
    }

    public GenericPubKeyCert getIccPubKeyCert() {
        return this.iccPubKeyCert;
    }

    public GenericPubKeyCert getTokenBinPubKeyCert() {
        return this.tokenBinPubKeyCert;
    }

    public void setAppFileLocator(String str) {
        this.appFileLocator = str;
    }

    public void setAppProfile(String str) {
        this.appProfile = str;
    }

    public void setCaPubKeyIndex(String str) {
        this.caPubKeyIndex = str;
    }

    public void setEnciccPrivateKey(String str) {
        this.enciccPrivateKey = str;
    }

    public void setIccPubKeyCert(GenericPubKeyCert genericPubKeyCert) {
        this.iccPubKeyCert = genericPubKeyCert;
    }

    public void setTokenBinPubKeyCert(GenericPubKeyCert genericPubKeyCert) {
        this.tokenBinPubKeyCert = genericPubKeyCert;
    }
}
