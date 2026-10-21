package com.bbva.sl.ar.core.libmcrypt;

/* JADX INFO: loaded from: classes8.dex */
public class KpubData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36615b;

    public KpubData(String str, String str2) {
        this.f36614a = str;
        this.f36615b = str2;
    }

    public String getKPubCheck() {
        return this.f36615b;
    }

    public String getKPubValue() {
        return this.f36614a;
    }

    public void setKPubCheck(String str) {
        this.f36615b = str;
    }

    public void setKPubValue(String str) {
        this.f36614a = str;
    }
}
