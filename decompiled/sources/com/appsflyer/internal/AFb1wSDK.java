package com.appsflyer.internal;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface AFb1wSDK {
    void AFInAppEventParameterName();

    void AFInAppEventParameterName(@NotNull Throwable th2);

    void AFInAppEventType();

    void AFInAppEventType(@Nullable String str);

    void AFInAppEventType(@Nullable String str, @Nullable PackageManager packageManager, @Nullable AFc1zSDK aFc1zSDK);

    void AFInAppEventType(@NotNull String str, @NotNull String str2);

    void AFInAppEventType(@NotNull String str, @NotNull String... strArr);

    void AFKeystoreWrapper();

    boolean afErrorLog();

    void valueOf();

    void valueOf(@NotNull String str, @NotNull String str2);

    void values();

    void values(@NotNull String str, int i10, @NotNull String str2);
}
