package io.reactivex.internal.subscribers;

import androidx.camera.core.impl.v;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public class StrictSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Subscriber<? super T> f73764p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicThrowable f73765q0 = new AtomicThrowable();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicLong f73766r0 = new AtomicLong();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicReference<Subscription> f73767s0 = new AtomicReference<>();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final AtomicBoolean f73768t0 = new AtomicBoolean();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public volatile boolean f73769u0;

    public StrictSubscriber(Subscriber<? super T> subscriber) {
        this.f73764p0 = subscriber;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        if (this.f73769u0) {
            return;
        }
        SubscriptionHelper.cancel(this.f73767s0);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.f73769u0 = true;
        HalfSerializer.onComplete(this.f73764p0, this, this.f73765q0);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        this.f73769u0 = true;
        HalfSerializer.onError(this.f73764p0, th2, this, this.f73765q0);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        HalfSerializer.onNext(this.f73764p0, t10, this, this.f73765q0);
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (this.f73768t0.compareAndSet(false, true)) {
            this.f73764p0.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.f73767s0, this.f73766r0, subscription);
        } else {
            subscription.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        if (j10 > 0) {
            SubscriptionHelper.deferredRequest(this.f73767s0, this.f73766r0, j10);
        } else {
            cancel();
            onError(new IllegalArgumentException(v.c("§3.9 violated: positive request amount required but it was ", j10)));
        }
    }
}
