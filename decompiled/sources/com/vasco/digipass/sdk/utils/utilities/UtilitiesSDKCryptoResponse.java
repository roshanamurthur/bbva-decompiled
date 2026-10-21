package com.vasco.digipass.sdk.utils.utilities;

/* JADX INFO: loaded from: classes9.dex */
public class UtilitiesSDKCryptoResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f65916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f65917b;

    public UtilitiesSDKCryptoResponse(int i10) {
        this(i10, null);
    }

    public byte[] getOutputData() {
        return this.f65917b;
    }

    public int getReturnCode() {
        return this.f65916a;
    }

    public UtilitiesSDKCryptoResponse(int i10, byte[] bArr) {
        this.f65916a = i10;
        this.f65917b = bArr;
    }
}
