package org.bouncycastle.crypto.agreement.kdf;

import org.bouncycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: classes2.dex */
public class GSKKDFParameters implements DerivationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f87952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f87954c;

    public GSKKDFParameters(byte[] bArr, int i10) {
        this(bArr, i10, null);
    }

    public byte[] getNonce() {
        return this.f87954c;
    }

    public int getStartCounter() {
        return this.f87953b;
    }

    public byte[] getZ() {
        return this.f87952a;
    }

    public GSKKDFParameters(byte[] bArr, int i10, byte[] bArr2) {
        this.f87952a = bArr;
        this.f87953b = i10;
        this.f87954c = bArr2;
    }
}
