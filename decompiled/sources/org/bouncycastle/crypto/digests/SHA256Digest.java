package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class SHA256Digest extends GeneralDigest implements EncodableDigest {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f88150n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f88155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f88156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f88157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f88158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f88159l;
    public int m;

    public SHA256Digest() {
        this.f88159l = new int[64];
        reset();
    }

    public static int a(int i10, int i11, int i12) {
        return ((~i10) & i12) ^ (i11 & i10);
    }

    public static int b(int i10, int i11, int i12) {
        return ((i10 ^ i11) & i12) | (i10 & i11);
    }

    public static int c(int i10) {
        return ((i10 << 10) | (i10 >>> 22)) ^ (((i10 >>> 2) | (i10 << 30)) ^ ((i10 >>> 13) | (i10 << 19)));
    }

    public static int d(int i10) {
        return ((i10 << 7) | (i10 >>> 25)) ^ (((i10 >>> 6) | (i10 << 26)) ^ ((i10 >>> 11) | (i10 << 21)));
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA256Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        Pack.intToBigEndian(this.f88151d, bArr, i10);
        Pack.intToBigEndian(this.f88152e, bArr, i10 + 4);
        Pack.intToBigEndian(this.f88153f, bArr, i10 + 8);
        Pack.intToBigEndian(this.f88154g, bArr, i10 + 12);
        Pack.intToBigEndian(this.f88155h, bArr, i10 + 16);
        Pack.intToBigEndian(this.f88156i, bArr, i10 + 20);
        Pack.intToBigEndian(this.f88157j, bArr, i10 + 24);
        Pack.intToBigEndian(this.f88158k, bArr, i10 + 28);
        reset();
        return 32;
    }

    public final void e(SHA256Digest sHA256Digest) {
        super.copyIn(sHA256Digest);
        this.f88151d = sHA256Digest.f88151d;
        this.f88152e = sHA256Digest.f88152e;
        this.f88153f = sHA256Digest.f88153f;
        this.f88154g = sHA256Digest.f88154g;
        this.f88155h = sHA256Digest.f88155h;
        this.f88156i = sHA256Digest.f88156i;
        this.f88157j = sHA256Digest.f88157j;
        this.f88158k = sHA256Digest.f88158k;
        int[] iArr = this.f88159l;
        int[] iArr2 = sHA256Digest.f88159l;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.m = sHA256Digest.m;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-256";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.m * 4) + 52];
        super.populateState(bArr);
        Pack.intToBigEndian(this.f88151d, bArr, 16);
        Pack.intToBigEndian(this.f88152e, bArr, 20);
        Pack.intToBigEndian(this.f88153f, bArr, 24);
        Pack.intToBigEndian(this.f88154g, bArr, 28);
        Pack.intToBigEndian(this.f88155h, bArr, 32);
        Pack.intToBigEndian(this.f88156i, bArr, 36);
        Pack.intToBigEndian(this.f88157j, bArr, 40);
        Pack.intToBigEndian(this.f88158k, bArr, 44);
        Pack.intToBigEndian(this.m, bArr, 48);
        for (int i10 = 0; i10 != this.m; i10++) {
            Pack.intToBigEndian(this.f88159l[i10], bArr, (i10 * 4) + 52);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int[] iArr;
        int i10 = 16;
        while (true) {
            iArr = this.f88159l;
            if (i10 > 63) {
                break;
            }
            int i11 = iArr[i10 - 2];
            int i12 = ((i11 >>> 10) ^ (((i11 >>> 17) | (i11 << 15)) ^ ((i11 >>> 19) | (i11 << 13)))) + iArr[i10 - 7];
            int i13 = iArr[i10 - 15];
            iArr[i10] = i12 + ((i13 >>> 3) ^ (((i13 >>> 7) | (i13 << 25)) ^ ((i13 >>> 18) | (i13 << 14)))) + iArr[i10 - 16];
            i10++;
        }
        int iB = this.f88151d;
        int iB2 = this.f88152e;
        int iB3 = this.f88153f;
        int iB4 = this.f88154g;
        int i14 = this.f88155h;
        int i15 = this.f88156i;
        int i16 = this.f88157j;
        int i17 = this.f88158k;
        int i18 = 0;
        for (int i19 = 0; i19 < 8; i19++) {
            int iA = a(i14, i15, i16) + d(i14);
            int[] iArr2 = f88150n;
            int i20 = iA + iArr2[i18] + iArr[i18] + i17;
            int i21 = iB4 + i20;
            int iB5 = b(iB, iB2, iB3) + c(iB) + i20;
            int i22 = i18 + 1;
            int iA2 = a(i21, i14, i15) + d(i21) + iArr2[i22] + iArr[i22] + i16;
            int i23 = iB3 + iA2;
            int iB6 = b(iB5, iB, iB2) + c(iB5) + iA2;
            int i24 = i18 + 2;
            int iA3 = a(i23, i21, i14) + d(i23) + iArr2[i24] + iArr[i24] + i15;
            int i25 = iB2 + iA3;
            int iB7 = b(iB6, iB5, iB) + c(iB6) + iA3;
            int i26 = i18 + 3;
            int iA4 = a(i25, i23, i21) + d(i25) + iArr2[i26] + iArr[i26] + i14;
            int i27 = iB + iA4;
            int iB8 = b(iB7, iB6, iB5) + c(iB7) + iA4;
            int i28 = i18 + 4;
            int iA5 = a(i27, i25, i23) + d(i27) + iArr2[i28] + iArr[i28] + i21;
            i17 = iB5 + iA5;
            iB4 = b(iB8, iB7, iB6) + c(iB8) + iA5;
            int i29 = i18 + 5;
            int iA6 = a(i17, i27, i25) + d(i17) + iArr2[i29] + iArr[i29] + i23;
            i16 = iB6 + iA6;
            iB3 = b(iB4, iB8, iB7) + c(iB4) + iA6;
            int i30 = i18 + 6;
            int iA7 = a(i16, i17, i27) + d(i16) + iArr2[i30] + iArr[i30] + i25;
            i15 = iB7 + iA7;
            iB2 = b(iB3, iB4, iB8) + c(iB3) + iA7;
            int i31 = i18 + 7;
            int iA8 = a(i15, i16, i17) + d(i15) + iArr2[i31] + iArr[i31] + i27;
            i14 = iB8 + iA8;
            iB = b(iB2, iB3, iB4) + c(iB2) + iA8;
            i18 += 8;
        }
        this.f88151d += iB;
        this.f88152e += iB2;
        this.f88153f += iB3;
        this.f88154g += iB4;
        this.f88155h += i14;
        this.f88156i += i15;
        this.f88157j += i16;
        this.f88158k += i17;
        this.m = 0;
        for (int i32 = 0; i32 < 16; i32++) {
            iArr[i32] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j10) {
        if (this.m > 14) {
            processBlock();
        }
        int[] iArr = this.f88159l;
        iArr[14] = (int) (j10 >>> 32);
        iArr[15] = (int) j10;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 3] & 255) | (bArr[i10] << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
        int i12 = this.m;
        this.f88159l[i12] = i11;
        int i13 = i12 + 1;
        this.m = i13;
        if (i13 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f88151d = 1779033703;
        this.f88152e = -1150833019;
        this.f88153f = 1013904242;
        this.f88154g = -1521486534;
        this.f88155h = 1359893119;
        this.f88156i = -1694144372;
        this.f88157j = 528734635;
        this.f88158k = 1541459225;
        this.m = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f88159l;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public SHA256Digest(SHA256Digest sHA256Digest) {
        super(sHA256Digest);
        this.f88159l = new int[64];
        e(sHA256Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        e((SHA256Digest) memoable);
    }

    public SHA256Digest(byte[] bArr) {
        super(bArr);
        this.f88159l = new int[64];
        this.f88151d = Pack.bigEndianToInt(bArr, 16);
        this.f88152e = Pack.bigEndianToInt(bArr, 20);
        this.f88153f = Pack.bigEndianToInt(bArr, 24);
        this.f88154g = Pack.bigEndianToInt(bArr, 28);
        this.f88155h = Pack.bigEndianToInt(bArr, 32);
        this.f88156i = Pack.bigEndianToInt(bArr, 36);
        this.f88157j = Pack.bigEndianToInt(bArr, 40);
        this.f88158k = Pack.bigEndianToInt(bArr, 44);
        this.m = Pack.bigEndianToInt(bArr, 48);
        for (int i10 = 0; i10 != this.m; i10++) {
            this.f88159l[i10] = Pack.bigEndianToInt(bArr, (i10 * 4) + 52);
        }
    }
}
