package com.google.mlkit.common.sdkinternal;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class TaskQueue {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("lock")
    public boolean f49427b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f49426a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("lock")
    public final ArrayDeque f49428c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f49429d = new AtomicReference();

    public final void a() {
        synchronized (this.f49426a) {
            try {
                if (this.f49428c.isEmpty()) {
                    this.f49427b = false;
                    return;
                }
                c cVar = (c) this.f49428c.remove();
                b(cVar.f49433b, cVar.f49432a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(final Runnable runnable, Executor executor) {
        try {
            executor.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzt
                @Override // java.lang.Runnable
                public final void run() {
                    TaskQueue taskQueue = this.zza;
                    Preconditions.checkState(((Thread) taskQueue.f49429d.getAndSet(Thread.currentThread())) == null);
                    try {
                        runnable.run();
                        taskQueue.f49429d.set(null);
                        taskQueue.a();
                    } catch (Throwable th2) {
                        try {
                            taskQueue.f49429d.set(null);
                            taskQueue.a();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            a();
        }
    }

    @KeepForSdk
    public void checkIsRunningOnCurrentThread() {
        Preconditions.checkState(Thread.currentThread().equals(this.f49429d.get()));
    }

    @KeepForSdk
    public void submit(@NonNull Executor executor, @NonNull Runnable runnable) {
        synchronized (this.f49426a) {
            try {
                if (this.f49427b) {
                    this.f49428c.add(new c(executor, runnable));
                } else {
                    this.f49427b = true;
                    b(runnable, executor);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
