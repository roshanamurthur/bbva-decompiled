package org.bouncycastle.pqc.math.linearalgebra;

/* JADX INFO: loaded from: classes13.dex */
public final class LittleEndianConversions {
    public static void I2OSP(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    public static int OS2IP(byte[] bArr) {
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    public static long OS2LIP(byte[] bArr, int i10) {
        long j10 = ((long) (bArr[i10] & 255)) | ((long) ((bArr[i10 + 1] & 255) << 8)) | ((long) ((bArr[i10 + 2] & 255) << 16)) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40);
        return ((((long) bArr[i10 + 7]) & 255) << 56) | j10 | ((((long) bArr[i10 + 6]) & 255) << 48);
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
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            bArr[i11 + i13] = (byte) (i10 >>> (i13 * 8));
        }
    }

    public static int OS2IP(byte[] bArr, int i10) {
        int i11 = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
        return ((bArr[i10 + 3] & 255) << 24) | i11 | ((bArr[i10 + 2] & 255) << 16);
    }

    public static void I2OSP(long j10, byte[] bArr, int i10) {
        bArr[i10] = (byte) j10;
        bArr[i10 + 1] = (byte) (j10 >>> 8);
        bArr[i10 + 2] = (byte) (j10 >>> 16);
        bArr[i10 + 3] = (byte) (j10 >>> 24);
        bArr[i10 + 4] = (byte) (j10 >>> 32);
        bArr[i10 + 5] = (byte) (j10 >>> 40);
        bArr[i10 + 6] = (byte) (j10 >>> 48);
        bArr[i10 + 7] = (byte) (j10 >>> 56);
    }

    public static int OS2IP(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            i12 |= (bArr[i10 + i13] & 255) << (i13 * 8);
        }
        return i12;
    }

    public static byte[] I2OSP(int i10) {
        return new byte[]{(byte) i10, (byte) (i10 >>> 8), (byte) (i10 >>> 16), (byte) (i10 >>> 24)};
    }

    public static byte[] I2OSP(long j10) {
        return new byte[]{(byte) j10, (byte) (j10 >>> 8), (byte) (j10 >>> 16), (byte) (j10 >>> 24), (byte) (j10 >>> 32), (byte) (j10 >>> 40), (byte) (j10 >>> 48), (byte) (j10 >>> 56)};
    }
}
