package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableTimer extends Flowable<Long> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f71332q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f71333r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final TimeUnit f71334s0;

    public static final class a extends AtomicReference<Disposable> implements Subscription, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super Long> f71335p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public volatile boolean f71336q0;

        public a(Subscriber<? super Long> subscriber) {
            this.f71335p0 = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            DisposableHelper.dispose(this);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                this.f71336q0 = true;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != DisposableHelper.DISPOSED) {
                if (!this.f71336q0) {
                    lazySet(EmptyDisposable.INSTANCE);
                    this.f71335p0.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                } else {
                    this.f71335p0.onNext(0L);
                    lazySet(EmptyDisposable.INSTANCE);
                    this.f71335p0.onComplete();
                }
            }
        }
    }

    public FlowableTimer(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.f71333r0 = j10;
        this.f71334s0 = timeUnit;
        this.f71332q0 = scheduler;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Long> subscriber) {
        a aVar = new a(subscriber);
        subscriber.onSubscribe(aVar);
        DisposableHelper.trySet(aVar, this.f71332q0.scheduleDirect(aVar, this.f71333r0, this.f71334s0));
    }
}
