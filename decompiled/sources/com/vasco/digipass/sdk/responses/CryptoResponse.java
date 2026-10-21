package com.vasco.digipass.sdk.responses;

/* JADX INFO: loaded from: classes9.dex */
public class CryptoResponse extends DigipassResponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f65807c;

    public CryptoResponse(int i10) {
        super(i10);
    }

    public byte[] getOutputData() {
        return this.f65807c;
    }

    public CryptoResponse(int i10, Throwable th2) {
        super(i10, th2);
    }

    public CryptoResponse(int i10, byte[] bArr) {
        super(i10);
        this.f65807c = bArr;
    }
}
