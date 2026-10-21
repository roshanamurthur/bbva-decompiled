package bc.org.bouncycastle.crypto.digests;

import com.vasco.digipass.sdk.utils.utilities.obfuscated.k4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.p3;

/* JADX INFO: loaded from: classes2.dex */
public class SHA256Digest extends a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f24920n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f24929l;
    public int m;

    public SHA256Digest() {
        this.f24929l = new int[64];
        reset();
    }

    public static int b(int i10) {
        return ((i10 << 10) | (i10 >>> 22)) ^ (((i10 >>> 2) | (i10 << 30)) ^ ((i10 >>> 13) | (i10 << 19)));
    }

    public static int d(int i10, int i11, int i12) {
        return ((~i10) & i12) ^ (i11 & i10);
    }

    public static int e(int i10) {
        return ((i10 << 7) | (i10 >>> 25)) ^ (((i10 >>> 6) | (i10 << 26)) ^ ((i10 >>> 11) | (i10 << 21)));
    }

    public static int f(int i10, int i11, int i12) {
        return ((i10 & i12) ^ (i10 & i11)) ^ (i11 & i12);
    }

    @Override // bc.org.bouncycastle.crypto.digests.a
    public void a(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 3] & 255) | (bArr[i10] << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
        int i12 = this.m;
        this.f24929l[i12] = i11;
        int i13 = i12 + 1;
        this.m = i13;
        if (i13 == 16) {
            a();
        }
    }

    public final void c(SHA256Digest sHA256Digest) {
        super.a(sHA256Digest);
        this.f24921d = sHA256Digest.f24921d;
        this.f24922e = sHA256Digest.f24922e;
        this.f24923f = sHA256Digest.f24923f;
        this.f24924g = sHA256Digest.f24924g;
        this.f24925h = sHA256Digest.f24925h;
        this.f24926i = sHA256Digest.f24926i;
        this.f24927j = sHA256Digest.f24927j;
        this.f24928k = sHA256Digest.f24928k;
        int[] iArr = sHA256Digest.f24929l;
        System.arraycopy(iArr, 0, this.f24929l, 0, iArr.length);
        this.m = sHA256Digest.m;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.p3
    public p3 copy() {
        return new SHA256Digest(this);
    }

    @Override // bc.org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        k4.a(this.f24921d, bArr, i10);
        k4.a(this.f24922e, bArr, i10 + 4);
        k4.a(this.f24923f, bArr, i10 + 8);
        k4.a(this.f24924g, bArr, i10 + 12);
        k4.a(this.f24925h, bArr, i10 + 16);
        k4.a(this.f24926i, bArr, i10 + 20);
        k4.a(this.f24927j, bArr, i10 + 24);
        k4.a(this.f24928k, bArr, i10 + 28);
        reset();
        return 32;
    }

    @Override // bc.org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-256";
    }

    @Override // bc.org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.m * 4) + 52];
        super.a(bArr);
        k4.a(this.f24921d, bArr, 16);
        k4.a(this.f24922e, bArr, 20);
        k4.a(this.f24923f, bArr, 24);
        k4.a(this.f24924g, bArr, 28);
        k4.a(this.f24925h, bArr, 32);
        k4.a(this.f24926i, bArr, 36);
        k4.a(this.f24927j, bArr, 40);
        k4.a(this.f24928k, bArr, 44);
        k4.a(this.m, bArr, 48);
        for (int i10 = 0; i10 != this.m; i10++) {
            k4.a(this.f24929l[i10], bArr, (i10 * 4) + 52);
        }
        return bArr;
    }

    @Override // bc.org.bouncycastle.crypto.digests.a, bc.org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f24921d = 1779033703;
        this.f24922e = -1150833019;
        this.f24923f = 1013904242;
        this.f24924g = -1521486534;
        this.f24925h = 1359893119;
        this.f24926i = -1694144372;
        this.f24927j = 528734635;
        this.f24928k = 1541459225;
        this.m = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f24929l;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public SHA256Digest(SHA256Digest sHA256Digest) {
        super(sHA256Digest);
        this.f24929l = new int[64];
        c(sHA256Digest);
    }

    public SHA256Digest(byte[] bArr) {
        super(bArr);
        this.f24929l = new int[64];
        this.f24921d = k4.a(bArr, 16);
        this.f24922e = k4.a(bArr, 20);
        this.f24923f = k4.a(bArr, 24);
        this.f24924g = k4.a(bArr, 28);
        this.f24925h = k4.a(bArr, 32);
        this.f24926i = k4.a(bArr, 36);
        this.f24927j = k4.a(bArr, 40);
        this.f24928k = k4.a(bArr, 44);
        this.m = k4.a(bArr, 48);
        for (int i10 = 0; i10 != this.m; i10++) {
            this.f24929l[i10] = k4.a(bArr, (i10 * 4) + 52);
        }
    }

    @Override // bc.org.bouncycastle.crypto.digests.a
    public void a(long j10) {
        if (this.m > 14) {
            a();
        }
        int[] iArr = this.f24929l;
        iArr[14] = (int) (j10 >>> 32);
        iArr[15] = (int) j10;
    }

    @Override // bc.org.bouncycastle.crypto.digests.a
    public void a() {
        int[] iArr;
        int i10 = 16;
        while (true) {
            iArr = this.f24929l;
            if (i10 > 63) {
                break;
            }
            int i11 = iArr[i10 - 2];
            int i12 = ((i11 >>> 10) ^ (((i11 >>> 17) | (i11 << 15)) ^ ((i11 >>> 19) | (i11 << 13)))) + iArr[i10 - 7];
            int i13 = iArr[i10 - 15];
            iArr[i10] = i12 + ((i13 >>> 3) ^ (((i13 >>> 7) | (i13 << 25)) ^ ((i13 >>> 18) | (i13 << 14)))) + iArr[i10 - 16];
            i10++;
        }
        int iF = this.f24921d;
        int iF2 = this.f24922e;
        int iF3 = this.f24923f;
        int iF4 = this.f24924g;
        int i14 = this.f24925h;
        int i15 = this.f24926i;
        int i16 = this.f24927j;
        int i17 = this.f24928k;
        int i18 = 0;
        for (int i19 = 0; i19 < 8; i19++) {
            int iD = d(i14, i15, i16) + e(i14);
            int[] iArr2 = f24920n;
            int i20 = iD + iArr2[i18] + iArr[i18] + i17;
            int i21 = iF4 + i20;
            int iF5 = f(iF, iF2, iF3) + b(iF) + i20;
            int i22 = i18 + 1;
            int iD2 = d(i21, i14, i15) + e(i21) + iArr2[i22] + iArr[i22] + i16;
            int i23 = iF3 + iD2;
            int iF6 = f(iF5, iF, iF2) + b(iF5) + iD2;
            int i24 = i18 + 2;
            int iD3 = d(i23, i21, i14) + e(i23) + iArr2[i24] + iArr[i24] + i15;
            int i25 = iF2 + iD3;
            int iF7 = f(iF6, iF5, iF) + b(iF6) + iD3;
            int i26 = i18 + 3;
            int iD4 = d(i25, i23, i21) + e(i25) + iArr2[i26] + iArr[i26] + i14;
            int i27 = iF + iD4;
            int iF8 = f(iF7, iF6, iF5) + b(iF7) + iD4;
            int i28 = i18 + 4;
            int iD5 = d(i27, i25, i23) + e(i27) + iArr2[i28] + iArr[i28] + i21;
            i17 = iF5 + iD5;
            iF4 = f(iF8, iF7, iF6) + b(iF8) + iD5;
            int i29 = i18 + 5;
            int iD6 = d(i17, i27, i25) + e(i17) + iArr2[i29] + iArr[i29] + i23;
            i16 = iF6 + iD6;
            iF3 = f(iF4, iF8, iF7) + b(iF4) + iD6;
            int i30 = i18 + 6;
            int iD7 = d(i16, i17, i27) + e(i16) + iArr2[i30] + iArr[i30] + i25;
            i15 = iF7 + iD7;
            iF2 = f(iF3, iF4, iF8) + b(iF3) + iD7;
            int i31 = i18 + 7;
            int iD8 = d(i15, i16, i17) + e(i15) + iArr2[i31] + iArr[i31] + i27;
            i14 = iF8 + iD8;
            iF = f(iF2, iF3, iF4) + b(iF2) + iD8;
            i18 += 8;
        }
        this.f24921d += iF;
        this.f24922e += iF2;
        this.f24923f += iF3;
        this.f24924g += iF4;
        this.f24925h += i14;
        this.f24926i += i15;
        this.f24927j += i16;
        this.f24928k += i17;
        this.m = 0;
        for (int i32 = 0; i32 < 16; i32++) {
            iArr[i32] = 0;
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.p3
    public void reset(p3 p3Var) {
        c((SHA256Digest) p3Var);
    }
}
