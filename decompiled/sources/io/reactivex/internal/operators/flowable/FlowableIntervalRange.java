package io.reactivex.internal.operators.flowable;

import androidx.collection.h;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableIntervalRange extends Flowable<Long> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f70760q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f70761r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final long f70762s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final long f70763t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final long f70764u0;
    public final TimeUnit v0;

    public static final class a extends AtomicLong implements Subscription, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super Long> f70765p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f70766q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f70767r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<Disposable> f70768s0 = new AtomicReference<>();

        public a(Subscriber<? super Long> subscriber, long j10, long j11) {
            this.f70765p0 = subscriber;
            this.f70767r0 = j10;
            this.f70766q0 = j11;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            DisposableHelper.dispose(this.f70768s0);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this, j10);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AtomicReference<Disposable> atomicReference = this.f70768s0;
            Disposable disposable = atomicReference.get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                long j10 = get();
                Subscriber<? super Long> subscriber = this.f70765p0;
                if (j10 == 0) {
                    subscriber.onError(new MissingBackpressureException(h.d(new StringBuilder("Can't deliver value "), this.f70767r0, " due to lack of requests")));
                    DisposableHelper.dispose(atomicReference);
                    return;
                }
                long j11 = this.f70767r0;
                subscriber.onNext(Long.valueOf(j11));
                if (j11 == this.f70766q0) {
                    if (atomicReference.get() != disposableHelper) {
                        subscriber.onComplete();
                    }
                    DisposableHelper.dispose(atomicReference);
                } else {
                    this.f70767r0 = j11 + 1;
                    if (j10 != Long.MAX_VALUE) {
                        decrementAndGet();
                    }
                }
            }
        }
    }

    public FlowableIntervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit, Scheduler scheduler) {
        this.f70763t0 = j12;
        this.f70764u0 = j13;
        this.v0 = timeUnit;
        this.f70760q0 = scheduler;
        this.f70761r0 = j10;
        this.f70762s0 = j11;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Long> subscriber) {
        a aVar = new a(subscriber, this.f70761r0, this.f70762s0);
        subscriber.onSubscribe(aVar);
        Scheduler scheduler = this.f70760q0;
        boolean z10 = scheduler instanceof TrampolineScheduler;
        AtomicReference<Disposable> atomicReference = aVar.f70768s0;
        if (!z10) {
            DisposableHelper.setOnce(atomicReference, scheduler.schedulePeriodicallyDirect(aVar, this.f70763t0, this.f70764u0, this.v0));
            return;
        }
        Scheduler.Worker workerCreateWorker = scheduler.createWorker();
        DisposableHelper.setOnce(atomicReference, workerCreateWorker);
        workerCreateWorker.schedulePeriodically(aVar, this.f70763t0, this.f70764u0, this.v0);
    }
}
