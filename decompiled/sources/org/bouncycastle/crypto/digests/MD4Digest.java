package org.bouncycastle.crypto.digests;

import androidx.camera.core.impl.a;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes2.dex */
public class MD4Digest extends GeneralDigest {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f88090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f88091i;

    public MD4Digest() {
        this.f88090h = new int[16];
        reset();
    }

    public static int a(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    public static int b(int i10, int i11, int i12) {
        return (i10 & i12) | (i10 & i11) | (i11 & i12);
    }

    public static int d(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    public static void e(int i10, int i11, byte[] bArr) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    public final void c(MD4Digest mD4Digest) {
        super.copyIn(mD4Digest);
        this.f88086d = mD4Digest.f88086d;
        this.f88087e = mD4Digest.f88087e;
        this.f88088f = mD4Digest.f88088f;
        this.f88089g = mD4Digest.f88089g;
        int[] iArr = this.f88090h;
        int[] iArr2 = mD4Digest.f88090h;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f88091i = mD4Digest.f88091i;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new MD4Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        e(this.f88086d, i10, bArr);
        e(this.f88087e, i10 + 4, bArr);
        e(this.f88088f, i10 + 8, bArr);
        e(this.f88089g, i10 + 12, bArr);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "MD4";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i10 = this.f88086d;
        int i11 = this.f88087e;
        int i12 = this.f88088f;
        int i13 = this.f88089g;
        int iA = a(i11, i12, i13) + i10;
        int[] iArr = this.f88090h;
        int iD = d(iA + iArr[0], 3);
        int iD2 = d(a(iD, i11, i12) + i13 + iArr[1], 7);
        int iD3 = d(a(iD2, iD, i11) + i12 + iArr[2], 11);
        int iD4 = d(a(iD3, iD2, iD) + i11 + iArr[3], 19);
        int iD5 = d(a(iD4, iD3, iD2) + iD + iArr[4], 3);
        int iD6 = d(a(iD5, iD4, iD3) + iD2 + iArr[5], 7);
        int iD7 = d(a(iD6, iD5, iD4) + iD3 + iArr[6], 11);
        int iD8 = d(a(iD7, iD6, iD5) + iD4 + iArr[7], 19);
        int iD9 = d(a(iD8, iD7, iD6) + iD5 + iArr[8], 3);
        int iD10 = d(a(iD9, iD8, iD7) + iD6 + iArr[9], 7);
        int iD11 = d(a(iD10, iD9, iD8) + iD7 + iArr[10], 11);
        int iD12 = d(a(iD11, iD10, iD9) + iD8 + iArr[11], 19);
        int iD13 = d(a(iD12, iD11, iD10) + iD9 + iArr[12], 3);
        int iD14 = d(a(iD13, iD12, iD11) + iD10 + iArr[13], 7);
        int iD15 = d(a(iD14, iD13, iD12) + iD11 + iArr[14], 11);
        int iD16 = d(a(iD15, iD14, iD13) + iD12 + iArr[15], 19);
        int iA2 = a.a(b(iD16, iD15, iD14) + iD13, iArr[0], 1518500249, 3);
        int iA3 = a.a(b(iA2, iD16, iD15) + iD14, iArr[4], 1518500249, 5);
        int iA4 = a.a(b(iA3, iA2, iD16) + iD15, iArr[8], 1518500249, 9);
        int iA5 = a.a(b(iA4, iA3, iA2) + iD16, iArr[12], 1518500249, 13);
        int iA6 = a.a(b(iA5, iA4, iA3) + iA2, iArr[1], 1518500249, 3);
        int iA7 = a.a(b(iA6, iA5, iA4) + iA3, iArr[5], 1518500249, 5);
        int iA8 = a.a(b(iA7, iA6, iA5) + iA4, iArr[9], 1518500249, 9);
        int iA9 = a.a(b(iA8, iA7, iA6) + iA5, iArr[13], 1518500249, 13);
        int iA10 = a.a(b(iA9, iA8, iA7) + iA6, iArr[2], 1518500249, 3);
        int iA11 = a.a(b(iA10, iA9, iA8) + iA7, iArr[6], 1518500249, 5);
        int iA12 = a.a(b(iA11, iA10, iA9) + iA8, iArr[10], 1518500249, 9);
        int iA13 = a.a(b(iA12, iA11, iA10) + iA9, iArr[14], 1518500249, 13);
        int iA14 = a.a(b(iA13, iA12, iA11) + iA10, iArr[3], 1518500249, 3);
        int iA15 = a.a(b(iA14, iA13, iA12) + iA11, iArr[7], 1518500249, 5);
        int iA16 = a.a(b(iA15, iA14, iA13) + iA12, iArr[11], 1518500249, 9);
        int iA17 = a.a(b(iA16, iA15, iA14) + iA13, iArr[15], 1518500249, 13);
        int iA18 = a.a(iA14 + ((iA17 ^ iA16) ^ iA15), iArr[0], 1859775393, 3);
        int iA19 = a.a(iA15 + ((iA18 ^ iA17) ^ iA16), iArr[8], 1859775393, 9);
        int iA20 = a.a(iA16 + ((iA19 ^ iA18) ^ iA17), iArr[4], 1859775393, 11);
        int iA21 = a.a(iA17 + ((iA20 ^ iA19) ^ iA18), iArr[12], 1859775393, 15);
        int iA22 = a.a(iA18 + ((iA21 ^ iA20) ^ iA19), iArr[2], 1859775393, 3);
        int iA23 = a.a(iA19 + ((iA22 ^ iA21) ^ iA20), iArr[10], 1859775393, 9);
        int iA24 = a.a(iA20 + ((iA23 ^ iA22) ^ iA21), iArr[6], 1859775393, 11);
        int iA25 = a.a(iA21 + ((iA24 ^ iA23) ^ iA22), iArr[14], 1859775393, 15);
        int iA26 = a.a(iA22 + ((iA25 ^ iA24) ^ iA23), iArr[1], 1859775393, 3);
        int iA27 = a.a(iA23 + ((iA26 ^ iA25) ^ iA24), iArr[9], 1859775393, 9);
        int iA28 = a.a(iA24 + ((iA27 ^ iA26) ^ iA25), iArr[5], 1859775393, 11);
        int iA29 = a.a(iA25 + ((iA28 ^ iA27) ^ iA26), iArr[13], 1859775393, 15);
        int iA30 = a.a(iA26 + ((iA29 ^ iA28) ^ iA27), iArr[3], 1859775393, 3);
        int iA31 = a.a(iA27 + ((iA30 ^ iA29) ^ iA28), iArr[11], 1859775393, 9);
        int iA32 = a.a(iA28 + ((iA31 ^ iA30) ^ iA29), iArr[7], 1859775393, 11);
        int iA33 = a.a(iA29 + ((iA32 ^ iA31) ^ iA30), iArr[15], 1859775393, 15);
        this.f88086d += iA30;
        this.f88087e += iA33;
        this.f88088f += iA32;
        this.f88089g += iA31;
        this.f88091i = 0;
        for (int i14 = 0; i14 != iArr.length; i14++) {
            iArr[i14] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j10) {
        if (this.f88091i > 14) {
            processBlock();
        }
        int[] iArr = this.f88090h;
        iArr[14] = (int) j10;
        iArr[15] = (int) (j10 >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i10) {
        int i11 = this.f88091i;
        int i12 = i11 + 1;
        this.f88091i = i12;
        this.f88090h[i11] = ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        if (i12 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f88086d = 1732584193;
        this.f88087e = -271733879;
        this.f88088f = -1732584194;
        this.f88089g = 271733878;
        this.f88091i = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f88090h;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public MD4Digest(MD4Digest mD4Digest) {
        super(mD4Digest);
        this.f88090h = new int[16];
        c(mD4Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        c((MD4Digest) memoable);
    }
}
