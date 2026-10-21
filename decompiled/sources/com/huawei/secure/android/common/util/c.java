package com.huawei.secure.android.common.util;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Handler f50688a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        f50688a.post(runnable);
    }
}
