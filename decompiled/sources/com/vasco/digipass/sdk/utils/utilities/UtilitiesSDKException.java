package com.vasco.digipass.sdk.utils.utilities;

/* JADX INFO: loaded from: classes9.dex */
public class UtilitiesSDKException extends Exception {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final int f65918p0;

    public UtilitiesSDKException(int i10) {
        this.f65918p0 = i10;
    }

    public int getReturnErrorCode() {
        return this.f65918p0;
    }

    public UtilitiesSDKException(int i10, Throwable th2) {
        super(th2);
        this.f65918p0 = i10;
    }
}
