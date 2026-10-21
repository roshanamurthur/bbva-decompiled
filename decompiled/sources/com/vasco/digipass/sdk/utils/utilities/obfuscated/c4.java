package com.vasco.digipass.sdk.utils.utilities.obfuscated;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c4 {
    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        y3.c(iArr, iArr2, iArr3);
        y3.b(iArr, 8, iArr2, 8, iArr3, 16);
        int iA = y3.a(iArr3, 8, iArr3, 16);
        int iA2 = y3.a(iArr3, 24, iArr3, 16, y3.a(iArr3, 0, iArr3, 8, 0) + iA) + iA;
        int[] iArrA = y3.a();
        int[] iArrA2 = y3.a();
        boolean z10 = y3.a(iArr, 8, iArr, 0, iArrA, 0) != y3.a(iArr2, 8, iArr2, 0, iArrA2, 0);
        int[] iArrC = y3.c();
        y3.c(iArrA, iArrA2, iArrC);
        e4.a(32, iA2 + (z10 ? e4.a(16, iArrC, 0, iArr3, 8) : e4.b(16, iArrC, 0, iArr3, 8)), iArr3, 24);
    }

    public static void a(int[] iArr, int[] iArr2) {
        y3.d(iArr, iArr2);
        y3.c(iArr, 8, iArr2, 16);
        int iA = y3.a(iArr2, 8, iArr2, 16);
        int iA2 = y3.a(iArr2, 24, iArr2, 16, y3.a(iArr2, 0, iArr2, 8, 0) + iA) + iA;
        int[] iArrA = y3.a();
        y3.a(iArr, 8, iArr, 0, iArrA, 0);
        int[] iArrC = y3.c();
        y3.d(iArrA, iArrC);
        e4.a(32, e4.b(16, iArrC, 0, iArr2, 8) + iA2, iArr2, 24);
    }
}
