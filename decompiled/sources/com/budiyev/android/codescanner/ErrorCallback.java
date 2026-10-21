package com.budiyev.android.codescanner;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes9.dex */
public interface ErrorCallback {

    @NonNull
    public static final ErrorCallback SUPPRESS = new Utils.SuppressErrorCallback();

    @WorkerThread
    void onError(@NonNull Throwable th2);
}
