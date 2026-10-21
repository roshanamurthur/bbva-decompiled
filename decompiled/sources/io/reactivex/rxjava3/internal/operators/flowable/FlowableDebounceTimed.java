package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableDebounceTimed<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f74706q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f74707r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f74708s0;

    public static final class a<T> extends AtomicReference<Disposable> implements Runnable, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T f74709p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f74710q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final b<T> f74711r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicBoolean f74712s0 = new AtomicBoolean();

        public a(T t10, long j10, b<T> bVar) {
            this.f74709p0 = t10;
            this.f74710q0 = j10;
            this.f74711r0 = bVar;
        }

        public final void a() {
            if (this.f74712s0.compareAndSet(false, true)) {
                b<T> bVar = this.f74711r0;
                long j10 = this.f74710q0;
                T t10 = this.f74709p0;
                if (j10 == bVar.v0) {
                    if (bVar.get() == 0) {
                        bVar.cancel();
                        bVar.f74713p0.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                    } else {
                        bVar.f74713p0.onNext(t10);
                        BackpressureHelper.produced(bVar, 1L);
                        DisposableHelper.dispose(this);
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
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
        public final Subscriber<? super T> f74713p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f74714q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f74715r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f74716s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f74717t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public a f74718u0;
        public volatile long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f74719w0;

        public b(SerializedSubscriber serializedSubscriber, long j10, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.f74713p0 = serializedSubscriber;
            this.f74714q0 = j10;
            this.f74715r0 = timeUnit;
            this.f74716s0 = worker;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74717t0.cancel();
            this.f74716s0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f74719w0) {
                return;
            }
            this.f74719w0 = true;
            a aVar = this.f74718u0;
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
            if (aVar != null) {
                aVar.a();
            }
            this.f74713p0.onComplete();
            this.f74716s0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74719w0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f74719w0 = true;
            a aVar = this.f74718u0;
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
            this.f74713p0.onError(th2);
            this.f74716s0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f74719w0) {
                return;
            }
            long j10 = this.v0 + 1;
            this.v0 = j10;
            a aVar = this.f74718u0;
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
            a aVar2 = new a(t10, j10, this);
            this.f74718u0 = aVar2;
            DisposableHelper.replace(aVar2, this.f74716s0.schedule(aVar2, this.f74714q0, this.f74715r0));
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74717t0, subscription)) {
                this.f74717t0 = subscription;
                this.f74713p0.onSubscribe(this);
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
        this.f74706q0 = j10;
        this.f74707r0 = timeUnit;
        this.f74708s0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new b(new SerializedSubscriber(subscriber), this.f74706q0, this.f74707r0, this.f74708s0.createWorker()));
    }
}
