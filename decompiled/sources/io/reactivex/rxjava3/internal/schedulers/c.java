package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
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
    public static final FutureTask<Void> f78022u0 = new FutureTask<>(Functions.EMPTY_RUNNABLE, null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Runnable f78023p0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ExecutorService f78026s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Thread f78027t0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<Future<?>> f78025r0 = new AtomicReference<>();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<Future<?>> f78024q0 = new AtomicReference<>();

    public c(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.f78023p0 = runnable;
        this.f78026s0 = scheduledExecutorService;
    }

    public final void a(Future<?> future) {
        while (true) {
            AtomicReference<Future<?>> atomicReference = this.f78025r0;
            Future<?> future2 = atomicReference.get();
            if (future2 == f78022u0) {
                future.cancel(this.f78027t0 != Thread.currentThread());
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
        this.f78027t0 = Thread.currentThread();
        try {
            this.f78023p0.run();
            this.f78027t0 = null;
            Future<?> futureSubmit = this.f78026s0.submit(this);
            loop0: while (true) {
                AtomicReference<Future<?>> atomicReference = this.f78024q0;
                Future<?> future = atomicReference.get();
                if (future != f78022u0) {
                    while (!atomicReference.compareAndSet(future, futureSubmit)) {
                        if (atomicReference.get() != future) {
                        }
                    }
                    break loop0;
                }
                futureSubmit.cancel(this.f78027t0 != Thread.currentThread());
                break;
            }
            return null;
        } catch (Throwable th2) {
            this.f78027t0 = null;
            RxJavaPlugins.onError(th2);
            throw th2;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f78025r0;
        FutureTask<Void> futureTask = f78022u0;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f78027t0 != Thread.currentThread());
        }
        Future<?> andSet2 = this.f78024q0.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f78027t0 != Thread.currentThread());
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f78025r0.get() == f78022u0;
    }
}
