package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: classes5.dex */
public class KDFParameters implements DerivationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f89330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89331b;

    public KDFParameters(byte[] bArr, byte[] bArr2) {
        this.f89331b = bArr;
        this.f89330a = bArr2;
    }

    public byte[] getIV() {
        return this.f89330a;
    }

    public byte[] getSharedSecret() {
        return this.f89331b;
    }
}
