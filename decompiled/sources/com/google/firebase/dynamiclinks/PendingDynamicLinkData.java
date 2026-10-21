package com.google.firebase.dynamiclinks;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.dynamiclinks.internal.DynamicLinkUTMParams;

/* JADX INFO: loaded from: classes10.dex */
public class PendingDynamicLinkData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DynamicLinkUTMParams f48333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final DynamicLinkData f48334b;

    @VisibleForTesting
    @KeepForSdk
    public PendingDynamicLinkData(DynamicLinkData dynamicLinkData) {
        if (dynamicLinkData == null) {
            this.f48334b = null;
            this.f48333a = null;
        } else {
            if (dynamicLinkData.getClickTimestamp() == 0) {
                dynamicLinkData.setClickTimestamp(DefaultClock.getInstance().currentTimeMillis());
            }
            this.f48334b = dynamicLinkData;
            this.f48333a = new DynamicLinkUTMParams(dynamicLinkData);
        }
    }

    public long getClickTimestamp() {
        DynamicLinkData dynamicLinkData = this.f48334b;
        if (dynamicLinkData == null) {
            return 0L;
        }
        return dynamicLinkData.getClickTimestamp();
    }

    @Nullable
    @KeepForSdk
    public Bundle getExtensions() {
        DynamicLinkData dynamicLinkData = this.f48334b;
        return dynamicLinkData == null ? new Bundle() : dynamicLinkData.getExtensionBundle();
    }

    @Nullable
    public Uri getLink() {
        String deepLink;
        DynamicLinkData dynamicLinkData = this.f48334b;
        if (dynamicLinkData == null || (deepLink = dynamicLinkData.getDeepLink()) == null) {
            return null;
        }
        return Uri.parse(deepLink);
    }

    public int getMinimumAppVersion() {
        DynamicLinkData dynamicLinkData = this.f48334b;
        if (dynamicLinkData == null) {
            return 0;
        }
        return dynamicLinkData.getMinVersion();
    }

    @Nullable
    @VisibleForTesting
    public Uri getRedirectUrl() {
        DynamicLinkData dynamicLinkData = this.f48334b;
        if (dynamicLinkData == null) {
            return null;
        }
        return dynamicLinkData.getRedirectUrl();
    }

    @Nullable
    public Intent getUpdateAppIntent(@NonNull Context context) {
        if (getMinimumAppVersion() == 0) {
            return null;
        }
        try {
            if (context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0).versionCode < getMinimumAppVersion() && getRedirectUrl() != null) {
                return new Intent("android.intent.action.VIEW").setData(getRedirectUrl()).setPackage("com.android.vending");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    @NonNull
    public Bundle getUtmParameters() {
        DynamicLinkUTMParams dynamicLinkUTMParams = this.f48333a;
        return dynamicLinkUTMParams == null ? new Bundle() : dynamicLinkUTMParams.asBundle();
    }

    public PendingDynamicLinkData(@Nullable String str, int i10, long j10, @Nullable Uri uri) {
        DynamicLinkData dynamicLinkData = new DynamicLinkData(null, str, i10, j10, null, uri);
        this.f48334b = dynamicLinkData;
        this.f48333a = new DynamicLinkUTMParams(dynamicLinkData);
    }
}
