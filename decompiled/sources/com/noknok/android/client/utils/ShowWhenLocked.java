package com.noknok.android.client.utils;

import android.app.Activity;
import android.os.Build;

/* JADX INFO: loaded from: classes11.dex */
public class ShowWhenLocked {
    public static void enable(Activity activity) {
        if (Build.VERSION.SDK_INT >= 27) {
            activity.setShowWhenLocked(true);
        } else {
            activity.getWindow().addFlags(4718592);
        }
    }
}
