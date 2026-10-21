package com.noknok.android.client.asm.core;

/* JADX INFO: loaded from: classes11.dex */
public class GetInfoParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63227b;

    public GetInfoParams(String str, String str2) {
        this.f63226a = str;
        this.f63227b = str2;
    }

    public String getCustomUIJson() {
        return this.f63227b;
    }

    public String getTransText() {
        return this.f63226a;
    }

    public GetInfoParams() {
        this.f63227b = null;
        this.f63226a = null;
    }
}
