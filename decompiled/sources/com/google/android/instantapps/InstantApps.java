package com.google.android.instantapps;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bbva.component.dm.actionlauncher.model.Action;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.bouncycastle.i18n.ErrorBundle;

/* JADX INFO: loaded from: classes9.dex */
public final class InstantApps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f43893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f43894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f43895c;

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f43896b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PackageManager f43897a;

        public a(PackageManager packageManager) {
            this.f43897a = packageManager;
        }
    }

    public static boolean a(@NonNull Activity activity, @Nullable Intent intent, int i10, @Nullable String str) {
        if (activity == null) {
            throw new IllegalArgumentException("Activity must not be null");
        }
        if (!isInstantApp(activity)) {
            return false;
        }
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(Action.TYPE_MARKET).authority(ErrorBundle.DETAIL_ENTRY).appendQueryParameter("id", activity.getPackageName());
        if (!TextUtils.isEmpty(str)) {
            builderAppendQueryParameter.appendQueryParameter("referrer", str);
        }
        Intent intent2 = new Intent("com.google.android.finsky.action.IA_INSTALL").setData(builderAppendQueryParameter.build()).setPackage("com.android.vending");
        intent2.putExtra("postInstallIntent", intent);
        if (intent != null && activity.getPackageManager().resolveActivity(intent2, 0) != null) {
            activity.startActivityForResult(intent2, i10);
            return true;
        }
        Intent intentPutExtra = new Intent("android.intent.action.VIEW").setPackage("com.android.vending").addCategory("android.intent.category.DEFAULT").putExtra("callerId", activity.getPackageName()).putExtra("overlay", true);
        Uri.Builder builderAppendQueryParameter2 = new Uri.Builder().scheme(Action.TYPE_MARKET).authority(ErrorBundle.DETAIL_ENTRY).appendQueryParameter("id", activity.getPackageName());
        if (!TextUtils.isEmpty(str)) {
            builderAppendQueryParameter2.appendQueryParameter("referrer", str);
        }
        intentPutExtra.setData(builderAppendQueryParameter2.build());
        activity.startActivityForResult(intentPutExtra, i10);
        return true;
    }

    public static boolean isInstantApp(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context must be non-null");
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalStateException("Application context is null!");
        }
        if (f43893a != null && applicationContext.equals(f43894b)) {
            return f43893a.booleanValue();
        }
        Boolean bool = null;
        f43893a = null;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            if (f43895c == null || !applicationContext.equals(f43894b)) {
                f43895c = new a(applicationContext.getPackageManager());
            }
            a aVar = f43895c;
            aVar.getClass();
            if (i10 >= 26) {
                if (a.f43896b == null) {
                    try {
                        a.f43896b = PackageManager.class.getDeclaredMethod("isInstantApp", new Class[0]);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                }
                bool = (Boolean) a.f43896b.invoke(aVar.f43897a, new Object[0]);
            }
        }
        f43894b = applicationContext;
        if (bool != null) {
            f43893a = bool;
        } else {
            try {
                applicationContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f43893a = Boolean.TRUE;
            } catch (ClassNotFoundException unused2) {
                f43893a = Boolean.FALSE;
            }
        }
        return f43893a.booleanValue();
    }

    @Deprecated
    public static boolean showInstallPrompt(@NonNull Activity activity, int i10, @Nullable String str) {
        return a(activity, null, i10, str);
    }

    public static boolean showInstallPrompt(@NonNull Activity activity, @NonNull Intent intent, int i10, @Nullable String str) {
        return a(activity, intent, i10, str);
    }
}
