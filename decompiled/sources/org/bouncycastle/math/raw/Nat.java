package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Nat {
    public static int add(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            long j11 = (((long) iArr[i11]) & 4294967295L) + (4294967295L & ((long) iArr2[i11])) + j10;
            iArr3[i11] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int add33At(int i10, int i11, int[] iArr, int i12) {
        long j10 = (((long) iArr[i12]) & 4294967295L) + (((long) i11) & 4294967295L);
        iArr[i12] = (int) j10;
        int i13 = i12 + 1;
        long j11 = (4294967295L & ((long) iArr[i13])) + 1 + (j10 >>> 32);
        iArr[i13] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return incAt(i10, iArr, i12 + 2);
    }

    public static int add33To(int i10, int i11, int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) i11) & 4294967295L);
        iArr[0] = (int) j10;
        long j11 = (4294967295L & ((long) iArr[1])) + 1 + (j10 >>> 32);
        iArr[1] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return incAt(i10, iArr, 2);
    }

    public static int addBothTo(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j10 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = i13 + i14;
            long j11 = (((long) iArr[i11 + i14]) & 4294967295L) + (((long) iArr2[i12 + i14]) & 4294967295L) + (4294967295L & ((long) iArr3[i15])) + j10;
            iArr3[i15] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int addDWordAt(int i10, long j10, int[] iArr, int i11) {
        long j11 = (((long) iArr[i11]) & 4294967295L) + (j10 & 4294967295L);
        iArr[i11] = (int) j11;
        int i12 = i11 + 1;
        long j12 = (4294967295L & ((long) iArr[i12])) + (j10 >>> 32) + (j11 >>> 32);
        iArr[i12] = (int) j12;
        if ((j12 >>> 32) == 0) {
            return 0;
        }
        return incAt(i10, iArr, i11 + 2);
    }

    public static int addDWordTo(int i10, long j10, int[] iArr) {
        long j11 = (((long) iArr[0]) & 4294967295L) + (j10 & 4294967295L);
        iArr[0] = (int) j11;
        long j12 = (4294967295L & ((long) iArr[1])) + (j10 >>> 32) + (j11 >>> 32);
        iArr[1] = (int) j12;
        if ((j12 >>> 32) == 0) {
            return 0;
        }
        return incAt(i10, iArr, 2);
    }

    public static int addTo(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        long j10 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = i12 + i13;
            long j11 = (((long) iArr[i11 + i13]) & 4294967295L) + (4294967295L & ((long) iArr2[i14])) + j10;
            iArr2[i14] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int addToEachOther(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        long j10 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = i11 + i13;
            int i15 = i12 + i13;
            long j11 = (((long) iArr[i14]) & 4294967295L) + (4294967295L & ((long) iArr2[i15])) + j10;
            int i16 = (int) j11;
            iArr[i14] = i16;
            iArr2[i15] = i16;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int addWordAt(int i10, int i11, int[] iArr, int i12) {
        long j10 = (((long) i11) & 4294967295L) + (4294967295L & ((long) iArr[i12]));
        iArr[i12] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return incAt(i10, iArr, i12 + 1);
    }

    public static int addWordTo(int i10, int i11, int[] iArr) {
        long j10 = (((long) i11) & 4294967295L) + (4294967295L & ((long) iArr[0]));
        iArr[0] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return incAt(i10, iArr, 1);
    }

    public static int cadd(int i10, int i11, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((long) (-(i11 & 1))) & 4294967295L;
        long j11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            long j12 = (((long) iArr[i12]) & 4294967295L) + (((long) iArr2[i12]) & j10) + j11;
            iArr3[i12] = (int) j12;
            j11 = j12 >>> 32;
        }
        return (int) j11;
    }

    public static void cmov(int i10, int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        int i14 = -(i11 & 1);
        for (int i15 = 0; i15 < i10; i15++) {
            int i16 = i13 + i15;
            int i17 = iArr2[i16];
            iArr2[i16] = i17 ^ ((iArr[i12 + i15] ^ i17) & i14);
        }
    }

    public static void copy(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        System.arraycopy(iArr, i11, iArr2, i12, i10);
    }

    public static void copy64(int i10, long[] jArr, int i11, long[] jArr2, int i12) {
        System.arraycopy(jArr, i11, jArr2, i12, i10);
    }

    public static int[] create(int i10) {
        return new int[i10];
    }

    public static long[] create64(int i10) {
        return new long[i10];
    }

    public static int csub(int i10, int i11, int[] iArr, int i12, int[] iArr2, int i13, int[] iArr3, int i14) {
        long j10 = ((long) (-(i11 & 1))) & 4294967295L;
        long j11 = 0;
        for (int i15 = 0; i15 < i10; i15++) {
            long j12 = ((((long) iArr[i12 + i15]) & 4294967295L) - (((long) iArr2[i13 + i15]) & j10)) + j11;
            iArr3[i14 + i15] = (int) j12;
            j11 = j12 >> 32;
        }
        return (int) j11;
    }

    public static int dec(int i10, int[] iArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11] - 1;
            iArr[i11] = i12;
            if (i12 != -1) {
                return 0;
            }
        }
        return -1;
    }

    public static int decAt(int i10, int[] iArr, int i11) {
        while (i11 < i10) {
            int i12 = iArr[i11] - 1;
            iArr[i11] = i12;
            if (i12 != -1) {
                return 0;
            }
            i11++;
        }
        return -1;
    }

    public static boolean diff(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        boolean zGte = gte(i10, iArr, i11, iArr2, i12);
        if (zGte) {
            sub(i10, iArr, i11, iArr2, i12, iArr3, i13);
        } else {
            sub(i10, iArr2, i12, iArr, i11, iArr3, i13);
        }
        return zGte;
    }

    public static boolean eq(int i10, int[] iArr, int[] iArr2) {
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(int i10, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i10) {
            throw new IllegalArgumentException();
        }
        int[] iArrCreate = create((i10 + 31) >> 5);
        int i11 = 0;
        while (bigInteger.signum() != 0) {
            iArrCreate[i11] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i11++;
        }
        return iArrCreate;
    }

    public static long[] fromBigInteger64(int i10, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i10) {
            throw new IllegalArgumentException();
        }
        long[] jArrCreate64 = create64((i10 + 63) >> 6);
        int i11 = 0;
        while (bigInteger.signum() != 0) {
            jArrCreate64[i11] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i11++;
        }
        return jArrCreate64;
    }

    public static int getBit(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else {
            int i12 = i10 >> 5;
            if (i12 < 0 || i12 >= iArr.length) {
                return 0;
            }
            i11 = iArr[i12] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean gte(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            int i14 = iArr[i11 + i13] ^ Integer.MIN_VALUE;
            int i15 = Integer.MIN_VALUE ^ iArr2[i12 + i13];
            if (i14 < i15) {
                return false;
            }
            if (i14 > i15) {
                return true;
            }
        }
        return true;
    }

    public static int inc(int i10, int[] iArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11] + 1;
            iArr[i11] = i12;
            if (i12 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int incAt(int i10, int[] iArr, int i11) {
        while (i11 < i10) {
            int i12 = iArr[i11] + 1;
            iArr[i11] = i12;
            if (i12 != 0) {
                return 0;
            }
            i11++;
        }
        return 1;
    }

    public static boolean isOne(int i10, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i11 = 1; i11 < i10; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int i10, int[] iArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        iArr3[i13 + i10] = mulWord(i10, iArr[i11], iArr2, i12, iArr3, i13);
        for (int i14 = 1; i14 < i10; i14++) {
            int i15 = i13 + i14;
            iArr3[i15 + i10] = mulWordAddTo(i10, iArr[i11 + i14], iArr2, i12, iArr3, i15);
        }
    }

    public static int mul31BothAdd(int i10, int i11, int[] iArr, int i12, int[] iArr2, int[] iArr3, int i13) {
        long j10 = ((long) i11) & 4294967295L;
        long j11 = ((long) i12) & 4294967295L;
        long j12 = 0;
        int i14 = 0;
        do {
            long j13 = ((((long) iArr2[i14]) & 4294967295L) * j11) + ((((long) iArr[i14]) & 4294967295L) * j10);
            int i15 = i13 + i14;
            long j14 = j13 + (((long) iArr3[i15]) & 4294967295L) + j12;
            iArr3[i15] = (int) j14;
            j12 = j14 >>> 32;
            i14++;
        } while (i14 < i10);
        return (int) j12;
    }

    public static int mulAddTo(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j10 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = i13 + i10;
            long jMulWordAddTo = j10 + (((long) mulWordAddTo(i10, iArr[i11 + i14], iArr2, i12, iArr3, i13)) & 4294967295L) + (((long) iArr3[i15]) & 4294967295L);
            iArr3[i15] = (int) jMulWordAddTo;
            j10 = jMulWordAddTo >>> 32;
            i13++;
        }
        return (int) j10;
    }

    public static int mulWord(int i10, int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        long j10 = ((long) i11) & 4294967295L;
        long j11 = 0;
        int i14 = 0;
        do {
            long j12 = ((((long) iArr[i12 + i14]) & 4294967295L) * j10) + j11;
            iArr2[i13 + i14] = (int) j12;
            j11 = j12 >>> 32;
            i14++;
        } while (i14 < i10);
        return (int) j11;
    }

    public static int mulWordAddTo(int i10, int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        long j10 = ((long) i11) & 4294967295L;
        long j11 = 0;
        int i14 = 0;
        do {
            int i15 = i13 + i14;
            long j12 = ((((long) iArr[i12 + i14]) & 4294967295L) * j10) + (((long) iArr2[i15]) & 4294967295L) + j11;
            iArr2[i15] = (int) j12;
            j11 = j12 >>> 32;
            i14++;
        } while (i14 < i10);
        return (int) j11;
    }

    public static int mulWordDwordAddAt(int i10, int i11, long j10, int[] iArr, int i12) {
        long j11 = ((long) i11) & 4294967295L;
        long j12 = ((j10 & 4294967295L) * j11) + (((long) iArr[i12]) & 4294967295L);
        iArr[i12] = (int) j12;
        long j13 = j11 * (j10 >>> 32);
        int i13 = i12 + 1;
        long j14 = j13 + (((long) iArr[i13]) & 4294967295L) + (j12 >>> 32);
        iArr[i13] = (int) j14;
        long j15 = j14 >>> 32;
        int i14 = i12 + 2;
        long j16 = j15 + (((long) iArr[i14]) & 4294967295L);
        iArr[i14] = (int) j16;
        if ((j16 >>> 32) == 0) {
            return 0;
        }
        return incAt(i10, iArr, i12 + 3);
    }

    public static int shiftDownBit(int i10, int[] iArr, int i11) {
        while (true) {
            i10--;
            if (i10 < 0) {
                return i11 << 31;
            }
            int i12 = iArr[i10];
            iArr[i10] = (i11 << 31) | (i12 >>> 1);
            i11 = i12;
        }
    }

    public static int shiftDownBits(int i10, int[] iArr, int i11, int i12) {
        while (true) {
            i10--;
            if (i10 < 0) {
                return i12 << (-i11);
            }
            int i13 = iArr[i10];
            iArr[i10] = (i12 << (-i11)) | (i13 >>> i11);
            i12 = i13;
        }
    }

    public static int shiftDownWord(int i10, int[] iArr, int i11) {
        while (true) {
            i10--;
            if (i10 < 0) {
                return i11;
            }
            int i12 = iArr[i10];
            iArr[i10] = i11;
            i11 = i12;
        }
    }

    public static int shiftUpBit(int i10, int[] iArr, int i11) {
        int i12 = 0;
        while (i12 < i10) {
            int i13 = iArr[i12];
            iArr[i12] = (i11 >>> 31) | (i13 << 1);
            i12++;
            i11 = i13;
        }
        return i11 >>> 31;
    }

    public static long shiftUpBit64(int i10, long[] jArr, int i11, long j10, long[] jArr2, int i12) {
        int i13 = 0;
        while (i13 < i10) {
            long j11 = jArr[i11 + i13];
            jArr2[i12 + i13] = (j10 >>> 63) | (j11 << 1);
            i13++;
            j10 = j11;
        }
        return j10 >>> 63;
    }

    public static int shiftUpBits(int i10, int[] iArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i10) {
            int i14 = iArr[i13];
            iArr[i13] = (i12 >>> (-i11)) | (i14 << i11);
            i13++;
            i12 = i14;
        }
        return i12 >>> (-i11);
    }

    public static long shiftUpBits64(int i10, long[] jArr, int i11, int i12, long j10) {
        int i13 = 0;
        while (i13 < i10) {
            int i14 = i11 + i13;
            long j11 = jArr[i14];
            jArr[i14] = (j10 >>> (-i12)) | (j11 << i12);
            i13++;
            j10 = j11;
        }
        return j10 >>> (-i12);
    }

    public static void square(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        int i13;
        int i14 = i10 << 1;
        int i15 = 0;
        int i16 = i10;
        int i17 = i14;
        do {
            i16--;
            long j10 = ((long) iArr[i11 + i16]) & 4294967295L;
            long j11 = j10 * j10;
            iArr2[(i17 - 1) + i12] = (i15 << 31) | ((int) (j11 >>> 33));
            i17 -= 2;
            iArr2[i12 + i17] = (int) (j11 >>> 1);
            i15 = (int) j11;
        } while (i16 > 0);
        int i18 = i12 + 2;
        long j12 = 0;
        for (i13 = 1; i13 < i10; i13++) {
            long jSquareWordAddTo = j12 + (((long) squareWordAddTo(iArr, i11, i13, iArr2, i12)) & 4294967295L) + (((long) iArr2[i18]) & 4294967295L);
            int i19 = i18 + 1;
            iArr2[i18] = (int) jSquareWordAddTo;
            long j13 = (jSquareWordAddTo >>> 32) + (((long) iArr2[i19]) & 4294967295L);
            i18 += 2;
            iArr2[i19] = (int) j13;
            j12 = j13 >>> 32;
        }
        shiftUpBit(i14, iArr2, i12, iArr[i11] << 31);
    }

    public static int squareWordAdd(int[] iArr, int i10, int i11, int[] iArr2, int i12) {
        long j10 = ((long) iArr[i10 + i11]) & 4294967295L;
        int i13 = 0;
        long j11 = 0;
        int i14 = i12;
        do {
            int i15 = i11 + i14;
            long j12 = ((((long) iArr[i10 + i13]) & 4294967295L) * j10) + (((long) iArr2[i15]) & 4294967295L) + j11;
            iArr2[i15] = (int) j12;
            j11 = j12 >>> 32;
            i14++;
            i13++;
        } while (i13 < i11);
        return (int) j11;
    }

    public static int squareWordAddTo(int[] iArr, int i10, int i11, int[] iArr2, int i12) {
        long j10 = ((long) iArr[i10 + i11]) & 4294967295L;
        int i13 = 0;
        long j11 = 0;
        int i14 = i12;
        do {
            int i15 = i11 + i14;
            long j12 = ((((long) iArr[i10 + i13]) & 4294967295L) * j10) + (((long) iArr2[i15]) & 4294967295L) + j11;
            iArr2[i15] = (int) j12;
            j11 = j12 >>> 32;
            i14++;
            i13++;
        } while (i13 < i11);
        return (int) j11;
    }

    public static int sub(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j10 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            long j11 = ((((long) iArr[i11 + i14]) & 4294967295L) - (4294967295L & ((long) iArr2[i12 + i14]))) + j10;
            iArr3[i13 + i14] = (int) j11;
            j10 = j11 >> 32;
        }
        return (int) j10;
    }

    public static int sub33At(int i10, int i11, int[] iArr, int i12) {
        long j10 = (((long) iArr[i12]) & 4294967295L) - (((long) i11) & 4294967295L);
        iArr[i12] = (int) j10;
        int i13 = i12 + 1;
        long j11 = ((4294967295L & ((long) iArr[i13])) - 1) + (j10 >> 32);
        iArr[i13] = (int) j11;
        if ((j11 >> 32) == 0) {
            return 0;
        }
        return decAt(i10, iArr, i12 + 2);
    }

    public static int sub33From(int i10, int i11, int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) - (((long) i11) & 4294967295L);
        iArr[0] = (int) j10;
        long j11 = ((4294967295L & ((long) iArr[1])) - 1) + (j10 >> 32);
        iArr[1] = (int) j11;
        if ((j11 >> 32) == 0) {
            return 0;
        }
        return decAt(i10, iArr, 2);
    }

    public static int subBothFrom(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j10 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = i13 + i14;
            long j11 = (((((long) iArr3[i15]) & 4294967295L) - (((long) iArr[i11 + i14]) & 4294967295L)) - (4294967295L & ((long) iArr2[i12 + i14]))) + j10;
            iArr3[i15] = (int) j11;
            j10 = j11 >> 32;
        }
        return (int) j10;
    }

    public static int subDWordAt(int i10, long j10, int[] iArr, int i11) {
        long j11 = (((long) iArr[i11]) & 4294967295L) - (j10 & 4294967295L);
        iArr[i11] = (int) j11;
        int i12 = i11 + 1;
        long j12 = ((4294967295L & ((long) iArr[i12])) - (j10 >>> 32)) + (j11 >> 32);
        iArr[i12] = (int) j12;
        if ((j12 >> 32) == 0) {
            return 0;
        }
        return decAt(i10, iArr, i11 + 2);
    }

    public static int subDWordFrom(int i10, long j10, int[] iArr) {
        long j11 = (((long) iArr[0]) & 4294967295L) - (j10 & 4294967295L);
        iArr[0] = (int) j11;
        long j12 = ((4294967295L & ((long) iArr[1])) - (j10 >>> 32)) + (j11 >> 32);
        iArr[1] = (int) j12;
        if ((j12 >> 32) == 0) {
            return 0;
        }
        return decAt(i10, iArr, 2);
    }

    public static int subFrom(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        long j10 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = i12 + i13;
            long j11 = ((((long) iArr2[i14]) & 4294967295L) - (4294967295L & ((long) iArr[i11 + i13]))) + j10;
            iArr2[i14] = (int) j11;
            j10 = j11 >> 32;
        }
        return (int) j10;
    }

    public static int subWordAt(int i10, int i11, int[] iArr, int i12) {
        long j10 = (((long) iArr[i12]) & 4294967295L) - (4294967295L & ((long) i11));
        iArr[i12] = (int) j10;
        if ((j10 >> 32) == 0) {
            return 0;
        }
        return decAt(i10, iArr, i12 + 1);
    }

    public static int subWordFrom(int i10, int i11, int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) - (4294967295L & ((long) i11));
        iArr[0] = (int) j10;
        if ((j10 >> 32) == 0) {
            return 0;
        }
        return decAt(i10, iArr, 1);
    }

    public static BigInteger toBigInteger(int i10, int[] iArr) {
        byte[] bArr = new byte[i10 << 2];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                Pack.intToBigEndian(i12, bArr, ((i10 - 1) - i11) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int i10, int[] iArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = 0;
        }
    }

    public static void zero64(int i10, long[] jArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = 0;
        }
    }

    public static int add33At(int i10, int i11, int[] iArr, int i12, int i13) {
        int i14 = i12 + i13;
        long j10 = (((long) iArr[i14]) & 4294967295L) + (((long) i11) & 4294967295L);
        iArr[i14] = (int) j10;
        int i15 = i14 + 1;
        long j11 = (4294967295L & ((long) iArr[i15])) + 1 + (j10 >>> 32);
        iArr[i15] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return incAt(i10, iArr, i12, i13 + 2);
    }

    public static int add33To(int i10, int i11, int[] iArr, int i12) {
        long j10 = (((long) iArr[i12]) & 4294967295L) + (((long) i11) & 4294967295L);
        iArr[i12] = (int) j10;
        int i13 = i12 + 1;
        long j11 = (4294967295L & ((long) iArr[i13])) + 1 + (j10 >>> 32);
        iArr[i13] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return incAt(i10, iArr, i12, 2);
    }

    public static int addBothTo(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            long j11 = (((long) iArr[i11]) & 4294967295L) + (((long) iArr2[i11]) & 4294967295L) + (4294967295L & ((long) iArr3[i11])) + j10;
            iArr3[i11] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int addDWordAt(int i10, long j10, int[] iArr, int i11, int i12) {
        int i13 = i11 + i12;
        long j11 = (((long) iArr[i13]) & 4294967295L) + (j10 & 4294967295L);
        iArr[i13] = (int) j11;
        int i14 = i13 + 1;
        long j12 = (4294967295L & ((long) iArr[i14])) + (j10 >>> 32) + (j11 >>> 32);
        iArr[i14] = (int) j12;
        if ((j12 >>> 32) == 0) {
            return 0;
        }
        return incAt(i10, iArr, i11, i12 + 2);
    }

    public static int addDWordTo(int i10, long j10, int[] iArr, int i11) {
        long j11 = (((long) iArr[i11]) & 4294967295L) + (j10 & 4294967295L);
        iArr[i11] = (int) j11;
        int i12 = i11 + 1;
        long j12 = (4294967295L & ((long) iArr[i12])) + (j10 >>> 32) + (j11 >>> 32);
        iArr[i12] = (int) j12;
        if ((j12 >>> 32) == 0) {
            return 0;
        }
        return incAt(i10, iArr, i11, 2);
    }

    public static int addTo(int i10, int[] iArr, int i11, int[] iArr2, int i12, int i13) {
        long j10 = ((long) i13) & 4294967295L;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = i12 + i14;
            long j11 = (((long) iArr[i11 + i14]) & 4294967295L) + (((long) iArr2[i15]) & 4294967295L) + j10;
            iArr2[i15] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int addWordAt(int i10, int i11, int[] iArr, int i12, int i13) {
        long j10 = ((long) i11) & 4294967295L;
        int i14 = i12 + i13;
        long j11 = j10 + (4294967295L & ((long) iArr[i14]));
        iArr[i14] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return incAt(i10, iArr, i12, i13 + 1);
    }

    public static int addWordTo(int i10, int i11, int[] iArr, int i12) {
        long j10 = (((long) i11) & 4294967295L) + (4294967295L & ((long) iArr[i12]));
        iArr[i12] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return incAt(i10, iArr, i12, 1);
    }

    public static void copy(int i10, int[] iArr, int[] iArr2) {
        System.arraycopy(iArr, 0, iArr2, 0, i10);
    }

    public static void copy64(int i10, long[] jArr, long[] jArr2) {
        System.arraycopy(jArr, 0, jArr2, 0, i10);
    }

    public static int csub(int i10, int i11, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((long) (-(i11 & 1))) & 4294967295L;
        long j11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            long j12 = ((((long) iArr[i12]) & 4294967295L) - (((long) iArr2[i12]) & j10)) + j11;
            iArr3[i12] = (int) j12;
            j11 = j12 >> 32;
        }
        return (int) j11;
    }

    public static int dec(int i10, int[] iArr, int[] iArr2) {
        int i11 = 0;
        while (i11 < i10) {
            int i12 = iArr[i11] - 1;
            iArr2[i11] = i12;
            i11++;
            if (i12 != -1) {
                while (i11 < i10) {
                    iArr2[i11] = iArr[i11];
                    i11++;
                }
                return 0;
            }
        }
        return -1;
    }

    public static int decAt(int i10, int[] iArr, int i11, int i12) {
        while (i12 < i10) {
            int i13 = i11 + i12;
            int i14 = iArr[i13] - 1;
            iArr[i13] = i14;
            if (i14 != -1) {
                return 0;
            }
            i12++;
        }
        return -1;
    }

    public static boolean gte(int i10, int[] iArr, int[] iArr2) {
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            int i12 = iArr[i11] ^ Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE ^ iArr2[i11];
            if (i12 < i13) {
                return false;
            }
            if (i12 > i13) {
                return true;
            }
        }
        return true;
    }

    public static int inc(int i10, int[] iArr, int[] iArr2) {
        int i11 = 0;
        while (i11 < i10) {
            int i12 = iArr[i11] + 1;
            iArr2[i11] = i12;
            i11++;
            if (i12 != 0) {
                while (i11 < i10) {
                    iArr2[i11] = iArr[i11];
                    i11++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static int incAt(int i10, int[] iArr, int i11, int i12) {
        while (i12 < i10) {
            int i13 = i11 + i12;
            int i14 = iArr[i13] + 1;
            iArr[i13] = i14;
            if (i14 != 0) {
                return 0;
            }
            i12++;
        }
        return 1;
    }

    public static void mul(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        iArr3[i10] = mulWord(i10, iArr[0], iArr2, iArr3);
        for (int i11 = 1; i11 < i10; i11++) {
            iArr3[i11 + i10] = mulWordAddTo(i10, iArr[i11], iArr2, 0, iArr3, i11);
        }
    }

    public static int mulAddTo(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 + i10;
            long jMulWordAddTo = j10 + (((long) mulWordAddTo(i10, iArr[i11], iArr2, 0, iArr3, i11)) & 4294967295L) + (((long) iArr3[i12]) & 4294967295L);
            iArr3[i12] = (int) jMulWordAddTo;
            j10 = jMulWordAddTo >>> 32;
        }
        return (int) j10;
    }

    public static int mulWord(int i10, int i11, int[] iArr, int[] iArr2) {
        long j10 = ((long) i11) & 4294967295L;
        long j11 = 0;
        int i12 = 0;
        do {
            long j12 = ((((long) iArr[i12]) & 4294967295L) * j10) + j11;
            iArr2[i12] = (int) j12;
            j11 = j12 >>> 32;
            i12++;
        } while (i12 < i10);
        return (int) j11;
    }

    public static int shiftDownBit(int i10, int[] iArr, int i11, int i12) {
        while (true) {
            i10--;
            if (i10 < 0) {
                return i12 << 31;
            }
            int i13 = i11 + i10;
            int i14 = iArr[i13];
            iArr[i13] = (i12 << 31) | (i14 >>> 1);
            i12 = i14;
        }
    }

    public static int shiftDownBits(int i10, int[] iArr, int i11, int i12, int i13) {
        while (true) {
            i10--;
            if (i10 < 0) {
                return i13 << (-i12);
            }
            int i14 = i11 + i10;
            int i15 = iArr[i14];
            iArr[i14] = (i13 << (-i12)) | (i15 >>> i12);
            i13 = i15;
        }
    }

    public static int shiftUpBit(int i10, int[] iArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i10) {
            int i14 = i11 + i13;
            int i15 = iArr[i14];
            iArr[i14] = (i12 >>> 31) | (i15 << 1);
            i13++;
            i12 = i15;
        }
        return i12 >>> 31;
    }

    public static int shiftUpBits(int i10, int[] iArr, int i11, int i12, int i13) {
        int i14 = 0;
        while (i14 < i10) {
            int i15 = i11 + i14;
            int i16 = iArr[i15];
            iArr[i15] = (i13 >>> (-i12)) | (i16 << i12);
            i14++;
            i13 = i16;
        }
        return i13 >>> (-i12);
    }

    public static long shiftUpBits64(int i10, long[] jArr, int i11, int i12, long j10, long[] jArr2, int i13) {
        int i14 = 0;
        while (i14 < i10) {
            long j11 = jArr[i11 + i14];
            jArr2[i13 + i14] = (j10 >>> (-i12)) | (j11 << i12);
            i14++;
            j10 = j11;
        }
        return j10 >>> (-i12);
    }

    public static void square(int i10, int[] iArr, int[] iArr2) {
        int i11;
        int i12 = i10 << 1;
        int i13 = i10;
        int i14 = i12;
        int i15 = 0;
        while (true) {
            i13--;
            long j10 = ((long) iArr[i13]) & 4294967295L;
            long j11 = j10 * j10;
            iArr2[i14 - 1] = (i15 << 31) | ((int) (j11 >>> 33));
            i14 -= 2;
            iArr2[i14] = (int) (j11 >>> 1);
            int i16 = (int) j11;
            if (i13 <= 0) {
                break;
            } else {
                i15 = i16;
            }
        }
        long j12 = 0;
        int i17 = 2;
        for (i11 = 1; i11 < i10; i11++) {
            long jSquareWordAddTo = j12 + (((long) squareWordAddTo(iArr, i11, iArr2)) & 4294967295L) + (((long) iArr2[i17]) & 4294967295L);
            int i18 = i17 + 1;
            iArr2[i17] = (int) jSquareWordAddTo;
            long j13 = (jSquareWordAddTo >>> 32) + (((long) iArr2[i18]) & 4294967295L);
            i17 += 2;
            iArr2[i18] = (int) j13;
            j12 = j13 >>> 32;
        }
        shiftUpBit(i12, iArr2, iArr[0] << 31);
    }

    public static int squareWordAdd(int[] iArr, int i10, int[] iArr2) {
        long j10 = ((long) iArr[i10]) & 4294967295L;
        long j11 = 0;
        int i11 = 0;
        do {
            int i12 = i10 + i11;
            long j12 = ((((long) iArr[i11]) & 4294967295L) * j10) + (((long) iArr2[i12]) & 4294967295L) + j11;
            iArr2[i12] = (int) j12;
            j11 = j12 >>> 32;
            i11++;
        } while (i11 < i10);
        return (int) j11;
    }

    public static int squareWordAddTo(int[] iArr, int i10, int[] iArr2) {
        long j10 = ((long) iArr[i10]) & 4294967295L;
        long j11 = 0;
        int i11 = 0;
        do {
            int i12 = i10 + i11;
            long j12 = ((((long) iArr[i11]) & 4294967295L) * j10) + (((long) iArr2[i12]) & 4294967295L) + j11;
            iArr2[i12] = (int) j12;
            j11 = j12 >>> 32;
            i11++;
        } while (i11 < i10);
        return (int) j11;
    }

    public static int sub(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            long j11 = ((((long) iArr[i11]) & 4294967295L) - (4294967295L & ((long) iArr2[i11]))) + j10;
            iArr3[i11] = (int) j11;
            j10 = j11 >> 32;
        }
        return (int) j10;
    }

    public static int sub33At(int i10, int i11, int[] iArr, int i12, int i13) {
        int i14 = i12 + i13;
        long j10 = (((long) iArr[i14]) & 4294967295L) - (((long) i11) & 4294967295L);
        iArr[i14] = (int) j10;
        int i15 = i14 + 1;
        long j11 = ((4294967295L & ((long) iArr[i15])) - 1) + (j10 >> 32);
        iArr[i15] = (int) j11;
        if ((j11 >> 32) == 0) {
            return 0;
        }
        return decAt(i10, iArr, i12, i13 + 2);
    }

    public static int sub33From(int i10, int i11, int[] iArr, int i12) {
        long j10 = (((long) iArr[i12]) & 4294967295L) - (((long) i11) & 4294967295L);
        iArr[i12] = (int) j10;
        int i13 = i12 + 1;
        long j11 = ((4294967295L & ((long) iArr[i13])) - 1) + (j10 >> 32);
        iArr[i13] = (int) j11;
        if ((j11 >> 32) == 0) {
            return 0;
        }
        return decAt(i10, iArr, i12, 2);
    }

    public static int subBothFrom(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            long j11 = (((((long) iArr3[i11]) & 4294967295L) - (((long) iArr[i11]) & 4294967295L)) - (4294967295L & ((long) iArr2[i11]))) + j10;
            iArr3[i11] = (int) j11;
            j10 = j11 >> 32;
        }
        return (int) j10;
    }

    public static int subDWordAt(int i10, long j10, int[] iArr, int i11, int i12) {
        int i13 = i11 + i12;
        long j11 = (((long) iArr[i13]) & 4294967295L) - (j10 & 4294967295L);
        iArr[i13] = (int) j11;
        int i14 = i13 + 1;
        long j12 = ((4294967295L & ((long) iArr[i14])) - (j10 >>> 32)) + (j11 >> 32);
        iArr[i14] = (int) j12;
        if ((j12 >> 32) == 0) {
            return 0;
        }
        return decAt(i10, iArr, i11, i12 + 2);
    }

    public static int subDWordFrom(int i10, long j10, int[] iArr, int i11) {
        long j11 = (((long) iArr[i11]) & 4294967295L) - (j10 & 4294967295L);
        iArr[i11] = (int) j11;
        int i12 = i11 + 1;
        long j12 = ((4294967295L & ((long) iArr[i12])) - (j10 >>> 32)) + (j11 >> 32);
        iArr[i12] = (int) j12;
        if ((j12 >> 32) == 0) {
            return 0;
        }
        return decAt(i10, iArr, i11, 2);
    }

    public static int subFrom(int i10, int[] iArr, int[] iArr2) {
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            long j11 = ((((long) iArr2[i11]) & 4294967295L) - (4294967295L & ((long) iArr[i11]))) + j10;
            iArr2[i11] = (int) j11;
            j10 = j11 >> 32;
        }
        return (int) j10;
    }

    public static int subWordAt(int i10, int i11, int[] iArr, int i12, int i13) {
        int i14 = i12 + i13;
        long j10 = (((long) iArr[i14]) & 4294967295L) - (4294967295L & ((long) i11));
        iArr[i14] = (int) j10;
        if ((j10 >> 32) == 0) {
            return 0;
        }
        return decAt(i10, iArr, i12, i13 + 1);
    }

    public static int subWordFrom(int i10, int i11, int[] iArr, int i12) {
        long j10 = (((long) iArr[i12]) & 4294967295L) - (4294967295L & ((long) i11));
        iArr[i12] = (int) j10;
        if ((j10 >> 32) == 0) {
            return 0;
        }
        return decAt(i10, iArr, i12, 1);
    }

    public static void zero(int i10, int[] iArr, int i11) {
        for (int i12 = 0; i12 < i10; i12++) {
            iArr[i11 + i12] = 0;
        }
    }

    public static int addTo(int i10, int[] iArr, int[] iArr2) {
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            long j11 = (((long) iArr[i11]) & 4294967295L) + (4294967295L & ((long) iArr2[i11])) + j10;
            iArr2[i11] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int[] copy(int i10, int[] iArr) {
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        return iArr2;
    }

    public static long[] copy64(int i10, long[] jArr) {
        long[] jArr2 = new long[i10];
        System.arraycopy(jArr, 0, jArr2, 0, i10);
        return jArr2;
    }

    public static void mul(int[] iArr, int i10, int i11, int[] iArr2, int i12, int i13, int[] iArr3, int i14) {
        iArr3[i14 + i13] = mulWord(i13, iArr[i10], iArr2, i12, iArr3, i14);
        for (int i15 = 1; i15 < i11; i15++) {
            int i16 = i14 + i15;
            iArr3[i16 + i13] = mulWordAddTo(i13, iArr[i10 + i15], iArr2, i12, iArr3, i16);
        }
    }

    public static int shiftDownBit(int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13) {
        while (true) {
            i10--;
            if (i10 < 0) {
                return i12 << 31;
            }
            int i14 = iArr[i11 + i10];
            iArr2[i13 + i10] = (i12 << 31) | (i14 >>> 1);
            i12 = i14;
        }
    }

    public static int shiftDownBits(int i10, int[] iArr, int i11, int i12, int i13, int[] iArr2, int i14) {
        while (true) {
            i10--;
            if (i10 < 0) {
                return i13 << (-i12);
            }
            int i15 = iArr[i11 + i10];
            iArr2[i14 + i10] = (i13 << (-i12)) | (i15 >>> i12);
            i13 = i15;
        }
    }

    public static int shiftUpBit(int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13) {
        int i14 = 0;
        while (i14 < i10) {
            int i15 = iArr[i11 + i14];
            iArr2[i13 + i14] = (i12 >>> 31) | (i15 << 1);
            i14++;
            i12 = i15;
        }
        return i12 >>> 31;
    }

    public static int shiftUpBits(int i10, int[] iArr, int i11, int i12, int i13, int[] iArr2, int i14) {
        int i15 = 0;
        while (i15 < i10) {
            int i16 = iArr[i11 + i15];
            iArr2[i14 + i15] = (i13 >>> (-i12)) | (i16 << i12);
            i15++;
            i13 = i16;
        }
        return i13 >>> (-i12);
    }

    public static int shiftDownBit(int i10, int[] iArr, int i11, int[] iArr2) {
        while (true) {
            i10--;
            if (i10 < 0) {
                return i11 << 31;
            }
            int i12 = iArr[i10];
            iArr2[i10] = (i11 << 31) | (i12 >>> 1);
            i11 = i12;
        }
    }

    public static int shiftDownBits(int i10, int[] iArr, int i11, int i12, int[] iArr2) {
        while (true) {
            i10--;
            if (i10 < 0) {
                return i12 << (-i11);
            }
            int i13 = iArr[i10];
            iArr2[i10] = (i12 << (-i11)) | (i13 >>> i11);
            i12 = i13;
        }
    }

    public static int shiftUpBit(int i10, int[] iArr, int i11, int[] iArr2) {
        int i12 = 0;
        while (i12 < i10) {
            int i13 = iArr[i12];
            iArr2[i12] = (i11 >>> 31) | (i13 << 1);
            i12++;
            i11 = i13;
        }
        return i11 >>> 31;
    }

    public static int shiftUpBits(int i10, int[] iArr, int i11, int i12, int[] iArr2) {
        int i13 = 0;
        while (i13 < i10) {
            int i14 = iArr[i13];
            iArr2[i13] = (i12 >>> (-i11)) | (i14 << i11);
            i13++;
            i12 = i14;
        }
        return i12 >>> (-i11);
    }
}
