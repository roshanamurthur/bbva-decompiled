package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableDebounceTimed<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f70441q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f70442r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f70443s0;

    public static final class a<T> extends AtomicReference<Disposable> implements Runnable, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T f70444p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f70445q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final b<T> f70446r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicBoolean f70447s0 = new AtomicBoolean();

        public a(T t10, long j10, b<T> bVar) {
            this.f70444p0 = t10;
            this.f70445q0 = j10;
            this.f70446r0 = bVar;
        }

        public final void a() {
            if (this.f70447s0.compareAndSet(false, true)) {
                b<T> bVar = this.f70446r0;
                long j10 = this.f70445q0;
                T t10 = this.f70444p0;
                if (j10 == bVar.v0) {
                    if (bVar.get() == 0) {
                        bVar.cancel();
                        bVar.f70448p0.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                    } else {
                        bVar.f70448p0.onNext(t10);
                        BackpressureHelper.produced(bVar, 1L);
                        DisposableHelper.dispose(this);
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a();
        }
    }

    public static final class b<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70448p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f70449q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f70450r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f70451s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f70452t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public a f70453u0;
        public volatile long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f70454w0;

        public b(SerializedSubscriber serializedSubscriber, long j10, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.f70448p0 = serializedSubscriber;
            this.f70449q0 = j10;
            this.f70450r0 = timeUnit;
            this.f70451s0 = worker;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70452t0.cancel();
            this.f70451s0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70454w0) {
                return;
            }
            this.f70454w0 = true;
            a aVar = this.f70453u0;
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
            if (aVar != null) {
                aVar.a();
            }
            this.f70448p0.onComplete();
            this.f70451s0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70454w0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f70454w0 = true;
            a aVar = this.f70453u0;
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
            this.f70448p0.onError(th2);
            this.f70451s0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70454w0) {
                return;
            }
            long j10 = this.v0 + 1;
            this.v0 = j10;
            a aVar = this.f70453u0;
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
            a aVar2 = new a(t10, j10, this);
            this.f70453u0 = aVar2;
            DisposableHelper.replace(aVar2, this.f70451s0.schedule(aVar2, this.f70449q0, this.f70450r0));
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70452t0, subscription)) {
                this.f70452t0 = subscription;
                this.f70448p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this, j10);
            }
        }
    }

    public FlowableDebounceTimed(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.f70441q0 = j10;
        this.f70442r0 = timeUnit;
        this.f70443s0 = scheduler;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new b(new SerializedSubscriber(subscriber), this.f70441q0, this.f70442r0, this.f70443s0.createWorker()));
    }
}
