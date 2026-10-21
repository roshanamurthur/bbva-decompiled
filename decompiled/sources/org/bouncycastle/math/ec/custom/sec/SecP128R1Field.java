package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat128;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes13.dex */
public class SecP128R1Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f90657a = {-1, -1, -1, -3};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f90658b = {1, 0, 0, 4, -2, -1, 3, -4};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f90659c = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void a(int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j12;
            long j13 = (j12 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j13;
            j11 = j13 >> 32;
        }
        iArr[3] = (int) ((4294967295L & ((long) iArr[3])) + 2 + j11);
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.add(iArr, iArr2, iArr3) != 0 || ((iArr3[3] >>> 1) >= 2147483646 && Nat128.gte(iArr3, f90657a))) {
            a(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.add(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && Nat256.gte(iArr3, f90658b))) {
            Nat.addTo(8, f90659c, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(4, iArr, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && Nat128.gte(iArr2, f90657a))) {
            a(iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat128.fromBigInteger(bigInteger);
        if ((iArrFromBigInteger[3] >>> 1) >= 2147483646) {
            int[] iArr = f90657a;
            if (Nat128.gte(iArrFromBigInteger, iArr)) {
                Nat128.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(4, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(4, iArr2, Nat128.add(iArr, f90657a, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat128.createExt();
        Nat128.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.mulAddTo(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && Nat256.gte(iArr3, f90658b))) {
            Nat.addTo(8, f90659c, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat128.isZero(iArr)) {
            Nat128.zero(iArr2);
        } else {
            Nat128.sub(f90657a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j10 = ((long) iArr[0]) & 4294967295L;
        long j11 = ((long) iArr[1]) & 4294967295L;
        long j12 = ((long) iArr[2]) & 4294967295L;
        long j13 = ((long) iArr[3]) & 4294967295L;
        long j14 = ((long) iArr[4]) & 4294967295L;
        long j15 = ((long) iArr[5]) & 4294967295L;
        long j16 = ((long) iArr[6]) & 4294967295L;
        long j17 = ((long) iArr[7]) & 4294967295L;
        long j18 = j13 + j17;
        long j19 = j16 + (j17 << 1);
        long j20 = j12 + j19;
        long j21 = j15 + (j19 << 1);
        long j22 = j11 + j21;
        long j23 = j14 + (j21 << 1);
        long j24 = j10 + j23;
        iArr2[0] = (int) j24;
        long j25 = j22 + (j24 >>> 32);
        iArr2[1] = (int) j25;
        long j26 = j20 + (j25 >>> 32);
        iArr2[2] = (int) j26;
        long j27 = j18 + (j23 << 1) + (j26 >>> 32);
        iArr2[3] = (int) j27;
        reduce32((int) (j27 >>> 32), iArr2);
    }

    public static void reduce32(int i10, int[] iArr) {
        while (i10 != 0) {
            long j10 = ((long) i10) & 4294967295L;
            long j11 = (((long) iArr[0]) & 4294967295L) + j10;
            iArr[0] = (int) j11;
            long j12 = j11 >> 32;
            if (j12 != 0) {
                long j13 = j12 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j13;
                long j14 = (j13 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j14;
                j12 = j14 >> 32;
            }
            long j15 = (4294967295L & ((long) iArr[3])) + (j10 << 1) + j12;
            iArr[3] = (int) j15;
            i10 = (int) (j15 >> 32);
        }
        if ((iArr[3] >>> 1) < 2147483646 || !Nat128.gte(iArr, f90657a)) {
            return;
        }
        a(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat128.createExt();
        Nat128.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2) {
        int[] iArrCreateExt = Nat128.createExt();
        Nat128.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                Nat128.square(iArr2, iArrCreateExt);
            }
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.sub(iArr, iArr2, iArr3) != 0) {
            long j10 = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j10;
            long j11 = j10 >> 32;
            if (j11 != 0) {
                long j12 = j11 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j12;
                long j13 = (j12 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j13;
                j11 = j13 >> 32;
            }
            iArr3[3] = (int) (((4294967295L & ((long) iArr3[3])) - 2) + j11);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(10, iArr, iArr2, iArr3) != 0) {
            Nat.subFrom(8, f90659c, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(4, iArr, 0, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && Nat128.gte(iArr2, f90657a))) {
            a(iArr2);
        }
    }
}
