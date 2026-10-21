package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo;

/* JADX INFO: loaded from: classes6.dex */
public class DynParams {
    private String api;
    private String dki;
    private String encKeyInfo;
    private Long keyExpTS;
    private Integer maxPmts;

    /* JADX INFO: renamed from: sc, reason: collision with root package name */
    private Integer f36931sc;

    public String getApi() {
        return this.api;
    }

    public String getDki() {
        return this.dki;
    }

    public String getEncKeyInfo() {
        return this.encKeyInfo;
    }

    public Long getKeyExpTS() {
        return this.keyExpTS;
    }

    public Integer getMaxPmts() {
        return this.maxPmts;
    }

    public Integer getSc() {
        return this.f36931sc;
    }

    public void setApi(String str) {
        this.api = str;
    }

    public void setDki(String str) {
        this.dki = str;
    }

    public void setEncKeyInfo(String str) {
        this.encKeyInfo = str;
    }

    public void setKeyExpTS(Long l6) {
        this.keyExpTS = l6;
    }

    public void setMaxPmts(Integer num) {
        this.maxPmts = num;
    }

    public void setSc(Integer num) {
        this.f36931sc = num;
    }
}
