package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzrr;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public abstract class ModelResource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f49422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f49423b;

    @NonNull
    @KeepForSdk
    protected final TaskQueue taskQueue;

    public ModelResource() {
        this.f49422a = new AtomicInteger(0);
        this.f49423b = new AtomicBoolean(false);
        this.taskQueue = new TaskQueue();
    }

    @NonNull
    @KeepForSdk
    public <T> Task<T> callAfterLoad(@NonNull final Executor executor, @NonNull final Callable<T> callable, @NonNull final CancellationToken cancellationToken) {
        Preconditions.checkState(this.f49422a.get() > 0);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.taskQueue.submit(new Executor() { // from class: com.google.mlkit.common.sdkinternal.zzm
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e5) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                    } else {
                        taskCompletionSource.setException(e5);
                    }
                    throw e5;
                }
            }
        }, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzn
            @Override // java.lang.Runnable
            public final void run() {
                ModelResource modelResource = this.zza;
                CancellationToken cancellationToken2 = cancellationToken;
                CancellationTokenSource cancellationTokenSource2 = cancellationTokenSource;
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                AtomicBoolean atomicBoolean = modelResource.f49423b;
                try {
                    if (cancellationToken2.isCancellationRequested()) {
                        cancellationTokenSource2.cancel();
                        return;
                    }
                    try {
                        if (!atomicBoolean.get()) {
                            modelResource.load();
                            atomicBoolean.set(true);
                        }
                        if (cancellationToken2.isCancellationRequested()) {
                            cancellationTokenSource2.cancel();
                            return;
                        }
                        Object objCall = callable2.call();
                        if (cancellationToken2.isCancellationRequested()) {
                            cancellationTokenSource2.cancel();
                        } else {
                            taskCompletionSource2.setResult(objCall);
                        }
                    } catch (RuntimeException e5) {
                        throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e5);
                    }
                } catch (Exception e7) {
                    if (cancellationToken2.isCancellationRequested()) {
                        cancellationTokenSource2.cancel();
                    } else {
                        taskCompletionSource2.setException(e7);
                    }
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    public boolean isLoaded() {
        return this.f49423b.get();
    }

    @KeepForSdk
    @VisibleForTesting
    @WorkerThread
    public abstract void load() throws MlKitException;

    @KeepForSdk
    public void pin() {
        this.f49422a.incrementAndGet();
    }

    @KeepForSdk
    @WorkerThread
    public abstract void release();

    @KeepForSdk
    public void unpin(@NonNull Executor executor) {
        unpinWithTask(executor);
    }

    @NonNull
    @KeepForSdk
    public Task<Void> unpinWithTask(@NonNull Executor executor) {
        Preconditions.checkState(this.f49422a.get() > 0);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.taskQueue.submit(executor, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzl
            @Override // java.lang.Runnable
            public final void run() {
                ModelResource modelResource = this.zza;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                int iDecrementAndGet = modelResource.f49422a.decrementAndGet();
                Preconditions.checkState(iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    modelResource.release();
                    modelResource.f49423b.set(false);
                }
                zzrr.zza();
                taskCompletionSource2.setResult(null);
            }
        });
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    public ModelResource(@NonNull TaskQueue taskQueue) {
        this.f49422a = new AtomicInteger(0);
        this.f49423b = new AtomicBoolean(false);
        this.taskQueue = taskQueue;
    }
}
