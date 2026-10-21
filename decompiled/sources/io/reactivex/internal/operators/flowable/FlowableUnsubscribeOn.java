package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableUnsubscribeOn<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f71344q0;

    public static final class a<T> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71345p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler f71346q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f71347r0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn$a$a, reason: collision with other inner class name */
        public final class RunnableC0315a implements Runnable {
            public RunnableC0315a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f71347r0.cancel();
            }
        }

        public a(Subscriber<? super T> subscriber, Scheduler scheduler) {
            this.f71345p0 = subscriber;
            this.f71346q0 = scheduler;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (compareAndSet(false, true)) {
                this.f71346q0.scheduleDirect(new RunnableC0315a());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.f71345p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (get()) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f71345p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (get()) {
                return;
            }
            this.f71345p0.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71347r0, subscription)) {
                this.f71347r0 = subscription;
                this.f71345p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f71347r0.request(j10);
        }
    }

    public FlowableUnsubscribeOn(Flowable<T> flowable, Scheduler scheduler) {
        super(flowable);
        this.f71344q0 = scheduler;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f71344q0));
    }
}
