package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat160;

/* JADX INFO: loaded from: classes13.dex */
public class SecP160R2Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f90680a = {-21389, -2, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f90681b = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f90682c = {-457489321, -42779, -2, -1, -1, 42777, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat160.add(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && Nat160.gte(iArr3, f90680a))) {
            Nat.add33To(5, 21389, iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((Nat.add(10, iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && Nat.gte(10, iArr3, f90681b))) && Nat.addTo(7, f90682c, iArr3) != 0) {
            Nat.incAt(10, iArr3, 7);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && Nat160.gte(iArr2, f90680a))) {
            Nat.add33To(5, 21389, iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat160.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[4] == -1) {
            int[] iArr = f90680a;
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
            Nat.shiftDownBit(5, iArr2, Nat160.add(iArr, f90680a, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat160.createExt();
        Nat160.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((Nat160.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && Nat.gte(10, iArr3, f90681b))) && Nat.addTo(7, f90682c, iArr3) != 0) {
            Nat.incAt(10, iArr3, 7);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat160.isZero(iArr)) {
            Nat160.zero(iArr2);
        } else {
            Nat160.sub(f90680a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        if (Nat160.mul33DWordAdd(21389, Nat160.mul33Add(21389, iArr, 5, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[4] == -1 && Nat160.gte(iArr2, f90680a))) {
            Nat.add33To(5, 21389, iArr2);
        }
    }

    public static void reduce32(int i10, int[] iArr) {
        if ((i10 == 0 || Nat160.mul33WordAdd(21389, i10, iArr, 0) == 0) && !(iArr[4] == -1 && Nat160.gte(iArr, f90680a))) {
            return;
        }
        Nat.add33To(5, 21389, iArr);
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
            Nat.sub33From(5, 21389, iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(10, iArr, iArr2, iArr3) == 0 || Nat.subFrom(7, f90682c, iArr3) == 0) {
            return;
        }
        Nat.decAt(10, iArr3, 7);
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && Nat160.gte(iArr2, f90680a))) {
            Nat.add33To(5, 21389, iArr2);
        }
    }
}
