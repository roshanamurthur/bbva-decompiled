package org.bouncycastle.math.raw;

import androidx.emoji2.text.flatbuffer.a;
import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Nat224 {
    public static int add(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = (((long) iArr[i10]) & 4294967295L) + (((long) iArr2[i11]) & 4294967295L);
        iArr3[i12] = (int) j10;
        long j11 = (((long) iArr[i10 + 1]) & 4294967295L) + (((long) iArr2[i11 + 1]) & 4294967295L) + (j10 >>> 32);
        iArr3[i12 + 1] = (int) j11;
        long j12 = (((long) iArr[i10 + 2]) & 4294967295L) + (((long) iArr2[i11 + 2]) & 4294967295L) + (j11 >>> 32);
        iArr3[i12 + 2] = (int) j12;
        long j13 = (((long) iArr[i10 + 3]) & 4294967295L) + (((long) iArr2[i11 + 3]) & 4294967295L) + (j12 >>> 32);
        iArr3[i12 + 3] = (int) j13;
        long j14 = (((long) iArr[i10 + 4]) & 4294967295L) + (((long) iArr2[i11 + 4]) & 4294967295L) + (j13 >>> 32);
        iArr3[i12 + 4] = (int) j14;
        long j15 = (((long) iArr[i10 + 5]) & 4294967295L) + (((long) iArr2[i11 + 5]) & 4294967295L) + (j14 >>> 32);
        iArr3[i12 + 5] = (int) j15;
        long j16 = (((long) iArr[i10 + 6]) & 4294967295L) + (((long) iArr2[i11 + 6]) & 4294967295L) + (j15 >>> 32);
        iArr3[i12 + 6] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = (((long) iArr[i10]) & 4294967295L) + (((long) iArr2[i11]) & 4294967295L) + (((long) iArr3[i12]) & 4294967295L);
        iArr3[i12] = (int) j10;
        int i13 = i12 + 1;
        long j11 = (((long) iArr[i10 + 1]) & 4294967295L) + (((long) iArr2[i11 + 1]) & 4294967295L) + (((long) iArr3[i13]) & 4294967295L) + (j10 >>> 32);
        iArr3[i13] = (int) j11;
        int i14 = i12 + 2;
        long j12 = (((long) iArr[i10 + 2]) & 4294967295L) + (((long) iArr2[i11 + 2]) & 4294967295L) + (((long) iArr3[i14]) & 4294967295L) + (j11 >>> 32);
        iArr3[i14] = (int) j12;
        int i15 = i12 + 3;
        long j13 = (((long) iArr[i10 + 3]) & 4294967295L) + (((long) iArr2[i11 + 3]) & 4294967295L) + (((long) iArr3[i15]) & 4294967295L) + (j12 >>> 32);
        iArr3[i15] = (int) j13;
        int i16 = i12 + 4;
        long j14 = (((long) iArr[i10 + 4]) & 4294967295L) + (((long) iArr2[i11 + 4]) & 4294967295L) + (((long) iArr3[i16]) & 4294967295L) + (j13 >>> 32);
        iArr3[i16] = (int) j14;
        int i17 = i12 + 5;
        long j15 = (((long) iArr[i10 + 5]) & 4294967295L) + (((long) iArr2[i11 + 5]) & 4294967295L) + (((long) iArr3[i17]) & 4294967295L) + (j14 >>> 32);
        iArr3[i17] = (int) j15;
        int i18 = i12 + 6;
        long j16 = (((long) iArr[i10 + 6]) & 4294967295L) + (((long) iArr2[i11 + 6]) & 4294967295L) + (((long) iArr3[i18]) & 4294967295L) + (j15 >>> 32);
        iArr3[i18] = (int) j16;
        return (int) (j16 >>> 32);
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
        long j14 = (((long) iArr[i10 + 4]) & 4294967295L) + (((long) iArr2[i16]) & 4294967295L) + (j13 >>> 32);
        iArr2[i16] = (int) j14;
        int i17 = i11 + 5;
        long j15 = (((long) iArr[i10 + 5]) & 4294967295L) + (((long) iArr2[i17]) & 4294967295L) + (j14 >>> 32);
        iArr2[i17] = (int) j15;
        int i18 = i11 + 6;
        long j16 = (((long) iArr[i10 + 6]) & 4294967295L) + (4294967295L & ((long) iArr2[i18])) + (j15 >>> 32);
        iArr2[i18] = (int) j16;
        return (int) (j16 >>> 32);
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
        long j14 = (((long) iArr[i22]) & 4294967295L) + (((long) iArr2[i23]) & 4294967295L) + (j13 >>> 32);
        int i24 = (int) j14;
        iArr[i22] = i24;
        iArr2[i23] = i24;
        int i25 = i10 + 5;
        int i26 = i11 + 5;
        long j15 = (((long) iArr[i25]) & 4294967295L) + (((long) iArr2[i26]) & 4294967295L) + (j14 >>> 32);
        int i27 = (int) j15;
        iArr[i25] = i27;
        iArr2[i26] = i27;
        int i28 = i10 + 6;
        int i29 = i11 + 6;
        long j16 = (((long) iArr[i28]) & 4294967295L) + (4294967295L & ((long) iArr2[i29])) + (j15 >>> 32);
        int i30 = (int) j16;
        iArr[i28] = i30;
        iArr2[i29] = i30;
        return (int) (j16 >>> 32);
    }

    public static void copy(int[] iArr, int i10, int[] iArr2, int i11) {
        iArr2[i11] = iArr[i10];
        iArr2[i11 + 1] = iArr[i10 + 1];
        iArr2[i11 + 2] = iArr[i10 + 2];
        iArr2[i11 + 3] = iArr[i10 + 3];
        iArr2[i11 + 4] = iArr[i10 + 4];
        iArr2[i11 + 5] = iArr[i10 + 5];
        iArr2[i11 + 6] = iArr[i10 + 6];
    }

    public static int[] create() {
        return new int[7];
    }

    public static int[] createExt() {
        return new int[14];
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
        for (int i10 = 6; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
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
            if (i12 < 0 || i12 >= 7) {
                return 0;
            }
            i11 = iArr[i12] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean gte(int[] iArr, int i10, int[] iArr2, int i11) {
        for (int i12 = 6; i12 >= 0; i12--) {
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
        for (int i10 = 1; i10 < 7; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i10 = 0; i10 < 7; i10++) {
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
        long j15 = ((long) iArr2[i11 + 5]) & 4294967295L;
        long j16 = ((long) iArr2[i11 + 6]) & 4294967295L;
        long j17 = ((long) iArr[i10]) & 4294967295L;
        long j18 = j17 * j10;
        iArr3[i12] = (int) j18;
        long j19 = (j17 * j11) + (j18 >>> 32);
        iArr3[i12 + 1] = (int) j19;
        long j20 = (j17 * j12) + (j19 >>> 32);
        iArr3[i12 + 2] = (int) j20;
        long j21 = (j17 * j13) + (j20 >>> 32);
        iArr3[i12 + 3] = (int) j21;
        long j22 = (j17 * j14) + (j21 >>> 32);
        iArr3[i12 + 4] = (int) j22;
        long j23 = (j17 * j15) + (j22 >>> 32);
        iArr3[i12 + 5] = (int) j23;
        long j24 = j23 >>> 32;
        long j25 = j16;
        long j26 = (j17 * j25) + j24;
        iArr3[i12 + 6] = (int) j26;
        iArr3[i12 + 7] = (int) (j26 >>> 32);
        int i13 = 1;
        int i14 = i12;
        while (i13 < 7) {
            int i15 = i14 + 1;
            long j27 = ((long) iArr[i10 + i13]) & 4294967295L;
            long j28 = j25;
            int i16 = i13;
            long j29 = (j27 * j10) + (((long) iArr3[i15]) & 4294967295L);
            iArr3[i15] = (int) j29;
            int i17 = i14 + 2;
            long j30 = (j27 * j11) + (((long) iArr3[i17]) & 4294967295L) + (j29 >>> 32);
            iArr3[i17] = (int) j30;
            int i18 = i14 + 3;
            long j31 = j12;
            long j32 = (j27 * j12) + (((long) iArr3[i18]) & 4294967295L) + (j30 >>> 32);
            iArr3[i18] = (int) j32;
            int i19 = i14 + 4;
            int i20 = i14;
            long j33 = (j27 * j13) + (((long) iArr3[i19]) & 4294967295L) + (j32 >>> 32);
            iArr3[i19] = (int) j33;
            int i21 = i20 + 5;
            long j34 = (j27 * j14) + (((long) iArr3[i21]) & 4294967295L) + (j33 >>> 32);
            iArr3[i21] = (int) j34;
            int i22 = i20 + 6;
            long j35 = (j27 * j15) + (((long) iArr3[i22]) & 4294967295L) + (j34 >>> 32);
            iArr3[i22] = (int) j35;
            long j36 = j35 >>> 32;
            int i23 = i20 + 7;
            long j37 = (j27 * j28) + (((long) iArr3[i23]) & 4294967295L) + j36;
            iArr3[i23] = (int) j37;
            iArr3[i20 + 8] = (int) (j37 >>> 32);
            i13 = i16 + 1;
            i14 = i15;
            j25 = j28;
            j12 = j31;
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
        return Nat.incAt(7, iArr, i11, 4);
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
        return Nat.incAt(7, iArr, i12, 3);
    }

    public static int mulAddTo(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = ((long) iArr2[i11]) & 4294967295L;
        long j11 = ((long) iArr2[i11 + 1]) & 4294967295L;
        long j12 = ((long) iArr2[i11 + 2]) & 4294967295L;
        long j13 = ((long) iArr2[i11 + 3]) & 4294967295L;
        long j14 = ((long) iArr2[i11 + 4]) & 4294967295L;
        long j15 = ((long) iArr2[i11 + 5]) & 4294967295L;
        long j16 = ((long) iArr2[i11 + 6]) & 4294967295L;
        long j17 = 0;
        int i13 = 0;
        int i14 = i12;
        while (i13 < 7) {
            int i15 = i13;
            long j18 = ((long) iArr[i10 + i13]) & 4294967295L;
            long j19 = j10;
            long j20 = (j18 * j10) + (((long) iArr3[i14]) & 4294967295L);
            long j21 = j16;
            iArr3[i14] = (int) j20;
            int i16 = i14 + 1;
            long j22 = (j18 * j11) + (((long) iArr3[i16]) & 4294967295L) + (j20 >>> 32);
            iArr3[i16] = (int) j22;
            int i17 = i14 + 2;
            long j23 = (j18 * j12) + (((long) iArr3[i17]) & 4294967295L) + (j22 >>> 32);
            iArr3[i17] = (int) j23;
            int i18 = i14 + 3;
            long j24 = (j18 * j13) + (((long) iArr3[i18]) & 4294967295L) + (j23 >>> 32);
            iArr3[i18] = (int) j24;
            int i19 = i14 + 4;
            long j25 = (j18 * j14) + (((long) iArr3[i19]) & 4294967295L) + (j24 >>> 32);
            iArr3[i19] = (int) j25;
            int i20 = i14 + 5;
            long j26 = (j18 * j15) + (((long) iArr3[i20]) & 4294967295L) + (j25 >>> 32);
            iArr3[i20] = (int) j26;
            int i21 = i14 + 6;
            long j27 = (j18 * j21) + (((long) iArr3[i21]) & 4294967295L) + (j26 >>> 32);
            iArr3[i21] = (int) j27;
            int i22 = i14 + 7;
            long j28 = (j27 >>> 32) + (((long) iArr3[i22]) & 4294967295L) + j17;
            iArr3[i22] = (int) j28;
            j17 = j28 >>> 32;
            i13 = i15 + 1;
            i14 = i16;
            j16 = j21;
            j10 = j19;
            j11 = j11;
        }
        return (int) j17;
    }

    public static int mulByWord(int i10, int[] iArr) {
        long j10 = ((long) i10) & 4294967295L;
        long j11 = (((long) iArr[0]) & 4294967295L) * j10;
        iArr[0] = (int) j11;
        long j12 = ((((long) iArr[1]) & 4294967295L) * j10) + (j11 >>> 32);
        iArr[1] = (int) j12;
        long j13 = ((((long) iArr[2]) & 4294967295L) * j10) + (j12 >>> 32);
        iArr[2] = (int) j13;
        long j14 = ((((long) iArr[3]) & 4294967295L) * j10) + (j13 >>> 32);
        iArr[3] = (int) j14;
        long j15 = ((((long) iArr[4]) & 4294967295L) * j10) + (j14 >>> 32);
        iArr[4] = (int) j15;
        long j16 = ((((long) iArr[5]) & 4294967295L) * j10) + (j15 >>> 32);
        iArr[5] = (int) j16;
        long j17 = (j10 * (4294967295L & ((long) iArr[6]))) + (j16 >>> 32);
        iArr[6] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int mulByWordAddTo(int i10, int[] iArr, int[] iArr2) {
        long j10 = ((long) i10) & 4294967295L;
        long j11 = ((((long) iArr2[0]) & 4294967295L) * j10) + (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j11;
        long j12 = ((((long) iArr2[1]) & 4294967295L) * j10) + (((long) iArr[1]) & 4294967295L) + (j11 >>> 32);
        iArr2[1] = (int) j12;
        long j13 = ((((long) iArr2[2]) & 4294967295L) * j10) + (((long) iArr[2]) & 4294967295L) + (j12 >>> 32);
        iArr2[2] = (int) j13;
        long j14 = ((((long) iArr2[3]) & 4294967295L) * j10) + (((long) iArr[3]) & 4294967295L) + (j13 >>> 32);
        iArr2[3] = (int) j14;
        long j15 = ((((long) iArr2[4]) & 4294967295L) * j10) + (((long) iArr[4]) & 4294967295L) + (j14 >>> 32);
        iArr2[4] = (int) j15;
        long j16 = ((((long) iArr2[5]) & 4294967295L) * j10) + (((long) iArr[5]) & 4294967295L) + (j15 >>> 32);
        iArr2[5] = (int) j16;
        long j17 = (j10 * (((long) iArr2[6]) & 4294967295L)) + (4294967295L & ((long) iArr[6])) + (j16 >>> 32);
        iArr2[6] = (int) j17;
        return (int) (j17 >>> 32);
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
        } while (i12 < 7);
        return (int) j11;
    }

    public static int mulWordAddTo(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
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
        long j15 = ((((long) iArr[i11 + 4]) & 4294967295L) * j10) + (((long) iArr2[i16]) & 4294967295L) + (j14 >>> 32);
        iArr2[i16] = (int) j15;
        int i17 = i12 + 5;
        long j16 = ((((long) iArr[i11 + 5]) & 4294967295L) * j10) + (((long) iArr2[i17]) & 4294967295L) + (j15 >>> 32);
        iArr2[i17] = (int) j16;
        int i18 = i12 + 6;
        long j17 = (j10 * (((long) iArr[i11 + 6]) & 4294967295L)) + (((long) iArr2[i18]) & 4294967295L) + (j16 >>> 32);
        iArr2[i18] = (int) j17;
        return (int) (j17 >>> 32);
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
        return Nat.incAt(7, iArr, i11, 3);
    }

    public static void square(int[] iArr, int i10, int[] iArr2, int i11) {
        long j10 = ((long) iArr[i10]) & 4294967295L;
        int i12 = 0;
        int i13 = 14;
        int i14 = 6;
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
                long j36 = j33 & 4294967295L;
                long j37 = (j32 * j10) + (jA2 & 4294967295L);
                int i28 = (int) j37;
                iArr2[i21] = (i25 >>> 31) | (i28 << 1);
                int i29 = i28 >>> 31;
                long jA4 = a.a(j32, j15, j37 >>> 32, j31);
                long jA5 = a.a(j32, j19, jA4 >>> 32, j34);
                long jA6 = a.a(j32, j24, jA5 >>> 32, j36);
                long j38 = jA5 & 4294967295L;
                long j39 = j35 + (jA6 >>> 32);
                long j40 = ((long) iArr[i10 + 5]) & 4294967295L;
                int i30 = i11 + 9;
                long j41 = (((long) iArr2[i30]) & 4294967295L) + (j39 >>> 32);
                long j42 = j39 & 4294967295L;
                int i31 = i11 + 10;
                long j43 = (((long) iArr2[i31]) & 4294967295L) + (j41 >>> 32);
                long j44 = j41 & 4294967295L;
                long j45 = (j40 * j10) + (jA4 & 4294967295L);
                int i32 = (int) j45;
                iArr2[i23] = i29 | (i32 << 1);
                int i33 = i32 >>> 31;
                long jA7 = a.a(j40, j15, j45 >>> 32, j38);
                long jA8 = a.a(j40, j19, jA7 >>> 32, jA6 & 4294967295L);
                long jA9 = a.a(j40, j24, jA8 >>> 32, j42);
                long j46 = jA8 & 4294967295L;
                long jA10 = a.a(j40, j32, jA9 >>> 32, j44);
                long j47 = j43 + (jA10 >>> 32);
                long j48 = jA10 & 4294967295L;
                long j49 = ((long) iArr[i10 + 6]) & 4294967295L;
                int i34 = i11 + 11;
                long j50 = (((long) iArr2[i34]) & 4294967295L) + (j47 >>> 32);
                int i35 = i11 + 12;
                long j51 = (((long) iArr2[i35]) & 4294967295L) + (j50 >>> 32);
                long j52 = 4294967295L & j50;
                long j53 = (j10 * j49) + (jA7 & 4294967295L);
                int i36 = (int) j53;
                iArr2[i24] = i33 | (i36 << 1);
                int i37 = i36 >>> 31;
                long jA11 = a.a(j49, j15, j53 >>> 32, j46);
                long jA12 = a.a(j49, j19, jA11 >>> 32, jA9 & 4294967295L);
                long jA13 = a.a(j49, j24, jA12 >>> 32, j48);
                long jA14 = a.a(j49, j32, jA13 >>> 32, j47 & 4294967295L);
                long jA15 = a.a(j49, j40, jA14 >>> 32, j52);
                long j54 = j51 + (jA15 >>> 32);
                int i38 = (int) jA11;
                iArr2[i26] = (i38 << 1) | i37;
                int i39 = (int) jA12;
                iArr2[i27] = (i38 >>> 31) | (i39 << 1);
                int i40 = i39 >>> 31;
                int i41 = (int) jA13;
                iArr2[i30] = i40 | (i41 << 1);
                int i42 = i41 >>> 31;
                int i43 = (int) jA14;
                iArr2[i31] = i42 | (i43 << 1);
                int i44 = i43 >>> 31;
                int i45 = (int) jA15;
                iArr2[i34] = i44 | (i45 << 1);
                int i46 = i45 >>> 31;
                int i47 = (int) j54;
                iArr2[i35] = i46 | (i47 << 1);
                int i48 = i47 >>> 31;
                int i49 = i11 + 13;
                iArr2[i49] = i48 | ((iArr2[i49] + ((int) (j54 >>> 32))) << 1);
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
        long j15 = ((((long) iArr[i10 + 5]) & 4294967295L) - (((long) iArr2[i11 + 5]) & 4294967295L)) + (j14 >> 32);
        iArr3[i12 + 5] = (int) j15;
        long j16 = ((((long) iArr[i10 + 6]) & 4294967295L) - (((long) iArr2[i11 + 6]) & 4294967295L)) + (j15 >> 32);
        iArr3[i12 + 6] = (int) j16;
        return (int) (j16 >> 32);
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
        long j15 = (((((long) iArr3[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) - (((long) iArr2[5]) & 4294967295L)) + (j14 >> 32);
        iArr3[5] = (int) j15;
        long j16 = (((((long) iArr3[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) - (((long) iArr2[6]) & 4294967295L)) + (j15 >> 32);
        iArr3[6] = (int) j16;
        return (int) (j16 >> 32);
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
        int i16 = i11 + 5;
        long j15 = ((((long) iArr2[i16]) & 4294967295L) - (((long) iArr[i10 + 5]) & 4294967295L)) + (j14 >> 32);
        iArr2[i16] = (int) j15;
        int i17 = i11 + 6;
        long j16 = ((((long) iArr2[i17]) & 4294967295L) - (((long) iArr[i10 + 6]) & 4294967295L)) + (j15 >> 32);
        iArr2[i17] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i10 = 0; i10 < 7; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                Pack.intToBigEndian(i11, bArr, (6 - i10) << 2);
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
        iArr[5] = 0;
        iArr[6] = 0;
    }

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
        long j15 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        return (int) (j16 >>> 32);
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
        long j15 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        return (int) (j16 >>> 32);
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
        long j14 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j13 >>> 32);
        iArr2[4] = (int) j14;
        long j15 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j14 >>> 32);
        iArr2[5] = (int) j15;
        long j16 = (((long) iArr[6]) & 4294967295L) + (4294967295L & ((long) iArr2[6])) + (j15 >>> 32);
        iArr2[6] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
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

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
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

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
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
            long j29 = (j28 >>> 32) + (((long) iArr3[i17]) & 4294967295L) + j17;
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

    public static void square(int[] iArr, int[] iArr2) {
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
                long jA = a.a(j19, j15, j22 >>> 32, j20);
                long j23 = j21 + (jA >>> 32);
                long j24 = ((long) iArr[3]) & 4294967295L;
                long j25 = (((long) iArr2[5]) & 4294967295L) + (j23 >>> 32);
                long j26 = (((long) iArr2[6]) & 4294967295L) + (j25 >>> 32);
                long j27 = (j24 * j10) + (jA & 4294967295L);
                int i17 = (int) j27;
                iArr2[3] = (i17 << 1) | (i16 >>> 31);
                long jA2 = a.a(j24, j15, j27 >>> 32, j23 & 4294967295L);
                long jA3 = a.a(j24, j19, jA2 >>> 32, j25 & 4294967295L);
                long j28 = j26 + (jA3 >>> 32);
                long j29 = jA3 & 4294967295L;
                long j30 = ((long) iArr[4]) & 4294967295L;
                long j31 = (((long) iArr2[7]) & 4294967295L) + (j28 >>> 32);
                long j32 = (((long) iArr2[8]) & 4294967295L) + (j31 >>> 32);
                long j33 = j31 & 4294967295L;
                long j34 = (j30 * j10) + (jA2 & 4294967295L);
                int i18 = (int) j34;
                iArr2[4] = (i17 >>> 31) | (i18 << 1);
                long jA4 = a.a(j30, j15, j34 >>> 32, j29);
                long jA5 = a.a(j30, j19, jA4 >>> 32, j28 & 4294967295L);
                long j35 = jA4 & 4294967295L;
                long jA6 = a.a(j30, j24, jA5 >>> 32, j33);
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
                long jA7 = a.a(j39, j15, j43 >>> 32, j36);
                long jA8 = a.a(j39, j19, jA7 >>> 32, j38);
                long jA9 = a.a(j39, j24, jA8 >>> 32, j37 & 4294967295L);
                long j44 = jA8 & 4294967295L;
                long jA10 = a.a(j39, j30, jA9 >>> 32, j42);
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
                long jA11 = a.a(j46, j15, j51 >>> 32, j44);
                long jA12 = a.a(j46, j19, jA11 >>> 32, jA9 & 4294967295L);
                long jA13 = a.a(j46, j24, jA12 >>> 32, jA10 & 4294967295L);
                long jA14 = a.a(j46, j30, jA13 >>> 32, j48);
                long jA15 = a.a(j46, j39, jA14 >>> 32, j50);
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
        long j15 = ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L)) + (j14 >> 32);
        iArr3[5] = (int) j15;
        long j16 = ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L)) + (j15 >> 32);
        iArr3[6] = (int) j16;
        return (int) (j16 >> 32);
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
        long j14 = ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j13 >> 32);
        iArr2[4] = (int) j14;
        long j15 = ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j14 >> 32);
        iArr2[5] = (int) j15;
        long j16 = ((((long) iArr2[6]) & 4294967295L) - (4294967295L & ((long) iArr[6]))) + (j15 >> 32);
        iArr2[6] = (int) j16;
        return (int) (j16 >> 32);
    }
}
