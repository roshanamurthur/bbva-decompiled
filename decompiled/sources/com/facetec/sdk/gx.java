package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public final class gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41837a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41839d;

    public static void b(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length / 2; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[(iArr.length - i10) - 1];
            iArr[(iArr.length - i10) - 1] = i11;
        }
    }

    public static int e(int i10) {
        int[][] iArr = gi.f41780a.f41783e;
        return ((iArr[0][(i10 >>> 24) & 255] + iArr[1][(i10 >>> 16) & 255]) ^ iArr[2][(i10 >>> 8) & 255]) + iArr[3][i10 & 255];
    }
}
