package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public abstract class u3 {
    public static int[] a() {
        return new int[4];
    }

    public static long[] b() {
        return new long[2];
    }

    public static int[] c() {
        return new int[8];
    }

    public static long[] d() {
        return new long[4];
    }

    public static int e(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j10 >> 32);
        iArr3[1] = (int) j11;
        long j12 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j11 >> 32);
        iArr3[2] = (int) j12;
        long j13 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j12 >> 32);
        iArr3[3] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        return (int) (j13 >>> 32);
    }

    public static int b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        return (int) (j13 >>> 32);
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((long) iArr2[0]) & 4294967295L;
        int i10 = 1;
        long j11 = ((long) iArr2[1]) & 4294967295L;
        long j12 = ((long) iArr2[2]) & 4294967295L;
        long j13 = ((long) iArr2[3]) & 4294967295L;
        long j14 = ((long) iArr[0]) & 4294967295L;
        long j15 = j14 * j10;
        iArr3[0] = (int) j15;
        long j16 = (j14 * j11) + (j15 >>> 32);
        iArr3[1] = (int) j16;
        long j17 = (j14 * j12) + (j16 >>> 32);
        iArr3[2] = (int) j17;
        long j18 = (j14 * j13) + (j17 >>> 32);
        iArr3[3] = (int) j18;
        iArr3[4] = (int) (j18 >>> 32);
        for (int i11 = 4; i10 < i11; i11 = 4) {
            long j19 = ((long) iArr[i10]) & 4294967295L;
            long j20 = (j19 * j10) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j20;
            int i12 = i10 + 1;
            int i13 = i10;
            long j21 = (j19 * j11) + (((long) iArr3[i12]) & 4294967295L) + (j20 >>> 32);
            iArr3[i12] = (int) j21;
            int i14 = i13 + 2;
            long j22 = (j19 * j12) + (((long) iArr3[i14]) & 4294967295L) + (j21 >>> 32);
            iArr3[i14] = (int) j22;
            int i15 = i13 + 3;
            long j23 = (j19 * j13) + (((long) iArr3[i15]) & 4294967295L) + (j22 >>> 32);
            iArr3[i15] = (int) j23;
            iArr3[i13 + 4] = (int) (j23 >>> 32);
            i10 = i12;
            j10 = j10;
        }
    }

    public static int d(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10 = 0;
        long j10 = ((long) iArr2[0]) & 4294967295L;
        long j11 = ((long) iArr2[1]) & 4294967295L;
        long j12 = ((long) iArr2[2]) & 4294967295L;
        long j13 = ((long) iArr2[3]) & 4294967295L;
        long j14 = 0;
        while (i10 < 4) {
            long j15 = ((long) iArr[i10]) & 4294967295L;
            long j16 = j10;
            long j17 = (((long) iArr3[i10]) & 4294967295L) + (j15 * j10);
            iArr3[i10] = (int) j17;
            int i11 = i10 + 1;
            long j18 = j11;
            long j19 = (j15 * j11) + (((long) iArr3[i11]) & 4294967295L) + (j17 >>> 32);
            iArr3[i11] = (int) j19;
            int i12 = i10 + 2;
            long j20 = (j15 * j12) + (((long) iArr3[i12]) & 4294967295L) + (j19 >>> 32);
            iArr3[i12] = (int) j20;
            int i13 = i10 + 3;
            long j21 = (j15 * j13) + (((long) iArr3[i13]) & 4294967295L) + (j20 >>> 32);
            iArr3[i13] = (int) j21;
            int i14 = i10 + 4;
            long j22 = j14 + (((long) iArr3[i14]) & 4294967295L) + (j21 >>> 32);
            iArr3[i14] = (int) j22;
            j14 = j22 >>> 32;
            i10 = i11;
            j10 = j16;
            j11 = j18;
        }
        return (int) j14;
    }

    public static boolean a(int[] iArr, int[] iArr2) {
        for (int i10 = 3; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static long[] b(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 128) {
            long[] jArrB = b();
            int i10 = 0;
            while (bigInteger.signum() != 0) {
                jArrB[i10] = bigInteger.longValue();
                bigInteger = bigInteger.shiftRight(64);
                i10++;
            }
            return jArrB;
        }
        throw new IllegalArgumentException();
    }

    public static boolean a(long[] jArr, long[] jArr2) {
        for (int i10 = 1; i10 >= 0; i10--) {
            if (jArr[i10] != jArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] a(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 128) {
            int[] iArrA = a();
            int i10 = 0;
            while (bigInteger.signum() != 0) {
                iArrA[i10] = bigInteger.intValue();
                bigInteger = bigInteger.shiftRight(32);
                i10++;
            }
            return iArrA;
        }
        throw new IllegalArgumentException();
    }

    public static boolean b(int[] iArr, int[] iArr2) {
        for (int i10 = 3; i10 >= 0; i10--) {
            int i11 = iArr[i10] ^ Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE ^ iArr2[i10];
            if (i11 < i12) {
                return false;
            }
            if (i11 > i12) {
                return true;
            }
        }
        return true;
    }

    public static int d(int[] iArr, int[] iArr2) {
        long j10 = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j10 >> 32);
        iArr2[1] = (int) j11;
        long j12 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j11 >> 32);
        iArr2[2] = (int) j12;
        long j13 = ((((long) iArr2[3]) & 4294967295L) - (4294967295L & ((long) iArr[3]))) + (j12 >> 32);
        iArr2[3] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static int a(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else {
            int i12 = i10 >> 5;
            if (i12 < 0 || i12 >= 4) {
                return 0;
            }
            i11 = iArr[i12] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean b(int[] iArr) {
        for (int i10 = 0; i10 < 4; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(long[] jArr) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 4; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(long[] jArr) {
        return jArr[0] == 1 && jArr[1] == 0;
    }

    public static void c(int[] iArr, int[] iArr2) {
        long j10 = ((long) iArr[0]) & 4294967295L;
        int i10 = 8;
        int i11 = 0;
        int i12 = 3;
        while (true) {
            int i13 = i12 - 1;
            long j11 = ((long) iArr[i12]) & 4294967295L;
            long j12 = j11 * j11;
            iArr2[i10 - 1] = (i11 << 31) | ((int) (j12 >>> 33));
            i10 -= 2;
            iArr2[i10] = (int) (j12 >>> 1);
            i11 = (int) j12;
            if (i13 <= 0) {
                long j13 = j10 * j10;
                long j14 = (j13 >>> 33) | (((long) (i11 << 31)) & 4294967295L);
                iArr2[0] = (int) j13;
                long j15 = ((long) iArr[1]) & 4294967295L;
                long j16 = ((long) iArr2[2]) & 4294967295L;
                long j17 = j14 + (j15 * j10);
                int i14 = (int) j17;
                iArr2[1] = (i14 << 1) | (((int) (j13 >>> 32)) & 1);
                int i15 = i14 >>> 31;
                long j18 = j16 + (j17 >>> 32);
                long j19 = ((long) iArr[2]) & 4294967295L;
                long j20 = ((long) iArr2[3]) & 4294967295L;
                long j21 = ((long) iArr2[4]) & 4294967295L;
                long j22 = j18 + (j19 * j10);
                int i16 = (int) j22;
                iArr2[2] = (i16 << 1) | i15;
                long jA = androidx.emoji2.text.flatbuffer.a.a(j19, j15, j22 >>> 32, j20);
                long j23 = j21 + (jA >>> 32);
                long j24 = ((long) iArr[3]) & 4294967295L;
                long j25 = (((long) iArr2[5]) & 4294967295L) + (j23 >>> 32);
                long j26 = j23 & 4294967295L;
                long j27 = (((long) iArr2[6]) & 4294967295L) + (j25 >>> 32);
                long j28 = (j10 * j24) + (jA & 4294967295L);
                int i17 = (int) j28;
                iArr2[3] = (i17 << 1) | (i16 >>> 31);
                long jA2 = androidx.emoji2.text.flatbuffer.a.a(j24, j15, j28 >>> 32, j26);
                long jA3 = androidx.emoji2.text.flatbuffer.a.a(j24, j19, jA2 >>> 32, j25 & 4294967295L);
                long j29 = j27 + (jA3 >>> 32);
                int i18 = (int) jA2;
                iArr2[4] = (i18 << 1) | (i17 >>> 31);
                int i19 = (int) (4294967295L & jA3);
                iArr2[5] = (i18 >>> 31) | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) j29;
                iArr2[6] = i20 | (i21 << 1);
                iArr2[7] = ((iArr2[7] + ((int) (j29 >>> 32))) << 1) | (i21 >>> 31);
                return;
            }
            i12 = i13;
        }
    }

    public static void d(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
    }

    public static BigInteger c(int[] iArr) {
        byte[] bArr = new byte[16];
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                k4.a(i11, bArr, (3 - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger c(long[] jArr) {
        byte[] bArr = new byte[16];
        for (int i10 = 0; i10 < 2; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                k4.a(j10, bArr, (1 - i10) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }
}
