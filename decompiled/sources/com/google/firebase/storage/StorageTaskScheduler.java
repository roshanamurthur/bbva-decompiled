package com.google.firebase.storage;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.firebase.concurrent.FirebaseExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class StorageTaskScheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Executor f49049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Executor f49050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Executor f49051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Executor f49052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Executor f49053e;
    public static StorageTaskScheduler sInstance = new StorageTaskScheduler();

    public static StorageTaskScheduler getInstance() {
        return sInstance;
    }

    public static void initializeExecutors(@NonNull Executor executor, @NonNull Executor executor2) {
        f49049a = FirebaseExecutors.newLimitedConcurrencyExecutor(executor, 5);
        f49051c = FirebaseExecutors.newLimitedConcurrencyExecutor(executor, 3);
        f49050b = FirebaseExecutors.newLimitedConcurrencyExecutor(executor, 2);
        f49052d = FirebaseExecutors.newSequentialExecutor(executor);
        f49053e = executor2;
    }

    public Executor getCommandPoolExecutor() {
        return f49049a;
    }

    public Executor getMainThreadExecutor() {
        return f49053e;
    }

    public void scheduleCallback(Runnable runnable) {
        f49052d.execute(runnable);
    }

    public void scheduleCommand(Runnable runnable) {
        f49049a.execute(runnable);
    }

    public void scheduleDownload(Runnable runnable) {
        f49051c.execute(runnable);
    }

    public void scheduleUpload(Runnable runnable) {
        f49050b.execute(runnable);
    }
}
