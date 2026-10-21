package com.mypinpad.tsdk.isolation;

import android.os.Debug;

/* JADX INFO: loaded from: classes10.dex */
public final class setHttpAuthUsernamePassword {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f59808a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59809b = 1;

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = f59809b;
        int i14 = (((i13 ^ 87) | (i13 & 87)) << 1) - (((~i13) & 87) | (i13 & (-88)));
        f59808a = i14 % 128;
        int i15 = i14 % 2;
        boolean zIsDebuggerConnected = Debug.isDebuggerConnected();
        int i16 = f59808a;
        int i17 = i16 & 17;
        int i18 = -(-(i16 | 17));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        f59809b = i19 % 128;
        int i20 = i19 % 2;
        return Boolean.valueOf(zIsDebuggerConnected);
    }

    public static boolean setY() {
        return ((Boolean) setOnFocusChangeListener(new Object[0], -2139127130, 2139127130, (int) System.currentTimeMillis())).booleanValue();
    }
}
