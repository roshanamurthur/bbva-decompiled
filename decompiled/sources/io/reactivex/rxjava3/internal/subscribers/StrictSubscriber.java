package io.reactivex.rxjava3.internal.subscribers;

import androidx.camera.core.impl.v;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public class StrictSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Subscriber<? super T> f78055p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicThrowable f78056q0 = new AtomicThrowable();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicLong f78057r0 = new AtomicLong();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicReference<Subscription> f78058s0 = new AtomicReference<>();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final AtomicBoolean f78059t0 = new AtomicBoolean();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public volatile boolean f78060u0;

    public StrictSubscriber(Subscriber<? super T> subscriber) {
        this.f78055p0 = subscriber;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        if (this.f78060u0) {
            return;
        }
        SubscriptionHelper.cancel(this.f78058s0);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.f78060u0 = true;
        HalfSerializer.onComplete(this.f78055p0, this, this.f78056q0);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        this.f78060u0 = true;
        HalfSerializer.onError(this.f78055p0, th2, this, this.f78056q0);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        HalfSerializer.onNext(this.f78055p0, t10, this, this.f78056q0);
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (this.f78059t0.compareAndSet(false, true)) {
            this.f78055p0.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.f78058s0, this.f78057r0, subscription);
        } else {
            subscription.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        if (j10 > 0) {
            SubscriptionHelper.deferredRequest(this.f78058s0, this.f78057r0, j10);
        } else {
            cancel();
            onError(new IllegalArgumentException(v.c("§3.9 violated: positive request amount required but it was ", j10)));
        }
    }
}
