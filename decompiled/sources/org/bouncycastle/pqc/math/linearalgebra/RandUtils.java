package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes13.dex */
public class RandUtils {
    public static int a(int i10, SecureRandom secureRandom) {
        int iNextInt;
        int i11;
        if (((-i10) & i10) == i10) {
            return (int) ((((long) i10) * ((long) (secureRandom.nextInt() >>> 1))) >> 31);
        }
        do {
            iNextInt = secureRandom.nextInt() >>> 1;
            i11 = iNextInt % i10;
        } while ((i10 - 1) + (iNextInt - i11) < 0);
        return i11;
    }
}
