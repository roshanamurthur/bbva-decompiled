package io.reactivex.internal.schedulers;

import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ScheduledDirectPeriodicTask extends a implements Runnable {
    public ScheduledDirectPeriodicTask(Runnable runnable) {
        super(runnable);
    }

    @Override // io.reactivex.internal.schedulers.a, io.reactivex.schedulers.SchedulerRunnableIntrospection
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
            lazySet(a.FINISHED);
            RxJavaPlugins.onError(th2);
        }
    }
}
