package org.bouncycastle.pqc.math.linearalgebra;

import c2.b;

/* JADX INFO: loaded from: classes13.dex */
public final class BigEndianConversions {
    public static void I2OSP(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    public static int OS2IP(byte[] bArr) {
        if (bArr.length > 4) {
            throw new ArithmeticException("invalid input length");
        }
        if (bArr.length == 0) {
            return 0;
        }
        int iE = 0;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            iE |= (bArr[i10] & 255) << b.e(bArr.length, 1, i10, 8);
        }
        return iE;
    }

    public static long OS2LIP(byte[] bArr, int i10) {
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((255 & ((long) bArr[i10 + 4])) << 24) | ((long) ((bArr[i10 + 5] & 255) << 16));
        return ((long) (bArr[i10 + 7] & 255)) | j10 | ((long) ((bArr[i10 + 6] & 255) << 8));
    }

    public static byte[] toByteArray(int[] iArr) {
        byte[] bArr = new byte[iArr.length << 2];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            I2OSP(iArr[i10], bArr, i10 << 2);
        }
        return bArr;
    }

    public static int[] toIntArray(byte[] bArr) {
        int length = (bArr.length + 3) / 4;
        int length2 = bArr.length & 3;
        int[] iArr = new int[length];
        int i10 = 0;
        int i11 = 0;
        while (i10 <= length - 2) {
            iArr[i10] = OS2IP(bArr, i11);
            i10++;
            i11 += 4;
        }
        int i12 = length - 1;
        if (length2 != 0) {
            iArr[i12] = OS2IP(bArr, i11, length2);
        } else {
            iArr[i12] = OS2IP(bArr, i11);
        }
        return iArr;
    }

    public static void I2OSP(int i10, byte[] bArr, int i11, int i12) {
        int i13 = i12 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            bArr[i11 + i14] = (byte) (i10 >>> ((i13 - i14) * 8));
        }
    }

    public static int OS2IP(byte[] bArr, int i10) {
        int i11 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24);
        return (bArr[i10 + 3] & 255) | i11 | ((bArr[i10 + 2] & 255) << 8);
    }

    public static byte[] toByteArray(int[] iArr, int i10) {
        int length = iArr.length;
        byte[] bArr = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        while (i11 <= length - 2) {
            I2OSP(iArr[i11], bArr, i12);
            i11++;
            i12 += 4;
        }
        I2OSP(iArr[length - 1], bArr, i12, i10 - i12);
        return bArr;
    }

    public static void I2OSP(long j10, byte[] bArr, int i10) {
        bArr[i10] = (byte) (j10 >>> 56);
        bArr[i10 + 1] = (byte) (j10 >>> 48);
        bArr[i10 + 2] = (byte) (j10 >>> 40);
        bArr[i10 + 3] = (byte) (j10 >>> 32);
        bArr[i10 + 4] = (byte) (j10 >>> 24);
        bArr[i10 + 5] = (byte) (j10 >>> 16);
        bArr[i10 + 6] = (byte) (j10 >>> 8);
        bArr[i10 + 7] = (byte) j10;
    }

    public static int OS2IP(byte[] bArr, int i10, int i11) {
        if (bArr.length == 0 || bArr.length < (i10 + i11) - 1) {
            return 0;
        }
        int iE = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            iE |= (bArr[i10 + i12] & 255) << b.e(i11, i12, 1, 8);
        }
        return iE;
    }

    public static byte[] I2OSP(int i10) {
        return new byte[]{(byte) (i10 >>> 24), (byte) (i10 >>> 16), (byte) (i10 >>> 8), (byte) i10};
    }

    public static byte[] I2OSP(int i10, int i11) throws ArithmeticException {
        if (i10 < 0) {
            return null;
        }
        int iCeilLog256 = IntegerFunctions.ceilLog256(i10);
        if (iCeilLog256 > i11) {
            throw new ArithmeticException("Cannot encode given integer into specified number of octets.");
        }
        byte[] bArr = new byte[i11];
        int i12 = i11 - 1;
        for (int i13 = i12; i13 >= i11 - iCeilLog256; i13--) {
            bArr[i13] = (byte) (i10 >>> ((i12 - i13) * 8));
        }
        return bArr;
    }

    public static byte[] I2OSP(long j10) {
        return new byte[]{(byte) (j10 >>> 56), (byte) (j10 >>> 48), (byte) (j10 >>> 40), (byte) (j10 >>> 32), (byte) (j10 >>> 24), (byte) (j10 >>> 16), (byte) (j10 >>> 8), (byte) j10};
    }
}
