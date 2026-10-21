package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.fuseable.CancellableQueueFuseable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFromAction<T> extends Flowable<T> implements Supplier<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f74917q0;

    public FlowableFromAction(Action action) {
        this.f74917q0 = action;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public T get() throws Throwable {
        this.f74917q0.run();
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
            this.f74917q0.run();
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
