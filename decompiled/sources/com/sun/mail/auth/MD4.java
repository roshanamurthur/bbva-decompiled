package com.sun.mail.auth;

import androidx.appcompat.widget.c;

/* JADX INFO: loaded from: classes9.dex */
public final class MD4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f65221f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f65225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f65226e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f65224c = new byte[64];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f65222a = new int[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f65223b = new int[16];

    static {
        byte[] bArr = new byte[136];
        f65221f = bArr;
        bArr[0] = -128;
    }

    public MD4() {
        f();
    }

    public static int a(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = (((~i11) & i13) | (i12 & i11)) + i14 + i10;
        return (i16 << i15) | (i16 >>> (32 - i15));
    }

    public static int b(int i10, int i11, int i12, int i13, int i14, int i15) {
        int iA = c.a((i11 & i13) | (i11 & i12) | (i12 & i13), i14, 1518500249, i10);
        return (iA >>> (32 - i15)) | (iA << i15);
    }

    public static int c(int i10, int i11, int i12, int i13, int i14, int i15) {
        int iA = c.a((i11 ^ i12) ^ i13, i14, 1859775393, i10);
        return (iA >>> (32 - i15)) | (iA << i15);
    }

    public final void d(byte[] bArr, int i10) {
        int iMin;
        if (i10 == 0) {
            return;
        }
        if (i10 < 0 || bArr.length - i10 < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (this.f65226e < 0) {
            f();
        }
        this.f65226e += (long) i10;
        int i11 = this.f65225d;
        byte[] bArr2 = this.f65224c;
        if (i11 != 0) {
            iMin = Math.min(i10, 64 - i11);
            System.arraycopy(bArr, 0, bArr2, this.f65225d, iMin);
            int i12 = this.f65225d + iMin;
            this.f65225d = i12;
            i10 -= iMin;
            if (i12 >= 64) {
                e(0, bArr2);
                this.f65225d = 0;
            }
        } else {
            iMin = 0;
        }
        while (i10 >= 64) {
            e(iMin, bArr);
            i10 -= 64;
            iMin += 64;
        }
        if (i10 > 0) {
            System.arraycopy(bArr, iMin, bArr2, 0, i10);
            this.f65225d = i10;
        }
    }

    public byte[] digest(byte[] bArr) {
        f();
        d(bArr, bArr.length);
        byte[] bArr2 = new byte[16];
        long j10 = this.f65226e;
        long j11 = j10 << 3;
        int i10 = ((int) j10) & 63;
        d(f65221f, i10 < 56 ? 56 - i10 : 120 - i10);
        byte[] bArr3 = this.f65224c;
        bArr3[56] = (byte) j11;
        bArr3[57] = (byte) (j11 >> 8);
        bArr3[58] = (byte) (j11 >> 16);
        bArr3[59] = (byte) (j11 >> 24);
        bArr3[60] = (byte) (j11 >> 32);
        bArr3[61] = (byte) (j11 >> 40);
        bArr3[62] = (byte) (j11 >> 48);
        bArr3[63] = (byte) (j11 >> 56);
        int i11 = 0;
        e(0, bArr3);
        int i12 = 0;
        while (true) {
            int[] iArr = this.f65222a;
            if (i11 >= iArr.length) {
                return bArr2;
            }
            int i13 = iArr[i11];
            bArr2[i12] = (byte) i13;
            bArr2[i12 + 1] = (byte) (i13 >> 8);
            int i14 = i12 + 3;
            bArr2[i12 + 2] = (byte) (i13 >> 16);
            i12 += 4;
            bArr2[i14] = (byte) (i13 >> 24);
            i11++;
        }
    }

    public final void e(int i10, byte[] bArr) {
        int i11 = i10;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f65223b;
            if (i12 >= iArr.length) {
                int[] iArr2 = this.f65222a;
                int i13 = iArr2[0];
                int i14 = iArr2[1];
                int i15 = iArr2[2];
                int i16 = iArr2[3];
                int iA = a(i13, i14, i15, i16, iArr[0], 3);
                int iA2 = a(i16, iA, i14, i15, iArr[1], 7);
                int iA3 = a(i15, iA2, iA, i14, iArr[2], 11);
                int iA4 = a(i14, iA3, iA2, iA, iArr[3], 19);
                int iA5 = a(iA, iA4, iA3, iA2, iArr[4], 3);
                int iA6 = a(iA2, iA5, iA4, iA3, iArr[5], 7);
                int iA7 = a(iA3, iA6, iA5, iA4, iArr[6], 11);
                int iA8 = a(iA4, iA7, iA6, iA5, iArr[7], 19);
                int iA9 = a(iA5, iA8, iA7, iA6, iArr[8], 3);
                int iA10 = a(iA6, iA9, iA8, iA7, iArr[9], 7);
                int iA11 = a(iA7, iA10, iA9, iA8, iArr[10], 11);
                int iA12 = a(iA8, iA11, iA10, iA9, iArr[11], 19);
                int iA13 = a(iA9, iA12, iA11, iA10, iArr[12], 3);
                int iA14 = a(iA10, iA13, iA12, iA11, iArr[13], 7);
                int iA15 = a(iA11, iA14, iA13, iA12, iArr[14], 11);
                int iA16 = a(iA12, iA15, iA14, iA13, iArr[15], 19);
                int iB = b(iA13, iA16, iA15, iA14, iArr[0], 3);
                int iB2 = b(iA14, iB, iA16, iA15, iArr[4], 5);
                int iB3 = b(iA15, iB2, iB, iA16, iArr[8], 9);
                int iB4 = b(iA16, iB3, iB2, iB, iArr[12], 13);
                int iB5 = b(iB, iB4, iB3, iB2, iArr[1], 3);
                int iB6 = b(iB2, iB5, iB4, iB3, iArr[5], 5);
                int iB7 = b(iB3, iB6, iB5, iB4, iArr[9], 9);
                int iB8 = b(iB4, iB7, iB6, iB5, iArr[13], 13);
                int iB9 = b(iB5, iB8, iB7, iB6, iArr[2], 3);
                int iB10 = b(iB6, iB9, iB8, iB7, iArr[6], 5);
                int iB11 = b(iB7, iB10, iB9, iB8, iArr[10], 9);
                int iB12 = b(iB8, iB11, iB10, iB9, iArr[14], 13);
                int iB13 = b(iB9, iB12, iB11, iB10, iArr[3], 3);
                int iB14 = b(iB10, iB13, iB12, iB11, iArr[7], 5);
                int iB15 = b(iB11, iB14, iB13, iB12, iArr[11], 9);
                int iB16 = b(iB12, iB15, iB14, iB13, iArr[15], 13);
                int iC = c(iB13, iB16, iB15, iB14, iArr[0], 3);
                int iC2 = c(iB14, iC, iB16, iB15, iArr[8], 9);
                int iC3 = c(iB15, iC2, iC, iB16, iArr[4], 11);
                int iC4 = c(iB16, iC3, iC2, iC, iArr[12], 15);
                int iC5 = c(iC, iC4, iC3, iC2, iArr[2], 3);
                int iC6 = c(iC2, iC5, iC4, iC3, iArr[10], 9);
                int iC7 = c(iC3, iC6, iC5, iC4, iArr[6], 11);
                int iC8 = c(iC4, iC7, iC6, iC5, iArr[14], 15);
                int iC9 = c(iC5, iC8, iC7, iC6, iArr[1], 3);
                int iC10 = c(iC6, iC9, iC8, iC7, iArr[9], 9);
                int iC11 = c(iC7, iC10, iC9, iC8, iArr[5], 11);
                int iC12 = c(iC8, iC11, iC10, iC9, iArr[13], 15);
                int iC13 = c(iC9, iC12, iC11, iC10, iArr[3], 3);
                int iC14 = c(iC10, iC13, iC12, iC11, iArr[11], 9);
                int iC15 = c(iC11, iC14, iC13, iC12, iArr[7], 11);
                int iC16 = c(iC12, iC15, iC14, iC13, iArr[15], 15);
                iArr2[0] = iArr2[0] + iC13;
                iArr2[1] = iArr2[1] + iC16;
                iArr2[2] = iArr2[2] + iC15;
                iArr2[3] = iArr2[3] + iC14;
                return;
            }
            iArr[i12] = (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24);
            i11 += 4;
            i12++;
        }
    }

    public final void f() {
        int[] iArr = this.f65222a;
        iArr[0] = 1732584193;
        iArr[1] = -271733879;
        iArr[2] = -1732584194;
        iArr[3] = 271733878;
        this.f65225d = 0;
        this.f65226e = 0L;
    }
}
