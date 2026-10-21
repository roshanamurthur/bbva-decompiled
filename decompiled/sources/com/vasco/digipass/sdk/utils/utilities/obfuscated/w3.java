package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public abstract class w3 {
    public static int[] a() {
        return new int[6];
    }

    public static long[] b() {
        return new long[3];
    }

    public static int[] c() {
        return new int[12];
    }

    public static long[] d() {
        return new long[6];
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
        long j14 = ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L)) + (j13 >> 32);
        iArr3[4] = (int) j14;
        long j15 = ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L)) + (j14 >> 32);
        iArr3[5] = (int) j15;
        return (int) (j15 >> 32);
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
        long j14 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        return (int) (j15 >>> 32);
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
        long j14 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((long) iArr2[0]) & 4294967295L;
        long j11 = ((long) iArr2[1]) & 4294967295L;
        long j12 = ((long) iArr2[2]) & 4294967295L;
        long j13 = ((long) iArr2[3]) & 4294967295L;
        long j14 = ((long) iArr2[4]) & 4294967295L;
        long j15 = ((long) iArr2[5]) & 4294967295L;
        long j16 = ((long) iArr[0]) & 4294967295L;
        long j17 = j16 * j10;
        iArr3[0] = (int) j17;
        long j18 = (j16 * j11) + (j17 >>> 32);
        iArr3[1] = (int) j18;
        long j19 = (j16 * j12) + (j18 >>> 32);
        iArr3[2] = (int) j19;
        long j20 = (j16 * j13) + (j19 >>> 32);
        iArr3[3] = (int) j20;
        long j21 = (j16 * j14) + (j20 >>> 32);
        iArr3[4] = (int) j21;
        long j22 = (j16 * j15) + (j21 >>> 32);
        iArr3[5] = (int) j22;
        iArr3[6] = (int) (j22 >>> 32);
        int i10 = 1;
        for (int i11 = 6; i10 < i11; i11 = 6) {
            long j23 = ((long) iArr[i10]) & 4294967295L;
            long j24 = j10;
            long j25 = (j23 * j10) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j25;
            int i12 = i10 + 1;
            long j26 = (j23 * j11) + (((long) iArr3[i12]) & 4294967295L) + (j25 >>> 32);
            iArr3[i12] = (int) j26;
            int i13 = i10 + 2;
            long j27 = j11;
            long j28 = (j23 * j12) + (((long) iArr3[i13]) & 4294967295L) + (j26 >>> 32);
            iArr3[i13] = (int) j28;
            int i14 = i10 + 3;
            long j29 = (j23 * j13) + (((long) iArr3[i14]) & 4294967295L) + (j28 >>> 32);
            iArr3[i14] = (int) j29;
            int i15 = i10 + 4;
            long j30 = (j23 * j14) + (((long) iArr3[i15]) & 4294967295L) + (j29 >>> 32);
            iArr3[i15] = (int) j30;
            long j31 = j30 >>> 32;
            int i16 = i10 + 5;
            long j32 = (j23 * j15) + (((long) iArr3[i16]) & 4294967295L) + j31;
            iArr3[i16] = (int) j32;
            iArr3[i10 + 6] = (int) (j32 >>> 32);
            j10 = j24;
            i10 = i12;
            j11 = j27;
        }
    }

    public static int d(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10 = 0;
        long j10 = 4294967295L;
        long j11 = ((long) iArr2[0]) & 4294967295L;
        long j12 = ((long) iArr2[1]) & 4294967295L;
        long j13 = ((long) iArr2[2]) & 4294967295L;
        long j14 = ((long) iArr2[3]) & 4294967295L;
        long j15 = ((long) iArr2[4]) & 4294967295L;
        long j16 = ((long) iArr2[5]) & 4294967295L;
        long j17 = 0;
        while (i10 < 6) {
            long j18 = j16;
            long j19 = ((long) iArr[i10]) & j10;
            long j20 = j11;
            long j21 = (((long) iArr3[i10]) & j10) + (j19 * j11);
            iArr3[i10] = (int) j21;
            int i11 = i10 + 1;
            long j22 = (j19 * j12) + (((long) iArr3[i11]) & j10) + (j21 >>> 32);
            iArr3[i11] = (int) j22;
            int i12 = i10 + 2;
            long j23 = (j19 * j13) + (((long) iArr3[i12]) & j10) + (j22 >>> 32);
            iArr3[i12] = (int) j23;
            int i13 = i10 + 3;
            long j24 = (j19 * j14) + (((long) iArr3[i13]) & j10) + (j23 >>> 32);
            iArr3[i13] = (int) j24;
            int i14 = i10 + 4;
            long j25 = (j19 * j15) + (((long) iArr3[i14]) & j10) + (j24 >>> 32);
            iArr3[i14] = (int) j25;
            int i15 = i10 + 5;
            long j26 = (j19 * j18) + (((long) iArr3[i15]) & j10) + (j25 >>> 32);
            iArr3[i15] = (int) j26;
            int i16 = i10 + 6;
            long j27 = j17 + (((long) iArr3[i16]) & j10) + (j26 >>> 32);
            iArr3[i16] = (int) j27;
            j17 = j27 >>> 32;
            i10 = i11;
            j16 = j18;
            j11 = j20;
            j12 = j12;
            j10 = 4294967295L;
        }
        return (int) j17;
    }

    public static int a(int[] iArr, int i10, int[] iArr2, int i11, int i12) {
        long j10 = (((long) iArr[i10]) & 4294967295L) + (((long) iArr2[i11]) & 4294967295L) + (((long) i12) & 4294967295L);
        iArr2[i11] = (int) j10;
        int i13 = i11 + 1;
        long j11 = (((long) iArr[i10 + 1]) & 4294967295L) + (((long) iArr2[i13]) & 4294967295L) + (j10 >>> 32);
        iArr2[i13] = (int) j11;
        int i14 = i11 + 2;
        long j12 = (((long) iArr[i10 + 2]) & 4294967295L) + (((long) iArr2[i14]) & 4294967295L) + (j11 >>> 32);
        iArr2[i14] = (int) j12;
        int i15 = i11 + 3;
        long j13 = (((long) iArr[i10 + 3]) & 4294967295L) + (((long) iArr2[i15]) & 4294967295L) + (j12 >>> 32);
        iArr2[i15] = (int) j13;
        int i16 = i11 + 4;
        long j14 = (((long) iArr[i10 + 4]) & 4294967295L) + (((long) iArr2[i16]) & 4294967295L) + (j13 >>> 32);
        iArr2[i16] = (int) j14;
        int i17 = i11 + 5;
        long j15 = (((long) iArr[i10 + 5]) & 4294967295L) + (4294967295L & ((long) iArr2[i17])) + (j14 >>> 32);
        iArr2[i17] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static long[] b(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 192) {
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

    public static boolean b(int[] iArr, int[] iArr2) {
        for (int i10 = 5; i10 >= 0; i10--) {
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

    public static boolean b(int[] iArr, int i10, int[] iArr2, int i11) {
        for (int i12 = 5; i12 >= 0; i12--) {
            int i13 = iArr[i10 + i12] ^ Integer.MIN_VALUE;
            int i14 = Integer.MIN_VALUE ^ iArr2[i11 + i12];
            if (i13 < i14) {
                return false;
            }
            if (i13 > i14) {
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
        long j13 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j12 >> 32);
        iArr2[3] = (int) j13;
        long j14 = ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j13 >> 32);
        iArr2[4] = (int) j14;
        long j15 = ((((long) iArr2[5]) & 4294967295L) - (4294967295L & ((long) iArr[5]))) + (j14 >> 32);
        iArr2[5] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static boolean b(int[] iArr) {
        for (int i10 = 0; i10 < 6; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(long[] jArr) {
        for (int i10 = 0; i10 < 3; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int a(int[] iArr, int i10, int[] iArr2, int i11) {
        long j10 = (((long) iArr[i10]) & 4294967295L) + (((long) iArr2[i11]) & 4294967295L);
        int i12 = (int) j10;
        iArr[i10] = i12;
        iArr2[i11] = i12;
        int i13 = i10 + 1;
        int i14 = i11 + 1;
        long j11 = (((long) iArr[i13]) & 4294967295L) + (((long) iArr2[i14]) & 4294967295L) + (j10 >>> 32);
        int i15 = (int) j11;
        iArr[i13] = i15;
        iArr2[i14] = i15;
        int i16 = i10 + 2;
        int i17 = i11 + 2;
        long j12 = (((long) iArr[i16]) & 4294967295L) + (((long) iArr2[i17]) & 4294967295L) + (j11 >>> 32);
        int i18 = (int) j12;
        iArr[i16] = i18;
        iArr2[i17] = i18;
        int i19 = i10 + 3;
        int i20 = i11 + 3;
        long j13 = (((long) iArr[i19]) & 4294967295L) + (((long) iArr2[i20]) & 4294967295L) + (j12 >>> 32);
        int i21 = (int) j13;
        iArr[i19] = i21;
        iArr2[i20] = i21;
        int i22 = i10 + 4;
        int i23 = i11 + 4;
        long j14 = (((long) iArr[i22]) & 4294967295L) + (((long) iArr2[i23]) & 4294967295L) + (j13 >>> 32);
        int i24 = (int) j14;
        iArr[i22] = i24;
        iArr2[i23] = i24;
        int i25 = i10 + 5;
        int i26 = i11 + 5;
        long j15 = (((long) iArr[i25]) & 4294967295L) + (4294967295L & ((long) iArr2[i26])) + (j14 >>> 32);
        int i27 = (int) j15;
        iArr[i25] = i27;
        iArr2[i26] = i27;
        return (int) (j15 >>> 32);
    }

    public static void b(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = ((long) iArr2[i11]) & 4294967295L;
        long j11 = ((long) iArr2[i11 + 1]) & 4294967295L;
        long j12 = ((long) iArr2[i11 + 2]) & 4294967295L;
        long j13 = ((long) iArr2[i11 + 3]) & 4294967295L;
        long j14 = ((long) iArr2[i11 + 4]) & 4294967295L;
        long j15 = ((long) iArr2[i11 + 5]) & 4294967295L;
        long j16 = ((long) iArr[i10]) & 4294967295L;
        long j17 = j16 * j10;
        iArr3[i12] = (int) j17;
        long j18 = (j16 * j11) + (j17 >>> 32);
        iArr3[i12 + 1] = (int) j18;
        long j19 = (j16 * j12) + (j18 >>> 32);
        iArr3[i12 + 2] = (int) j19;
        long j20 = (j16 * j13) + (j19 >>> 32);
        iArr3[i12 + 3] = (int) j20;
        long j21 = (j16 * j14) + (j20 >>> 32);
        iArr3[i12 + 4] = (int) j21;
        long j22 = (j16 * j15) + (j21 >>> 32);
        iArr3[i12 + 5] = (int) j22;
        iArr3[i12 + 6] = (int) (j22 >>> 32);
        int i13 = 1;
        int i14 = i12;
        while (i13 < 6) {
            int i15 = i14 + 1;
            long j23 = ((long) iArr[i10 + i13]) & 4294967295L;
            long j24 = j15;
            long j25 = (j23 * j10) + (((long) iArr3[i15]) & 4294967295L);
            iArr3[i15] = (int) j25;
            int i16 = i14 + 2;
            int i17 = i13;
            long j26 = (j23 * j11) + (((long) iArr3[i16]) & 4294967295L) + (j25 >>> 32);
            iArr3[i16] = (int) j26;
            int i18 = i14 + 3;
            long j27 = j12;
            long j28 = (j23 * j12) + (((long) iArr3[i18]) & 4294967295L) + (j26 >>> 32);
            iArr3[i18] = (int) j28;
            long j29 = j28 >>> 32;
            int i19 = i14 + 4;
            int i20 = i14;
            long j30 = (j23 * j13) + (((long) iArr3[i19]) & 4294967295L) + j29;
            iArr3[i19] = (int) j30;
            int i21 = i20 + 5;
            long j31 = (j23 * j14) + (((long) iArr3[i21]) & 4294967295L) + (j30 >>> 32);
            iArr3[i21] = (int) j31;
            int i22 = i20 + 6;
            long j32 = (j23 * j24) + (((long) iArr3[i22]) & 4294967295L) + (j31 >>> 32);
            iArr3[i22] = (int) j32;
            iArr3[i20 + 7] = (int) (j32 >>> 32);
            i13 = i17 + 1;
            i14 = i15;
            j15 = j24;
            j12 = j27;
        }
    }

    public static void c(int[] iArr, int[] iArr2) {
        long j10 = ((long) iArr[0]) & 4294967295L;
        int i10 = 12;
        int i11 = 0;
        int i12 = 5;
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
                long j28 = (j24 * j10) + (jA & 4294967295L);
                int i17 = (int) j28;
                iArr2[3] = (i17 << 1) | (i16 >>> 31);
                long jA2 = androidx.emoji2.text.flatbuffer.a.a(j24, j15, j28 >>> 32, j26);
                long jA3 = androidx.emoji2.text.flatbuffer.a.a(j24, j19, jA2 >>> 32, j25 & 4294967295L);
                long j29 = j27 + (jA3 >>> 32);
                long j30 = jA3 & 4294967295L;
                long j31 = ((long) iArr[4]) & 4294967295L;
                long j32 = (((long) iArr2[7]) & 4294967295L) + (j29 >>> 32);
                long j33 = j29 & 4294967295L;
                long j34 = (((long) iArr2[8]) & 4294967295L) + (j32 >>> 32);
                long j35 = j32 & 4294967295L;
                long j36 = (j31 * j10) + (jA2 & 4294967295L);
                int i18 = (int) j36;
                iArr2[4] = (i18 << 1) | (i17 >>> 31);
                int i19 = i18 >>> 31;
                long jA4 = androidx.emoji2.text.flatbuffer.a.a(j31, j15, j36 >>> 32, j30);
                long jA5 = androidx.emoji2.text.flatbuffer.a.a(j31, j19, jA4 >>> 32, j33);
                long jA6 = androidx.emoji2.text.flatbuffer.a.a(j31, j24, jA5 >>> 32, j35);
                long j37 = jA5 & 4294967295L;
                long j38 = j34 + (jA6 >>> 32);
                long j39 = ((long) iArr[5]) & 4294967295L;
                long j40 = (((long) iArr2[9]) & 4294967295L) + (j38 >>> 32);
                long j41 = j38 & 4294967295L;
                long j42 = (((long) iArr2[10]) & 4294967295L) + (j40 >>> 32);
                long j43 = 4294967295L & j40;
                long j44 = (j39 * j10) + (jA4 & 4294967295L);
                int i20 = (int) j44;
                iArr2[5] = (i20 << 1) | i19;
                long jA7 = androidx.emoji2.text.flatbuffer.a.a(j39, j15, j44 >>> 32, j37);
                long jA8 = androidx.emoji2.text.flatbuffer.a.a(j39, j19, jA7 >>> 32, jA6 & 4294967295L);
                long jA9 = androidx.emoji2.text.flatbuffer.a.a(j39, j24, jA8 >>> 32, j41);
                long jA10 = androidx.emoji2.text.flatbuffer.a.a(j39, j31, jA9 >>> 32, j43);
                long j45 = j42 + (jA10 >>> 32);
                int i21 = (int) jA7;
                iArr2[6] = (i21 << 1) | (i20 >>> 31);
                int i22 = (int) jA8;
                iArr2[7] = (i21 >>> 31) | (i22 << 1);
                int i23 = (int) jA9;
                iArr2[8] = (i23 << 1) | (i22 >>> 31);
                int i24 = (int) jA10;
                iArr2[9] = (i23 >>> 31) | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) j45;
                iArr2[10] = i25 | (i26 << 1);
                iArr2[11] = (i26 >>> 31) | ((iArr2[11] + ((int) (j45 >>> 32))) << 1);
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
        iArr[4] = 0;
        iArr[5] = 0;
    }

    public static boolean a(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        boolean zB = b(iArr, i10, iArr2, i11);
        if (zB) {
            c(iArr, i10, iArr2, i11, iArr3, i12);
        } else {
            c(iArr2, i11, iArr, i10, iArr3, i12);
        }
        return zB;
    }

    public static boolean a(int[] iArr, int[] iArr2) {
        for (int i10 = 5; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(long[] jArr, long[] jArr2) {
        for (int i10 = 2; i10 >= 0; i10--) {
            if (jArr[i10] != jArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] a(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 192) {
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

    public static int a(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else {
            int i12 = i10 >> 5;
            if (i12 < 0 || i12 >= 6) {
                return 0;
            }
            i11 = iArr[i12] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean a(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 6; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 3; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static long a(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j10 = ((long) i10) & 4294967295L;
        long j11 = ((long) iArr[i11]) & 4294967295L;
        long j12 = (j10 * j11) + (((long) iArr2[i12]) & 4294967295L);
        iArr3[i13] = (int) j12;
        long j13 = ((long) iArr[i11 + 1]) & 4294967295L;
        long j14 = (j10 * j13) + j11 + (((long) iArr2[i12 + 1]) & 4294967295L) + (j12 >>> 32);
        iArr3[i13 + 1] = (int) j14;
        long j15 = ((long) iArr[i11 + 2]) & 4294967295L;
        long j16 = (j10 * j15) + j13 + (((long) iArr2[i12 + 2]) & 4294967295L) + (j14 >>> 32);
        iArr3[i13 + 2] = (int) j16;
        long j17 = ((long) iArr[i11 + 3]) & 4294967295L;
        long j18 = (j10 * j17) + j15 + (((long) iArr2[i12 + 3]) & 4294967295L) + (j16 >>> 32);
        iArr3[i13 + 3] = (int) j18;
        long j19 = ((long) iArr[i11 + 4]) & 4294967295L;
        long j20 = (j10 * j19) + j17 + (((long) iArr2[i12 + 4]) & 4294967295L) + (j18 >>> 32);
        iArr3[i13 + 4] = (int) j20;
        long j21 = ((long) iArr[i11 + 5]) & 4294967295L;
        long j22 = (j10 * j21) + j19 + (4294967295L & ((long) iArr2[i12 + 5])) + (j20 >>> 32);
        iArr3[i13 + 5] = (int) j22;
        return (j22 >>> 32) + j21;
    }

    public static void c(int[] iArr, int i10, int[] iArr2, int i11) {
        long j10 = ((long) iArr[i10]) & 4294967295L;
        int i12 = 0;
        int i13 = 12;
        int i14 = 5;
        while (true) {
            int i15 = i14 - 1;
            long j11 = ((long) iArr[i10 + i14]) & 4294967295L;
            long j12 = j11 * j11;
            iArr2[(i13 - 1) + i11] = (i12 << 31) | ((int) (j12 >>> 33));
            i13 -= 2;
            iArr2[i11 + i13] = (int) (j12 >>> 1);
            i12 = (int) j12;
            if (i15 <= 0) {
                long j13 = j10 * j10;
                long j14 = (j13 >>> 33) | (((long) (i12 << 31)) & 4294967295L);
                iArr2[i11] = (int) j13;
                int i16 = ((int) (j13 >>> 32)) & 1;
                long j15 = ((long) iArr[i10 + 1]) & 4294967295L;
                int i17 = i11 + 2;
                long j16 = ((long) iArr2[i17]) & 4294967295L;
                long j17 = j14 + (j15 * j10);
                int i18 = (int) j17;
                iArr2[i11 + 1] = (i18 << 1) | i16;
                int i19 = i18 >>> 31;
                long j18 = j16 + (j17 >>> 32);
                long j19 = ((long) iArr[i10 + 2]) & 4294967295L;
                int i20 = i11 + 3;
                long j20 = ((long) iArr2[i20]) & 4294967295L;
                int i21 = i11 + 4;
                long j21 = ((long) iArr2[i21]) & 4294967295L;
                long j22 = j18 + (j19 * j10);
                int i22 = (int) j22;
                iArr2[i17] = (i22 << 1) | i19;
                long jA = androidx.emoji2.text.flatbuffer.a.a(j19, j15, j22 >>> 32, j20);
                long j23 = j21 + (jA >>> 32);
                long j24 = ((long) iArr[i10 + 3]) & 4294967295L;
                int i23 = i11 + 5;
                long j25 = (((long) iArr2[i23]) & 4294967295L) + (j23 >>> 32);
                long j26 = j23 & 4294967295L;
                int i24 = i11 + 6;
                long j27 = (((long) iArr2[i24]) & 4294967295L) + (j25 >>> 32);
                long j28 = j25 & 4294967295L;
                long j29 = (j24 * j10) + (jA & 4294967295L);
                int i25 = (int) j29;
                iArr2[i20] = (i25 << 1) | (i22 >>> 31);
                long jA2 = androidx.emoji2.text.flatbuffer.a.a(j24, j15, j29 >>> 32, j26);
                long jA3 = androidx.emoji2.text.flatbuffer.a.a(j24, j19, jA2 >>> 32, j28);
                long j30 = j27 + (jA3 >>> 32);
                long j31 = jA3 & 4294967295L;
                long j32 = ((long) iArr[i10 + 4]) & 4294967295L;
                int i26 = i11 + 7;
                long j33 = (((long) iArr2[i26]) & 4294967295L) + (j30 >>> 32);
                long j34 = j30 & 4294967295L;
                int i27 = i11 + 8;
                long j35 = (((long) iArr2[i27]) & 4294967295L) + (j33 >>> 32);
                long j36 = j33 & 4294967295L;
                long j37 = (j32 * j10) + (jA2 & 4294967295L);
                int i28 = (int) j37;
                iArr2[i21] = (i25 >>> 31) | (i28 << 1);
                int i29 = i28 >>> 31;
                long jA4 = androidx.emoji2.text.flatbuffer.a.a(j32, j15, j37 >>> 32, j31);
                long jA5 = androidx.emoji2.text.flatbuffer.a.a(j32, j19, jA4 >>> 32, j34);
                long jA6 = androidx.emoji2.text.flatbuffer.a.a(j32, j24, jA5 >>> 32, j36);
                long j38 = jA5 & 4294967295L;
                long j39 = j35 + (jA6 >>> 32);
                long j40 = ((long) iArr[i10 + 5]) & 4294967295L;
                int i30 = i11 + 9;
                long j41 = (((long) iArr2[i30]) & 4294967295L) + (j39 >>> 32);
                long j42 = j39 & 4294967295L;
                int i31 = i11 + 10;
                long j43 = (((long) iArr2[i31]) & 4294967295L) + (j41 >>> 32);
                long j44 = (j10 * j40) + (jA4 & 4294967295L);
                int i32 = (int) j44;
                iArr2[i23] = i29 | (i32 << 1);
                int i33 = i32 >>> 31;
                long jA7 = androidx.emoji2.text.flatbuffer.a.a(j40, j15, j44 >>> 32, j38);
                long jA8 = androidx.emoji2.text.flatbuffer.a.a(j40, j19, jA7 >>> 32, jA6 & 4294967295L);
                long jA9 = androidx.emoji2.text.flatbuffer.a.a(j40, j24, jA8 >>> 32, j42);
                long jA10 = androidx.emoji2.text.flatbuffer.a.a(j40, j32, jA9 >>> 32, 4294967295L & j41);
                long j45 = j43 + (jA10 >>> 32);
                int i34 = (int) jA7;
                iArr2[i24] = (i34 << 1) | i33;
                int i35 = (int) jA8;
                iArr2[i26] = (i34 >>> 31) | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) jA9;
                iArr2[i27] = i36 | (i37 << 1);
                int i38 = i37 >>> 31;
                int i39 = (int) jA10;
                iArr2[i30] = i38 | (i39 << 1);
                int i40 = i39 >>> 31;
                int i41 = (int) j45;
                iArr2[i31] = i40 | (i41 << 1);
                int i42 = i41 >>> 31;
                int i43 = i11 + 11;
                iArr2[i43] = i42 | ((iArr2[i43] + ((int) (j45 >>> 32))) << 1);
                return;
            }
            i14 = i15;
        }
    }

    public static int a(int i10, long j10, int[] iArr, int i11) {
        long j11 = ((long) i10) & 4294967295L;
        long j12 = j10 & 4294967295L;
        long j13 = (j11 * j12) + (((long) iArr[i11]) & 4294967295L);
        iArr[i11] = (int) j13;
        long j14 = j10 >>> 32;
        long j15 = (j11 * j14) + j12;
        int i12 = i11 + 1;
        long j16 = j15 + (((long) iArr[i12]) & 4294967295L) + (j13 >>> 32);
        iArr[i12] = (int) j16;
        int i13 = i11 + 2;
        long j17 = j14 + (((long) iArr[i13]) & 4294967295L) + (j16 >>> 32);
        iArr[i13] = (int) j17;
        int i14 = i11 + 3;
        long j18 = (j17 >>> 32) + (((long) iArr[i14]) & 4294967295L);
        iArr[i14] = (int) j18;
        if ((j18 >>> 32) == 0) {
            return 0;
        }
        return e4.a(6, iArr, i11, 4);
    }

    public static int a(int i10, int i11, int[] iArr, int i12) {
        long j10 = ((long) i10) & 4294967295L;
        long j11 = ((long) i11) & 4294967295L;
        long j12 = (j10 * j11) + (((long) iArr[i12]) & 4294967295L);
        iArr[i12] = (int) j12;
        int i13 = i12 + 1;
        long j13 = j11 + (((long) iArr[i13]) & 4294967295L) + (j12 >>> 32);
        iArr[i13] = (int) j13;
        int i14 = i12 + 2;
        long j14 = (j13 >>> 32) + (((long) iArr[i14]) & 4294967295L);
        iArr[i14] = (int) j14;
        if ((j14 >>> 32) == 0) {
            return 0;
        }
        return e4.a(6, iArr, i12, 3);
    }

    public static int c(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = (((long) iArr[i10]) & 4294967295L) - (((long) iArr2[i11]) & 4294967295L);
        iArr3[i12] = (int) j10;
        long j11 = ((((long) iArr[i10 + 1]) & 4294967295L) - (((long) iArr2[i11 + 1]) & 4294967295L)) + (j10 >> 32);
        iArr3[i12 + 1] = (int) j11;
        long j12 = ((((long) iArr[i10 + 2]) & 4294967295L) - (((long) iArr2[i11 + 2]) & 4294967295L)) + (j11 >> 32);
        iArr3[i12 + 2] = (int) j12;
        long j13 = ((((long) iArr[i10 + 3]) & 4294967295L) - (((long) iArr2[i11 + 3]) & 4294967295L)) + (j12 >> 32);
        iArr3[i12 + 3] = (int) j13;
        long j14 = ((((long) iArr[i10 + 4]) & 4294967295L) - (((long) iArr2[i11 + 4]) & 4294967295L)) + (j13 >> 32);
        iArr3[i12 + 4] = (int) j14;
        long j15 = ((((long) iArr[i10 + 5]) & 4294967295L) - (((long) iArr2[i11 + 5]) & 4294967295L)) + (j14 >> 32);
        iArr3[i12 + 5] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static BigInteger c(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                k4.a(i11, bArr, (5 - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger c(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i10 = 0; i10 < 3; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                k4.a(j10, bArr, (2 - i10) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }
}
