package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableThrottleFirstTimed<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f71272q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f71273r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f71274s0;

    public static final class a<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71275p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f71276q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f71277r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f71278s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f71279t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final SequentialDisposable f71280u0 = new SequentialDisposable();
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f71281w0;

        public a(SerializedSubscriber serializedSubscriber, long j10, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.f71275p0 = serializedSubscriber;
            this.f71276q0 = j10;
            this.f71277r0 = timeUnit;
            this.f71278s0 = worker;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f71279t0.cancel();
            this.f71278s0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f71281w0) {
                return;
            }
            this.f71281w0 = true;
            this.f71275p0.onComplete();
            this.f71278s0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f71281w0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f71281w0 = true;
            this.f71275p0.onError(th2);
            this.f71278s0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f71281w0 || this.v0) {
                return;
            }
            this.v0 = true;
            if (get() == 0) {
                this.f71281w0 = true;
                cancel();
                this.f71275p0.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
            } else {
                this.f71275p0.onNext(t10);
                BackpressureHelper.produced(this, 1L);
                Disposable disposable = this.f71280u0.get();
                if (disposable != null) {
                    disposable.dispose();
                }
                this.f71280u0.replace(this.f71278s0.schedule(this, this.f71276q0, this.f71277r0));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71279t0, subscription)) {
                this.f71279t0 = subscription;
                this.f71275p0.onSubscribe(this);
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
        this.f71272q0 = j10;
        this.f71273r0 = timeUnit;
        this.f71274s0 = scheduler;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(new SerializedSubscriber(subscriber), this.f71272q0, this.f71273r0, this.f71274s0.createWorker()));
    }
}
