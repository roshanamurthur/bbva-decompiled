package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class RC5Parameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f89360p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f89361q0;

    public RC5Parameters(byte[] bArr, int i10) {
        if (bArr.length > 255) {
            throw new IllegalArgumentException("RC5 key length can be no greater than 255");
        }
        byte[] bArr2 = new byte[bArr.length];
        this.f89360p0 = bArr2;
        this.f89361q0 = i10;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public byte[] getKey() {
        return this.f89360p0;
    }

    public int getRounds() {
        return this.f89361q0;
    }
}
