package com.viergegroup.sdk.taptophone.vierge.models;

/* JADX INFO: loaded from: classes7.dex */
public class SearchTxnRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f67969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f67970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ApiVersion f67971c;

    public ApiVersion getApiVersion() {
        return this.f67971c;
    }

    public String getRrn() {
        return this.f67970b;
    }

    public String getTerminalSerialNumber() {
        return this.f67969a;
    }

    public void setApiVersion(ApiVersion apiVersion) {
        this.f67971c = apiVersion;
    }

    public void setRrn(String str) {
        this.f67970b = str;
    }

    public void setTerminalSerialNumber(String str) {
        this.f67969a = str;
    }
}
