package com.bbva.sl.ar.android.secsdk.fido.model;

import ad.d;

/* JADX INFO: loaded from: classes8.dex */
public class AppInfo {
    private String id;
    private String name;

    public AppInfo(String str, String str2) {
        this.id = str;
        this.name = str2;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppInfo{id='");
        sb2.append(this.id);
        sb2.append("', name='");
        return d.f(sb2, this.name, "'}");
    }
}
