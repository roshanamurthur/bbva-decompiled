package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f65184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f65185b;

    static {
        f65185b = Build.VERSION.SDK_INT >= 29 ? new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"} : new String[]{"android.permission.ACCESS_FINE_LOCATION"};
    }

    private h() {
    }

    @NonNull
    public static String a(Context context) {
        if (!TextUtils.isEmpty(f65184a)) {
            return f65184a;
        }
        f65184a = "";
        if (context == null) {
            return "";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            f65184a = String.format("%s : %s", packageInfo.versionName, Integer.valueOf(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException e5) {
            com.salesforce.marketingcloud.g.b(l.f65197c, e5, "Failed to get Application Version from the PackageManager.", new Object[0]);
        }
        return f65184a;
    }

    public static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        for (String str : f65185b) {
            if (!a(context, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(Context context) {
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return a(context, "android.permission.BLUETOOTH_SCAN") && a(context, "android.permission.BLUETOOTH_CONNECT");
        }
        return true;
    }

    public static boolean a(@NonNull Context context, @NonNull String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public static boolean b(PackageManager packageManager, Intent intent) {
        return packageManager.queryIntentServices(intent, 65536).size() > 0;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public static boolean a(PackageManager packageManager, Intent intent) {
        return packageManager.queryBroadcastReceivers(intent, 0).size() > 0;
    }
}
