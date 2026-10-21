package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes12.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, Disposable {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Object f77976q0 = new Object();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Object f77977r0 = new Object();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Object f77978s0 = new Object();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Object f77979t0 = new Object();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Runnable f77980p0;

    public ScheduledRunnable(Runnable runnable, DisposableContainer disposableContainer) {
        super(3);
        this.f77980p0 = runnable;
        lazySet(0, disposableContainer);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f77979t0;
            if (obj6 == obj || obj6 == (obj4 = f77977r0) || obj6 == (obj5 = f77978s0)) {
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
            if (obj2 == obj || obj2 == (obj3 = f77976q0) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((DisposableContainer) obj2).delete(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == f77976q0 || obj == f77979t0;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3 = f77978s0;
        Object obj4 = f77977r0;
        Object obj5 = f77976q0;
        Object obj6 = f77979t0;
        lazySet(2, Thread.currentThread());
        try {
            this.f77980p0.run();
            lazySet(2, null);
            Object obj7 = get(0);
            if (obj7 != obj5 && compareAndSet(0, obj7, obj6) && obj7 != null) {
                ((DisposableContainer) obj7).delete(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == obj4 || obj2 == obj3) {
                    return;
                }
            } while (!compareAndSet(1, obj2, obj6));
        } catch (Throwable th2) {
            try {
                RxJavaPlugins.onError(th2);
                throw th2;
            } catch (Throwable th3) {
                lazySet(2, null);
                Object obj8 = get(0);
                if (obj8 != obj5 && compareAndSet(0, obj8, obj6) && obj8 != null) {
                    ((DisposableContainer) obj8).delete(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj4 || obj == obj3) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj6));
                throw th3;
            }
        }
    }

    public void setFuture(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f77979t0) {
                return;
            }
            if (obj == f77977r0) {
                future.cancel(false);
                return;
            } else if (obj == f77978s0) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }
}
