package com.vasco.digipass.sdk.responses;

/* JADX INFO: loaded from: classes9.dex */
public class DigipassResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f65831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Throwable f65832b;

    public DigipassResponse(int i10) {
        this.f65831a = i10;
    }

    public Throwable getCause() {
        return this.f65832b;
    }

    public int getReturnCode() {
        return this.f65831a;
    }

    public DigipassResponse(int i10, Throwable th2) {
        this.f65831a = i10;
        this.f65832b = th2;
    }
}
