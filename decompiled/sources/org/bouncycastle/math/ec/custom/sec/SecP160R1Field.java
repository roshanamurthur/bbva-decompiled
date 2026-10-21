package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat160;

/* JADX INFO: loaded from: classes13.dex */
public class SecP160R1Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f90671a = {Integer.MAX_VALUE, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f90672b = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f90673c = {-1, -1073741826, -1, -1, -1, 1, 1};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat160.add(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && Nat160.gte(iArr3, f90671a))) {
            Nat.addWordTo(5, -2147483647, iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((Nat.add(10, iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && Nat.gte(10, iArr3, f90672b))) && Nat.addTo(7, f90673c, iArr3) != 0) {
            Nat.incAt(10, iArr3, 7);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && Nat160.gte(iArr2, f90671a))) {
            Nat.addWordTo(5, -2147483647, iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat160.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[4] == -1) {
            int[] iArr = f90671a;
            if (Nat160.gte(iArrFromBigInteger, iArr)) {
                Nat160.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(5, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(5, iArr2, Nat160.add(iArr, f90671a, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat160.createExt();
        Nat160.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((Nat160.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && Nat.gte(10, iArr3, f90672b))) && Nat.addTo(7, f90673c, iArr3) != 0) {
            Nat.incAt(10, iArr3, 7);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat160.isZero(iArr)) {
            Nat160.zero(iArr2);
        } else {
            Nat160.sub(f90671a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j10 = ((long) iArr[5]) & 4294967295L;
        long j11 = ((long) iArr[6]) & 4294967295L;
        long j12 = ((long) iArr[7]) & 4294967295L;
        long j13 = ((long) iArr[8]) & 4294967295L;
        long j14 = ((long) iArr[9]) & 4294967295L;
        long j15 = (((long) iArr[0]) & 4294967295L) + j10 + (j10 << 31);
        iArr2[0] = (int) j15;
        long j16 = (((long) iArr[1]) & 4294967295L) + j11 + (j11 << 31) + (j15 >>> 32);
        iArr2[1] = (int) j16;
        long j17 = (((long) iArr[2]) & 4294967295L) + j12 + (j12 << 31) + (j16 >>> 32);
        iArr2[2] = (int) j17;
        long j18 = (((long) iArr[3]) & 4294967295L) + j13 + (j13 << 31) + (j17 >>> 32);
        iArr2[3] = (int) j18;
        long j19 = (4294967295L & ((long) iArr[4])) + j14 + (j14 << 31) + (j18 >>> 32);
        iArr2[4] = (int) j19;
        reduce32((int) (j19 >>> 32), iArr2);
    }

    public static void reduce32(int i10, int[] iArr) {
        if ((i10 == 0 || Nat160.mulWordsAdd(-2147483647, i10, iArr, 0) == 0) && !(iArr[4] == -1 && Nat160.gte(iArr, f90671a))) {
            return;
        }
        Nat.addWordTo(5, -2147483647, iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat160.createExt();
        Nat160.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2) {
        int[] iArrCreateExt = Nat160.createExt();
        Nat160.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                Nat160.square(iArr2, iArrCreateExt);
            }
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat160.sub(iArr, iArr2, iArr3) != 0) {
            Nat.subWordFrom(5, -2147483647, iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(10, iArr, iArr2, iArr3) == 0 || Nat.subFrom(7, f90673c, iArr3) == 0) {
            return;
        }
        Nat.decAt(10, iArr3, 7);
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && Nat160.gte(iArr2, f90671a))) {
            Nat.addWordTo(5, -2147483647, iArr2);
        }
    }
}
