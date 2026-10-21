package com.vasco.digipass.sdk.responses;

import com.vasco.digipass.sdk.obfuscated.q;

/* JADX INFO: loaded from: classes9.dex */
public class GenericResponse extends DigipassResponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f65836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f65837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f65838e;

    public GenericResponse(int i10) {
        super(i10);
    }

    public int getAttemptLeft() {
        return this.f65838e;
    }

    public byte[] getDynamicVector() {
        return q.c(this.f65837d);
    }

    public int getStatus() {
        return this.f65836c;
    }

    public void setDynamicVector(byte[] bArr) {
        this.f65837d = bArr;
    }

    public GenericResponse(int i10, Throwable th2) {
        super(i10, th2);
    }

    public GenericResponse(int i10, int i11, byte[] bArr) {
        this(i10, i11, bArr, 0);
    }

    public GenericResponse(int i10, int i11, byte[] bArr, int i12) {
        super(i10);
        this.f65836c = i11;
        this.f65837d = q.c(bArr);
        this.f65838e = i12;
    }
}
