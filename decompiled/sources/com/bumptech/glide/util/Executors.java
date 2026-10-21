package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class Executors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38907a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f38908b = new b();

    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            Util.postOnUiThread(runnable);
        }
    }

    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor directExecutor() {
        return f38908b;
    }

    public static Executor mainThreadExecutor() {
        return f38907a;
    }

    @VisibleForTesting
    public static void shutdownAndAwaitTermination(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (executorService.awaitTermination(5L, timeUnit)) {
                return;
            }
            executorService.shutdownNow();
            if (executorService.awaitTermination(5L, timeUnit)) {
            } else {
                throw new RuntimeException("Failed to shutdown");
            }
        } catch (InterruptedException e5) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e5);
        }
    }
}
