package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class FirebaseInitProvider extends ContentProvider {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public static final StartupTime f48739p0 = StartupTime.now();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public static final AtomicBoolean f48740q0 = new AtomicBoolean(false);

    @Nullable
    public static StartupTime getStartupTime() {
        return f48739p0;
    }

    public static boolean isCurrentlyInitializing() {
        return f48740q0.get();
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        Preconditions.checkNotNull(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        AtomicBoolean atomicBoolean = f48740q0;
        try {
            atomicBoolean.set(true);
            FirebaseApp.initializeApp(getContext());
            return false;
        } finally {
            atomicBoolean.set(false);
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
