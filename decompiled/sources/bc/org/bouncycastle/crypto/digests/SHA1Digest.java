package bc.org.bouncycastle.crypto.digests;

import androidx.appcompat.widget.c;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.k4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.p3;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public class SHA1Digest extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f24918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24919j;

    public SHA1Digest() {
        this.f24918i = new int[80];
        reset();
    }

    public static int c(int i10, int i11, int i12) {
        return (i10 & i12) | (i10 & i11) | (i11 & i12);
    }

    @Override // bc.org.bouncycastle.crypto.digests.a
    public void a(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 3] & 255) | (bArr[i10] << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
        int i12 = this.f24919j;
        this.f24918i[i12] = i11;
        int i13 = i12 + 1;
        this.f24919j = i13;
        if (i13 == 16) {
            a();
        }
    }

    public final void b(SHA1Digest sHA1Digest) {
        this.f24913d = sHA1Digest.f24913d;
        this.f24914e = sHA1Digest.f24914e;
        this.f24915f = sHA1Digest.f24915f;
        this.f24916g = sHA1Digest.f24916g;
        this.f24917h = sHA1Digest.f24917h;
        int[] iArr = sHA1Digest.f24918i;
        System.arraycopy(iArr, 0, this.f24918i, 0, iArr.length);
        this.f24919j = sHA1Digest.f24919j;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.p3
    public p3 copy() {
        return new SHA1Digest(this);
    }

    @Override // bc.org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        k4.a(this.f24913d, bArr, i10);
        k4.a(this.f24914e, bArr, i10 + 4);
        k4.a(this.f24915f, bArr, i10 + 8);
        k4.a(this.f24916g, bArr, i10 + 12);
        k4.a(this.f24917h, bArr, i10 + 16);
        reset();
        return 20;
    }

    @Override // bc.org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return McElieceCCA2KeyGenParameterSpec.SHA1;
    }

    @Override // bc.org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.f24919j * 4) + 40];
        super.a(bArr);
        k4.a(this.f24913d, bArr, 16);
        k4.a(this.f24914e, bArr, 20);
        k4.a(this.f24915f, bArr, 24);
        k4.a(this.f24916g, bArr, 28);
        k4.a(this.f24917h, bArr, 32);
        k4.a(this.f24919j, bArr, 36);
        for (int i10 = 0; i10 != this.f24919j; i10++) {
            k4.a(this.f24918i[i10], bArr, (i10 * 4) + 40);
        }
        return bArr;
    }

    @Override // bc.org.bouncycastle.crypto.digests.a, bc.org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f24913d = 1732584193;
        this.f24914e = -271733879;
        this.f24915f = -1732584194;
        this.f24916g = 271733878;
        this.f24917h = -1009589776;
        this.f24919j = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f24918i;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super(sHA1Digest);
        this.f24918i = new int[80];
        b(sHA1Digest);
    }

    public SHA1Digest(byte[] bArr) {
        super(bArr);
        this.f24918i = new int[80];
        this.f24913d = k4.a(bArr, 16);
        this.f24914e = k4.a(bArr, 20);
        this.f24915f = k4.a(bArr, 24);
        this.f24916g = k4.a(bArr, 28);
        this.f24917h = k4.a(bArr, 32);
        this.f24919j = k4.a(bArr, 36);
        for (int i10 = 0; i10 != this.f24919j; i10++) {
            this.f24918i[i10] = k4.a(bArr, (i10 * 4) + 40);
        }
    }

    @Override // bc.org.bouncycastle.crypto.digests.a
    public void a(long j10) {
        if (this.f24919j > 14) {
            a();
        }
        int[] iArr = this.f24918i;
        iArr[14] = (int) (j10 >>> 32);
        iArr[15] = (int) j10;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.p3
    public void reset(p3 p3Var) {
        SHA1Digest sHA1Digest = (SHA1Digest) p3Var;
        super.a(sHA1Digest);
        b(sHA1Digest);
    }

    @Override // bc.org.bouncycastle.crypto.digests.a
    public void a() {
        int[] iArr;
        int i10 = 16;
        while (true) {
            iArr = this.f24918i;
            if (i10 >= 80) {
                break;
            }
            int i11 = ((iArr[i10 - 3] ^ iArr[i10 - 8]) ^ iArr[i10 - 14]) ^ iArr[i10 - 16];
            iArr[i10] = (i11 >>> 31) | (i11 << 1);
            i10++;
        }
        int iA = this.f24913d;
        int iA2 = this.f24914e;
        int i12 = this.f24915f;
        int i13 = this.f24916g;
        int i14 = this.f24917h;
        int i15 = 0;
        for (int i16 = 0; i16 < 4; i16++) {
            int iA3 = c.a(((iA2 & i12) | ((~iA2) & i13)) + ((iA << 5) | (iA >>> 27)), iArr[i15], 1518500249, i14);
            int i17 = (iA2 >>> 2) | (iA2 << 30);
            int iA4 = c.a(((iA & i17) | ((~iA) & i12)) + ((iA3 << 5) | (iA3 >>> 27)), iArr[i15 + 1], 1518500249, i13);
            int i18 = (iA >>> 2) | (iA << 30);
            int iA5 = c.a(((iA3 & i18) | ((~iA3) & i17)) + ((iA4 << 5) | (iA4 >>> 27)), iArr[i15 + 2], 1518500249, i12);
            i14 = (iA3 >>> 2) | (iA3 << 30);
            int i19 = i15 + 4;
            iA2 = c.a(((iA4 & i14) | ((~iA4) & i18)) + ((iA5 << 5) | (iA5 >>> 27)), iArr[i15 + 3], 1518500249, i17);
            i13 = (iA4 >>> 2) | (iA4 << 30);
            i15 += 5;
            iA = c.a(((iA5 & i13) | ((~iA5) & i14)) + ((iA2 << 5) | (iA2 >>> 27)), iArr[i19], 1518500249, i18);
            i12 = (iA5 >>> 2) | (iA5 << 30);
        }
        for (int i20 = 0; i20 < 4; i20++) {
            int iA6 = c.a(((iA << 5) | (iA >>> 27)) + ((iA2 ^ i12) ^ i13), iArr[i15], 1859775393, i14);
            int i21 = (iA2 >>> 2) | (iA2 << 30);
            int iA7 = c.a(((iA6 << 5) | (iA6 >>> 27)) + ((iA ^ i21) ^ i12), iArr[i15 + 1], 1859775393, i13);
            int i22 = (iA >>> 2) | (iA << 30);
            int iA8 = c.a(((iA7 << 5) | (iA7 >>> 27)) + ((iA6 ^ i22) ^ i21), iArr[i15 + 2], 1859775393, i12);
            i14 = (iA6 >>> 2) | (iA6 << 30);
            int i23 = i15 + 4;
            iA2 = c.a(((iA8 << 5) | (iA8 >>> 27)) + ((iA7 ^ i14) ^ i22), iArr[i15 + 3], 1859775393, i21);
            i13 = (iA7 >>> 2) | (iA7 << 30);
            i15 += 5;
            iA = c.a(((iA2 << 5) | (iA2 >>> 27)) + ((iA8 ^ i13) ^ i14), iArr[i23], 1859775393, i22);
            i12 = (iA8 >>> 2) | (iA8 << 30);
        }
        for (int i24 = 0; i24 < 4; i24++) {
            int iA9 = c.a(c(iA2, i12, i13) + ((iA << 5) | (iA >>> 27)), iArr[i15], -1894007588, i14);
            int i25 = (iA2 >>> 2) | (iA2 << 30);
            int iA10 = c.a(c(iA, i25, i12) + ((iA9 << 5) | (iA9 >>> 27)), iArr[i15 + 1], -1894007588, i13);
            int i26 = (iA >>> 2) | (iA << 30);
            int iA11 = c.a(c(iA9, i26, i25) + ((iA10 << 5) | (iA10 >>> 27)), iArr[i15 + 2], -1894007588, i12);
            i14 = (iA9 >>> 2) | (iA9 << 30);
            int i27 = i15 + 4;
            iA2 = c.a(c(iA10, i14, i26) + ((iA11 << 5) | (iA11 >>> 27)), iArr[i15 + 3], -1894007588, i25);
            i13 = (iA10 >>> 2) | (iA10 << 30);
            i15 += 5;
            iA = c.a(c(iA11, i13, i14) + ((iA2 << 5) | (iA2 >>> 27)), iArr[i27], -1894007588, i26);
            i12 = (iA11 >>> 2) | (iA11 << 30);
        }
        for (int i28 = 0; i28 <= 3; i28++) {
            int iA12 = c.a(((iA << 5) | (iA >>> 27)) + ((iA2 ^ i12) ^ i13), iArr[i15], -899497514, i14);
            int i29 = (iA2 >>> 2) | (iA2 << 30);
            int iA13 = c.a(((iA12 << 5) | (iA12 >>> 27)) + ((iA ^ i29) ^ i12), iArr[i15 + 1], -899497514, i13);
            int i30 = (iA >>> 2) | (iA << 30);
            int iA14 = c.a(((iA13 << 5) | (iA13 >>> 27)) + ((iA12 ^ i30) ^ i29), iArr[i15 + 2], -899497514, i12);
            i14 = (iA12 >>> 2) | (iA12 << 30);
            int i31 = i15 + 4;
            iA2 = c.a(((iA14 << 5) | (iA14 >>> 27)) + ((iA13 ^ i14) ^ i30), iArr[i15 + 3], -899497514, i29);
            i13 = (iA13 >>> 2) | (iA13 << 30);
            i15 += 5;
            iA = c.a(((iA2 << 5) | (iA2 >>> 27)) + ((iA14 ^ i13) ^ i14), iArr[i31], -899497514, i30);
            i12 = (iA14 >>> 2) | (iA14 << 30);
        }
        this.f24913d += iA;
        this.f24914e += iA2;
        this.f24915f += i12;
        this.f24916g += i13;
        this.f24917h += i14;
        this.f24919j = 0;
        for (int i32 = 0; i32 < 16; i32++) {
            iArr[i32] = 0;
        }
    }
}
