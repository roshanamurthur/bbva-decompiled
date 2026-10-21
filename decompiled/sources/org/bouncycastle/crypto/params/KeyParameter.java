package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class KeyParameter implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f89332p0;

    public KeyParameter(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] getKey() {
        return this.f89332p0;
    }

    public KeyParameter(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f89332p0 = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }
}
