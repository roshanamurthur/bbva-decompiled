package com.vasco.digipass.sdk.responses;

import com.vasco.digipass.sdk.obfuscated.q;

/* JADX INFO: loaded from: classes9.dex */
public class ActivationResponse extends GenericResponse {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f65806f;

    public ActivationResponse(int i10) {
        super(i10);
    }

    public byte[] getStaticVector() {
        return q.c(this.f65806f);
    }

    public void setStaticVector(byte[] bArr) {
        this.f65806f = q.c(bArr);
    }

    public ActivationResponse(int i10, Throwable th2) {
        super(i10, th2);
    }

    public ActivationResponse(int i10, int i11, byte[] bArr, int i12) {
        super(i10, i11, bArr, i12);
    }
}
