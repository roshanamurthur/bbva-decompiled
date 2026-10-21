package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzaw;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class MLTaskExecutor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f49410b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public static MLTaskExecutor f49411c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.mlkit_common.zza f49412a;

    public MLTaskExecutor(Looper looper) {
        this.f49412a = new com.google.android.gms.internal.mlkit_common.zza(looper);
    }

    @NonNull
    @KeepForSdk
    public static MLTaskExecutor getInstance() {
        MLTaskExecutor mLTaskExecutor;
        synchronized (f49410b) {
            try {
                if (f49411c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f49411c = new MLTaskExecutor(handlerThread.getLooper());
                }
                mLTaskExecutor = f49411c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mLTaskExecutor;
    }

    @NonNull
    @KeepForSdk
    public static Executor workerThreadExecutor() {
        return b.zza;
    }

    @NonNull
    @KeepForSdk
    public Handler getHandler() {
        return this.f49412a;
    }

    @NonNull
    @KeepForSdk
    public <ResultT> Task<ResultT> scheduleCallable(@NonNull final Callable<ResultT> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        scheduleRunnable(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzf
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    taskCompletionSource2.setResult(callable2.call());
                } catch (MlKitException e5) {
                    taskCompletionSource2.setException(e5);
                } catch (Exception e7) {
                    taskCompletionSource2.setException(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e7));
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    public void scheduleRunnable(@NonNull Runnable runnable) {
        workerThreadExecutor().execute(runnable);
    }

    @KeepForSdk
    public void scheduleRunnableDelayed(@NonNull Runnable runnable, long j10) {
        this.f49412a.postDelayed(runnable, j10);
    }

    @NonNull
    @KeepForSdk
    public <ResultT> Task<ResultT> scheduleTaskCallable(@NonNull Callable<Task<ResultT>> callable) {
        return (Task<ResultT>) scheduleCallable(callable).continueWithTask(zzaw.zza(), new Continuation() { // from class: com.google.mlkit.common.sdkinternal.zzg
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return (Task) task.getResult();
            }
        });
    }
}
