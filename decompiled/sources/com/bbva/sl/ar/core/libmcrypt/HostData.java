package com.bbva.sl.ar.core.libmcrypt;

/* JADX INFO: loaded from: classes8.dex */
public class HostData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36613b;

    public HostData(String str, String str2) {
        this.f36612a = str;
        this.f36613b = str2;
    }

    public String getDataCheck() {
        return this.f36613b;
    }

    public String getHostData() {
        return this.f36612a;
    }

    public void setDataCheck(String str) {
        this.f36613b = str;
    }

    public void setHostData(String str) {
        this.f36612a = str;
    }
}
