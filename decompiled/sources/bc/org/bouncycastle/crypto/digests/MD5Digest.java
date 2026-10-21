package bc.org.bouncycastle.crypto.digests;

import androidx.datastore.preferences.protobuf.e;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.k4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.p3;

/* JADX INFO: loaded from: classes2.dex */
public class MD5Digest extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f24911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24912i;

    public MD5Digest() {
        this.f24911h = new int[16];
        reset();
    }

    public static int b(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    public static int c(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    public static void d(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    public static int f(int i10, int i11, int i12) {
        return (i10 & i12) | (i11 & (~i12));
    }

    @Override // bc.org.bouncycastle.crypto.digests.a
    public void a(byte[] bArr, int i10) {
        int i11 = this.f24912i;
        int i12 = i11 + 1;
        this.f24912i = i12;
        this.f24911h[i11] = ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        if (i12 == 16) {
            a();
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.p3
    public p3 copy() {
        return new MD5Digest(this);
    }

    @Override // bc.org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        d(this.f24907d, bArr, i10);
        d(this.f24908e, bArr, i10 + 4);
        d(this.f24909f, bArr, i10 + 8);
        d(this.f24910g, bArr, i10 + 12);
        reset();
        return 16;
    }

    public final void e(MD5Digest mD5Digest) {
        super.a(mD5Digest);
        this.f24907d = mD5Digest.f24907d;
        this.f24908e = mD5Digest.f24908e;
        this.f24909f = mD5Digest.f24909f;
        this.f24910g = mD5Digest.f24910g;
        int[] iArr = mD5Digest.f24911h;
        System.arraycopy(iArr, 0, this.f24911h, 0, iArr.length);
        this.f24912i = mD5Digest.f24912i;
    }

    @Override // bc.org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "MD5";
    }

    @Override // bc.org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.f24912i * 4) + 36];
        super.a(bArr);
        k4.a(this.f24907d, bArr, 16);
        k4.a(this.f24908e, bArr, 20);
        k4.a(this.f24909f, bArr, 24);
        k4.a(this.f24910g, bArr, 28);
        k4.a(this.f24912i, bArr, 32);
        for (int i10 = 0; i10 != this.f24912i; i10++) {
            k4.a(this.f24911h[i10], bArr, (i10 * 4) + 36);
        }
        return bArr;
    }

    @Override // bc.org.bouncycastle.crypto.digests.a, bc.org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f24907d = 1732584193;
        this.f24908e = -271733879;
        this.f24909f = -1732584194;
        this.f24910g = 271733878;
        this.f24912i = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f24911h;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    @Override // bc.org.bouncycastle.crypto.digests.a
    public void a(long j10) {
        if (this.f24912i > 14) {
            a();
        }
        int[] iArr = this.f24911h;
        iArr[14] = (int) j10;
        iArr[15] = (int) (j10 >>> 32);
    }

    public MD5Digest(byte[] bArr) {
        super(bArr);
        this.f24911h = new int[16];
        this.f24907d = k4.a(bArr, 16);
        this.f24908e = k4.a(bArr, 20);
        this.f24909f = k4.a(bArr, 24);
        this.f24910g = k4.a(bArr, 28);
        this.f24912i = k4.a(bArr, 32);
        for (int i10 = 0; i10 != this.f24912i; i10++) {
            this.f24911h[i10] = k4.a(bArr, (i10 * 4) + 36);
        }
    }

    @Override // bc.org.bouncycastle.crypto.digests.a
    public void a() {
        int i10 = this.f24907d;
        int i11 = this.f24908e;
        int i12 = this.f24909f;
        int i13 = this.f24910g;
        int iC = c(i11, i12, i13) + i10;
        int[] iArr = this.f24911h;
        int iC2 = e.c(iC, iArr[0], -680876936, 7, i11);
        int iC3 = e.c(c(iC2, i11, i12) + i13, iArr[1], -389564586, 12, iC2);
        int iC4 = e.c(c(iC3, iC2, i11) + i12, iArr[2], 606105819, 17, iC3);
        int iC5 = e.c(c(iC4, iC3, iC2) + i11, iArr[3], -1044525330, 22, iC4);
        int iC6 = e.c(c(iC5, iC4, iC3) + iC2, iArr[4], -176418897, 7, iC5);
        int iC7 = e.c(c(iC6, iC5, iC4) + iC3, iArr[5], 1200080426, 12, iC6);
        int iC8 = e.c(c(iC7, iC6, iC5) + iC4, iArr[6], -1473231341, 17, iC7);
        int iC9 = e.c(c(iC8, iC7, iC6) + iC5, iArr[7], -45705983, 22, iC8);
        int iC10 = e.c(c(iC9, iC8, iC7) + iC6, iArr[8], 1770035416, 7, iC9);
        int iC11 = e.c(c(iC10, iC9, iC8) + iC7, iArr[9], -1958414417, 12, iC10);
        int iC12 = e.c(c(iC11, iC10, iC9) + iC8, iArr[10], -42063, 17, iC11);
        int iC13 = e.c(c(iC12, iC11, iC10) + iC9, iArr[11], -1990404162, 22, iC12);
        int iC14 = e.c(c(iC13, iC12, iC11) + iC10, iArr[12], 1804603682, 7, iC13);
        int iC15 = e.c(c(iC14, iC13, iC12) + iC11, iArr[13], -40341101, 12, iC14);
        int iC16 = e.c(c(iC15, iC14, iC13) + iC12, iArr[14], -1502002290, 17, iC15);
        int iC17 = e.c(c(iC16, iC15, iC14) + iC13, iArr[15], 1236535329, 22, iC16);
        int iC18 = e.c(f(iC17, iC16, iC15) + iC14, iArr[1], -165796510, 5, iC17);
        int iC19 = e.c(f(iC18, iC17, iC16) + iC15, iArr[6], -1069501632, 9, iC18);
        int iC20 = e.c(f(iC19, iC18, iC17) + iC16, iArr[11], 643717713, 14, iC19);
        int iC21 = e.c(f(iC20, iC19, iC18) + iC17, iArr[0], -373897302, 20, iC20);
        int iC22 = e.c(f(iC21, iC20, iC19) + iC18, iArr[5], -701558691, 5, iC21);
        int iC23 = e.c(f(iC22, iC21, iC20) + iC19, iArr[10], 38016083, 9, iC22);
        int iC24 = e.c(f(iC23, iC22, iC21) + iC20, iArr[15], -660478335, 14, iC23);
        int iC25 = e.c(f(iC24, iC23, iC22) + iC21, iArr[4], -405537848, 20, iC24);
        int iC26 = e.c(f(iC25, iC24, iC23) + iC22, iArr[9], 568446438, 5, iC25);
        int iC27 = e.c(f(iC26, iC25, iC24) + iC23, iArr[14], -1019803690, 9, iC26);
        int iC28 = e.c(f(iC27, iC26, iC25) + iC24, iArr[3], -187363961, 14, iC27);
        int iC29 = e.c(f(iC28, iC27, iC26) + iC25, iArr[8], 1163531501, 20, iC28);
        int iC30 = e.c(f(iC29, iC28, iC27) + iC26, iArr[13], -1444681467, 5, iC29);
        int iC31 = e.c(f(iC30, iC29, iC28) + iC27, iArr[2], -51403784, 9, iC30);
        int iC32 = e.c(f(iC31, iC30, iC29) + iC28, iArr[7], 1735328473, 14, iC31);
        int iC33 = e.c(f(iC32, iC31, iC30) + iC29, iArr[12], -1926607734, 20, iC32);
        int iC34 = e.c(iC30 + ((iC33 ^ iC32) ^ iC31), iArr[5], -378558, 4, iC33);
        int iC35 = e.c(iC31 + ((iC34 ^ iC33) ^ iC32), iArr[8], -2022574463, 11, iC34);
        int iC36 = e.c(iC32 + ((iC35 ^ iC34) ^ iC33), iArr[11], 1839030562, 16, iC35);
        int iC37 = e.c(iC33 + ((iC36 ^ iC35) ^ iC34), iArr[14], -35309556, 23, iC36);
        int iC38 = e.c(iC34 + ((iC37 ^ iC36) ^ iC35), iArr[1], -1530992060, 4, iC37);
        int iC39 = e.c(iC35 + ((iC38 ^ iC37) ^ iC36), iArr[4], 1272893353, 11, iC38);
        int iC40 = e.c(iC36 + ((iC39 ^ iC38) ^ iC37), iArr[7], -155497632, 16, iC39);
        int iC41 = e.c(iC37 + ((iC40 ^ iC39) ^ iC38), iArr[10], -1094730640, 23, iC40);
        int iC42 = e.c(iC38 + ((iC41 ^ iC40) ^ iC39), iArr[13], 681279174, 4, iC41);
        int iC43 = e.c(iC39 + ((iC42 ^ iC41) ^ iC40), iArr[0], -358537222, 11, iC42);
        int iC44 = e.c(iC40 + ((iC43 ^ iC42) ^ iC41), iArr[3], -722521979, 16, iC43);
        int iB = b(iC41 + ((iC44 ^ iC43) ^ iC42) + iArr[6] + 76029189, 23) + iC44;
        int iC45 = e.c(iC42 + ((iB ^ iC44) ^ iC43), iArr[9], -640364487, 4, iB);
        int iC46 = e.c(iC43 + ((iC45 ^ iB) ^ iC44), iArr[12], -421815835, 11, iC45);
        int iC47 = e.c(iC44 + ((iC46 ^ iC45) ^ iB), iArr[15], 530742520, 16, iC46);
        int iC48 = e.c(iB + ((iC47 ^ iC46) ^ iC45), iArr[2], -995338651, 23, iC47);
        int iC49 = e.c(iC45 + (((~iC46) | iC48) ^ iC47), iArr[0], -198630844, 6, iC48);
        int iC50 = e.c(iC46 + (((~iC47) | iC49) ^ iC48), iArr[7], 1126891415, 10, iC49);
        int iC51 = e.c(iC47 + (((~iC48) | iC50) ^ iC49), iArr[14], -1416354905, 15, iC50);
        int iC52 = e.c(iC48 + (((~iC49) | iC51) ^ iC50), iArr[5], -57434055, 21, iC51);
        int iC53 = e.c(iC49 + (((~iC50) | iC52) ^ iC51), iArr[12], 1700485571, 6, iC52);
        int iC54 = e.c(iC50 + (((~iC51) | iC53) ^ iC52), iArr[3], -1894986606, 10, iC53);
        int iB2 = b(((iC51 + (((~iC52) | iC54) ^ iC53)) + iArr[10]) - 1051523, 15) + iC54;
        int iC55 = e.c(iC52 + (((~iC53) | iB2) ^ iC54), iArr[1], -2054922799, 21, iB2);
        int iC56 = e.c(iC53 + (((~iC54) | iC55) ^ iB2), iArr[8], 1873313359, 6, iC55);
        int iC57 = e.c(iC54 + (((~iB2) | iC56) ^ iC55), iArr[15], -30611744, 10, iC56);
        int iC58 = e.c(iB2 + (((~iC55) | iC57) ^ iC56), iArr[6], -1560198380, 15, iC57);
        int iC59 = e.c(iC55 + (((~iC56) | iC58) ^ iC57), iArr[13], 1309151649, 21, iC58);
        int iC60 = e.c(iC56 + (((~iC57) | iC59) ^ iC58), iArr[4], -145523070, 6, iC59);
        int iC61 = e.c(iC57 + (((~iC58) | iC60) ^ iC59), iArr[11], -1120210379, 10, iC60);
        int iC62 = e.c(iC58 + (((~iC59) | iC61) ^ iC60), iArr[2], 718787259, 15, iC61);
        int iC63 = e.c(iC59 + (((~iC60) | iC62) ^ iC61), iArr[9], -343485551, 21, iC62);
        this.f24907d += iC60;
        this.f24908e += iC63;
        this.f24909f += iC62;
        this.f24910g += iC61;
        this.f24912i = 0;
        for (int i14 = 0; i14 != iArr.length; i14++) {
            iArr[i14] = 0;
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.p3
    public void reset(p3 p3Var) {
        e((MD5Digest) p3Var);
    }

    public MD5Digest(MD5Digest mD5Digest) {
        super(mD5Digest);
        this.f24911h = new int[16];
        e(mD5Digest);
    }
}
