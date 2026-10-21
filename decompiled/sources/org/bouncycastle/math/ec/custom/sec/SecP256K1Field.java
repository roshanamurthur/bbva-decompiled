package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes13.dex */
public class SecP256K1Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f90726a = {-977, -2, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f90727b = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f90728c = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.add(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && Nat256.gte(iArr3, f90726a))) {
            Nat.add33To(8, 977, iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((Nat.add(16, iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && Nat.gte(16, iArr3, f90727b))) && Nat.addTo(10, f90728c, iArr3) != 0) {
            Nat.incAt(16, iArr3, 10);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && Nat256.gte(iArr2, f90726a))) {
            Nat.add33To(8, 977, iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat256.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[7] == -1) {
            int[] iArr = f90726a;
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
            Nat.shiftDownBit(8, iArr2, Nat256.add(iArr, f90726a, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((Nat256.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && Nat.gte(16, iArr3, f90727b))) && Nat.addTo(10, f90728c, iArr3) != 0) {
            Nat.incAt(16, iArr3, 10);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat256.isZero(iArr)) {
            Nat256.zero(iArr2);
        } else {
            Nat256.sub(f90726a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        if (Nat256.mul33DWordAdd(977, Nat256.mul33Add(977, iArr, 8, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[7] == -1 && Nat256.gte(iArr2, f90726a))) {
            Nat.add33To(8, 977, iArr2);
        }
    }

    public static void reduce32(int i10, int[] iArr) {
        if ((i10 == 0 || Nat256.mul33WordAdd(977, i10, iArr, 0) == 0) && !(iArr[7] == -1 && Nat256.gte(iArr, f90726a))) {
            return;
        }
        Nat.add33To(8, 977, iArr);
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
            Nat.sub33From(8, 977, iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(16, iArr, iArr2, iArr3) == 0 || Nat.subFrom(10, f90728c, iArr3) == 0) {
            return;
        }
        Nat.decAt(16, iArr3, 10);
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && Nat256.gte(iArr2, f90726a))) {
            Nat.add33To(8, 977, iArr2);
        }
    }
}
