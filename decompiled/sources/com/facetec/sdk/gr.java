package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public final class gr {
    public static void b(int i10, int i11, boolean z10, int i12, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z10) {
            d(iArr);
        }
        int i13 = 0;
        while (i13 < i12) {
            int i14 = i10 ^ iArr[i13];
            int iC = i11 ^ c(i14, iArr2);
            i13++;
            i11 = i14;
            i10 = iC;
        }
        int i15 = i10 ^ iArr[iArr.length - 2];
        int i16 = i11 ^ iArr[iArr.length - 1];
        if (!z10) {
            d(iArr);
        }
        iArr3[0] = i16;
        iArr3[1] = i15;
    }

    private static int c(int i10, int[][] iArr) {
        return ((iArr[0][i10 >>> 24] + iArr[1][(i10 >>> 16) & 255]) ^ iArr[2][(i10 >>> 8) & 255]) + iArr[3][i10 & 255];
    }

    private static void d(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length / 2; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[(iArr.length - i10) - 1];
            iArr[(iArr.length - i10) - 1] = i11;
        }
    }
}
