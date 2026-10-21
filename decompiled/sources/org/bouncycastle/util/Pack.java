package org.bouncycastle.util;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Pack {
    public static int bigEndianToInt(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | (bArr[i10] << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long bigEndianToLong(byte[] bArr, int i10) {
        int iBigEndianToInt = bigEndianToInt(bArr, i10);
        return (((long) bigEndianToInt(bArr, i10 + 4)) & 4294967295L) | ((((long) iBigEndianToInt) & 4294967295L) << 32);
    }

    public static short bigEndianToShort(byte[] bArr, int i10) {
        return (short) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public static void intToBigEndian(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    public static void intToLittleEndian(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    public static int littleEndianToInt(byte[] bArr, int i10) {
        return (bArr[i10 + 3] << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static long littleEndianToLong(byte[] bArr, int i10) {
        return ((((long) littleEndianToInt(bArr, i10 + 4)) & 4294967295L) << 32) | (((long) littleEndianToInt(bArr, i10)) & 4294967295L);
    }

    public static short littleEndianToShort(byte[] bArr, int i10) {
        return (short) (((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255));
    }

    public static void longToBigEndian(long j10, byte[] bArr, int i10) {
        intToBigEndian((int) (j10 >>> 32), bArr, i10);
        intToBigEndian((int) (j10 & 4294967295L), bArr, i10 + 4);
    }

    public static void longToLittleEndian(long j10, byte[] bArr, int i10) {
        intToLittleEndian((int) (4294967295L & j10), bArr, i10);
        intToLittleEndian((int) (j10 >>> 32), bArr, i10 + 4);
    }

    public static void shortToBigEndian(short s4, byte[] bArr, int i10) {
        bArr[i10] = (byte) (s4 >>> 8);
        bArr[i10 + 1] = (byte) s4;
    }

    public static void shortToLittleEndian(short s4, byte[] bArr, int i10) {
        bArr[i10] = (byte) s4;
        bArr[i10 + 1] = (byte) (s4 >>> 8);
    }

    public static void bigEndianToInt(byte[] bArr, int i10, int[] iArr) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr[i11] = bigEndianToInt(bArr, i10);
            i10 += 4;
        }
    }

    public static void bigEndianToLong(byte[] bArr, int i10, long[] jArr) {
        for (int i11 = 0; i11 < jArr.length; i11++) {
            jArr[i11] = bigEndianToLong(bArr, i10);
            i10 += 8;
        }
    }

    public static void intToBigEndian(int[] iArr, byte[] bArr, int i10) {
        for (int i11 : iArr) {
            intToBigEndian(i11, bArr, i10);
            i10 += 4;
        }
    }

    public static void intToLittleEndian(int[] iArr, byte[] bArr, int i10) {
        for (int i11 : iArr) {
            intToLittleEndian(i11, bArr, i10);
            i10 += 4;
        }
    }

    public static void littleEndianToInt(byte[] bArr, int i10, int[] iArr) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr[i11] = littleEndianToInt(bArr, i10);
            i10 += 4;
        }
    }

    public static void littleEndianToLong(byte[] bArr, int i10, long[] jArr) {
        for (int i11 = 0; i11 < jArr.length; i11++) {
            jArr[i11] = littleEndianToLong(bArr, i10);
            i10 += 8;
        }
    }

    public static void longToBigEndian(long j10, byte[] bArr, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            bArr[i12 + i10] = (byte) (255 & j10);
            j10 >>>= 8;
        }
    }

    public static void longToLittleEndian(long[] jArr, int i10, int i11, byte[] bArr, int i12) {
        for (int i13 = 0; i13 < i11; i13++) {
            longToLittleEndian(jArr[i10 + i13], bArr, i12);
            i12 += 8;
        }
    }

    public static byte[] shortToBigEndian(short s4) {
        byte[] bArr = new byte[2];
        shortToBigEndian(s4, bArr, 0);
        return bArr;
    }

    public static byte[] shortToLittleEndian(short s4) {
        byte[] bArr = new byte[2];
        shortToLittleEndian(s4, bArr, 0);
        return bArr;
    }

    public static byte[] intToBigEndian(int i10) {
        byte[] bArr = new byte[4];
        intToBigEndian(i10, bArr, 0);
        return bArr;
    }

    public static byte[] intToLittleEndian(int i10) {
        byte[] bArr = new byte[4];
        intToLittleEndian(i10, bArr, 0);
        return bArr;
    }

    public static void littleEndianToInt(byte[] bArr, int i10, int[] iArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i11 + i13] = littleEndianToInt(bArr, i10);
            i10 += 4;
        }
    }

    public static void littleEndianToLong(byte[] bArr, int i10, long[] jArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            jArr[i11 + i13] = littleEndianToLong(bArr, i10);
            i10 += 8;
        }
    }

    public static void longToBigEndian(long[] jArr, byte[] bArr, int i10) {
        for (long j10 : jArr) {
            longToBigEndian(j10, bArr, i10);
            i10 += 8;
        }
    }

    public static void longToLittleEndian(long[] jArr, byte[] bArr, int i10) {
        for (long j10 : jArr) {
            longToLittleEndian(j10, bArr, i10);
            i10 += 8;
        }
    }

    public static byte[] intToBigEndian(int[] iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        intToBigEndian(iArr, bArr, 0);
        return bArr;
    }

    public static byte[] intToLittleEndian(int[] iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        intToLittleEndian(iArr, bArr, 0);
        return bArr;
    }

    public static int[] littleEndianToInt(byte[] bArr, int i10, int i11) {
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = littleEndianToInt(bArr, i10);
            i10 += 4;
        }
        return iArr;
    }

    public static byte[] longToBigEndian(long j10) {
        byte[] bArr = new byte[8];
        longToBigEndian(j10, bArr, 0);
        return bArr;
    }

    public static byte[] longToLittleEndian(long j10) {
        byte[] bArr = new byte[8];
        longToLittleEndian(j10, bArr, 0);
        return bArr;
    }

    public static byte[] longToBigEndian(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        longToBigEndian(jArr, bArr, 0);
        return bArr;
    }

    public static byte[] longToLittleEndian(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        longToLittleEndian(jArr, bArr, 0);
        return bArr;
    }
}
