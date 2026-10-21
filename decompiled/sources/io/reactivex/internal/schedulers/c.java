package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: InstantPeriodicTask.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c implements Callable<Void>, Disposable {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final FutureTask<Void> f73731u0 = new FutureTask<>(Functions.EMPTY_RUNNABLE, null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Runnable f73732p0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ExecutorService f73735s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Thread f73736t0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<Future<?>> f73734r0 = new AtomicReference<>();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<Future<?>> f73733q0 = new AtomicReference<>();

    public c(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.f73732p0 = runnable;
        this.f73735s0 = scheduledExecutorService;
    }

    public final void a(Future<?> future) {
        while (true) {
            AtomicReference<Future<?>> atomicReference = this.f73734r0;
            Future<?> future2 = atomicReference.get();
            if (future2 == f73731u0) {
                future.cancel(this.f73736t0 != Thread.currentThread());
                return;
            } else {
                while (!atomicReference.compareAndSet(future2, future)) {
                    if (atomicReference.get() != future2) {
                    }
                }
                return;
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        this.f73736t0 = Thread.currentThread();
        try {
            this.f73732p0.run();
            Future<?> futureSubmit = this.f73735s0.submit(this);
            loop0: while (true) {
                AtomicReference<Future<?>> atomicReference = this.f73733q0;
                Future<?> future = atomicReference.get();
                if (future == f73731u0) {
                    futureSubmit.cancel(this.f73736t0 != Thread.currentThread());
                    break;
                }
                do {
                    if (atomicReference.compareAndSet(future, futureSubmit)) {
                        break loop0;
                    }
                } while (atomicReference.get() == future);
            }
            this.f73736t0 = null;
        } catch (Throwable th2) {
            this.f73736t0 = null;
            RxJavaPlugins.onError(th2);
        }
        return null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f73734r0;
        FutureTask<Void> futureTask = f73731u0;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f73736t0 != Thread.currentThread());
        }
        Future<?> andSet2 = this.f73733q0.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f73736t0 != Thread.currentThread());
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f73734r0.get() == f73731u0;
    }
}
