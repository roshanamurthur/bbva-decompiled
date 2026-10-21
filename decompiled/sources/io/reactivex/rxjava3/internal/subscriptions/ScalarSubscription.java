package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements QueueSubscription<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final T f78067p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Subscriber<? super T> f78068q0;

    public ScalarSubscription(Subscriber<? super T> subscriber, T t10) {
        this.f78068q0 = subscriber;
        this.f78067p0 = t10;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        lazySet(2);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public void clear() {
        lazySet(1);
    }

    public boolean isCancelled() {
        return get() == 2;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f78067p0;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        if (SubscriptionHelper.validate(j10) && compareAndSet(0, 1)) {
            T t10 = this.f78067p0;
            Subscriber<? super T> subscriber = this.f78068q0;
            subscriber.onNext(t10);
            if (get() != 2) {
                subscriber.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
    public int requestFusion(int i10) {
        return i10 & 1;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public boolean offer(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
