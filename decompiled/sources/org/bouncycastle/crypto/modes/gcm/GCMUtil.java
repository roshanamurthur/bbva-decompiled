package org.bouncycastle.crypto.modes.gcm;

import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public abstract class GCMUtil {
    public static void asBytes(int[] iArr, byte[] bArr) {
        Pack.intToBigEndian(iArr, bArr, 0);
    }

    public static void asInts(byte[] bArr, int[] iArr) {
        Pack.bigEndianToInt(bArr, 0, iArr);
    }

    public static void asLongs(byte[] bArr, long[] jArr) {
        Pack.bigEndianToLong(bArr, 0, jArr);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
    }

    public static void divideP(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = j10 >> 63;
        jArr2[0] = ((j10 ^ ((-2233785415175766016L) & j12)) << 1) | (j11 >>> 63);
        jArr2[1] = (j11 << 1) | (-j12);
    }

    public static void multiply(byte[] bArr, byte[] bArr2) {
        long[] jArrAsLongs = asLongs(bArr);
        multiply(jArrAsLongs, asLongs(bArr2));
        asBytes(jArrAsLongs, bArr);
    }

    public static void multiplyP(int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        iArr[0] = (((i13 << 31) >> 31) & (-520093696)) ^ (i10 >>> 1);
        iArr[1] = (i11 >>> 1) | (i10 << 31);
        iArr[2] = (i12 >>> 1) | (i11 << 31);
        iArr[3] = (i13 >>> 1) | (i12 << 31);
    }

    public static void multiplyP3(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = j11 << 61;
        jArr2[0] = (j12 >>> 7) ^ ((((j10 >>> 3) ^ j12) ^ (j12 >>> 1)) ^ (j12 >>> 2));
        jArr2[1] = (j10 << 61) | (j11 >>> 3);
    }

    public static void multiplyP4(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = j11 << 60;
        jArr2[0] = (j12 >>> 7) ^ ((((j10 >>> 4) ^ j12) ^ (j12 >>> 1)) ^ (j12 >>> 2));
        jArr2[1] = (j10 << 60) | (j11 >>> 4);
    }

    public static void multiplyP7(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = j11 << 57;
        jArr2[0] = (j12 >>> 7) ^ ((((j10 >>> 7) ^ j12) ^ (j12 >>> 1)) ^ (j12 >>> 2));
        jArr2[1] = (j10 << 57) | (j11 >>> 7);
    }

    public static void multiplyP8(int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = i13 << 24;
        iArr[0] = (i14 >>> 7) ^ ((((i10 >>> 8) ^ i14) ^ (i14 >>> 1)) ^ (i14 >>> 2));
        iArr[1] = (i11 >>> 8) | (i10 << 24);
        iArr[2] = (i12 >>> 8) | (i11 << 24);
        iArr[3] = (i13 >>> 8) | (i12 << 24);
    }

    public static byte[] oneAsBytes() {
        byte[] bArr = new byte[16];
        bArr[0] = -128;
        return bArr;
    }

    public static int[] oneAsInts() {
        int[] iArr = new int[4];
        iArr[0] = Integer.MIN_VALUE;
        return iArr;
    }

    public static long[] oneAsLongs() {
        return new long[]{Long.MIN_VALUE, 0};
    }

    public static long[] pAsLongs() {
        return new long[]{4611686018427387904L, 0};
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        Interleave.expand64To128Rev(jArr[0], jArr3, 0);
        Interleave.expand64To128Rev(jArr[1], jArr3, 2);
        long j10 = jArr3[0];
        long j11 = jArr3[1];
        long j12 = jArr3[2];
        long j13 = jArr3[3];
        long j14 = j12 ^ ((j13 << 57) ^ ((j13 << 63) ^ (j13 << 62)));
        jArr2[0] = j10 ^ ((((j14 >>> 1) ^ j14) ^ (j14 >>> 2)) ^ (j14 >>> 7));
        jArr2[1] = (j11 ^ ((((j13 >>> 1) ^ j13) ^ (j13 >>> 2)) ^ (j13 >>> 7))) ^ ((j14 << 57) ^ ((j14 << 63) ^ (j14 << 62)));
    }

    public static void xor(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        while (true) {
            i12--;
            if (i12 < 0) {
                return;
            }
            int i13 = i10 + i12;
            bArr[i13] = (byte) (bArr[i13] ^ bArr2[i11 + i12]);
        }
    }

    public static void asBytes(long[] jArr, byte[] bArr) {
        Pack.longToBigEndian(jArr, bArr, 0);
    }

    public static int[] asInts(byte[] bArr) {
        int[] iArr = new int[4];
        Pack.bigEndianToInt(bArr, 0, iArr);
        return iArr;
    }

    public static long[] asLongs(byte[] bArr) {
        long[] jArr = new long[2];
        Pack.bigEndianToLong(bArr, 0, jArr);
        return jArr;
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static void multiply(int[] iArr, int[] iArr2) {
        int i10 = iArr2[0];
        int i11 = iArr2[1];
        int i12 = iArr2[2];
        int i13 = iArr2[3];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < 4; i18++) {
            int i19 = iArr[i18];
            for (int i20 = 0; i20 < 32; i20++) {
                int i21 = i19 >> 31;
                i19 <<= 1;
                i14 ^= i10 & i21;
                i15 ^= i11 & i21;
                i16 ^= i12 & i21;
                i17 ^= i21 & i13;
                int i22 = (i13 << 31) >> 8;
                i13 = (i13 >>> 1) | (i12 << 31);
                i12 = (i12 >>> 1) | (i11 << 31);
                i11 = (i11 >>> 1) | (i10 << 31);
                i10 = (i10 >>> 1) ^ (i22 & (-520093696));
            }
        }
        iArr[0] = i14;
        iArr[1] = i15;
        iArr[2] = i16;
        iArr[3] = i17;
    }

    public static void multiplyP(int[] iArr, int[] iArr2) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        iArr2[0] = (((i13 << 31) >> 31) & (-520093696)) ^ (i10 >>> 1);
        iArr2[1] = (i11 >>> 1) | (i10 << 31);
        iArr2[2] = (i12 >>> 1) | (i11 << 31);
        iArr2[3] = (i13 >>> 1) | (i12 << 31);
    }

    public static void multiplyP8(int[] iArr, int[] iArr2) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = i13 << 24;
        iArr2[0] = (i14 >>> 7) ^ ((((i10 >>> 8) ^ i14) ^ (i14 >>> 1)) ^ (i14 >>> 2));
        iArr2[1] = (i11 >>> 8) | (i10 << 24);
        iArr2[2] = (i12 >>> 8) | (i11 << 24);
        iArr2[3] = (i13 >>> 8) | (i12 << 24);
    }

    public static void xor(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        int i13 = 0;
        do {
            bArr3[i12 + i13] = (byte) (bArr[i10 + i13] ^ bArr2[i11 + i13]);
            int i14 = i13 + 1;
            bArr3[i12 + i14] = (byte) (bArr2[i14 + i11] ^ bArr[i10 + i14]);
            int i15 = i13 + 2;
            bArr3[i12 + i15] = (byte) (bArr2[i15 + i11] ^ bArr[i10 + i15]);
            int i16 = i13 + 3;
            bArr3[i12 + i16] = (byte) (bArr2[i16 + i11] ^ bArr[i10 + i16]);
            i13 += 4;
        } while (i13 < 16);
    }

    public static byte[] asBytes(int[] iArr) {
        byte[] bArr = new byte[16];
        Pack.intToBigEndian(iArr, bArr, 0);
        return bArr;
    }

    public static void multiply(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr2[0];
        long j13 = jArr2[1];
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        for (int i10 = 0; i10 < 64; i10++) {
            long j17 = j10 >> 63;
            j10 <<= 1;
            j14 ^= j12 & j17;
            long j18 = j16 ^ (j13 & j17);
            long j19 = j11 >> 63;
            j11 <<= 1;
            j16 = j18 ^ (j12 & j19);
            j15 ^= j13 & j19;
            long j20 = (j13 << 63) >> 8;
            j13 = (j13 >>> 1) | (j12 << 63);
            j12 = (j12 >>> 1) ^ (j20 & (-2233785415175766016L));
        }
        jArr[0] = ((((j15 >>> 1) ^ j15) ^ (j15 >>> 2)) ^ (j15 >>> 7)) ^ j14;
        jArr[1] = (((j15 << 63) ^ (j15 << 62)) ^ (j15 << 57)) ^ j16;
    }

    public static void multiplyP(long[] jArr) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        jArr[0] = (((j11 << 63) >> 63) & (-2233785415175766016L)) ^ (j10 >>> 1);
        jArr[1] = (j10 << 63) | (j11 >>> 1);
    }

    public static void multiplyP8(long[] jArr) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = j11 << 56;
        jArr[0] = (j12 >>> 7) ^ ((((j10 >>> 8) ^ j12) ^ (j12 >>> 1)) ^ (j12 >>> 2));
        jArr[1] = (j10 << 56) | (j11 >>> 8);
    }

    public static void xor(byte[] bArr, byte[] bArr2) {
        int i10 = 0;
        do {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
            int i11 = i10 + 1;
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
            int i12 = i10 + 2;
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i12]);
            int i13 = i10 + 3;
            bArr[i13] = (byte) (bArr[i13] ^ bArr2[i13]);
            i10 += 4;
        } while (i10 < 16);
    }

    public static byte[] asBytes(long[] jArr) {
        byte[] bArr = new byte[16];
        Pack.longToBigEndian(jArr, bArr, 0);
        return bArr;
    }

    public static void multiplyP(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        jArr2[0] = (((j11 << 63) >> 63) & (-2233785415175766016L)) ^ (j10 >>> 1);
        jArr2[1] = (j10 << 63) | (j11 >>> 1);
    }

    public static void multiplyP8(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = j11 << 56;
        jArr2[0] = (j12 >>> 7) ^ ((((j10 >>> 8) ^ j12) ^ (j12 >>> 1)) ^ (j12 >>> 2));
        jArr2[1] = (j10 << 56) | (j11 >>> 8);
    }

    public static void xor(byte[] bArr, byte[] bArr2, int i10) {
        int i11 = 0;
        do {
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i10 + i11]);
            int i12 = i11 + 1;
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i10 + i12]);
            int i13 = i11 + 2;
            bArr[i13] = (byte) (bArr[i13] ^ bArr2[i10 + i13]);
            int i14 = i11 + 3;
            bArr[i14] = (byte) (bArr[i14] ^ bArr2[i10 + i14]);
            i11 += 4;
        } while (i11 < 16);
    }

    public static void xor(byte[] bArr, byte[] bArr2, int i10, int i11) {
        while (true) {
            i11--;
            if (i11 < 0) {
                return;
            } else {
                bArr[i11] = (byte) (bArr[i11] ^ bArr2[i10 + i11]);
            }
        }
    }

    public static void xor(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i10 = 0;
        do {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
            int i11 = i10 + 1;
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
            int i12 = i10 + 2;
            bArr3[i12] = (byte) (bArr[i12] ^ bArr2[i12]);
            int i13 = i10 + 3;
            bArr3[i13] = (byte) (bArr[i13] ^ bArr2[i13]);
            i10 += 4;
        } while (i10 < 16);
    }

    public static void xor(int[] iArr, int[] iArr2) {
        iArr[0] = iArr[0] ^ iArr2[0];
        iArr[1] = iArr[1] ^ iArr2[1];
        iArr[2] = iArr[2] ^ iArr2[2];
        iArr[3] = iArr2[3] ^ iArr[3];
    }

    public static void xor(int[] iArr, int[] iArr2, int[] iArr3) {
        iArr3[0] = iArr[0] ^ iArr2[0];
        iArr3[1] = iArr[1] ^ iArr2[1];
        iArr3[2] = iArr[2] ^ iArr2[2];
        iArr3[3] = iArr[3] ^ iArr2[3];
    }

    public static void xor(long[] jArr, long[] jArr2) {
        jArr[0] = jArr[0] ^ jArr2[0];
        jArr[1] = jArr[1] ^ jArr2[1];
    }

    public static void xor(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }
}
