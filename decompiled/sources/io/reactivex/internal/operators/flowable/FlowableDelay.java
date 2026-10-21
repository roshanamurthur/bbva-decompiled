package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableDelay<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f70456q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f70457r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f70458s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f70459t0;

    public static final class a<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70460p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f70461q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f70462r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f70463s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f70464t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Subscription f70465u0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableDelay$a$a, reason: collision with other inner class name */
        public final class RunnableC0303a implements Runnable {
            public RunnableC0303a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                try {
                    aVar.f70460p0.onComplete();
                } finally {
                    aVar.f70463s0.dispose();
                }
            }
        }

        public final class b implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Throwable f70467p0;

            public b(Throwable th2) {
                this.f70467p0 = th2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                try {
                    aVar.f70460p0.onError(this.f70467p0);
                } finally {
                    aVar.f70463s0.dispose();
                }
            }
        }

        public final class c implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final T f70469p0;

            public c(T t10) {
                this.f70469p0 = t10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f70460p0.onNext(this.f70469p0);
            }
        }

        public a(Subscriber<? super T> subscriber, long j10, TimeUnit timeUnit, Scheduler.Worker worker, boolean z10) {
            this.f70460p0 = subscriber;
            this.f70461q0 = j10;
            this.f70462r0 = timeUnit;
            this.f70463s0 = worker;
            this.f70464t0 = z10;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70465u0.cancel();
            this.f70463s0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f70463s0.schedule(new RunnableC0303a(), this.f70461q0, this.f70462r0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f70463s0.schedule(new b(th2), this.f70464t0 ? this.f70461q0 : 0L, this.f70462r0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f70463s0.schedule(new c(t10), this.f70461q0, this.f70462r0);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70465u0, subscription)) {
                this.f70465u0 = subscription;
                this.f70460p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f70465u0.request(j10);
        }
    }

    public FlowableDelay(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        super(flowable);
        this.f70456q0 = j10;
        this.f70457r0 = timeUnit;
        this.f70458s0 = scheduler;
        this.f70459t0 = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(this.f70459t0 ? subscriber : new SerializedSubscriber(subscriber), this.f70456q0, this.f70457r0, this.f70458s0.createWorker(), this.f70459t0));
    }
}
