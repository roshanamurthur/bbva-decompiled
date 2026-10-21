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
public final class FlowableInterval extends Flowable<Long> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f70753q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f70754r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final long f70755s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final TimeUnit f70756t0;

    public static final class a extends AtomicLong implements Subscription, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super Long> f70757p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f70758q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Disposable> f70759r0 = new AtomicReference<>();

        public a(Subscriber<? super Long> subscriber) {
            this.f70757p0 = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            DisposableHelper.dispose(this.f70759r0);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this, j10);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AtomicReference<Disposable> atomicReference = this.f70759r0;
            if (atomicReference.get() != DisposableHelper.DISPOSED) {
                long j10 = get();
                Subscriber<? super Long> subscriber = this.f70757p0;
                if (j10 == 0) {
                    subscriber.onError(new MissingBackpressureException(h.d(new StringBuilder("Can't deliver value "), this.f70758q0, " due to lack of requests")));
                    DisposableHelper.dispose(atomicReference);
                } else {
                    long j11 = this.f70758q0;
                    this.f70758q0 = j11 + 1;
                    subscriber.onNext(Long.valueOf(j11));
                    BackpressureHelper.produced(this, 1L);
                }
            }
        }
    }

    public FlowableInterval(long j10, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        this.f70754r0 = j10;
        this.f70755s0 = j11;
        this.f70756t0 = timeUnit;
        this.f70753q0 = scheduler;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Long> subscriber) {
        a aVar = new a(subscriber);
        subscriber.onSubscribe(aVar);
        Scheduler scheduler = this.f70753q0;
        boolean z10 = scheduler instanceof TrampolineScheduler;
        AtomicReference<Disposable> atomicReference = aVar.f70759r0;
        if (!z10) {
            DisposableHelper.setOnce(atomicReference, scheduler.schedulePeriodicallyDirect(aVar, this.f70754r0, this.f70755s0, this.f70756t0));
            return;
        }
        Scheduler.Worker workerCreateWorker = scheduler.createWorker();
        DisposableHelper.setOnce(atomicReference, workerCreateWorker);
        workerCreateWorker.schedulePeriodically(aVar, this.f70754r0, this.f70755s0, this.f70756t0);
    }
}
