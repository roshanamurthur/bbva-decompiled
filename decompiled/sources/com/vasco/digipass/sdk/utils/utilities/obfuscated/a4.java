package com.vasco.digipass.sdk.utils.utilities.obfuscated;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a4 {
    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        w3.c(iArr, iArr2, iArr3);
        w3.b(iArr, 6, iArr2, 6, iArr3, 12);
        int iA = w3.a(iArr3, 6, iArr3, 12);
        int iA2 = w3.a(iArr3, 18, iArr3, 12, w3.a(iArr3, 0, iArr3, 6, 0) + iA) + iA;
        int[] iArrA = w3.a();
        int[] iArrA2 = w3.a();
        boolean z10 = w3.a(iArr, 6, iArr, 0, iArrA, 0) != w3.a(iArr2, 6, iArr2, 0, iArrA2, 0);
        int[] iArrC = w3.c();
        w3.c(iArrA, iArrA2, iArrC);
        e4.a(24, iA2 + (z10 ? e4.a(12, iArrC, 0, iArr3, 6) : e4.b(12, iArrC, 0, iArr3, 6)), iArr3, 18);
    }

    public static void a(int[] iArr, int[] iArr2) {
        w3.c(iArr, iArr2);
        w3.c(iArr, 6, iArr2, 12);
        int iA = w3.a(iArr2, 6, iArr2, 12);
        int iA2 = w3.a(iArr2, 18, iArr2, 12, w3.a(iArr2, 0, iArr2, 6, 0) + iA) + iA;
        int[] iArrA = w3.a();
        w3.a(iArr, 6, iArr, 0, iArrA, 0);
        int[] iArrC = w3.c();
        w3.c(iArrA, iArrC);
        e4.a(24, e4.b(12, iArrC, 0, iArr2, 6) + iA2, iArr2, 18);
    }
}
