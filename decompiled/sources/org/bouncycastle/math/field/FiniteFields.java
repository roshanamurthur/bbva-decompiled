package org.bouncycastle.math.field;

import java.math.BigInteger;
import sm.a;
import sm.b;
import sm.c;

/* JADX INFO: loaded from: classes13.dex */
public abstract class FiniteFields {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f90889a = new c(BigInteger.valueOf(2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f90890b = new c(BigInteger.valueOf(3));

    public static PolynomialExtensionField getBinaryExtensionField(int[] iArr) {
        if (iArr[0] != 0) {
            throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
        }
        for (int i10 = 1; i10 < iArr.length; i10++) {
            if (iArr[i10] <= iArr[i10 - 1]) {
                throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
            }
        }
        return new b(f90889a, new a(iArr));
    }

    public static FiniteField getPrimeField(BigInteger bigInteger) {
        int iBitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || iBitLength < 2) {
            throw new IllegalArgumentException("'characteristic' must be >= 2");
        }
        if (iBitLength < 3) {
            int iIntValue = bigInteger.intValue();
            if (iIntValue == 2) {
                return f90889a;
            }
            if (iIntValue == 3) {
                return f90890b;
            }
        }
        return new c(bigInteger);
    }
}
