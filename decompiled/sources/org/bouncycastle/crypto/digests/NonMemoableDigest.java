package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;

/* JADX INFO: loaded from: classes2.dex */
public class NonMemoableDigest implements ExtendedDigest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtendedDigest f88098a;

    public NonMemoableDigest(ExtendedDigest extendedDigest) {
        if (extendedDigest == null) {
            throw new IllegalArgumentException("baseDigest must not be null");
        }
        this.f88098a = extendedDigest;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        return this.f88098a.doFinal(bArr, i10);
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.f88098a.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.f88098a.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.f88098a.getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.f88098a.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        this.f88098a.update(b10);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        this.f88098a.update(bArr, i10, i11);
    }
}
