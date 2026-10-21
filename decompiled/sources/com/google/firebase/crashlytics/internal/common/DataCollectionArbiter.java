package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.PaymentStatus;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public class DataCollectionArbiter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f47752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseApp f47753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f47754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TaskCompletionSource<Void> f47755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Boolean f47758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TaskCompletionSource<Void> f47759h;

    public DataCollectionArbiter(FirebaseApp firebaseApp) {
        Boolean boolValueOf;
        Object obj = new Object();
        this.f47754c = obj;
        this.f47755d = new TaskCompletionSource<>();
        this.f47756e = false;
        this.f47757f = false;
        this.f47759h = new TaskCompletionSource<>();
        Context applicationContext = firebaseApp.getApplicationContext();
        this.f47753b = firebaseApp;
        SharedPreferences sharedPrefs = CommonUtils.getSharedPrefs(applicationContext);
        this.f47752a = sharedPrefs;
        if (sharedPrefs.contains("firebase_crashlytics_collection_enabled")) {
            this.f47757f = false;
            boolValueOf = Boolean.valueOf(sharedPrefs.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        this.f47758g = boolValueOf == null ? a(applicationContext) : boolValueOf;
        synchronized (obj) {
            try {
                if (isAutomaticDataCollectionEnabled()) {
                    this.f47755d.trySetResult(null);
                    this.f47756e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public final Boolean a(Context context) {
        Boolean boolValueOf;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e5) {
            Logger.getLogger().e("Could not read data collection permission from manifest", e5);
        }
        if (boolValueOf == null) {
            this.f47757f = false;
            return null;
        }
        this.f47757f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolValueOf));
    }

    public void grantDataCollectionPermission(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f47759h.trySetResult(null);
    }

    public synchronized boolean isAutomaticDataCollectionEnabled() {
        boolean zIsDataCollectionDefaultEnabled;
        String str;
        Boolean bool = this.f47758g;
        if (bool != null) {
            zIsDataCollectionDefaultEnabled = bool.booleanValue();
        } else {
            try {
                zIsDataCollectionDefaultEnabled = this.f47753b.isDataCollectionDefaultEnabled();
            } catch (IllegalStateException unused) {
                zIsDataCollectionDefaultEnabled = false;
            }
        }
        String str2 = zIsDataCollectionDefaultEnabled ? PaymentStatus.ENABLED : "DISABLED";
        if (this.f47758g == null) {
            str = "global Firebase setting";
        } else {
            str = this.f47757f ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        Logger.getLogger().d(String.format("Crashlytics automatic data collection %s by %s.", str2, str));
        return zIsDataCollectionDefaultEnabled;
    }

    public synchronized void setCrashlyticsDataCollectionEnabled(@Nullable Boolean bool) {
        if (bool != null) {
            try {
                this.f47757f = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f47758g = bool != null ? bool : a(this.f47753b.getApplicationContext());
        SharedPreferences.Editor editorEdit = this.f47752a.edit();
        if (bool != null) {
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("firebase_crashlytics_collection_enabled");
        }
        editorEdit.apply();
        synchronized (this.f47754c) {
            try {
                if (isAutomaticDataCollectionEnabled()) {
                    if (!this.f47756e) {
                        this.f47755d.trySetResult(null);
                        this.f47756e = true;
                    }
                } else if (this.f47756e) {
                    this.f47755d = new TaskCompletionSource<>();
                    this.f47756e = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public Task<Void> waitForAutomaticDataCollectionEnabled() {
        Task<Void> task;
        synchronized (this.f47754c) {
            task = this.f47755d.getTask();
        }
        return task;
    }

    public Task<Void> waitForDataCollectionPermission(Executor executor) {
        return Utils.race(executor, this.f47759h.getTask(), waitForAutomaticDataCollectionEnabled());
    }
}
