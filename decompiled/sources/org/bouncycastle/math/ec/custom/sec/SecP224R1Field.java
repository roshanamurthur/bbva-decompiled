package org.bouncycastle.math.ec.custom.sec;

import ai.a;
import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat224;

/* JADX INFO: loaded from: classes13.dex */
public class SecP224R1Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f90717a = {1, 0, 0, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f90718b = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f90719c = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void a(int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j12;
            long j13 = (j12 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j13;
            j11 = j13 >> 32;
        }
        long j14 = (4294967295L & ((long) iArr[3])) + 1 + j11;
        iArr[3] = (int) j14;
        if ((j14 >> 32) != 0) {
            Nat.incAt(7, iArr, 4);
        }
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.add(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && Nat224.gte(iArr3, f90717a))) {
            a(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((Nat.add(14, iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, f90718b))) && Nat.addTo(11, f90719c, iArr3) != 0) {
            Nat.incAt(14, iArr3, 11);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, f90717a))) {
            a(iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat224.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[6] == -1) {
            int[] iArr = f90717a;
            if (Nat224.gte(iArrFromBigInteger, iArr)) {
                Nat224.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(7, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(7, iArr2, Nat224.add(iArr, f90717a, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((Nat224.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, f90718b))) && Nat.addTo(11, f90719c, iArr3) != 0) {
            Nat.incAt(14, iArr3, 11);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat224.isZero(iArr)) {
            Nat224.zero(iArr2);
        } else {
            Nat224.sub(f90717a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j10 = ((long) iArr[10]) & 4294967295L;
        long j11 = ((long) iArr[11]) & 4294967295L;
        long j12 = ((long) iArr[12]) & 4294967295L;
        long j13 = ((long) iArr[13]) & 4294967295L;
        long j14 = ((((long) iArr[7]) & 4294967295L) + j11) - 1;
        long j15 = (((long) iArr[8]) & 4294967295L) + j12;
        long j16 = (((long) iArr[9]) & 4294967295L) + j13;
        long j17 = (((long) iArr[0]) & 4294967295L) - j14;
        long j18 = j17 & 4294967295L;
        long j19 = ((((long) iArr[1]) & 4294967295L) - j15) + (j17 >> 32);
        int i10 = (int) j19;
        iArr2[1] = i10;
        long j20 = ((((long) iArr[2]) & 4294967295L) - j16) + (j19 >> 32);
        int i11 = (int) j20;
        iArr2[2] = i11;
        long jG = a.g(((long) iArr[3]) & 4294967295L, j14, j10, j20 >> 32);
        long j21 = jG & 4294967295L;
        long jG2 = a.g(((long) iArr[4]) & 4294967295L, j15, j11, jG >> 32);
        iArr2[4] = (int) jG2;
        long jG3 = a.g(((long) iArr[5]) & 4294967295L, j16, j12, jG2 >> 32);
        iArr2[5] = (int) jG3;
        long jG4 = a.g(((long) iArr[6]) & 4294967295L, j10, j13, jG3 >> 32);
        iArr2[6] = (int) jG4;
        long j22 = (jG4 >> 32) + 1;
        long j23 = j21 + j22;
        long j24 = j18 - j22;
        iArr2[0] = (int) j24;
        long j25 = j24 >> 32;
        if (j25 != 0) {
            long j26 = j25 + (((long) i10) & 4294967295L);
            iArr2[1] = (int) j26;
            long j27 = (j26 >> 32) + (((long) i11) & 4294967295L);
            iArr2[2] = (int) j27;
            j23 += j27 >> 32;
        }
        long j28 = j23;
        iArr2[3] = (int) j28;
        if (((j28 >> 32) == 0 || Nat.incAt(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && Nat224.gte(iArr2, f90717a))) {
            return;
        }
        a(iArr2);
    }

    public static void reduce32(int i10, int[] iArr) {
        long j10;
        if (i10 != 0) {
            long j11 = ((long) i10) & 4294967295L;
            long j12 = (((long) iArr[0]) & 4294967295L) - j11;
            iArr[0] = (int) j12;
            long j13 = j12 >> 32;
            if (j13 != 0) {
                long j14 = j13 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j14;
                long j15 = (j14 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j15;
                j13 = j15 >> 32;
            }
            long j16 = (4294967295L & ((long) iArr[3])) + j11 + j13;
            iArr[3] = (int) j16;
            j10 = j16 >> 32;
        } else {
            j10 = 0;
        }
        if ((j10 == 0 || Nat.incAt(7, iArr, 4) == 0) && !(iArr[6] == -1 && Nat224.gte(iArr, f90717a))) {
            return;
        }
        a(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                Nat224.square(iArr2, iArrCreateExt);
            }
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.sub(iArr, iArr2, iArr3) != 0) {
            long j10 = (((long) iArr3[0]) & 4294967295L) + 1;
            iArr3[0] = (int) j10;
            long j11 = j10 >> 32;
            if (j11 != 0) {
                long j12 = j11 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j12;
                long j13 = (j12 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j13;
                j11 = j13 >> 32;
            }
            long j14 = ((4294967295L & ((long) iArr3[3])) - 1) + j11;
            iArr3[3] = (int) j14;
            if ((j14 >> 32) != 0) {
                Nat.decAt(7, iArr3, 4);
            }
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(14, iArr, iArr2, iArr3) == 0 || Nat.subFrom(11, f90719c, iArr3) == 0) {
            return;
        }
        Nat.decAt(14, iArr3, 11);
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, f90717a))) {
            a(iArr2);
        }
    }
}
