package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ScheduledDirectPeriodicTask extends a implements Runnable {
    public ScheduledDirectPeriodicTask(Runnable runnable) {
        super(runnable);
    }

    @Override // io.reactivex.rxjava3.internal.schedulers.a, io.reactivex.rxjava3.schedulers.SchedulerRunnableIntrospection
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            this.runner = null;
        } catch (Throwable th2) {
            this.runner = null;
            dispose();
            RxJavaPlugins.onError(th2);
            throw th2;
        }
    }
}
