package org.bouncycastle.crypto.digests;

import androidx.appcompat.widget.c;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class SM3Digest extends GeneralDigest {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f88168h = new int[64];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f88169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f88170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f88172g;

    static {
        int i10;
        int i11 = 0;
        while (true) {
            if (i11 >= 16) {
                break;
            }
            f88168h[i11] = (2043430169 >>> (32 - i11)) | (2043430169 << i11);
            i11++;
        }
        for (i10 = 16; i10 < 64; i10++) {
            int i12 = i10 % 32;
            f88168h[i10] = (2055708042 >>> (32 - i12)) | (2055708042 << i12);
        }
    }

    public SM3Digest() {
        this.f88169d = new int[8];
        this.f88170e = new int[16];
        this.f88172g = new int[68];
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SM3Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        Pack.intToBigEndian(this.f88169d, bArr, i10);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int[] iArr;
        int i10;
        int[] iArr2;
        int i11 = 0;
        while (true) {
            iArr = this.f88172g;
            i10 = 16;
            if (i11 >= 16) {
                break;
            }
            iArr[i11] = this.f88170e[i11];
            i11++;
        }
        for (int i12 = 16; i12 < 68; i12++) {
            int i13 = iArr[i12 - 3];
            int i14 = iArr[i12 - 13];
            int i15 = ((i13 >>> 17) | (i13 << 15)) ^ (iArr[i12 - 16] ^ iArr[i12 - 9]);
            iArr[i12] = (((i15 ^ ((i15 << 15) | (i15 >>> 17))) ^ ((i15 << 23) | (i15 >>> 9))) ^ ((i14 >>> 25) | (i14 << 7))) ^ iArr[i12 - 6];
        }
        int[] iArr3 = this.f88169d;
        int i16 = iArr3[0];
        int i17 = iArr3[1];
        int i18 = iArr3[2];
        int i19 = iArr3[3];
        int i20 = iArr3[4];
        int i21 = iArr3[5];
        int i22 = iArr3[6];
        int i23 = 0;
        int i24 = iArr3[7];
        while (true) {
            iArr2 = f88168h;
            if (i23 >= i10) {
                break;
            }
            int i25 = (i16 << 12) | (i16 >>> 20);
            int i26 = i25 + i20 + iArr2[i23];
            int i27 = (i26 << 7) | (i26 >>> 25);
            int i28 = iArr[i23];
            int iA = c.a((i16 ^ i17) ^ i18, i19, i27 ^ i25, i28 ^ iArr[i23 + 4]);
            int iA2 = c.a((i20 ^ i21) ^ i22, i24, i27, i28);
            int i29 = (i17 << 9) | (i17 >>> 23);
            int i30 = (i21 << 19) | (i21 >>> 13);
            i23++;
            i19 = i18;
            i21 = i20;
            i24 = i22;
            i20 = (iA2 ^ ((iA2 << 9) | (iA2 >>> 23))) ^ ((iA2 << 17) | (iA2 >>> 15));
            i18 = i29;
            i22 = i30;
            i10 = 16;
            i17 = i16;
            i16 = iA;
        }
        int i31 = 16;
        while (i31 < 64) {
            int i32 = (i16 << 12) | (i16 >>> 20);
            int i33 = i32 + i20 + iArr2[i31];
            int i34 = (i33 >>> 25) | (i33 << 7);
            int i35 = iArr[i31];
            int iA3 = c.a((i16 & i17) | (i16 & i18) | (i17 & i18), i19, i32 ^ i34, iArr[i31 + 4] ^ i35);
            int iA4 = c.a((i20 & i21) | ((~i20) & i22), i24, i34, i35);
            int i36 = (i21 << 19) | (i21 >>> 13);
            int i37 = (iA4 ^ ((iA4 << 9) | (iA4 >>> 23))) ^ ((iA4 << 17) | (iA4 >>> 15));
            i31++;
            i19 = i18;
            i21 = i20;
            i24 = i22;
            i20 = i37;
            i18 = (i17 >>> 23) | (i17 << 9);
            i22 = i36;
            i17 = i16;
            i16 = iA3;
        }
        iArr3[0] = iArr3[0] ^ i16;
        iArr3[1] = iArr3[1] ^ i17;
        iArr3[2] = iArr3[2] ^ i18;
        iArr3[3] = iArr3[3] ^ i19;
        iArr3[4] = iArr3[4] ^ i20;
        iArr3[5] = iArr3[5] ^ i21;
        iArr3[6] = iArr3[6] ^ i22;
        iArr3[7] = iArr3[7] ^ i24;
        this.f88171f = 0;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j10) {
        int i10 = this.f88171f;
        int[] iArr = this.f88170e;
        if (i10 > 14) {
            iArr[i10] = 0;
            this.f88171f = i10 + 1;
            processBlock();
        }
        while (true) {
            int i11 = this.f88171f;
            if (i11 >= 14) {
                iArr[i11] = (int) (j10 >>> 32);
                this.f88171f = i11 + 2;
                iArr[i11 + 1] = (int) j10;
                return;
            }
            iArr[i11] = 0;
            this.f88171f = i11 + 1;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
        int i12 = this.f88171f;
        this.f88170e[i12] = i11;
        int i13 = i12 + 1;
        this.f88171f = i13;
        if (i13 >= 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        int[] iArr = this.f88169d;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.f88171f = 0;
    }

    public SM3Digest(SM3Digest sM3Digest) {
        super(sM3Digest);
        int[] iArr = new int[8];
        this.f88169d = iArr;
        this.f88170e = new int[16];
        this.f88172g = new int[68];
        System.arraycopy(sM3Digest.f88169d, 0, iArr, 0, iArr.length);
        int[] iArr2 = this.f88170e;
        System.arraycopy(sM3Digest.f88170e, 0, iArr2, 0, iArr2.length);
        this.f88171f = sM3Digest.f88171f;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SM3Digest sM3Digest = (SM3Digest) memoable;
        super.copyIn(sM3Digest);
        int[] iArr = sM3Digest.f88169d;
        int[] iArr2 = this.f88169d;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = this.f88170e;
        System.arraycopy(sM3Digest.f88170e, 0, iArr3, 0, iArr3.length);
        this.f88171f = sM3Digest.f88171f;
    }
}
