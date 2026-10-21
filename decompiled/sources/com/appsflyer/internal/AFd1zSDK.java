package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes2.dex */
public interface AFd1zSDK {
    @WorkerThread
    void AFInAppEventType(@NonNull AFd1uSDK<?> aFd1uSDK);

    @WorkerThread
    void AFInAppEventType(@NonNull AFd1uSDK<?> aFd1uSDK, @NonNull AFd1ySDK aFd1ySDK);

    @WorkerThread
    void AFKeystoreWrapper(@NonNull AFd1uSDK<?> aFd1uSDK);
}
