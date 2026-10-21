package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableTimeInterval<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, Timed<T>> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f75551q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f75552r0;

    public static final class a<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super Timed<T>> f75553p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final TimeUnit f75554q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Scheduler f75555r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f75556s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f75557t0;

        public a(Subscriber<? super Timed<T>> subscriber, TimeUnit timeUnit, Scheduler scheduler) {
            this.f75553p0 = subscriber;
            this.f75555r0 = scheduler;
            this.f75554q0 = timeUnit;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f75556s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75553p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f75553p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            Scheduler scheduler = this.f75555r0;
            TimeUnit timeUnit = this.f75554q0;
            long jNow = scheduler.now(timeUnit);
            long j10 = this.f75557t0;
            this.f75557t0 = jNow;
            this.f75553p0.onNext(new Timed(t10, jNow - j10, timeUnit));
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75556s0, subscription)) {
                this.f75557t0 = this.f75555r0.now(this.f75554q0);
                this.f75556s0 = subscription;
                this.f75553p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f75556s0.request(j10);
        }
    }

    public FlowableTimeInterval(Flowable<T> flowable, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.f75551q0 = scheduler;
        this.f75552r0 = timeUnit;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super Timed<T>> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f75552r0, this.f75551q0));
    }
}
