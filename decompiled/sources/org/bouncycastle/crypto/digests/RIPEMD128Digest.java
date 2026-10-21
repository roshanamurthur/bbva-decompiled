package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes2.dex */
public class RIPEMD128Digest extends GeneralDigest {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f88104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f88105i;

    public RIPEMD128Digest() {
        this.f88104h = new int[16];
        reset();
    }

    public static int a(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i(i10 + ((i11 ^ i12) ^ i13) + i14, i15);
    }

    public static int b(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i((((~i11) & i13) | (i12 & i11)) + i10 + i14 + 1518500249, i15);
    }

    public static int c(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i(i10 + ((i11 | (~i12)) ^ i13) + i14 + 1859775393, i15);
    }

    public static int d(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i(((((i11 & i13) | (i12 & (~i13))) + i10) + i14) - 1894007588, i15);
    }

    public static int e(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i(i10 + ((i11 ^ i12) ^ i13) + i14, i15);
    }

    public static int f(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i((((~i11) & i13) | (i12 & i11)) + i10 + i14 + 1836072691, i15);
    }

    public static int g(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i(i10 + ((i11 | (~i12)) ^ i13) + i14 + 1548603684, i15);
    }

    public static int h(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i(((i11 & i13) | (i12 & (~i13))) + i10 + i14 + 1352829926, i15);
    }

    public static int i(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    public static void k(int i10, int i11, byte[] bArr) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new RIPEMD128Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        k(this.f88100d, i10, bArr);
        k(this.f88101e, i10 + 4, bArr);
        k(this.f88102f, i10 + 8, bArr);
        k(this.f88103g, i10 + 12, bArr);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "RIPEMD128";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    public final void j(RIPEMD128Digest rIPEMD128Digest) {
        super.copyIn(rIPEMD128Digest);
        this.f88100d = rIPEMD128Digest.f88100d;
        this.f88101e = rIPEMD128Digest.f88101e;
        this.f88102f = rIPEMD128Digest.f88102f;
        this.f88103g = rIPEMD128Digest.f88103g;
        int[] iArr = this.f88104h;
        int[] iArr2 = rIPEMD128Digest.f88104h;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f88105i = rIPEMD128Digest.f88105i;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i10 = this.f88100d;
        int i11 = this.f88101e;
        int i12 = this.f88102f;
        int i13 = this.f88103g;
        int[] iArr = this.f88104h;
        int iA = a(i10, i11, i12, i13, iArr[0], 11);
        int iA2 = a(i13, iA, i11, i12, iArr[1], 14);
        int iA3 = a(i12, iA2, iA, i11, iArr[2], 15);
        int iA4 = a(i11, iA3, iA2, iA, iArr[3], 12);
        int iA5 = a(iA, iA4, iA3, iA2, iArr[4], 5);
        int iA6 = a(iA2, iA5, iA4, iA3, iArr[5], 8);
        int iA7 = a(iA3, iA6, iA5, iA4, iArr[6], 7);
        int iA8 = a(iA4, iA7, iA6, iA5, iArr[7], 9);
        int iA9 = a(iA5, iA8, iA7, iA6, iArr[8], 11);
        int iA10 = a(iA6, iA9, iA8, iA7, iArr[9], 13);
        int iA11 = a(iA7, iA10, iA9, iA8, iArr[10], 14);
        int iA12 = a(iA8, iA11, iA10, iA9, iArr[11], 15);
        int iA13 = a(iA9, iA12, iA11, iA10, iArr[12], 6);
        int iA14 = a(iA10, iA13, iA12, iA11, iArr[13], 7);
        int iA15 = a(iA11, iA14, iA13, iA12, iArr[14], 9);
        int iA16 = a(iA12, iA15, iA14, iA13, iArr[15], 8);
        int iB = b(iA13, iA16, iA15, iA14, iArr[7], 7);
        int iB2 = b(iA14, iB, iA16, iA15, iArr[4], 6);
        int iB3 = b(iA15, iB2, iB, iA16, iArr[13], 8);
        int iB4 = b(iA16, iB3, iB2, iB, iArr[1], 13);
        int iB5 = b(iB, iB4, iB3, iB2, iArr[10], 11);
        int iB6 = b(iB2, iB5, iB4, iB3, iArr[6], 9);
        int iB7 = b(iB3, iB6, iB5, iB4, iArr[15], 7);
        int iB8 = b(iB4, iB7, iB6, iB5, iArr[3], 15);
        int iB9 = b(iB5, iB8, iB7, iB6, iArr[12], 7);
        int iB10 = b(iB6, iB9, iB8, iB7, iArr[0], 12);
        int iB11 = b(iB7, iB10, iB9, iB8, iArr[9], 15);
        int iB12 = b(iB8, iB11, iB10, iB9, iArr[5], 9);
        int iB13 = b(iB9, iB12, iB11, iB10, iArr[2], 11);
        int iB14 = b(iB10, iB13, iB12, iB11, iArr[14], 7);
        int iB15 = b(iB11, iB14, iB13, iB12, iArr[11], 13);
        int iB16 = b(iB12, iB15, iB14, iB13, iArr[8], 12);
        int iC = c(iB13, iB16, iB15, iB14, iArr[3], 11);
        int iC2 = c(iB14, iC, iB16, iB15, iArr[10], 13);
        int iC3 = c(iB15, iC2, iC, iB16, iArr[14], 6);
        int iC4 = c(iB16, iC3, iC2, iC, iArr[4], 7);
        int iC5 = c(iC, iC4, iC3, iC2, iArr[9], 14);
        int iC6 = c(iC2, iC5, iC4, iC3, iArr[15], 9);
        int iC7 = c(iC3, iC6, iC5, iC4, iArr[8], 13);
        int iC8 = c(iC4, iC7, iC6, iC5, iArr[1], 15);
        int iC9 = c(iC5, iC8, iC7, iC6, iArr[2], 14);
        int iC10 = c(iC6, iC9, iC8, iC7, iArr[7], 8);
        int iC11 = c(iC7, iC10, iC9, iC8, iArr[0], 13);
        int iC12 = c(iC8, iC11, iC10, iC9, iArr[6], 6);
        int iC13 = c(iC9, iC12, iC11, iC10, iArr[13], 5);
        int iC14 = c(iC10, iC13, iC12, iC11, iArr[11], 12);
        int iC15 = c(iC11, iC14, iC13, iC12, iArr[5], 7);
        int iC16 = c(iC12, iC15, iC14, iC13, iArr[12], 5);
        int iD = d(iC13, iC16, iC15, iC14, iArr[1], 11);
        int iD2 = d(iC14, iD, iC16, iC15, iArr[9], 12);
        int iD3 = d(iC15, iD2, iD, iC16, iArr[11], 14);
        int iD4 = d(iC16, iD3, iD2, iD, iArr[10], 15);
        int iD5 = d(iD, iD4, iD3, iD2, iArr[0], 14);
        int iD6 = d(iD2, iD5, iD4, iD3, iArr[8], 15);
        int iD7 = d(iD3, iD6, iD5, iD4, iArr[12], 9);
        int iD8 = d(iD4, iD7, iD6, iD5, iArr[4], 8);
        int iD9 = d(iD5, iD8, iD7, iD6, iArr[13], 9);
        int iD10 = d(iD6, iD9, iD8, iD7, iArr[3], 14);
        int iD11 = d(iD7, iD10, iD9, iD8, iArr[7], 5);
        int iD12 = d(iD8, iD11, iD10, iD9, iArr[15], 6);
        int iD13 = d(iD9, iD12, iD11, iD10, iArr[14], 8);
        int iD14 = d(iD10, iD13, iD12, iD11, iArr[5], 6);
        int iD15 = d(iD11, iD14, iD13, iD12, iArr[6], 5);
        int iD16 = d(iD12, iD15, iD14, iD13, iArr[2], 12);
        int iH = h(i10, i11, i12, i13, iArr[5], 8);
        int iH2 = h(i13, iH, i11, i12, iArr[14], 9);
        int iH3 = h(i12, iH2, iH, i11, iArr[7], 9);
        int iH4 = h(i11, iH3, iH2, iH, iArr[0], 11);
        int iH5 = h(iH, iH4, iH3, iH2, iArr[9], 13);
        int iH6 = h(iH2, iH5, iH4, iH3, iArr[2], 15);
        int iH7 = h(iH3, iH6, iH5, iH4, iArr[11], 15);
        int iH8 = h(iH4, iH7, iH6, iH5, iArr[4], 5);
        int iH9 = h(iH5, iH8, iH7, iH6, iArr[13], 7);
        int iH10 = h(iH6, iH9, iH8, iH7, iArr[6], 7);
        int iH11 = h(iH7, iH10, iH9, iH8, iArr[15], 8);
        int iH12 = h(iH8, iH11, iH10, iH9, iArr[8], 11);
        int iH13 = h(iH9, iH12, iH11, iH10, iArr[1], 14);
        int iH14 = h(iH10, iH13, iH12, iH11, iArr[10], 14);
        int iH15 = h(iH11, iH14, iH13, iH12, iArr[3], 12);
        int iH16 = h(iH12, iH15, iH14, iH13, iArr[12], 6);
        int iG = g(iH13, iH16, iH15, iH14, iArr[6], 9);
        int iG2 = g(iH14, iG, iH16, iH15, iArr[11], 13);
        int iG3 = g(iH15, iG2, iG, iH16, iArr[3], 15);
        int iG4 = g(iH16, iG3, iG2, iG, iArr[7], 7);
        int iG5 = g(iG, iG4, iG3, iG2, iArr[0], 12);
        int iG6 = g(iG2, iG5, iG4, iG3, iArr[13], 8);
        int iG7 = g(iG3, iG6, iG5, iG4, iArr[5], 9);
        int iG8 = g(iG4, iG7, iG6, iG5, iArr[10], 11);
        int iG9 = g(iG5, iG8, iG7, iG6, iArr[14], 7);
        int iG10 = g(iG6, iG9, iG8, iG7, iArr[15], 7);
        int iG11 = g(iG7, iG10, iG9, iG8, iArr[8], 12);
        int iG12 = g(iG8, iG11, iG10, iG9, iArr[12], 7);
        int iG13 = g(iG9, iG12, iG11, iG10, iArr[4], 6);
        int iG14 = g(iG10, iG13, iG12, iG11, iArr[9], 15);
        int iG15 = g(iG11, iG14, iG13, iG12, iArr[1], 13);
        int iG16 = g(iG12, iG15, iG14, iG13, iArr[2], 11);
        int iF = f(iG13, iG16, iG15, iG14, iArr[15], 9);
        int iF2 = f(iG14, iF, iG16, iG15, iArr[5], 7);
        int iF3 = f(iG15, iF2, iF, iG16, iArr[1], 15);
        int iF4 = f(iG16, iF3, iF2, iF, iArr[3], 11);
        int iF5 = f(iF, iF4, iF3, iF2, iArr[7], 8);
        int iF6 = f(iF2, iF5, iF4, iF3, iArr[14], 6);
        int iF7 = f(iF3, iF6, iF5, iF4, iArr[6], 6);
        int iF8 = f(iF4, iF7, iF6, iF5, iArr[9], 14);
        int iF9 = f(iF5, iF8, iF7, iF6, iArr[11], 12);
        int iF10 = f(iF6, iF9, iF8, iF7, iArr[8], 13);
        int iF11 = f(iF7, iF10, iF9, iF8, iArr[12], 5);
        int iF12 = f(iF8, iF11, iF10, iF9, iArr[2], 14);
        int iF13 = f(iF9, iF12, iF11, iF10, iArr[10], 13);
        int iF14 = f(iF10, iF13, iF12, iF11, iArr[0], 13);
        int iF15 = f(iF11, iF14, iF13, iF12, iArr[4], 7);
        int iF16 = f(iF12, iF15, iF14, iF13, iArr[13], 5);
        int iE = e(iF13, iF16, iF15, iF14, iArr[8], 15);
        int iE2 = e(iF14, iE, iF16, iF15, iArr[6], 5);
        int iE3 = e(iF15, iE2, iE, iF16, iArr[4], 8);
        int iE4 = e(iF16, iE3, iE2, iE, iArr[1], 11);
        int iE5 = e(iE, iE4, iE3, iE2, iArr[3], 14);
        int iE6 = e(iE2, iE5, iE4, iE3, iArr[11], 14);
        int iE7 = e(iE3, iE6, iE5, iE4, iArr[15], 6);
        int iE8 = e(iE4, iE7, iE6, iE5, iArr[0], 14);
        int iE9 = e(iE5, iE8, iE7, iE6, iArr[5], 6);
        int iE10 = e(iE6, iE9, iE8, iE7, iArr[12], 9);
        int iE11 = e(iE7, iE10, iE9, iE8, iArr[2], 12);
        int iE12 = e(iE8, iE11, iE10, iE9, iArr[13], 9);
        int iE13 = e(iE9, iE12, iE11, iE10, iArr[9], 12);
        int iE14 = e(iE10, iE13, iE12, iE11, iArr[7], 5);
        int iE15 = e(iE11, iE14, iE13, iE12, iArr[10], 15);
        int iE16 = e(iE12, iE15, iE14, iE13, iArr[14], 8);
        int i14 = iD15 + this.f88101e + iE14;
        this.f88101e = this.f88102f + iD14 + iE13;
        this.f88102f = this.f88103g + iD13 + iE16;
        this.f88103g = this.f88100d + iD16 + iE15;
        this.f88100d = i14;
        this.f88105i = 0;
        for (int i15 = 0; i15 != iArr.length; i15++) {
            iArr[i15] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j10) {
        if (this.f88105i > 14) {
            processBlock();
        }
        int[] iArr = this.f88104h;
        iArr[14] = (int) j10;
        iArr[15] = (int) (j10 >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i10) {
        int i11 = this.f88105i;
        int i12 = i11 + 1;
        this.f88105i = i12;
        this.f88104h[i11] = ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        if (i12 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f88100d = 1732584193;
        this.f88101e = -271733879;
        this.f88102f = -1732584194;
        this.f88103g = 271733878;
        this.f88105i = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f88104h;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public RIPEMD128Digest(RIPEMD128Digest rIPEMD128Digest) {
        super(rIPEMD128Digest);
        this.f88104h = new int[16];
        j(rIPEMD128Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        j((RIPEMD128Digest) memoable);
    }
}
