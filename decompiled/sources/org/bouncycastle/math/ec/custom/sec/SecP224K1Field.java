package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat224;

/* JADX INFO: loaded from: classes13.dex */
public class SecP224K1Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f90707a = {-6803, -2, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f90708b = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f90709c = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.add(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && Nat224.gte(iArr3, f90707a))) {
            Nat.add33To(7, 6803, iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((Nat.add(14, iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, f90708b))) && Nat.addTo(9, f90709c, iArr3) != 0) {
            Nat.incAt(14, iArr3, 9);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, f90707a))) {
            Nat.add33To(7, 6803, iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat224.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[6] == -1 && Nat224.gte(iArrFromBigInteger, f90707a)) {
            Nat.add33To(7, 6803, iArrFromBigInteger);
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(7, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(7, iArr2, Nat224.add(iArr, f90707a, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((Nat224.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, f90708b))) && Nat.addTo(9, f90709c, iArr3) != 0) {
            Nat.incAt(14, iArr3, 9);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat224.isZero(iArr)) {
            Nat224.zero(iArr2);
        } else {
            Nat224.sub(f90707a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        if (Nat224.mul33DWordAdd(6803, Nat224.mul33Add(6803, iArr, 7, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, f90707a))) {
            Nat.add33To(7, 6803, iArr2);
        }
    }

    public static void reduce32(int i10, int[] iArr) {
        if ((i10 == 0 || Nat224.mul33WordAdd(6803, i10, iArr, 0) == 0) && !(iArr[6] == -1 && Nat224.gte(iArr, f90707a))) {
            return;
        }
        Nat.add33To(7, 6803, iArr);
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
            Nat.sub33From(7, 6803, iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(14, iArr, iArr2, iArr3) == 0 || Nat.subFrom(9, f90709c, iArr3) == 0) {
            return;
        }
        Nat.decAt(14, iArr3, 9);
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, f90707a))) {
            Nat.add33To(7, 6803, iArr2);
        }
    }
}
