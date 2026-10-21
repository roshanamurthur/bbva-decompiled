package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes5.dex */
public class RC2Parameters extends KeyParameter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f89359q0;

    public RC2Parameters(byte[] bArr) {
        this(bArr, bArr.length > 128 ? 1024 : bArr.length * 8);
    }

    public int getEffectiveKeyBits() {
        return this.f89359q0;
    }

    public RC2Parameters(byte[] bArr, int i10) {
        super(bArr);
        this.f89359q0 = i10;
    }
}
