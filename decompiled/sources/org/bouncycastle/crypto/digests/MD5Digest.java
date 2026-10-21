package org.bouncycastle.crypto.digests;

import androidx.camera.camera2.internal.compat.u;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class MD5Digest extends GeneralDigest implements EncodableDigest {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f88096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f88097i;

    public MD5Digest() {
        this.f88096h = new int[16];
        reset();
    }

    public static int a(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    public static int b(int i10, int i11, int i12) {
        return (i10 & i12) | (i11 & (~i12));
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

    public final void c(MD5Digest mD5Digest) {
        super.copyIn(mD5Digest);
        this.f88092d = mD5Digest.f88092d;
        this.f88093e = mD5Digest.f88093e;
        this.f88094f = mD5Digest.f88094f;
        this.f88095g = mD5Digest.f88095g;
        int[] iArr = this.f88096h;
        int[] iArr2 = mD5Digest.f88096h;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f88097i = mD5Digest.f88097i;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new MD5Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        e(this.f88092d, i10, bArr);
        e(this.f88093e, i10 + 4, bArr);
        e(this.f88094f, i10 + 8, bArr);
        e(this.f88095g, i10 + 12, bArr);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "MD5";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.f88097i * 4) + 36];
        super.populateState(bArr);
        Pack.intToBigEndian(this.f88092d, bArr, 16);
        Pack.intToBigEndian(this.f88093e, bArr, 20);
        Pack.intToBigEndian(this.f88094f, bArr, 24);
        Pack.intToBigEndian(this.f88095g, bArr, 28);
        Pack.intToBigEndian(this.f88097i, bArr, 32);
        for (int i10 = 0; i10 != this.f88097i; i10++) {
            Pack.intToBigEndian(this.f88096h[i10], bArr, (i10 * 4) + 36);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i10 = this.f88092d;
        int i11 = this.f88093e;
        int i12 = this.f88094f;
        int i13 = this.f88095g;
        int iA = a(i11, i12, i13) + i10;
        int[] iArr = this.f88096h;
        int iC = u.c(iA, iArr[0], -680876936, 7, i11);
        int iC2 = u.c(a(iC, i11, i12) + i13, iArr[1], -389564586, 12, iC);
        int iC3 = u.c(a(iC2, iC, i11) + i12, iArr[2], 606105819, 17, iC2);
        int iC4 = u.c(a(iC3, iC2, iC) + i11, iArr[3], -1044525330, 22, iC3);
        int iC5 = u.c(a(iC4, iC3, iC2) + iC, iArr[4], -176418897, 7, iC4);
        int iC6 = u.c(a(iC5, iC4, iC3) + iC2, iArr[5], 1200080426, 12, iC5);
        int iC7 = u.c(a(iC6, iC5, iC4) + iC3, iArr[6], -1473231341, 17, iC6);
        int iC8 = u.c(a(iC7, iC6, iC5) + iC4, iArr[7], -45705983, 22, iC7);
        int iC9 = u.c(a(iC8, iC7, iC6) + iC5, iArr[8], 1770035416, 7, iC8);
        int iC10 = u.c(a(iC9, iC8, iC7) + iC6, iArr[9], -1958414417, 12, iC9);
        int iC11 = u.c(a(iC10, iC9, iC8) + iC7, iArr[10], -42063, 17, iC10);
        int iC12 = u.c(a(iC11, iC10, iC9) + iC8, iArr[11], -1990404162, 22, iC11);
        int iC13 = u.c(a(iC12, iC11, iC10) + iC9, iArr[12], 1804603682, 7, iC12);
        int iC14 = u.c(a(iC13, iC12, iC11) + iC10, iArr[13], -40341101, 12, iC13);
        int iC15 = u.c(a(iC14, iC13, iC12) + iC11, iArr[14], -1502002290, 17, iC14);
        int iC16 = u.c(a(iC15, iC14, iC13) + iC12, iArr[15], 1236535329, 22, iC15);
        int iC17 = u.c(b(iC16, iC15, iC14) + iC13, iArr[1], -165796510, 5, iC16);
        int iC18 = u.c(b(iC17, iC16, iC15) + iC14, iArr[6], -1069501632, 9, iC17);
        int iC19 = u.c(b(iC18, iC17, iC16) + iC15, iArr[11], 643717713, 14, iC18);
        int iC20 = u.c(b(iC19, iC18, iC17) + iC16, iArr[0], -373897302, 20, iC19);
        int iC21 = u.c(b(iC20, iC19, iC18) + iC17, iArr[5], -701558691, 5, iC20);
        int iC22 = u.c(b(iC21, iC20, iC19) + iC18, iArr[10], 38016083, 9, iC21);
        int iC23 = u.c(b(iC22, iC21, iC20) + iC19, iArr[15], -660478335, 14, iC22);
        int iC24 = u.c(b(iC23, iC22, iC21) + iC20, iArr[4], -405537848, 20, iC23);
        int iC25 = u.c(b(iC24, iC23, iC22) + iC21, iArr[9], 568446438, 5, iC24);
        int iC26 = u.c(b(iC25, iC24, iC23) + iC22, iArr[14], -1019803690, 9, iC25);
        int iC27 = u.c(b(iC26, iC25, iC24) + iC23, iArr[3], -187363961, 14, iC26);
        int iC28 = u.c(b(iC27, iC26, iC25) + iC24, iArr[8], 1163531501, 20, iC27);
        int iC29 = u.c(b(iC28, iC27, iC26) + iC25, iArr[13], -1444681467, 5, iC28);
        int iC30 = u.c(b(iC29, iC28, iC27) + iC26, iArr[2], -51403784, 9, iC29);
        int iC31 = u.c(b(iC30, iC29, iC28) + iC27, iArr[7], 1735328473, 14, iC30);
        int iC32 = u.c(b(iC31, iC30, iC29) + iC28, iArr[12], -1926607734, 20, iC31);
        int iC33 = u.c(iC29 + ((iC32 ^ iC31) ^ iC30), iArr[5], -378558, 4, iC32);
        int iC34 = u.c(iC30 + ((iC33 ^ iC32) ^ iC31), iArr[8], -2022574463, 11, iC33);
        int iC35 = u.c(iC31 + ((iC34 ^ iC33) ^ iC32), iArr[11], 1839030562, 16, iC34);
        int iC36 = u.c(iC32 + ((iC35 ^ iC34) ^ iC33), iArr[14], -35309556, 23, iC35);
        int iC37 = u.c(iC33 + ((iC36 ^ iC35) ^ iC34), iArr[1], -1530992060, 4, iC36);
        int iC38 = u.c(iC34 + ((iC37 ^ iC36) ^ iC35), iArr[4], 1272893353, 11, iC37);
        int iC39 = u.c(iC35 + ((iC38 ^ iC37) ^ iC36), iArr[7], -155497632, 16, iC38);
        int iC40 = u.c(iC36 + ((iC39 ^ iC38) ^ iC37), iArr[10], -1094730640, 23, iC39);
        int iC41 = u.c(iC37 + ((iC40 ^ iC39) ^ iC38), iArr[13], 681279174, 4, iC40);
        int iC42 = u.c(iC38 + ((iC41 ^ iC40) ^ iC39), iArr[0], -358537222, 11, iC41);
        int iC43 = u.c(iC39 + ((iC42 ^ iC41) ^ iC40), iArr[3], -722521979, 16, iC42);
        int iD = d(iC40 + ((iC43 ^ iC42) ^ iC41) + iArr[6] + 76029189, 23) + iC43;
        int iC44 = u.c(iC41 + ((iD ^ iC43) ^ iC42), iArr[9], -640364487, 4, iD);
        int iC45 = u.c(iC42 + ((iC44 ^ iD) ^ iC43), iArr[12], -421815835, 11, iC44);
        int iC46 = u.c(iC43 + ((iC45 ^ iC44) ^ iD), iArr[15], 530742520, 16, iC45);
        int iC47 = u.c(iD + ((iC46 ^ iC45) ^ iC44), iArr[2], -995338651, 23, iC46);
        int iC48 = u.c(iC44 + (((~iC45) | iC47) ^ iC46), iArr[0], -198630844, 6, iC47);
        int iC49 = u.c(iC45 + (((~iC46) | iC48) ^ iC47), iArr[7], 1126891415, 10, iC48);
        int iC50 = u.c(iC46 + (((~iC47) | iC49) ^ iC48), iArr[14], -1416354905, 15, iC49);
        int iC51 = u.c(iC47 + (((~iC48) | iC50) ^ iC49), iArr[5], -57434055, 21, iC50);
        int iC52 = u.c(iC48 + (((~iC49) | iC51) ^ iC50), iArr[12], 1700485571, 6, iC51);
        int iC53 = u.c(iC49 + (((~iC50) | iC52) ^ iC51), iArr[3], -1894986606, 10, iC52);
        int iD2 = d(((iC50 + (((~iC51) | iC53) ^ iC52)) + iArr[10]) - 1051523, 15) + iC53;
        int iC54 = u.c(iC51 + (((~iC52) | iD2) ^ iC53), iArr[1], -2054922799, 21, iD2);
        int iC55 = u.c(iC52 + (((~iC53) | iC54) ^ iD2), iArr[8], 1873313359, 6, iC54);
        int iC56 = u.c(iC53 + (((~iD2) | iC55) ^ iC54), iArr[15], -30611744, 10, iC55);
        int iC57 = u.c(iD2 + (((~iC54) | iC56) ^ iC55), iArr[6], -1560198380, 15, iC56);
        int iC58 = u.c(iC54 + (((~iC55) | iC57) ^ iC56), iArr[13], 1309151649, 21, iC57);
        int iC59 = u.c(iC55 + (((~iC56) | iC58) ^ iC57), iArr[4], -145523070, 6, iC58);
        int iC60 = u.c(iC56 + (((~iC57) | iC59) ^ iC58), iArr[11], -1120210379, 10, iC59);
        int iC61 = u.c(iC57 + (((~iC58) | iC60) ^ iC59), iArr[2], 718787259, 15, iC60);
        int iC62 = u.c(iC58 + (((~iC59) | iC61) ^ iC60), iArr[9], -343485551, 21, iC61);
        this.f88092d += iC59;
        this.f88093e += iC62;
        this.f88094f += iC61;
        this.f88095g += iC60;
        this.f88097i = 0;
        for (int i14 = 0; i14 != iArr.length; i14++) {
            iArr[i14] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j10) {
        if (this.f88097i > 14) {
            processBlock();
        }
        int[] iArr = this.f88096h;
        iArr[14] = (int) j10;
        iArr[15] = (int) (j10 >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i10) {
        int i11 = this.f88097i;
        int i12 = i11 + 1;
        this.f88097i = i12;
        this.f88096h[i11] = ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        if (i12 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f88092d = 1732584193;
        this.f88093e = -271733879;
        this.f88094f = -1732584194;
        this.f88095g = 271733878;
        this.f88097i = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f88096h;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public MD5Digest(MD5Digest mD5Digest) {
        super(mD5Digest);
        this.f88096h = new int[16];
        c(mD5Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        c((MD5Digest) memoable);
    }

    public MD5Digest(byte[] bArr) {
        super(bArr);
        this.f88096h = new int[16];
        this.f88092d = Pack.bigEndianToInt(bArr, 16);
        this.f88093e = Pack.bigEndianToInt(bArr, 20);
        this.f88094f = Pack.bigEndianToInt(bArr, 24);
        this.f88095g = Pack.bigEndianToInt(bArr, 28);
        this.f88097i = Pack.bigEndianToInt(bArr, 32);
        for (int i10 = 0; i10 != this.f88097i; i10++) {
            this.f88096h[i10] = Pack.bigEndianToInt(bArr, (i10 * 4) + 36);
        }
    }
}
