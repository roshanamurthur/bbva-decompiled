package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.os.Looper;
import androidx.camera.core.impl.k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes10.dex */
public final class Utils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f47779a = ExecutorUtils.buildSingleThreadExecutorService("awaitEvenIfOnMainThread task continuation executor");

    public static <T> T awaitEvenIfOnMainThread(Task<T> task) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f47779a, new k(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new TimeoutException();
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j10, TimeUnit timeUnit) {
        boolean zAwait;
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }

    public static <T> Task<T> callTask(Executor executor, Callable<Task<T>> callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new androidx.camera.camera2.internal.g(callable, executor, 4, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @SuppressLint({"TaskMainThread"})
    public static <T> Task<T> race(Task<T> task, Task<T> task2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hc.a aVar = new hc.a(taskCompletionSource);
        task.continueWith(aVar);
        task2.continueWith(aVar);
        return taskCompletionSource.getTask();
    }

    public static <T> Task<T> race(Executor executor, Task<T> task, Task<T> task2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        com.appsflyer.internal.a aVar = new com.appsflyer.internal.a(taskCompletionSource, 3);
        task.continueWith(executor, aVar);
        task2.continueWith(executor, aVar);
        return taskCompletionSource.getTask();
    }
}
