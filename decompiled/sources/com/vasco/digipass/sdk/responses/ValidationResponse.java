package com.vasco.digipass.sdk.responses;

import com.vasco.digipass.sdk.obfuscated.q;

/* JADX INFO: loaded from: classes9.dex */
public class ValidationResponse extends GenericResponse {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f65844f;

    public ValidationResponse(int i10) {
        super(i10);
    }

    public byte[] getEncryptionKey() {
        return q.c(this.f65844f);
    }

    public ValidationResponse(int i10, Throwable th2) {
        super(i10, th2);
    }

    public ValidationResponse(int i10, int i11, byte[] bArr, int i12, byte[] bArr2) {
        super(i10, i11, bArr, i12);
        this.f65844f = q.c(bArr2);
    }
}
