package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile;

import flexjson.JSON;

/* JADX INFO: loaded from: classes6.dex */
class IccPrivateKeyCrtComponentsMdesCmsC {

    @JSON(name = "dp")
    private String dpValue;

    @JSON(name = "dq")
    private String dqValue;

    @JSON(name = "p")
    private String pValue;

    @JSON(name = "q")
    private String qValue;

    @JSON(name = "u")
    private String uValue;

    public String getDpValue() {
        return this.dpValue;
    }

    public String getDqValue() {
        return this.dqValue;
    }

    public String getpValue() {
        return this.pValue;
    }

    public String getqValue() {
        return this.qValue;
    }

    public String getuValue() {
        return this.uValue;
    }

    public void setDpValue(String str) {
        this.dpValue = str;
    }

    public void setDqValue(String str) {
        this.dqValue = str;
    }

    public void setpValue(String str) {
        this.pValue = str;
    }

    public void setqValue(String str) {
        this.qValue = str;
    }

    public void setuValue(String str) {
        this.uValue = str;
    }
}
