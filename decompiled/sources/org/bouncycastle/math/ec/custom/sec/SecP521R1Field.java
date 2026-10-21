package org.bouncycastle.math.ec.custom.sec;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat512;

/* JADX INFO: loaded from: classes13.dex */
public class SecP521R1Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f90752a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        int iAdd = Nat.add(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (iAdd > 511 || (iAdd == 511 && Nat.eq(16, iArr3, f90752a))) {
            iAdd = (Nat.inc(16, iArr3) + iAdd) & 511;
        }
        iArr3[16] = iAdd;
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        int iInc = Nat.inc(16, iArr, iArr2) + iArr[16];
        if (iInc > 511 || (iInc == 511 && Nat.eq(16, iArr2, f90752a))) {
            iInc = (Nat.inc(16, iArr2) + iInc) & 511;
        }
        iArr2[16] = iInc;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat.fromBigInteger(ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY, bigInteger);
        if (Nat.eq(17, iArrFromBigInteger, f90752a)) {
            Nat.zero(17, iArrFromBigInteger);
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        int i10 = iArr[16];
        iArr2[16] = (Nat.shiftDownBit(16, iArr, i10, iArr2) >>> 23) | (i10 >>> 1);
    }

    public static void implMultiply(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat512.mul(iArr, iArr2, iArr3);
        int i10 = iArr[16];
        int i11 = iArr2[16];
        iArr3[32] = (i10 * i11) + Nat.mul31BothAdd(16, i10, iArr2, i11, iArr, iArr3, 16);
    }

    public static void implSquare(int[] iArr, int[] iArr2) {
        Nat512.square(iArr, iArr2);
        int i10 = iArr[16];
        iArr2[32] = (i10 * i10) + Nat.mulWordAddTo(16, i10 << 1, iArr, 0, iArr2, 16);
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = Nat.create(33);
        implMultiply(iArr, iArr2, iArrCreate);
        reduce(iArrCreate, iArr3);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat.isZero(17, iArr)) {
            Nat.zero(17, iArr2);
        } else {
            Nat.sub(17, f90752a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        int i10 = iArr[32];
        int iAddTo = Nat.addTo(16, iArr, iArr2) + (Nat.shiftDownBits(16, iArr, 16, 9, i10, iArr2, 0) >>> 23) + (i10 >>> 9);
        if (iAddTo > 511 || (iAddTo == 511 && Nat.eq(16, iArr2, f90752a))) {
            iAddTo = (Nat.inc(16, iArr2) + iAddTo) & 511;
        }
        iArr2[16] = iAddTo;
    }

    public static void reduce23(int[] iArr) {
        int i10 = iArr[16];
        int iAddWordTo = Nat.addWordTo(16, i10 >>> 9, iArr) + (i10 & 511);
        if (iAddWordTo > 511 || (iAddWordTo == 511 && Nat.eq(16, iArr, f90752a))) {
            iAddWordTo = (Nat.inc(16, iArr) + iAddWordTo) & 511;
        }
        iArr[16] = iAddWordTo;
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreate = Nat.create(33);
        implSquare(iArr, iArrCreate);
        reduce(iArrCreate, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2) {
        int[] iArrCreate = Nat.create(33);
        implSquare(iArr, iArrCreate);
        while (true) {
            reduce(iArrCreate, iArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                implSquare(iArr2, iArrCreate);
            }
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        int iSub = (Nat.sub(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (iSub < 0) {
            iSub = (Nat.dec(16, iArr3) + iSub) & 511;
        }
        iArr3[16] = iSub;
    }

    public static void twice(int[] iArr, int[] iArr2) {
        int i10 = iArr[16];
        iArr2[16] = (Nat.shiftUpBit(16, iArr, i10 << 23, iArr2) | (i10 << 1)) & 511;
    }
}
