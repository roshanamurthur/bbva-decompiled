package com.akamai.botman;

import android.util.Log;
import androidx.appcompat.widget.o1;
import com.google.android.gms.wearable.WearableStatusCodes;

/* JADX INFO: loaded from: classes2.dex */
public final class ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ap f26309a = new ap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26310b = 5;

    public static void a(int i10, String str, String str2) {
        String strConcat = "BMP:".concat(String.valueOf(str));
        if (str2.length() <= 4000) {
            Log.println(i10, strConcat, str2);
            return;
        }
        int length = str2.length() / WearableStatusCodes.TARGET_NODE_NOT_CONNECTED;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = i11 + 1;
            int i13 = i12 * WearableStatusCodes.TARGET_NODE_NOT_CONNECTED;
            if (i13 >= str2.length()) {
                StringBuilder sbC = o1.c("Part ", i11, ": ");
                sbC.append(str2.substring(i11 * WearableStatusCodes.TARGET_NODE_NOT_CONNECTED));
                Log.println(i10, strConcat, sbC.toString());
            } else {
                StringBuilder sbC2 = o1.c("Part ", i11, ": ");
                sbC2.append(str2.substring(i11 * WearableStatusCodes.TARGET_NODE_NOT_CONNECTED, i13));
                Log.println(i10, strConcat, sbC2.toString());
            }
            i11 = i12;
        }
    }

    public static void c(String str, String str2, Throwable... thArr) {
        f26309a.b(6, str, str2, thArr);
    }

    public final void b(int i10, String str, String str2, Throwable... thArr) {
        if (i10 < this.f26310b) {
            return;
        }
        if (thArr.length <= 0) {
            a(i10, str, str2);
            return;
        }
        a(i10, str, str2 + '\n' + Log.getStackTraceString(thArr[0]));
    }

    public static void b(String str, String str2, Throwable... thArr) {
        f26309a.b(5, str, str2, thArr);
    }

    public static void a(String str, String str2, Throwable... thArr) {
        f26309a.b(4, str, str2, thArr);
    }
}
