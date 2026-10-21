package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;

/* JADX INFO: loaded from: classes2.dex */
public class ShortenedDigest implements ExtendedDigest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtendedDigest f88173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88174b;

    public ShortenedDigest(ExtendedDigest extendedDigest, int i10) {
        if (extendedDigest == null) {
            throw new IllegalArgumentException("baseDigest must not be null");
        }
        if (i10 > extendedDigest.getDigestSize()) {
            throw new IllegalArgumentException("baseDigest output not large enough to support length");
        }
        this.f88173a = extendedDigest;
        this.f88174b = i10;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        ExtendedDigest extendedDigest = this.f88173a;
        byte[] bArr2 = new byte[extendedDigest.getDigestSize()];
        extendedDigest.doFinal(bArr2, 0);
        int i11 = this.f88174b;
        System.arraycopy(bArr2, 0, bArr, i10, i11);
        return i11;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.f88173a.getAlgorithmName() + "(" + (this.f88174b * 8) + ")";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.f88173a.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.f88174b;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.f88173a.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        this.f88173a.update(b10);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        this.f88173a.update(bArr, i10, i11);
    }
}
