package com.veridas.util;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes11.dex */
public class Thread {
    public static boolean runOnUiThread(Runnable runnable) {
        return new Handler(Looper.getMainLooper()).post(runnable);
    }
}
