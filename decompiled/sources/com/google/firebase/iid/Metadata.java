package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class Metadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public String f48421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    public String f48422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("this")
    public int f48423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("this")
    public int f48424e = 0;

    public Metadata(Context context) {
        this.f48420a = context;
    }

    public static String getDefaultSenderId(FirebaseApp firebaseApp) {
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

    public final PackageInfo a(String str) {
        try {
            return this.f48420a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e5) {
            String strValueOf = String.valueOf(e5);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(strValueOf);
            Log.w("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }

    public final synchronized void b() {
        PackageInfo packageInfoA = a(this.f48420a.getPackageName());
        if (packageInfoA != null) {
            this.f48421b = Integer.toString(packageInfoA.versionCode);
            this.f48422c = packageInfoA.versionName;
        }
    }

    public synchronized String getAppVersionCode() {
        try {
            if (this.f48421b == null) {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f48421b;
    }

    public synchronized String getAppVersionName() {
        try {
            if (this.f48422c == null) {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f48422c;
    }

    public synchronized int getGmsVersionCode() {
        PackageInfo packageInfoA;
        try {
            if (this.f48423d == 0 && (packageInfoA = a("com.google.android.gms")) != null) {
                this.f48423d = packageInfoA.versionCode;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f48423d;
    }

    public synchronized int getIidImplementation() {
        int i10 = this.f48424e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f48420a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        int i11 = 1;
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f48424e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f48424e = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.isAtLeastO()) {
            this.f48424e = 2;
            i11 = 2;
        } else {
            this.f48424e = 1;
        }
        return i11;
    }

    @KeepForSdk
    public boolean isGmscorePresent() {
        return getIidImplementation() != 0;
    }
}
