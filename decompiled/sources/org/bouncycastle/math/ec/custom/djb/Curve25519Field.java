package org.bouncycastle.math.ec.custom.djb;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.math.BigInteger;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes13.dex */
public class Curve25519Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f90640a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f90641b = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK};

    public static void a(int[] iArr) {
        long j10 = ((long) iArr[0]) & 4294967295L;
        int[] iArr2 = f90641b;
        long j11 = j10 - (((long) iArr2[0]) & 4294967295L);
        iArr[0] = (int) j11;
        long jDecAt = j11 >> 32;
        if (jDecAt != 0) {
            jDecAt = Nat.decAt(8, iArr, 1);
        }
        long j12 = (((long) iArr[8]) & 4294967295L) + 19 + jDecAt;
        iArr[8] = (int) j12;
        long jIncAt = j12 >> 32;
        if (jIncAt != 0) {
            jIncAt = Nat.incAt(15, iArr, 9);
        }
        iArr[15] = (int) (((((long) iArr[15]) & 4294967295L) - (((long) (iArr2[15] + 1)) & 4294967295L)) + jIncAt);
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat256.add(iArr, iArr2, iArr3);
        if (Nat256.gte(iArr3, f90640a)) {
            b(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat.add(16, iArr, iArr2, iArr3);
        if (Nat.gte(16, iArr3, f90641b)) {
            a(iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        Nat.inc(8, iArr, iArr2);
        if (Nat256.gte(iArr2, f90640a)) {
            b(iArr2);
        }
    }

    public static void b(int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) + 19;
        iArr[0] = (int) j10;
        long jIncAt = j10 >> 32;
        if (jIncAt != 0) {
            jIncAt = Nat.incAt(7, iArr, 1);
        }
        iArr[7] = (int) (((((long) iArr[7]) & 4294967295L) - SvgConstantsKt.SPECIFIED_SOLID_COLOR) + jIncAt);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat256.fromBigInteger(bigInteger);
        while (true) {
            int[] iArr = f90640a;
            if (!Nat256.gte(iArrFromBigInteger, iArr)) {
                return iArrFromBigInteger;
            }
            Nat256.subFrom(iArr, iArrFromBigInteger);
        }
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            Nat256.add(iArr, f90640a, iArr2);
            Nat.shiftDownBit(8, iArr2, 0);
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat256.mulAddTo(iArr, iArr2, iArr3);
        if (Nat.gte(16, iArr3, f90641b)) {
            a(iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat256.isZero(iArr)) {
            Nat256.zero(iArr2);
        } else {
            Nat256.sub(f90640a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        int i10 = iArr[7];
        Nat.shiftUpBit(8, iArr, 8, i10, iArr2, 0);
        int iMulByWordAddTo = Nat256.mulByWordAddTo(19, iArr, iArr2) << 1;
        int i11 = iArr2[7];
        iArr2[7] = Nat.addWordTo(7, (((i11 >>> 31) - (i10 >>> 31)) + iMulByWordAddTo) * 19, iArr2) + (Integer.MAX_VALUE & i11);
        if (Nat256.gte(iArr2, f90640a)) {
            b(iArr2);
        }
    }

    public static void reduce27(int i10, int[] iArr) {
        int i11 = iArr[7];
        iArr[7] = Nat.addWordTo(7, ((i10 << 1) | (i11 >>> 31)) * 19, iArr) + (i11 & Integer.MAX_VALUE);
        if (Nat256.gte(iArr, f90640a)) {
            b(iArr);
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
            long j10 = (((long) iArr3[0]) & 4294967295L) - 19;
            iArr3[0] = (int) j10;
            long jDecAt = j10 >> 32;
            if (jDecAt != 0) {
                jDecAt = Nat.decAt(7, iArr3, 1);
            }
            iArr3[7] = (int) ((4294967295L & ((long) iArr3[7])) + SvgConstantsKt.SPECIFIED_SOLID_COLOR + jDecAt);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            long j10 = ((long) iArr3[0]) & 4294967295L;
            int[] iArr4 = f90641b;
            long j11 = j10 + (((long) iArr4[0]) & 4294967295L);
            iArr3[0] = (int) j11;
            long jIncAt = j11 >> 32;
            if (jIncAt != 0) {
                jIncAt = Nat.incAt(8, iArr3, 1);
            }
            long j12 = ((((long) iArr3[8]) & 4294967295L) - 19) + jIncAt;
            iArr3[8] = (int) j12;
            long jDecAt = j12 >> 32;
            if (jDecAt != 0) {
                jDecAt = Nat.decAt(15, iArr3, 9);
            }
            iArr3[15] = (int) ((((long) iArr3[15]) & 4294967295L) + (((long) (iArr4[15] + 1)) & 4294967295L) + jDecAt);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        Nat.shiftUpBit(8, iArr, 0, iArr2);
        if (Nat256.gte(iArr2, f90640a)) {
            b(iArr2);
        }
    }
}
