package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class ScheduledDirectTask extends a implements Callable<Void> {
    public ScheduledDirectTask(Runnable runnable) {
        super(runnable);
    }

    @Override // io.reactivex.rxjava3.internal.schedulers.a, io.reactivex.rxjava3.schedulers.SchedulerRunnableIntrospection
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    @Override // java.util.concurrent.Callable
    public Void call() {
        this.runner = Thread.currentThread();
        try {
            try {
                this.runnable.run();
                return null;
            } finally {
                lazySet(a.FINISHED);
                this.runner = null;
            }
        } catch (Throwable th2) {
            RxJavaPlugins.onError(th2);
            throw th2;
        }
    }
}
