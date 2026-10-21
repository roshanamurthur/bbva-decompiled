package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public abstract class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final y2 f66504a = new o4(BigInteger.valueOf(2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final y2 f66505b = new o4(BigInteger.valueOf(3));

    public static n4 a(int[] iArr) {
        if (iArr[0] != 0) {
            throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
        }
        for (int i10 = 1; i10 < iArr.length; i10++) {
            if (iArr[i10] <= iArr[i10 - 1]) {
                throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
            }
        }
        return new d3(f66504a, new a3(iArr));
    }

    public static y2 a(BigInteger bigInteger) {
        int iBitLength = bigInteger.bitLength();
        if (bigInteger.signum() > 0 && iBitLength >= 2) {
            if (iBitLength < 3) {
                int iIntValue = bigInteger.intValue();
                if (iIntValue == 2) {
                    return f66504a;
                }
                if (iIntValue == 3) {
                    return f66505b;
                }
            }
            return new o4(bigInteger);
        }
        throw new IllegalArgumentException("'characteristic' must be >= 2");
    }
}
