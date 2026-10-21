package com.appsflyer.internal;

import android.content.pm.PackageManager;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface AFe1tSDK {
    @Nullable
    String AFInAppEventParameterName();

    @Nullable
    String AFInAppEventParameterName(@NotNull SimpleDateFormat simpleDateFormat);

    void AFInAppEventParameterName(boolean z10, @NotNull Map<String, Object> map, int i10);

    @Nullable
    String AFInAppEventType();

    void AFInAppEventType(@NotNull Map<String, Object> map);

    void AFInAppEventType(@NotNull Map<String, Object> map, @Nullable String str);

    long AFKeystoreWrapper();

    void AFKeystoreWrapper(@NotNull Map<String, Object> map);

    void AFKeystoreWrapper(@NotNull Map<String, Object> map, @NotNull String str);

    boolean AFLogger();

    @Nullable
    String afDebugLog();

    boolean afErrorLog();

    boolean afInfoLog();

    @Nullable
    String valueOf() throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException;

    void valueOf(@NotNull Map<String, Object> map);

    @NotNull
    String values();

    void values(@NotNull Map<String, ? extends Object> map);

    void values(@NotNull Map<String, Object> map, boolean z10);
}
