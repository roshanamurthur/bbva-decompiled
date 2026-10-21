package com.appsflyer.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class AFg1jSDK {
    public static int AFInAppEventType;
    public static int AFKeystoreWrapper;
    public static int valueOf;
    public static final Object values = new Object();

    public static void AFInAppEventParameterName(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length / 2; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[(iArr.length - i10) - 1];
            iArr[(iArr.length - i10) - 1] = i11;
        }
    }

    public static int AFInAppEventParameterName(int i10) {
        int[][] iArr = AFg1sSDK.values.AFKeystoreWrapper;
        return ((iArr[0][i10 >>> 24] + iArr[1][(i10 >>> 16) & 255]) ^ iArr[2][(i10 >>> 8) & 255]) + iArr[3][i10 & 255];
    }
}
