package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b4 {
    public static long[] a() {
        return new long[7];
    }

    public static long[] b() {
        return new long[14];
    }

    public static BigInteger c(long[] jArr) {
        byte[] bArr = new byte[56];
        for (int i10 = 0; i10 < 7; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                k4.a(j10, bArr, (6 - i10) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static boolean a(long[] jArr, long[] jArr2) {
        for (int i10 = 6; i10 >= 0; i10--) {
            if (jArr[i10] != jArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(long[] jArr) {
        for (int i10 = 0; i10 < 7; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static long[] a(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 448) {
            long[] jArrA = a();
            int i10 = 0;
            while (bigInteger.signum() != 0) {
                jArrA[i10] = bigInteger.longValue();
                bigInteger = bigInteger.shiftRight(64);
                i10++;
            }
            return jArrA;
        }
        throw new IllegalArgumentException();
    }

    public static boolean a(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 7; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }
}
