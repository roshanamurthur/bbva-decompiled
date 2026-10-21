package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1uSDK {
    public final int AFInAppEventParameterName;

    @NonNull
    public final String AFInAppEventType;

    @Nullable
    public final String AFKeystoreWrapper;

    @Nullable
    public final Throwable afDebugLog;

    @Nullable
    public final AFf1sSDK afInfoLog;

    @Nullable
    public final String afRDLog;
    public final long valueOf;
    public final long values;

    public AFf1uSDK(@Nullable String str, @NonNull String str2, long j10, long j11, int i10, @Nullable AFf1sSDK aFf1sSDK, @Nullable String str3, Throwable th2) {
        this.AFKeystoreWrapper = str;
        this.AFInAppEventType = str2;
        this.values = j10;
        this.valueOf = j11;
        this.AFInAppEventParameterName = i10;
        this.afInfoLog = aFf1sSDK;
        this.afRDLog = str3;
        this.afDebugLog = th2;
    }
}
