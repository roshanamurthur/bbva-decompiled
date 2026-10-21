package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes5.dex */
public class IESWithCipherParameters extends IESParameters {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f89315s0;

    public IESWithCipherParameters(byte[] bArr, byte[] bArr2, int i10, int i11) {
        super(bArr, bArr2, i10);
        this.f89315s0 = i11;
    }

    public int getCipherKeySize() {
        return this.f89315s0;
    }
}
