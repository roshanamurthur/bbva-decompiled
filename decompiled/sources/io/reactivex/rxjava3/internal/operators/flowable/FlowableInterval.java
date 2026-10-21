package io.reactivex.rxjava3.internal.operators.flowable;

import androidx.collection.h;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.schedulers.TrampolineScheduler;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableInterval extends Flowable<Long> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f75029q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f75030r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final long f75031s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final TimeUnit f75032t0;

    public static final class a extends AtomicLong implements Subscription, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super Long> f75033p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f75034q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Disposable> f75035r0 = new AtomicReference<>();

        public a(Subscriber<? super Long> subscriber) {
            this.f75033p0 = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            DisposableHelper.dispose(this.f75035r0);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this, j10);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AtomicReference<Disposable> atomicReference = this.f75035r0;
            if (atomicReference.get() != DisposableHelper.DISPOSED) {
                long j10 = get();
                Subscriber<? super Long> subscriber = this.f75033p0;
                if (j10 == 0) {
                    subscriber.onError(new MissingBackpressureException(h.d(new StringBuilder("Can't deliver value "), this.f75034q0, " due to lack of requests")));
                    DisposableHelper.dispose(atomicReference);
                } else {
                    long j11 = this.f75034q0;
                    this.f75034q0 = j11 + 1;
                    subscriber.onNext(Long.valueOf(j11));
                    BackpressureHelper.produced(this, 1L);
                }
            }
        }
    }

    public FlowableInterval(long j10, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        this.f75030r0 = j10;
        this.f75031s0 = j11;
        this.f75032t0 = timeUnit;
        this.f75029q0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super Long> subscriber) {
        a aVar = new a(subscriber);
        subscriber.onSubscribe(aVar);
        Scheduler scheduler = this.f75029q0;
        boolean z10 = scheduler instanceof TrampolineScheduler;
        AtomicReference<Disposable> atomicReference = aVar.f75035r0;
        if (!z10) {
            DisposableHelper.setOnce(atomicReference, scheduler.schedulePeriodicallyDirect(aVar, this.f75030r0, this.f75031s0, this.f75032t0));
            return;
        }
        Scheduler.Worker workerCreateWorker = scheduler.createWorker();
        DisposableHelper.setOnce(atomicReference, workerCreateWorker);
        workerCreateWorker.schedulePeriodically(aVar, this.f75030r0, this.f75031s0, this.f75032t0);
    }
}
