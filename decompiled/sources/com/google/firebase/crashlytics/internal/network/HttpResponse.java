package com.google.firebase.crashlytics.internal.network;

/* JADX INFO: loaded from: classes10.dex */
public class HttpResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48277b;

    public HttpResponse(int i10, String str) {
        this.f48276a = i10;
        this.f48277b = str;
    }

    public String body() {
        return this.f48277b;
    }

    public int code() {
        return this.f48276a;
    }
}
