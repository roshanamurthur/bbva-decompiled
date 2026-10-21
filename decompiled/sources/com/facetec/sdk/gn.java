package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public final class gn {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static byte[] f41792g = new byte[256];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f41786a = new byte[256];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f41787b = new int[256];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f41788c = new int[256];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f41790e = new int[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[] f41789d = new int[256];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int[] f41791f = new int[10];

    static {
        int i10;
        byte b10 = 1;
        byte b11 = 1;
        do {
            b10 = (byte) (((b10 & 128) != 0 ? 27 : 0) ^ ((b10 << 1) ^ b10));
            byte b12 = (byte) (b11 ^ (b11 << 1));
            byte b13 = (byte) (b12 ^ (b12 << 2));
            byte b14 = (byte) (b13 ^ (b13 << 4));
            b11 = (byte) (b14 ^ ((b14 & 128) != 0 ? (byte) 9 : (byte) 0));
            i10 = b10 & 255;
            f41792g[i10] = (byte) (((((b11 ^ 99) ^ b(b11, 1)) ^ b(b11, 2)) ^ b(b11, 3)) ^ b(b11, 4));
        } while (i10 != 1);
        f41792g[0] = 99;
        for (int i11 = 0; i11 < 256; i11++) {
            int i12 = f41792g[i11] & 255;
            f41786a[i12] = (byte) i11;
            int i13 = i11 << 1;
            if (i13 >= 256) {
                i13 ^= 283;
            }
            int i14 = i13 << 1;
            if (i14 >= 256) {
                i14 ^= 283;
            }
            int i15 = i14 << 1;
            if (i15 >= 256) {
                i15 ^= 283;
            }
            int i16 = i15 ^ i11;
            int i17 = ((i13 ^ (i14 ^ i15)) << 24) | (i16 << 16) | ((i16 ^ i14) << 8) | (i16 ^ i13);
            f41787b[i12] = i17;
            f41788c[i12] = (i17 >>> 8) | (i17 << 24);
            f41790e[i12] = (i17 >>> 16) | (i17 << 16);
            f41789d[i12] = (i17 << 8) | (i17 >>> 24);
        }
        f41791f[0] = 16777216;
        int i18 = 1;
        for (int i19 = 1; i19 < 10; i19++) {
            i18 <<= 1;
            if (i18 >= 256) {
                i18 ^= 283;
            }
            f41791f[i19] = i18 << 24;
        }
    }

    public static byte[][] a(int i10) {
        byte[][] bArr = new byte[4][];
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i10 >>> (i11 << 3);
            bArr[i11] = new byte[]{(byte) (i12 & 3), (byte) ((i12 >> 2) & 3), (byte) ((i12 >> 4) & 3), (byte) ((i12 >> 6) & 3)};
        }
        return bArr;
    }

    private static int b(byte b10, int i10) {
        int i11 = b10 & 255;
        return (i11 >> (8 - i10)) | (i11 << i10);
    }

    public static int[] b(byte[] bArr, int i10) throws IllegalArgumentException {
        int i11 = i10;
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i12 = 4;
        int i13 = (i11 + 1) * 4;
        int[] iArr = new int[i13];
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            int i16 = i14 + 3;
            int i17 = ((bArr[i14 + 1] & 255) << 16) | (bArr[i14] << 24) | ((bArr[i14 + 2] & 255) << 8);
            i14 += 4;
            iArr[i15] = i17 | (bArr[i16] & 255);
        }
        int i18 = 4;
        int i19 = 0;
        int i20 = 0;
        while (i18 < i13) {
            int i21 = iArr[i18 - 1];
            if (i19 == 0) {
                byte[] bArr2 = f41792g;
                i21 = ((bArr2[i21 >>> 24] & 255) | (((bArr2[(i21 >>> 16) & 255] << 24) | ((bArr2[(i21 >>> 8) & 255] & 255) << 16)) | ((bArr2[i21 & 255] & 255) << 8))) ^ f41791f[i20];
                i19 = 4;
                i20++;
            }
            iArr[i18] = i21 ^ iArr[i18 - 4];
            i18++;
            i19--;
        }
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int[] iArr2 = new int[i13];
        int i22 = i11 * 4;
        iArr2[0] = iArr[i22];
        int i23 = 1;
        iArr2[1] = iArr[i22 + 1];
        iArr2[2] = iArr[i22 + 2];
        iArr2[3] = iArr[i22 + 3];
        int i24 = i22 - 4;
        while (i23 < i11) {
            int i25 = iArr[i24];
            int[] iArr3 = f41787b;
            byte[] bArr3 = f41792g;
            int i26 = iArr3[bArr3[i25 >>> 24] & 255];
            int[] iArr4 = f41788c;
            int i27 = i26 ^ iArr4[bArr3[(i25 >>> 16) & 255] & 255];
            int[] iArr5 = f41790e;
            int i28 = i27 ^ iArr5[bArr3[(i25 >>> 8) & 255] & 255];
            int[] iArr6 = f41789d;
            iArr2[i12] = iArr6[bArr3[i25 & 255] & 255] ^ i28;
            int i29 = iArr[i24 + 1];
            iArr2[i12 + 1] = ((iArr4[bArr3[(i29 >>> 16) & 255] & 255] ^ iArr3[bArr3[i29 >>> 24] & 255]) ^ iArr5[bArr3[(i29 >>> 8) & 255] & 255]) ^ iArr6[bArr3[i29 & 255] & 255];
            int i30 = iArr[i24 + 2];
            int i31 = i12 + 3;
            iArr2[i12 + 2] = iArr6[bArr3[i30 & 255] & 255] ^ ((iArr3[bArr3[i30 >>> 24] & 255] ^ iArr4[bArr3[(i30 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i30 >>> 8) & 255] & 255]);
            int i32 = iArr[i24 + 3];
            i12 += 4;
            iArr2[i31] = iArr6[bArr3[i32 & 255] & 255] ^ ((iArr3[bArr3[i32 >>> 24] & 255] ^ iArr4[bArr3[(i32 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i32 >>> 8) & 255] & 255]);
            i24 -= 4;
            i23++;
            i11 = i10;
        }
        iArr2[i12] = iArr[i24];
        iArr2[i12 + 1] = iArr[i24 + 1];
        iArr2[i12 + 2] = iArr[i24 + 2];
        iArr2[i12 + 3] = iArr[i24 + 3];
        return iArr2;
    }
}
