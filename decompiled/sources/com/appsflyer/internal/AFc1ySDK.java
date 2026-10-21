package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface AFc1ySDK {
    @WorkerThread
    boolean AFInAppEventParameterName(@NotNull String... strArr);

    @WorkerThread
    int AFInAppEventType();

    @WorkerThread
    @Nullable
    String AFKeystoreWrapper(@NotNull Throwable th2, @NotNull String str);

    @WorkerThread
    boolean AFKeystoreWrapper();

    @WorkerThread
    @NotNull
    List<AFb1aSDK> values();
}
