package org.bouncycastle.crypto.digests;

import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class SHA224Digest extends GeneralDigest implements EncodableDigest {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f88140n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f88145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f88146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f88147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f88148k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f88149l;
    public int m;

    public SHA224Digest() {
        this.f88149l = new int[64];
        reset();
    }

    public static int a(int i10, int i11, int i12) {
        return ((~i10) & i12) ^ (i11 & i10);
    }

    public static int b(int i10, int i11, int i12) {
        return ((i10 & i12) ^ (i10 & i11)) ^ (i11 & i12);
    }

    public static int c(int i10) {
        return ((i10 << 10) | (i10 >>> 22)) ^ (((i10 >>> 2) | (i10 << 30)) ^ ((i10 >>> 13) | (i10 << 19)));
    }

    public static int d(int i10) {
        return ((i10 << 7) | (i10 >>> 25)) ^ (((i10 >>> 6) | (i10 << 26)) ^ ((i10 >>> 11) | (i10 << 21)));
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA224Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        Pack.intToBigEndian(this.f88141d, bArr, i10);
        Pack.intToBigEndian(this.f88142e, bArr, i10 + 4);
        Pack.intToBigEndian(this.f88143f, bArr, i10 + 8);
        Pack.intToBigEndian(this.f88144g, bArr, i10 + 12);
        Pack.intToBigEndian(this.f88145h, bArr, i10 + 16);
        Pack.intToBigEndian(this.f88146i, bArr, i10 + 20);
        Pack.intToBigEndian(this.f88147j, bArr, i10 + 24);
        reset();
        return 28;
    }

    public final void e(SHA224Digest sHA224Digest) {
        super.copyIn(sHA224Digest);
        this.f88141d = sHA224Digest.f88141d;
        this.f88142e = sHA224Digest.f88142e;
        this.f88143f = sHA224Digest.f88143f;
        this.f88144g = sHA224Digest.f88144g;
        this.f88145h = sHA224Digest.f88145h;
        this.f88146i = sHA224Digest.f88146i;
        this.f88147j = sHA224Digest.f88147j;
        this.f88148k = sHA224Digest.f88148k;
        int[] iArr = this.f88149l;
        int[] iArr2 = sHA224Digest.f88149l;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.m = sHA224Digest.m;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return McElieceCCA2KeyGenParameterSpec.SHA224;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 28;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.m * 4) + 52];
        super.populateState(bArr);
        Pack.intToBigEndian(this.f88141d, bArr, 16);
        Pack.intToBigEndian(this.f88142e, bArr, 20);
        Pack.intToBigEndian(this.f88143f, bArr, 24);
        Pack.intToBigEndian(this.f88144g, bArr, 28);
        Pack.intToBigEndian(this.f88145h, bArr, 32);
        Pack.intToBigEndian(this.f88146i, bArr, 36);
        Pack.intToBigEndian(this.f88147j, bArr, 40);
        Pack.intToBigEndian(this.f88148k, bArr, 44);
        Pack.intToBigEndian(this.m, bArr, 48);
        for (int i10 = 0; i10 != this.m; i10++) {
            Pack.intToBigEndian(this.f88149l[i10], bArr, (i10 * 4) + 52);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int[] iArr;
        int i10 = 16;
        while (true) {
            iArr = this.f88149l;
            if (i10 > 63) {
                break;
            }
            int i11 = iArr[i10 - 2];
            int i12 = ((i11 >>> 10) ^ (((i11 >>> 17) | (i11 << 15)) ^ ((i11 >>> 19) | (i11 << 13)))) + iArr[i10 - 7];
            int i13 = iArr[i10 - 15];
            iArr[i10] = i12 + ((i13 >>> 3) ^ (((i13 >>> 7) | (i13 << 25)) ^ ((i13 >>> 18) | (i13 << 14)))) + iArr[i10 - 16];
            i10++;
        }
        int iB = this.f88141d;
        int iB2 = this.f88142e;
        int iB3 = this.f88143f;
        int iB4 = this.f88144g;
        int i14 = this.f88145h;
        int i15 = this.f88146i;
        int i16 = this.f88147j;
        int i17 = this.f88148k;
        int i18 = 0;
        for (int i19 = 0; i19 < 8; i19++) {
            int iA = a(i14, i15, i16) + d(i14);
            int[] iArr2 = f88140n;
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
        this.f88141d += iB;
        this.f88142e += iB2;
        this.f88143f += iB3;
        this.f88144g += iB4;
        this.f88145h += i14;
        this.f88146i += i15;
        this.f88147j += i16;
        this.f88148k += i17;
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
        int[] iArr = this.f88149l;
        iArr[14] = (int) (j10 >>> 32);
        iArr[15] = (int) j10;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 3] & 255) | (bArr[i10] << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
        int i12 = this.m;
        this.f88149l[i12] = i11;
        int i13 = i12 + 1;
        this.m = i13;
        if (i13 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f88141d = -1056596264;
        this.f88142e = 914150663;
        this.f88143f = 812702999;
        this.f88144g = -150054599;
        this.f88145h = -4191439;
        this.f88146i = 1750603025;
        this.f88147j = 1694076839;
        this.f88148k = -1090891868;
        this.m = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f88149l;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public SHA224Digest(SHA224Digest sHA224Digest) {
        super(sHA224Digest);
        this.f88149l = new int[64];
        e(sHA224Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        e((SHA224Digest) memoable);
    }

    public SHA224Digest(byte[] bArr) {
        super(bArr);
        this.f88149l = new int[64];
        this.f88141d = Pack.bigEndianToInt(bArr, 16);
        this.f88142e = Pack.bigEndianToInt(bArr, 20);
        this.f88143f = Pack.bigEndianToInt(bArr, 24);
        this.f88144g = Pack.bigEndianToInt(bArr, 28);
        this.f88145h = Pack.bigEndianToInt(bArr, 32);
        this.f88146i = Pack.bigEndianToInt(bArr, 36);
        this.f88147j = Pack.bigEndianToInt(bArr, 40);
        this.f88148k = Pack.bigEndianToInt(bArr, 44);
        this.m = Pack.bigEndianToInt(bArr, 48);
        for (int i10 = 0; i10 != this.m; i10++) {
            this.f88149l[i10] = Pack.bigEndianToInt(bArr, (i10 * 4) + 52);
        }
    }
}
