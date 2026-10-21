package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes12.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, Disposable {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Object f73686q0 = new Object();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Object f73687r0 = new Object();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Object f73688s0 = new Object();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Object f73689t0 = new Object();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Runnable f73690p0;

    public ScheduledRunnable(Runnable runnable, DisposableContainer disposableContainer) {
        super(3);
        this.f73690p0 = runnable;
        lazySet(0, disposableContainer);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f73689t0;
            if (obj6 == obj || obj6 == (obj4 = f73687r0) || obj6 == (obj5 = f73688s0)) {
                break;
            }
            boolean z10 = get(2) != Thread.currentThread();
            if (z10) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 == null) {
                    break;
                }
                ((Future) obj6).cancel(z10);
                break;
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f73686q0) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((DisposableContainer) obj2).delete(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == f73686q0 || obj == f73689t0;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2 = f73688s0;
        Object obj3 = f73687r0;
        Object obj4 = f73686q0;
        Object obj5 = f73689t0;
        lazySet(2, Thread.currentThread());
        try {
            this.f73690p0.run();
        } catch (Throwable th2) {
            try {
                RxJavaPlugins.onError(th2);
            } finally {
                lazySet(2, null);
                Object obj6 = get(0);
                if (obj6 != obj4 && compareAndSet(0, obj6, obj5) && obj6 != null) {
                    ((DisposableContainer) obj6).delete(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj3 || obj == obj2) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj5));
            }
        }
        lazySet(2, null);
        Object obj7 = get(0);
        if (obj7 != obj4 && compareAndSet(0, obj7, obj5) && obj7 != null) {
            ((DisposableContainer) obj7).delete(this);
        }
        while (r2 != obj3 && r2 != obj2 && !compareAndSet(1, get(i), obj5)) {
        }
    }

    public void setFuture(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f73689t0) {
                return;
            }
            if (obj == f73687r0) {
                future.cancel(false);
                return;
            } else if (obj == f73688s0) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }
}
