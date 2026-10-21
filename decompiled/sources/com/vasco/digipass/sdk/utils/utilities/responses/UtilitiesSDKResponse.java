package com.vasco.digipass.sdk.utils.utilities.responses;

/* JADX INFO: loaded from: classes9.dex */
public class UtilitiesSDKResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f66531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Throwable f66532b;

    public UtilitiesSDKResponse(int i10) {
        this.f66531a = i10;
    }

    public Throwable getCause() {
        return this.f66532b;
    }

    public int getReturnCode() {
        return this.f66531a;
    }

    public UtilitiesSDKResponse(int i10, Throwable th2) {
        this.f66531a = i10;
        this.f66532b = th2;
    }
}
