package org.bouncycastle.math.raw;

import androidx.emoji2.text.flatbuffer.a;
import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Nat160 {
    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j14 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j14 >>> 32);
    }

    public static int addTo(int[] iArr, int i10, int[] iArr2, int i11, int i12) {
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
        long j14 = (((long) iArr[i10 + 4]) & 4294967295L) + (4294967295L & ((long) iArr2[i16])) + (j13 >>> 32);
        iArr2[i16] = (int) j14;
        return (int) (j14 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i10, int[] iArr2, int i11) {
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
        long j14 = (((long) iArr[i22]) & 4294967295L) + (4294967295L & ((long) iArr2[i23])) + (j13 >>> 32);
        int i24 = (int) j14;
        iArr[i22] = i24;
        iArr2[i23] = i24;
        return (int) (j14 >>> 32);
    }

    public static void copy(int[] iArr, int i10, int[] iArr2, int i11) {
        iArr2[i11] = iArr[i10];
        iArr2[i11 + 1] = iArr[i10 + 1];
        iArr2[i11 + 2] = iArr[i10 + 2];
        iArr2[i11 + 3] = iArr[i10 + 3];
        iArr2[i11 + 4] = iArr[i10 + 4];
    }

    public static int[] create() {
        return new int[5];
    }

    public static int[] createExt() {
        return new int[10];
    }

    public static boolean diff(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        boolean zGte = gte(iArr, i10, iArr2, i11);
        if (zGte) {
            sub(iArr, i10, iArr2, i11, iArr3, i12);
        } else {
            sub(iArr2, i11, iArr, i10, iArr3, i12);
        }
        return zGte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i10 = 4; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            throw new IllegalArgumentException();
        }
        int[] iArrCreate = create();
        int i10 = 0;
        while (bigInteger.signum() != 0) {
            iArrCreate[i10] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i10++;
        }
        return iArrCreate;
    }

    public static int getBit(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else {
            int i12 = i10 >> 5;
            if (i12 < 0 || i12 >= 5) {
                return 0;
            }
            i11 = iArr[i12] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean gte(int[] iArr, int i10, int[] iArr2, int i11) {
        for (int i12 = 4; i12 >= 0; i12--) {
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

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 5; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i10 = 0; i10 < 5; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = ((long) iArr2[i11]) & 4294967295L;
        long j11 = ((long) iArr2[i11 + 1]) & 4294967295L;
        long j12 = ((long) iArr2[i11 + 2]) & 4294967295L;
        long j13 = ((long) iArr2[i11 + 3]) & 4294967295L;
        long j14 = ((long) iArr2[i11 + 4]) & 4294967295L;
        long j15 = ((long) iArr[i10]) & 4294967295L;
        long j16 = j15 * j10;
        iArr3[i12] = (int) j16;
        long j17 = (j15 * j11) + (j16 >>> 32);
        iArr3[i12 + 1] = (int) j17;
        long j18 = (j15 * j12) + (j17 >>> 32);
        iArr3[i12 + 2] = (int) j18;
        long j19 = (j15 * j13) + (j18 >>> 32);
        iArr3[i12 + 3] = (int) j19;
        long j20 = (j15 * j14) + (j19 >>> 32);
        iArr3[i12 + 4] = (int) j20;
        iArr3[i12 + 5] = (int) (j20 >>> 32);
        int i13 = 1;
        int i14 = i12;
        while (i13 < 5) {
            int i15 = i14 + 1;
            long j21 = ((long) iArr[i10 + i13]) & 4294967295L;
            long j22 = j10;
            long j23 = (j21 * j10) + (((long) iArr3[i15]) & 4294967295L);
            iArr3[i15] = (int) j23;
            int i16 = i14 + 2;
            int i17 = i13;
            long j24 = (j21 * j11) + (((long) iArr3[i16]) & 4294967295L) + (j23 >>> 32);
            iArr3[i16] = (int) j24;
            int i18 = i14 + 3;
            long j25 = j12;
            long j26 = (j21 * j12) + (((long) iArr3[i18]) & 4294967295L) + (j24 >>> 32);
            iArr3[i18] = (int) j26;
            int i19 = i14 + 4;
            long j27 = (j21 * j13) + (((long) iArr3[i19]) & 4294967295L) + (j26 >>> 32);
            iArr3[i19] = (int) j27;
            long j28 = j27 >>> 32;
            int i20 = i14 + 5;
            long j29 = (j21 * j14) + (((long) iArr3[i20]) & 4294967295L) + j28;
            iArr3[i20] = (int) j29;
            iArr3[i14 + 6] = (int) (j29 >>> 32);
            i13 = i17 + 1;
            i14 = i15;
            j10 = j22;
            j12 = j25;
        }
    }

    public static long mul33Add(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
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
        long j20 = (j10 * j19) + j17 + (4294967295L & ((long) iArr2[i12 + 4])) + (j18 >>> 32);
        iArr3[i13 + 4] = (int) j20;
        return (j20 >>> 32) + j19;
    }

    public static int mul33DWordAdd(int i10, long j10, int[] iArr, int i11) {
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
        return Nat.incAt(5, iArr, i11, 4);
    }

    public static int mul33WordAdd(int i10, int i11, int[] iArr, int i12) {
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
        return Nat.incAt(5, iArr, i12, 3);
    }

    public static int mulAddTo(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = ((long) iArr2[i11]) & 4294967295L;
        long j11 = ((long) iArr2[i11 + 1]) & 4294967295L;
        long j12 = ((long) iArr2[i11 + 2]) & 4294967295L;
        long j13 = ((long) iArr2[i11 + 3]) & 4294967295L;
        long j14 = ((long) iArr2[i11 + 4]) & 4294967295L;
        int i13 = 0;
        long j15 = 0;
        int i14 = i12;
        while (i13 < 5) {
            long j16 = ((long) iArr[i10 + i13]) & 4294967295L;
            long j17 = j10;
            long j18 = (j16 * j10) + (((long) iArr3[i14]) & 4294967295L);
            iArr3[i14] = (int) j18;
            int i15 = i14 + 1;
            long j19 = (j16 * j11) + (((long) iArr3[i15]) & 4294967295L) + (j18 >>> 32);
            iArr3[i15] = (int) j19;
            int i16 = i14 + 2;
            long j20 = (j16 * j12) + (((long) iArr3[i16]) & 4294967295L) + (j19 >>> 32);
            iArr3[i16] = (int) j20;
            int i17 = i14 + 3;
            long j21 = (j16 * j13) + (((long) iArr3[i17]) & 4294967295L) + (j20 >>> 32);
            iArr3[i17] = (int) j21;
            int i18 = i14 + 4;
            long j22 = (j16 * j14) + (((long) iArr3[i18]) & 4294967295L) + (j21 >>> 32);
            iArr3[i18] = (int) j22;
            int i19 = i14 + 5;
            long j23 = (j22 >>> 32) + (((long) iArr3[i19]) & 4294967295L) + j15;
            iArr3[i19] = (int) j23;
            j15 = j23 >>> 32;
            i13++;
            i14 = i15;
            j10 = j17;
            j11 = j11;
        }
        return (int) j15;
    }

    public static int mulWord(int i10, int[] iArr, int[] iArr2, int i11) {
        long j10 = ((long) i10) & 4294967295L;
        long j11 = 0;
        int i12 = 0;
        do {
            long j12 = ((((long) iArr[i12]) & 4294967295L) * j10) + j11;
            iArr2[i11 + i12] = (int) j12;
            j11 = j12 >>> 32;
            i12++;
        } while (i12 < 5);
        return (int) j11;
    }

    public static int mulWordAddExt(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        long j10 = ((long) i10) & 4294967295L;
        long j11 = ((((long) iArr[i11]) & 4294967295L) * j10) + (((long) iArr2[i12]) & 4294967295L);
        iArr2[i12] = (int) j11;
        int i13 = i12 + 1;
        long j12 = ((((long) iArr[i11 + 1]) & 4294967295L) * j10) + (((long) iArr2[i13]) & 4294967295L) + (j11 >>> 32);
        iArr2[i13] = (int) j12;
        int i14 = i12 + 2;
        long j13 = ((((long) iArr[i11 + 2]) & 4294967295L) * j10) + (((long) iArr2[i14]) & 4294967295L) + (j12 >>> 32);
        iArr2[i14] = (int) j13;
        int i15 = i12 + 3;
        long j14 = ((((long) iArr[i11 + 3]) & 4294967295L) * j10) + (((long) iArr2[i15]) & 4294967295L) + (j13 >>> 32);
        iArr2[i15] = (int) j14;
        int i16 = i12 + 4;
        long j15 = (j10 * (((long) iArr[i11 + 4]) & 4294967295L)) + (((long) iArr2[i16]) & 4294967295L) + (j14 >>> 32);
        iArr2[i16] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int mulWordDwordAdd(int i10, long j10, int[] iArr, int i11) {
        long j11 = ((long) i10) & 4294967295L;
        long j12 = ((j10 & 4294967295L) * j11) + (((long) iArr[i11]) & 4294967295L);
        iArr[i11] = (int) j12;
        long j13 = j11 * (j10 >>> 32);
        int i12 = i11 + 1;
        long j14 = j13 + (((long) iArr[i12]) & 4294967295L) + (j12 >>> 32);
        iArr[i12] = (int) j14;
        long j15 = j14 >>> 32;
        int i13 = i11 + 2;
        long j16 = j15 + (((long) iArr[i13]) & 4294967295L);
        iArr[i13] = (int) j16;
        if ((j16 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(5, iArr, i11, 3);
    }

    public static int mulWordsAdd(int i10, int i11, int[] iArr, int i12) {
        long j10 = ((((long) i11) & 4294967295L) * (((long) i10) & 4294967295L)) + (((long) iArr[i12]) & 4294967295L);
        iArr[i12] = (int) j10;
        int i13 = i12 + 1;
        long j11 = (j10 >>> 32) + (4294967295L & ((long) iArr[i13]));
        iArr[i13] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(5, iArr, i12, 2);
    }

    public static void square(int[] iArr, int i10, int[] iArr2, int i11) {
        long j10 = ((long) iArr[i10]) & 4294967295L;
        int i12 = 0;
        int i13 = 10;
        int i14 = 4;
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
                long jA = a.a(j19, j15, j22 >>> 32, j20);
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
                long jA2 = a.a(j24, j15, j29 >>> 32, j26);
                long jA3 = a.a(j24, j19, jA2 >>> 32, j28);
                long j30 = j27 + (jA3 >>> 32);
                long j31 = jA3 & 4294967295L;
                long j32 = ((long) iArr[i10 + 4]) & 4294967295L;
                int i26 = i11 + 7;
                long j33 = (((long) iArr2[i26]) & 4294967295L) + (j30 >>> 32);
                long j34 = j30 & 4294967295L;
                int i27 = i11 + 8;
                long j35 = (((long) iArr2[i27]) & 4294967295L) + (j33 >>> 32);
                long j36 = (j10 * j32) + (jA2 & 4294967295L);
                int i28 = (int) j36;
                iArr2[i21] = (i28 << 1) | (i25 >>> 31);
                long jA4 = a.a(j32, j15, j36 >>> 32, j31);
                long jA5 = a.a(j32, j19, jA4 >>> 32, j34);
                long jA6 = a.a(j32, j24, jA5 >>> 32, j33 & 4294967295L);
                long j37 = j35 + (jA6 >>> 32);
                int i29 = (int) jA4;
                iArr2[i23] = (i29 << 1) | (i28 >>> 31);
                int i30 = (int) jA5;
                iArr2[i24] = (i29 >>> 31) | (i30 << 1);
                int i31 = i30 >>> 31;
                int i32 = (int) jA6;
                iArr2[i26] = i31 | (i32 << 1);
                int i33 = i32 >>> 31;
                int i34 = (int) j37;
                iArr2[i27] = i33 | (i34 << 1);
                int i35 = i34 >>> 31;
                int i36 = i11 + 9;
                iArr2[i36] = i35 | ((iArr2[i36] + ((int) (j37 >>> 32))) << 1);
                return;
            }
            i14 = i15;
        }
    }

    public static int sub(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
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
        return (int) (j14 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((((long) iArr3[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = (((((long) iArr3[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) - (((long) iArr2[1]) & 4294967295L)) + (j10 >> 32);
        iArr3[1] = (int) j11;
        long j12 = (((((long) iArr3[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) - (((long) iArr2[2]) & 4294967295L)) + (j11 >> 32);
        iArr3[2] = (int) j12;
        long j13 = (((((long) iArr3[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) - (((long) iArr2[3]) & 4294967295L)) + (j12 >> 32);
        iArr3[3] = (int) j13;
        long j14 = (((((long) iArr3[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) - (((long) iArr2[4]) & 4294967295L)) + (j13 >> 32);
        iArr3[4] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static int subFrom(int[] iArr, int i10, int[] iArr2, int i11) {
        long j10 = (((long) iArr2[i11]) & 4294967295L) - (((long) iArr[i10]) & 4294967295L);
        iArr2[i11] = (int) j10;
        int i12 = i11 + 1;
        long j11 = ((((long) iArr2[i12]) & 4294967295L) - (((long) iArr[i10 + 1]) & 4294967295L)) + (j10 >> 32);
        iArr2[i12] = (int) j11;
        int i13 = i11 + 2;
        long j12 = ((((long) iArr2[i13]) & 4294967295L) - (((long) iArr[i10 + 2]) & 4294967295L)) + (j11 >> 32);
        iArr2[i13] = (int) j12;
        int i14 = i11 + 3;
        long j13 = ((((long) iArr2[i14]) & 4294967295L) - (((long) iArr[i10 + 3]) & 4294967295L)) + (j12 >> 32);
        iArr2[i14] = (int) j13;
        int i15 = i11 + 4;
        long j14 = ((((long) iArr2[i15]) & 4294967295L) - (((long) iArr[i10 + 4]) & 4294967295L)) + (j13 >> 32);
        iArr2[i15] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i10 = 0; i10 < 5; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                Pack.intToBigEndian(i11, bArr, (4 - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j10 >>> 32);
        iArr2[1] = (int) j11;
        long j12 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j11 >>> 32);
        iArr2[2] = (int) j12;
        long j13 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j12 >>> 32);
        iArr2[3] = (int) j13;
        long j14 = (((long) iArr[4]) & 4294967295L) + (4294967295L & ((long) iArr2[4])) + (j13 >>> 32);
        iArr2[4] = (int) j14;
        return (int) (j14 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i10 = 4; i10 >= 0; i10--) {
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

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((long) iArr2[0]) & 4294967295L;
        int i10 = 1;
        long j11 = ((long) iArr2[1]) & 4294967295L;
        long j12 = ((long) iArr2[2]) & 4294967295L;
        long j13 = ((long) iArr2[3]) & 4294967295L;
        long j14 = ((long) iArr2[4]) & 4294967295L;
        long j15 = ((long) iArr[0]) & 4294967295L;
        long j16 = j15 * j10;
        iArr3[0] = (int) j16;
        long j17 = (j15 * j11) + (j16 >>> 32);
        iArr3[1] = (int) j17;
        long j18 = (j15 * j12) + (j17 >>> 32);
        iArr3[2] = (int) j18;
        long j19 = (j15 * j13) + (j18 >>> 32);
        iArr3[3] = (int) j19;
        long j20 = (j15 * j14) + (j19 >>> 32);
        iArr3[4] = (int) j20;
        iArr3[5] = (int) (j20 >>> 32);
        for (int i11 = 5; i10 < i11; i11 = 5) {
            long j21 = ((long) iArr[i10]) & 4294967295L;
            long j22 = j10;
            long j23 = (j21 * j10) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j23;
            int i12 = i10 + 1;
            long j24 = (j21 * j11) + (((long) iArr3[i12]) & 4294967295L) + (j23 >>> 32);
            iArr3[i12] = (int) j24;
            int i13 = i10 + 2;
            long j25 = j11;
            long j26 = (j21 * j12) + (((long) iArr3[i13]) & 4294967295L) + (j24 >>> 32);
            iArr3[i13] = (int) j26;
            int i14 = i10 + 3;
            long j27 = (j21 * j13) + (((long) iArr3[i14]) & 4294967295L) + (j26 >>> 32);
            iArr3[i14] = (int) j27;
            long j28 = j27 >>> 32;
            int i15 = i10 + 4;
            long j29 = (j21 * j14) + (((long) iArr3[i15]) & 4294967295L) + j28;
            iArr3[i15] = (int) j29;
            iArr3[i10 + 5] = (int) (j29 >>> 32);
            j10 = j22;
            i10 = i12;
            j11 = j25;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10 = 0;
        long j10 = ((long) iArr2[0]) & 4294967295L;
        long j11 = ((long) iArr2[1]) & 4294967295L;
        long j12 = ((long) iArr2[2]) & 4294967295L;
        long j13 = ((long) iArr2[3]) & 4294967295L;
        long j14 = ((long) iArr2[4]) & 4294967295L;
        long j15 = 0;
        while (i10 < 5) {
            long j16 = j15;
            long j17 = ((long) iArr[i10]) & 4294967295L;
            long j18 = j10;
            long j19 = (j17 * j10) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j19;
            int i11 = i10 + 1;
            long j20 = j11;
            long j21 = (j17 * j11) + (((long) iArr3[i11]) & 4294967295L) + (j19 >>> 32);
            iArr3[i11] = (int) j21;
            int i12 = i10 + 2;
            long j22 = (j17 * j12) + (((long) iArr3[i12]) & 4294967295L) + (j21 >>> 32);
            iArr3[i12] = (int) j22;
            int i13 = i10 + 3;
            long j23 = (j17 * j13) + (((long) iArr3[i13]) & 4294967295L) + (j22 >>> 32);
            iArr3[i13] = (int) j23;
            int i14 = i10 + 4;
            long j24 = (j17 * j14) + (((long) iArr3[i14]) & 4294967295L) + (j23 >>> 32);
            iArr3[i14] = (int) j24;
            int i15 = i10 + 5;
            long j25 = (j24 >>> 32) + (((long) iArr3[i15]) & 4294967295L) + j16;
            iArr3[i15] = (int) j25;
            j15 = j25 >>> 32;
            j10 = j18;
            i10 = i11;
            j11 = j20;
        }
        return (int) j15;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j10 = ((long) iArr[0]) & 4294967295L;
        int i10 = 10;
        int i11 = 0;
        int i12 = 4;
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
                long j18 = j16 + (j17 >>> 32);
                long j19 = ((long) iArr[2]) & 4294967295L;
                long j20 = ((long) iArr2[3]) & 4294967295L;
                long j21 = ((long) iArr2[4]) & 4294967295L;
                long j22 = j18 + (j19 * j10);
                int i15 = (int) j22;
                iArr2[2] = (i14 >>> 31) | (i15 << 1);
                int i16 = i15 >>> 31;
                long jA = a.a(j19, j15, j22 >>> 32, j20);
                long j23 = j21 + (jA >>> 32);
                long j24 = ((long) iArr[3]) & 4294967295L;
                long j25 = (((long) iArr2[5]) & 4294967295L) + (j23 >>> 32);
                long j26 = j23 & 4294967295L;
                long j27 = (((long) iArr2[6]) & 4294967295L) + (j25 >>> 32);
                long j28 = j25 & 4294967295L;
                long j29 = (j24 * j10) + (jA & 4294967295L);
                int i17 = (int) j29;
                iArr2[3] = i16 | (i17 << 1);
                int i18 = i17 >>> 31;
                long jA2 = a.a(j24, j15, j29 >>> 32, j26);
                long jA3 = a.a(j24, j19, jA2 >>> 32, j28);
                long j30 = j27 + (jA3 >>> 32);
                long j31 = jA3 & 4294967295L;
                long j32 = ((long) iArr[4]) & 4294967295L;
                long j33 = (((long) iArr2[7]) & 4294967295L) + (j30 >>> 32);
                long j34 = j30 & 4294967295L;
                long j35 = (((long) iArr2[8]) & 4294967295L) + (j33 >>> 32);
                long j36 = (j10 * j32) + (jA2 & 4294967295L);
                int i19 = (int) j36;
                iArr2[4] = (i19 << 1) | i18;
                long jA4 = a.a(j32, j15, j36 >>> 32, j31);
                long jA5 = a.a(j32, j19, jA4 >>> 32, j34);
                long jA6 = a.a(j32, j24, jA5 >>> 32, j33 & 4294967295L);
                long j37 = j35 + (jA6 >>> 32);
                int i20 = (int) jA4;
                iArr2[5] = (i20 << 1) | (i19 >>> 31);
                int i21 = (int) jA5;
                iArr2[6] = (i20 >>> 31) | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) jA6;
                iArr2[7] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j37;
                iArr2[8] = i24 | (i25 << 1);
                iArr2[9] = ((iArr2[9] + ((int) (j37 >>> 32))) << 1) | (i25 >>> 31);
                return;
            }
            i12 = i13;
        }
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j14 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j10 = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j10 >> 32);
        iArr2[1] = (int) j11;
        long j12 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j11 >> 32);
        iArr2[2] = (int) j12;
        long j13 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j12 >> 32);
        iArr2[3] = (int) j13;
        long j14 = ((((long) iArr2[4]) & 4294967295L) - (4294967295L & ((long) iArr[4]))) + (j13 >> 32);
        iArr2[4] = (int) j14;
        return (int) (j14 >> 32);
    }
}
