package org.bouncycastle.pqc.crypto.gmss.util;

import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes13.dex */
public class GMSSRandom {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f91065a;

    public GMSSRandom(Digest digest) {
        this.f91065a = digest;
    }

    public byte[] nextSeed(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        Digest digest = this.f91065a;
        digest.update(bArr, 0, length);
        byte[] bArr3 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr3, 0);
        byte b10 = 0;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = (bArr[i10] & 255) + (bArr3[i10] & 255) + b10;
            bArr[i10] = (byte) i11;
            b10 = (byte) (i11 >> 8);
        }
        byte b11 = 1;
        for (int i12 = 0; i12 < bArr.length; i12++) {
            int i13 = (bArr[i12] & 255) + b11;
            bArr[i12] = (byte) i13;
            b11 = (byte) (i13 >> 8);
        }
        return bArr3;
    }
}
