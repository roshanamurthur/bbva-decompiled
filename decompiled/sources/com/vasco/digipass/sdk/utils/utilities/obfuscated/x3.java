package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public abstract class x3 {
    public static int[] a() {
        return new int[7];
    }

    public static int[] b() {
        return new int[14];
    }

    public static boolean c(int[] iArr, int[] iArr2) {
        for (int i10 = 6; i10 >= 0; i10--) {
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

    public static int d(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((long) iArr2[0]) & 4294967295L;
        long j11 = ((long) iArr2[1]) & 4294967295L;
        long j12 = ((long) iArr2[2]) & 4294967295L;
        long j13 = ((long) iArr2[3]) & 4294967295L;
        long j14 = ((long) iArr2[4]) & 4294967295L;
        long j15 = ((long) iArr2[5]) & 4294967295L;
        long j16 = ((long) iArr2[6]) & 4294967295L;
        long j17 = 0;
        int i10 = 0;
        while (i10 < 7) {
            long j18 = j16;
            long j19 = ((long) iArr[i10]) & 4294967295L;
            long j20 = j15;
            long j21 = (((long) iArr3[i10]) & 4294967295L) + (j19 * j10);
            iArr3[i10] = (int) j21;
            int i11 = i10 + 1;
            long j22 = j11;
            long j23 = (j19 * j11) + (((long) iArr3[i11]) & 4294967295L) + (j21 >>> 32);
            iArr3[i11] = (int) j23;
            int i12 = i10 + 2;
            long j24 = (j19 * j12) + (((long) iArr3[i12]) & 4294967295L) + (j23 >>> 32);
            iArr3[i12] = (int) j24;
            int i13 = i10 + 3;
            long j25 = (j19 * j13) + (((long) iArr3[i13]) & 4294967295L) + (j24 >>> 32);
            iArr3[i13] = (int) j25;
            int i14 = i10 + 4;
            long j26 = (j19 * j14) + (((long) iArr3[i14]) & 4294967295L) + (j25 >>> 32);
            iArr3[i14] = (int) j26;
            int i15 = i10 + 5;
            long j27 = (j19 * j20) + (((long) iArr3[i15]) & 4294967295L) + (j26 >>> 32);
            iArr3[i15] = (int) j27;
            int i16 = i10 + 6;
            long j28 = (j19 * j18) + (((long) iArr3[i16]) & 4294967295L) + (j27 >>> 32);
            iArr3[i16] = (int) j28;
            int i17 = i10 + 7;
            long j29 = j17 + (((long) iArr3[i17]) & 4294967295L) + (j28 >>> 32);
            iArr3[i17] = (int) j29;
            j17 = j29 >>> 32;
            i10 = i11;
            j16 = j18;
            j15 = j20;
            j11 = j22;
            j12 = j12;
        }
        return (int) j17;
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
        long j16 = ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L)) + (j15 >> 32);
        iArr3[6] = (int) j16;
        return (int) (j16 >> 32);
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
        long j16 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        return (int) (j16 >>> 32);
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
        long j16 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((long) iArr2[0]) & 4294967295L;
        long j11 = ((long) iArr2[1]) & 4294967295L;
        long j12 = ((long) iArr2[2]) & 4294967295L;
        long j13 = ((long) iArr2[3]) & 4294967295L;
        long j14 = ((long) iArr2[4]) & 4294967295L;
        long j15 = ((long) iArr2[5]) & 4294967295L;
        long j16 = ((long) iArr2[6]) & 4294967295L;
        long j17 = ((long) iArr[0]) & 4294967295L;
        long j18 = j17 * j10;
        iArr3[0] = (int) j18;
        long j19 = (j17 * j11) + (j18 >>> 32);
        iArr3[1] = (int) j19;
        long j20 = (j17 * j12) + (j19 >>> 32);
        iArr3[2] = (int) j20;
        long j21 = (j17 * j13) + (j20 >>> 32);
        iArr3[3] = (int) j21;
        long j22 = (j17 * j14) + (j21 >>> 32);
        iArr3[4] = (int) j22;
        long j23 = (j17 * j15) + (j22 >>> 32);
        iArr3[5] = (int) j23;
        long j24 = (j17 * j16) + (j23 >>> 32);
        iArr3[6] = (int) j24;
        iArr3[7] = (int) (j24 >>> 32);
        int i10 = 1;
        for (int i11 = 7; i10 < i11; i11 = 7) {
            long j25 = ((long) iArr[i10]) & 4294967295L;
            long j26 = j10;
            long j27 = (j25 * j10) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j27;
            int i12 = i10 + 1;
            long j28 = (j25 * j11) + (((long) iArr3[i12]) & 4294967295L) + (j27 >>> 32);
            iArr3[i12] = (int) j28;
            int i13 = i10 + 2;
            long j29 = j11;
            long j30 = (j25 * j12) + (((long) iArr3[i13]) & 4294967295L) + (j28 >>> 32);
            iArr3[i13] = (int) j30;
            int i14 = i10 + 3;
            long j31 = (j25 * j13) + (((long) iArr3[i14]) & 4294967295L) + (j30 >>> 32);
            iArr3[i14] = (int) j31;
            int i15 = i10 + 4;
            long j32 = (j25 * j14) + (((long) iArr3[i15]) & 4294967295L) + (j31 >>> 32);
            iArr3[i15] = (int) j32;
            int i16 = i10 + 5;
            long j33 = (j25 * j15) + (((long) iArr3[i16]) & 4294967295L) + (j32 >>> 32);
            iArr3[i16] = (int) j33;
            long j34 = j33 >>> 32;
            int i17 = i10 + 6;
            long j35 = (j25 * j16) + (((long) iArr3[i17]) & 4294967295L) + j34;
            iArr3[i17] = (int) j35;
            iArr3[i10 + 7] = (int) (j35 >>> 32);
            j10 = j26;
            i10 = i12;
            j11 = j29;
        }
    }

    public static int e(int[] iArr, int[] iArr2) {
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
        long j15 = ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j14 >> 32);
        iArr2[5] = (int) j15;
        long j16 = ((((long) iArr2[6]) & 4294967295L) - (4294967295L & ((long) iArr[6]))) + (j15 >> 32);
        iArr2[6] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static void a(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static boolean b(int[] iArr, int[] iArr2) {
        for (int i10 = 6; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(int[] iArr) {
        for (int i10 = 0; i10 < 7; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] a(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 224) {
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

    public static void d(int[] iArr, int[] iArr2) {
        long j10 = ((long) iArr[0]) & 4294967295L;
        int i10 = 14;
        int i11 = 0;
        int i12 = 6;
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
                long j26 = (((long) iArr2[6]) & 4294967295L) + (j25 >>> 32);
                long j27 = (j24 * j10) + (jA & 4294967295L);
                int i17 = (int) j27;
                iArr2[3] = (i17 << 1) | (i16 >>> 31);
                long jA2 = androidx.emoji2.text.flatbuffer.a.a(j24, j15, j27 >>> 32, j23 & 4294967295L);
                long jA3 = androidx.emoji2.text.flatbuffer.a.a(j24, j19, jA2 >>> 32, j25 & 4294967295L);
                long j28 = j26 + (jA3 >>> 32);
                long j29 = jA3 & 4294967295L;
                long j30 = ((long) iArr[4]) & 4294967295L;
                long j31 = (((long) iArr2[7]) & 4294967295L) + (j28 >>> 32);
                long j32 = (((long) iArr2[8]) & 4294967295L) + (j31 >>> 32);
                long j33 = j31 & 4294967295L;
                long j34 = (j30 * j10) + (jA2 & 4294967295L);
                int i18 = (int) j34;
                iArr2[4] = (i17 >>> 31) | (i18 << 1);
                long jA4 = androidx.emoji2.text.flatbuffer.a.a(j30, j15, j34 >>> 32, j29);
                long jA5 = androidx.emoji2.text.flatbuffer.a.a(j30, j19, jA4 >>> 32, j28 & 4294967295L);
                long j35 = jA4 & 4294967295L;
                long jA6 = androidx.emoji2.text.flatbuffer.a.a(j30, j24, jA5 >>> 32, j33);
                long j36 = jA5 & 4294967295L;
                long j37 = j32 + (jA6 >>> 32);
                long j38 = jA6 & 4294967295L;
                long j39 = ((long) iArr[5]) & 4294967295L;
                long j40 = (((long) iArr2[9]) & 4294967295L) + (j37 >>> 32);
                long j41 = (((long) iArr2[10]) & 4294967295L) + (j40 >>> 32);
                long j42 = j40 & 4294967295L;
                long j43 = (j39 * j10) + j35;
                int i19 = (int) j43;
                iArr2[5] = (i19 << 1) | (i18 >>> 31);
                int i20 = i19 >>> 31;
                long jA7 = androidx.emoji2.text.flatbuffer.a.a(j39, j15, j43 >>> 32, j36);
                long jA8 = androidx.emoji2.text.flatbuffer.a.a(j39, j19, jA7 >>> 32, j38);
                long jA9 = androidx.emoji2.text.flatbuffer.a.a(j39, j24, jA8 >>> 32, j37 & 4294967295L);
                long j44 = jA8 & 4294967295L;
                long jA10 = androidx.emoji2.text.flatbuffer.a.a(j39, j30, jA9 >>> 32, j42);
                long j45 = j41 + (jA10 >>> 32);
                long j46 = ((long) iArr[6]) & 4294967295L;
                long j47 = (((long) iArr2[11]) & 4294967295L) + (j45 >>> 32);
                long j48 = j45 & 4294967295L;
                long j49 = (((long) iArr2[12]) & 4294967295L) + (j47 >>> 32);
                long j50 = 4294967295L & j47;
                long j51 = (j46 * j10) + (jA7 & 4294967295L);
                int i21 = (int) j51;
                iArr2[6] = (i21 << 1) | i20;
                int i22 = i21 >>> 31;
                long jA11 = androidx.emoji2.text.flatbuffer.a.a(j46, j15, j51 >>> 32, j44);
                long jA12 = androidx.emoji2.text.flatbuffer.a.a(j46, j19, jA11 >>> 32, jA9 & 4294967295L);
                long jA13 = androidx.emoji2.text.flatbuffer.a.a(j46, j24, jA12 >>> 32, jA10 & 4294967295L);
                long jA14 = androidx.emoji2.text.flatbuffer.a.a(j46, j30, jA13 >>> 32, j48);
                long jA15 = androidx.emoji2.text.flatbuffer.a.a(j46, j39, jA14 >>> 32, j50);
                long j52 = j49 + (jA15 >>> 32);
                int i23 = (int) jA11;
                iArr2[7] = (i23 << 1) | i22;
                int i24 = (int) jA12;
                iArr2[8] = (i23 >>> 31) | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) jA13;
                iArr2[9] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) jA14;
                iArr2[10] = i27 | (i28 << 1);
                int i29 = (int) jA15;
                iArr2[11] = (i29 << 1) | (i28 >>> 31);
                int i30 = (int) j52;
                iArr2[12] = (i29 >>> 31) | (i30 << 1);
                iArr2[13] = (i30 >>> 31) | ((iArr2[13] + ((int) (j52 >>> 32))) << 1);
                return;
            }
            i12 = i13;
        }
    }

    public static int a(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else {
            int i12 = i10 >> 5;
            if (i12 < 0 || i12 >= 7) {
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
        for (int i10 = 1; i10 < 7; i10++) {
            if (iArr[i10] != 0) {
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
        long j22 = (j10 * j21) + j19 + (((long) iArr2[i12 + 5]) & 4294967295L) + (j20 >>> 32);
        iArr3[i13 + 5] = (int) j22;
        long j23 = ((long) iArr[i11 + 6]) & 4294967295L;
        long j24 = (j10 * j23) + j21 + (4294967295L & ((long) iArr2[i12 + 6])) + (j22 >>> 32);
        iArr3[i13 + 6] = (int) j24;
        return (j24 >>> 32) + j23;
    }

    public static BigInteger c(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i10 = 0; i10 < 7; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                k4.a(i11, bArr, (6 - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
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
        return e4.a(7, iArr, i11, 4);
    }

    public static void d(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
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
        return e4.a(7, iArr, i12, 3);
    }
}
