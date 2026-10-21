package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public class CrashlyticsBackgroundWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f47720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Task<Void> f47721b = Tasks.forResult(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f47722c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal<Boolean> f47723d = new ThreadLocal<>();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CrashlyticsBackgroundWorker.this.f47723d.set(Boolean.TRUE);
        }
    }

    public CrashlyticsBackgroundWorker(Executor executor) {
        this.f47720a = executor;
        executor.execute(new a());
    }

    public void checkRunningOnThread() {
        if (!Boolean.TRUE.equals(this.f47723d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor getExecutor() {
        return this.f47720a;
    }

    public <T> Task<T> submit(Callable<T> callable) {
        Task<T> task;
        synchronized (this.f47722c) {
            task = (Task<T>) this.f47721b.continueWith(this.f47720a, new xf.g(callable));
            this.f47721b = task.continueWith(this.f47720a, new xf.h());
        }
        return task;
    }

    public <T> Task<T> submitTask(Callable<Task<T>> callable) {
        Task<T> task;
        synchronized (this.f47722c) {
            task = (Task<T>) this.f47721b.continueWithTask(this.f47720a, new xf.g(callable));
            this.f47721b = task.continueWith(this.f47720a, new xf.h());
        }
        return task;
    }
}
