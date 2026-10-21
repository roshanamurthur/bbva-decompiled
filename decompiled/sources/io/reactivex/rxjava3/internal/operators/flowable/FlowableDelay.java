package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableDelay<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f74721q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f74722r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f74723s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f74724t0;

    public static final class a<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f74725p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f74726q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f74727r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f74728s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f74729t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Subscription f74730u0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.flowable.FlowableDelay$a$a, reason: collision with other inner class name */
        public final class RunnableC0367a implements Runnable {
            public RunnableC0367a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                try {
                    aVar.f74725p0.onComplete();
                } finally {
                    aVar.f74728s0.dispose();
                }
            }
        }

        public final class b implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Throwable f74732p0;

            public b(Throwable th2) {
                this.f74732p0 = th2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                try {
                    aVar.f74725p0.onError(this.f74732p0);
                } finally {
                    aVar.f74728s0.dispose();
                }
            }
        }

        public final class c implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final T f74734p0;

            public c(T t10) {
                this.f74734p0 = t10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f74725p0.onNext(this.f74734p0);
            }
        }

        public a(Subscriber<? super T> subscriber, long j10, TimeUnit timeUnit, Scheduler.Worker worker, boolean z10) {
            this.f74725p0 = subscriber;
            this.f74726q0 = j10;
            this.f74727r0 = timeUnit;
            this.f74728s0 = worker;
            this.f74729t0 = z10;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74730u0.cancel();
            this.f74728s0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74728s0.schedule(new RunnableC0367a(), this.f74726q0, this.f74727r0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f74728s0.schedule(new b(th2), this.f74729t0 ? this.f74726q0 : 0L, this.f74727r0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f74728s0.schedule(new c(t10), this.f74726q0, this.f74727r0);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74730u0, subscription)) {
                this.f74730u0 = subscription;
                this.f74725p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f74730u0.request(j10);
        }
    }

    public FlowableDelay(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        super(flowable);
        this.f74721q0 = j10;
        this.f74722r0 = timeUnit;
        this.f74723s0 = scheduler;
        this.f74724t0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(this.f74724t0 ? subscriber : new SerializedSubscriber(subscriber), this.f74721q0, this.f74722r0, this.f74723s0.createWorker(), this.f74724t0));
    }
}
