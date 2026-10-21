package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableTimeInterval<T> extends io.reactivex.internal.operators.flowable.a<T, Timed<T>> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f71295q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f71296r0;

    public static final class a<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super Timed<T>> f71297p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final TimeUnit f71298q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Scheduler f71299r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f71300s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f71301t0;

        public a(Subscriber<? super Timed<T>> subscriber, TimeUnit timeUnit, Scheduler scheduler) {
            this.f71297p0 = subscriber;
            this.f71299r0 = scheduler;
            this.f71298q0 = timeUnit;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f71300s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71297p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f71297p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            Scheduler scheduler = this.f71299r0;
            TimeUnit timeUnit = this.f71298q0;
            long jNow = scheduler.now(timeUnit);
            long j10 = this.f71301t0;
            this.f71301t0 = jNow;
            this.f71297p0.onNext(new Timed(t10, jNow - j10, timeUnit));
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71300s0, subscription)) {
                this.f71301t0 = this.f71299r0.now(this.f71298q0);
                this.f71300s0 = subscription;
                this.f71297p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f71300s0.request(j10);
        }
    }

    public FlowableTimeInterval(Flowable<T> flowable, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.f71295q0 = scheduler;
        this.f71296r0 = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Timed<T>> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f71296r0, this.f71295q0));
    }
}
