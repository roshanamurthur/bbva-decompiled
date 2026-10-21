package com.bbva.cellscore.web.model.page.components;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class CurrentPageDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("url")
    String f27152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("params")
    String[] f27153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("native")
    boolean f27154c;

    public String[] getParams() {
        return this.f27153b;
    }

    public String getUrl() {
        return this.f27152a;
    }

    public boolean isNative() {
        return this.f27154c;
    }
}
