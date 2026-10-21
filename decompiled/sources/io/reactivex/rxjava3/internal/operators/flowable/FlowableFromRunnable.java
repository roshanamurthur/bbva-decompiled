package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.fuseable.CancellableQueueFuseable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFromRunnable<T> extends Flowable<T> implements Supplier<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Runnable f74941q0;

    public FlowableFromRunnable(Runnable runnable) {
        this.f74941q0 = runnable;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public T get() throws Throwable {
        this.f74941q0.run();
        return null;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        CancellableQueueFuseable cancellableQueueFuseable = new CancellableQueueFuseable();
        subscriber.onSubscribe(cancellableQueueFuseable);
        if (cancellableQueueFuseable.isDisposed()) {
            return;
        }
        try {
            this.f74941q0.run();
            if (cancellableQueueFuseable.isDisposed()) {
                return;
            }
            subscriber.onComplete();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (cancellableQueueFuseable.isDisposed()) {
                RxJavaPlugins.onError(th2);
            } else {
                subscriber.onError(th2);
            }
        }
    }
}
