package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableThrottleFirstTimed<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f75528q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f75529r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f75530s0;

    public static final class a<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75531p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f75532q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f75533r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f75534s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f75535t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final SequentialDisposable f75536u0 = new SequentialDisposable();
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f75537w0;

        public a(SerializedSubscriber serializedSubscriber, long j10, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.f75531p0 = serializedSubscriber;
            this.f75532q0 = j10;
            this.f75533r0 = timeUnit;
            this.f75534s0 = worker;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f75535t0.cancel();
            this.f75534s0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f75537w0) {
                return;
            }
            this.f75537w0 = true;
            this.f75531p0.onComplete();
            this.f75534s0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f75537w0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f75537w0 = true;
            this.f75531p0.onError(th2);
            this.f75534s0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f75537w0 || this.v0) {
                return;
            }
            this.v0 = true;
            if (get() == 0) {
                this.f75537w0 = true;
                cancel();
                this.f75531p0.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
            } else {
                this.f75531p0.onNext(t10);
                BackpressureHelper.produced(this, 1L);
                Disposable disposable = this.f75536u0.get();
                if (disposable != null) {
                    disposable.dispose();
                }
                this.f75536u0.replace(this.f75534s0.schedule(this, this.f75532q0, this.f75533r0));
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75535t0, subscription)) {
                this.f75535t0 = subscription;
                this.f75531p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this, j10);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.v0 = false;
        }
    }

    public FlowableThrottleFirstTimed(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.f75528q0 = j10;
        this.f75529r0 = timeUnit;
        this.f75530s0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(new SerializedSubscriber(subscriber), this.f75528q0, this.f75529r0, this.f75530s0.createWorker()));
    }
}
