package com.salesforce.marketingcloud.util;

import android.os.Build;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f65132a = "Amazon";

    private b() {
    }

    public static boolean a() {
        return Build.MANUFACTURER.equalsIgnoreCase(f65132a);
    }
}
