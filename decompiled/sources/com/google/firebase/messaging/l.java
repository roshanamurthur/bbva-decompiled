package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import java.util.List;

/* JADX INFO: compiled from: Metadata.java */
/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public String f48643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    public String f48644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("this")
    public int f48645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("this")
    public int f48646e = 0;

    public l(Context context) {
        this.f48642a = context;
    }

    public static String c(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            return applicationId;
        }
        String[] strArrSplit = applicationId.split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public final synchronized String a() {
        try {
            if (this.f48643b == null) {
                f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f48643b;
    }

    public final synchronized String b() {
        try {
            if (this.f48644c == null) {
                f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f48644c;
    }

    public final PackageInfo d(String str) {
        try {
            return this.f48642a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e5) {
            Log.w(Constants.TAG, "Failed to find package " + e5);
            return null;
        }
    }

    public final boolean e() {
        synchronized (this) {
            int i10 = this.f48646e;
            if (i10 == 0) {
                PackageManager packageManager = this.f48642a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") != -1) {
                    if (!PlatformVersion.isAtLeastO()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                            this.f48646e = 1;
                            return true;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
                        this.f48646e = 2;
                        return true;
                    }
                    Log.w(Constants.TAG, "Failed to resolve IID implementation package, falling back");
                    if (PlatformVersion.isAtLeastO()) {
                        this.f48646e = 2;
                    } else {
                        this.f48646e = 1;
                    }
                    i10 = this.f48646e;
                }
                return false;
            }
            if (i10 != 0) {
                return true;
            }
            return false;
        }
    }

    public final synchronized void f() {
        PackageInfo packageInfoD = d(this.f48642a.getPackageName());
        if (packageInfoD != null) {
            this.f48643b = Integer.toString(packageInfoD.versionCode);
            this.f48644c = packageInfoD.versionName;
        }
    }
}
