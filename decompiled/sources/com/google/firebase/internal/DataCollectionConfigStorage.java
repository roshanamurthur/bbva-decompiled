package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;

/* JADX INFO: loaded from: classes10.dex */
public class DataCollectionConfigStorage {

    @VisibleForTesting
    public static final String DATA_COLLECTION_DEFAULT_ENABLED = "firebase_data_collection_default_enabled";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f48512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Publisher f48513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f48514d;

    public DataCollectionConfigStorage(Context context, String str, Publisher publisher) {
        context = Build.VERSION.SDK_INT >= 24 ? ContextCompat.createDeviceProtectedStorageContext(context) : context;
        this.f48511a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f48512b = sharedPreferences;
        this.f48513c = publisher;
        this.f48514d = sharedPreferences.contains(DATA_COLLECTION_DEFAULT_ENABLED) ? sharedPreferences.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED, true) : a();
    }

    public final boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context context = this.f48511a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(DATA_COLLECTION_DEFAULT_ENABLED)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public final synchronized void b(boolean z10) {
        if (this.f48514d != z10) {
            this.f48514d = z10;
            this.f48513c.publish(new Event<>(DataCollectionDefaultChange.class, new DataCollectionDefaultChange(z10)));
        }
    }

    public synchronized boolean isEnabled() {
        return this.f48514d;
    }

    public synchronized void setEnabled(Boolean bool) {
        try {
            if (bool == null) {
                this.f48512b.edit().remove(DATA_COLLECTION_DEFAULT_ENABLED).apply();
                b(a());
            } else {
                boolean zEquals = Boolean.TRUE.equals(bool);
                this.f48512b.edit().putBoolean(DATA_COLLECTION_DEFAULT_ENABLED, zEquals).apply();
                b(zEquals);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
