package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements QueueSubscription<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final T f73776p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Subscriber<? super T> f73777q0;

    public ScalarSubscription(Subscriber<? super T> subscriber, T t10) {
        this.f73777q0 = subscriber;
        this.f73776p0 = t10;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        lazySet(2);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        lazySet(1);
    }

    public boolean isCancelled() {
        return get() == 2;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f73776p0;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        if (SubscriptionHelper.validate(j10) && compareAndSet(0, 1)) {
            T t10 = this.f73776p0;
            Subscriber<? super T> subscriber = this.f73777q0;
            subscriber.onNext(t10);
            if (get() != 2) {
                subscriber.onComplete();
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int i10) {
        return i10 & 1;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
