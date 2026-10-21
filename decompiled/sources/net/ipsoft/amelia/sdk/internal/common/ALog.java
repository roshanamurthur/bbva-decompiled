package net.ipsoft.amelia.sdk.internal.common;

import android.util.Log;

/* JADX INFO: loaded from: classes12.dex */
public class ALog {
    public static String TAG_AMELIA = "amelia";
    public static boolean enabled = false;

    public static void w(String str, String str2) {
        if (enabled) {
            Log.w(str, str2);
        }
    }

    public static void d(String str, String str2) {
    }
}
