package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public abstract class q3 {
    private static int a(int i10) {
        int i11 = 0;
        while ((i10 & 1) == 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        if (e4.e(length, iArr2)) {
            throw new IllegalArgumentException("'x' cannot be 0");
        }
        int iA = 0;
        if (e4.d(length, iArr2)) {
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            return;
        }
        int[] iArrA = e4.a(length, iArr2);
        int[] iArrA2 = e4.a(length);
        iArrA2[0] = 1;
        int iA2 = (1 & iArrA[0]) == 0 ? a(iArr, iArrA, length, iArrA2, 0) : 0;
        if (e4.d(length, iArrA)) {
            a(iArr, iA2, iArrA2, iArr3);
            return;
        }
        int[] iArrA3 = e4.a(length, iArr);
        int[] iArrA4 = e4.a(length);
        int i10 = length;
        while (true) {
            int i11 = i10 - 1;
            if (iArrA[i11] == 0 && iArrA3[i11] == 0) {
                i10--;
            } else if (e4.c(i10, iArrA, iArrA3)) {
                e4.e(i10, iArrA3, iArrA);
                iA2 = a(iArr, iArrA, i10, iArrA2, (e4.e(length, iArrA4, iArrA2) - iA) + iA2);
                if (e4.d(i10, iArrA)) {
                    a(iArr, iA2, iArrA2, iArr3);
                    return;
                }
            } else {
                e4.e(i10, iArrA, iArrA3);
                iA = a(iArr, iArrA3, i10, iArrA4, (e4.e(length, iArrA2, iArrA4) - iA2) + iA);
                if (e4.d(i10, iArrA3)) {
                    a(iArr, iA, iArrA4, iArr3);
                    return;
                }
            }
        }
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        SecureRandom secureRandom = new SecureRandom();
        int[] iArrA = e4.a(length);
        int i10 = length - 1;
        int i11 = iArr[i10];
        int i12 = i11 | (i11 >>> 1);
        int i13 = i12 | (i12 >>> 2);
        int i14 = i13 | (i13 >>> 4);
        int i15 = i14 | (i14 >>> 8);
        int i16 = i15 | (i15 >>> 16);
        do {
            for (int i17 = 0; i17 != length; i17++) {
                iArrA[i17] = secureRandom.nextInt();
            }
            iArrA[i10] = iArrA[i10] & i16;
        } while (e4.c(length, iArrA, iArr));
        return iArrA;
    }

    private static void a(int[] iArr, int i10, int[] iArr2, int[] iArr3) {
        if (i10 < 0) {
            e4.a(iArr.length, iArr2, iArr, iArr3);
        } else {
            System.arraycopy(iArr2, 0, iArr3, 0, iArr.length);
        }
    }

    private static int a(int[] iArr, int[] iArr2, int i10, int[] iArr3, int i11) {
        int i12;
        int iE;
        int length = iArr.length;
        int i13 = 0;
        while (true) {
            i12 = iArr2[0];
            if (i12 != 0) {
                break;
            }
            e4.d(i10, iArr2, 0);
            i13 += 32;
        }
        int iA = a(i12);
        if (iA > 0) {
            e4.b(i10, iArr2, iA, 0);
            i13 += iA;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            if ((iArr3[0] & 1) != 0) {
                if (i11 < 0) {
                    iE = e4.a(length, iArr, iArr3);
                } else {
                    iE = e4.e(length, iArr, iArr3);
                }
                i11 = iE + i11;
            }
            e4.c(length, iArr3, i11);
        }
        return i11;
    }
}
