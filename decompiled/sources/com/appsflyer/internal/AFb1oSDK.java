package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1oSDK {
    public final String AFKeystoreWrapper;
    private final boolean valueOf;
    public final long values;

    public AFb1oSDK() {
    }

    public AFb1oSDK(String str, long j10, boolean z10) {
        this.AFKeystoreWrapper = str;
        this.values = j10;
        this.valueOf = z10;
    }

    @Nullable
    public static Uri AFKeystoreWrapper(@Nullable Activity activity) {
        if (activity == null || activity.getIntent() == null) {
            return null;
        }
        return activity.getReferrer();
    }

    public final boolean valueOf() {
        return this.valueOf;
    }
}
