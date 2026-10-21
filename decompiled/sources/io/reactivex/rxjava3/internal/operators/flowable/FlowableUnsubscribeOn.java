package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableUnsubscribeOn<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f75600q0;

    public static final class a<T> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75601p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler f75602q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f75603r0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.flowable.FlowableUnsubscribeOn$a$a, reason: collision with other inner class name */
        public final class RunnableC0379a implements Runnable {
            public RunnableC0379a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f75603r0.cancel();
            }
        }

        public a(Subscriber<? super T> subscriber, Scheduler scheduler) {
            this.f75601p0 = subscriber;
            this.f75602q0 = scheduler;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (compareAndSet(false, true)) {
                this.f75602q0.scheduleDirect(new RunnableC0379a());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.f75601p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (get()) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f75601p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (get()) {
                return;
            }
            this.f75601p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75603r0, subscription)) {
                this.f75603r0 = subscription;
                this.f75601p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f75603r0.request(j10);
        }
    }

    public FlowableUnsubscribeOn(Flowable<T> flowable, Scheduler scheduler) {
        super(flowable);
        this.f75600q0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f75600q0));
    }
}
