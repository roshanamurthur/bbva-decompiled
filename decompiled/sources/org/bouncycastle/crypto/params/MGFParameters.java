package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: classes5.dex */
public class MGFParameters implements DerivationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f89333a;

    public MGFParameters(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] getSeed() {
        return this.f89333a;
    }

    public MGFParameters(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f89333a = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }
}
