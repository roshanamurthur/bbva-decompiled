package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableTimer extends Flowable<Long> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f75588q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f75589r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final TimeUnit f75590s0;

    public static final class a extends AtomicReference<Disposable> implements Subscription, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super Long> f75591p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public volatile boolean f75592q0;

        public a(Subscriber<? super Long> subscriber) {
            this.f75591p0 = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            DisposableHelper.dispose(this);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                this.f75592q0 = true;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != DisposableHelper.DISPOSED) {
                if (!this.f75592q0) {
                    lazySet(EmptyDisposable.INSTANCE);
                    this.f75591p0.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                } else {
                    this.f75591p0.onNext(0L);
                    lazySet(EmptyDisposable.INSTANCE);
                    this.f75591p0.onComplete();
                }
            }
        }
    }

    public FlowableTimer(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.f75589r0 = j10;
        this.f75590s0 = timeUnit;
        this.f75588q0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super Long> subscriber) {
        a aVar = new a(subscriber);
        subscriber.onSubscribe(aVar);
        DisposableHelper.trySet(aVar, this.f75588q0.scheduleDirect(aVar, this.f75589r0, this.f75590s0));
    }
}
