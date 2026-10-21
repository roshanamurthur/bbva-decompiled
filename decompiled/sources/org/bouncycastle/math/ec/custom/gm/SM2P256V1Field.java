package org.bouncycastle.math.ec.custom.gm;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes13.dex */
public class SM2P256V1Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f90649a = {-1, -1, 0, -1, -1, -1, -1, -2};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f90650b = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

    public static void a(int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j12;
            j11 = j12 >> 32;
        }
        long j13 = ((((long) iArr[2]) & 4294967295L) - 1) + j11;
        iArr[2] = (int) j13;
        long j14 = (((long) iArr[3]) & 4294967295L) + 1 + (j13 >> 32);
        iArr[3] = (int) j14;
        long j15 = j14 >> 32;
        if (j15 != 0) {
            long j16 = j15 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j16;
            long j17 = (j16 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j17;
            long j18 = (j17 >> 32) + (((long) iArr[6]) & 4294967295L);
            iArr[6] = (int) j18;
            j15 = j18 >> 32;
        }
        iArr[7] = (int) ((4294967295L & ((long) iArr[7])) + 1 + j15);
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.add(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && Nat256.gte(iArr3, f90649a))) {
            a(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        int iAdd = Nat.add(16, iArr, iArr2, iArr3);
        int[] iArr4 = f90650b;
        if (iAdd != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && Nat.gte(16, iArr3, iArr4))) {
            Nat.subFrom(16, iArr4, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(8, iArr, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && Nat256.gte(iArr2, f90649a))) {
            a(iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat256.fromBigInteger(bigInteger);
        if ((iArrFromBigInteger[7] >>> 1) >= Integer.MAX_VALUE) {
            int[] iArr = f90649a;
            if (Nat256.gte(iArrFromBigInteger, iArr)) {
                Nat256.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(8, iArr2, Nat256.add(iArr, f90649a, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        int iMulAddTo = Nat256.mulAddTo(iArr, iArr2, iArr3);
        int[] iArr4 = f90650b;
        if (iMulAddTo != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && Nat.gte(16, iArr3, iArr4))) {
            Nat.subFrom(16, iArr4, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat256.isZero(iArr)) {
            Nat256.zero(iArr2);
        } else {
            Nat256.sub(f90649a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j10 = ((long) iArr[8]) & 4294967295L;
        long j11 = ((long) iArr[9]) & 4294967295L;
        long j12 = ((long) iArr[10]) & 4294967295L;
        long j13 = ((long) iArr[11]) & 4294967295L;
        long j14 = ((long) iArr[12]) & 4294967295L;
        long j15 = ((long) iArr[13]) & 4294967295L;
        long j16 = ((long) iArr[14]) & 4294967295L;
        long j17 = ((long) iArr[15]) & 4294967295L;
        long j18 = j12 + j13;
        long j19 = j15 + j16;
        long j20 = j19 + (j17 << 1);
        long j21 = j10 + j11 + j19;
        long j22 = j18 + j14 + j17 + j21;
        long j23 = (((long) iArr[0]) & 4294967295L) + j22 + j15 + j16 + j17;
        iArr2[0] = (int) j23;
        long j24 = (((((long) iArr[1]) & 4294967295L) + j22) - j10) + j16 + j17 + (j23 >> 32);
        iArr2[1] = (int) j24;
        long j25 = ((((long) iArr[2]) & 4294967295L) - j21) + (j24 >> 32);
        iArr2[2] = (int) j25;
        long j26 = ((((((long) iArr[3]) & 4294967295L) + j22) - j11) - j12) + j15 + (j25 >> 32);
        iArr2[3] = (int) j26;
        long j27 = ((((((long) iArr[4]) & 4294967295L) + j22) - j18) - j10) + j16 + (j26 >> 32);
        iArr2[4] = (int) j27;
        long j28 = (((long) iArr[5]) & 4294967295L) + j20 + j12 + (j27 >> 32);
        iArr2[5] = (int) j28;
        long j29 = (((long) iArr[6]) & 4294967295L) + j13 + j16 + j17 + (j28 >> 32);
        iArr2[6] = (int) j29;
        long j30 = (4294967295L & ((long) iArr[7])) + j22 + j20 + j14 + (j29 >> 32);
        iArr2[7] = (int) j30;
        reduce32((int) (j30 >> 32), iArr2);
    }

    public static void reduce32(int i10, int[] iArr) {
        long j10;
        if (i10 != 0) {
            long j11 = ((long) i10) & 4294967295L;
            long j12 = (((long) iArr[0]) & 4294967295L) + j11;
            iArr[0] = (int) j12;
            long j13 = j12 >> 32;
            if (j13 != 0) {
                long j14 = j13 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j14;
                j13 = j14 >> 32;
            }
            long j15 = ((((long) iArr[2]) & 4294967295L) - j11) + j13;
            iArr[2] = (int) j15;
            long j16 = (((long) iArr[3]) & 4294967295L) + j11 + (j15 >> 32);
            iArr[3] = (int) j16;
            long j17 = j16 >> 32;
            if (j17 != 0) {
                long j18 = j17 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j18;
                long j19 = (j18 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j19;
                long j20 = (j19 >> 32) + (((long) iArr[6]) & 4294967295L);
                iArr[6] = (int) j20;
                j17 = j20 >> 32;
            }
            long j21 = (4294967295L & ((long) iArr[7])) + j11 + j17;
            iArr[7] = (int) j21;
            j10 = j21 >> 32;
        } else {
            j10 = 0;
        }
        if (j10 != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && Nat256.gte(iArr, f90649a))) {
            a(iArr);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                Nat256.square(iArr2, iArrCreateExt);
            }
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.sub(iArr, iArr2, iArr3) != 0) {
            long j10 = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j10;
            long j11 = j10 >> 32;
            if (j11 != 0) {
                long j12 = j11 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j12;
                j11 = j12 >> 32;
            }
            long j13 = (((long) iArr3[2]) & 4294967295L) + 1 + j11;
            iArr3[2] = (int) j13;
            long j14 = ((((long) iArr3[3]) & 4294967295L) - 1) + (j13 >> 32);
            iArr3[3] = (int) j14;
            long j15 = j14 >> 32;
            if (j15 != 0) {
                long j16 = j15 + (((long) iArr3[4]) & 4294967295L);
                iArr3[4] = (int) j16;
                long j17 = (j16 >> 32) + (((long) iArr3[5]) & 4294967295L);
                iArr3[5] = (int) j17;
                long j18 = (j17 >> 32) + (((long) iArr3[6]) & 4294967295L);
                iArr3[6] = (int) j18;
                j15 = j18 >> 32;
            }
            iArr3[7] = (int) (((4294967295L & ((long) iArr3[7])) - 1) + j15);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            Nat.addTo(16, f90650b, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(8, iArr, 0, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && Nat256.gte(iArr2, f90649a))) {
            a(iArr2);
        }
    }
}
