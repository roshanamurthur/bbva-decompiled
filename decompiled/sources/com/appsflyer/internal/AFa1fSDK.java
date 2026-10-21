package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface AFa1fSDK {
    void AFInAppEventParameterName();

    @WorkerThread
    @NotNull
    List<AFa1rSDK> AFKeystoreWrapper();

    @WorkerThread
    @Nullable
    String valueOf(@NotNull AFa1rSDK aFa1rSDK);

    @WorkerThread
    void valueOf();

    @WorkerThread
    boolean valueOf(@Nullable String str);
}
