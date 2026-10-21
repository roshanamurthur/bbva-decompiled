package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableMergeWithCompletable<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CompletableSource f75081q0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75082p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Subscription> f75083q0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final C0373a f75084r0 = new C0373a(this);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f75085s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicLong f75086t0 = new AtomicLong();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f75087u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.flowable.FlowableMergeWithCompletable$a$a, reason: collision with other inner class name */
        public static final class C0373a extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?> f75088p0;

            public C0373a(a<?> aVar) {
                this.f75088p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a<?> aVar = this.f75088p0;
                aVar.v0 = true;
                if (aVar.f75087u0) {
                    HalfSerializer.onComplete(aVar.f75082p0, aVar, aVar.f75085s0);
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a<?> aVar = this.f75088p0;
                SubscriptionHelper.cancel(aVar.f75083q0);
                HalfSerializer.onError(aVar.f75082p0, th2, aVar, aVar.f75085s0);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(Subscriber<? super T> subscriber) {
            this.f75082p0 = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.cancel(this.f75083q0);
            DisposableHelper.dispose(this.f75084r0);
            this.f75085s0.tryTerminateAndReport();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75087u0 = true;
            if (this.v0) {
                HalfSerializer.onComplete(this.f75082p0, this, this.f75085s0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f75084r0);
            HalfSerializer.onError(this.f75082p0, th2, this, this.f75085s0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            HalfSerializer.onNext(this.f75082p0, t10, this, this.f75085s0);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this.f75083q0, this.f75086t0, subscription);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f75083q0, this.f75086t0, j10);
        }
    }

    public FlowableMergeWithCompletable(Flowable<T> flowable, CompletableSource completableSource) {
        super(flowable);
        this.f75081q0 = completableSource;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber);
        subscriber.onSubscribe(aVar);
        this.source.subscribe((FlowableSubscriber) aVar);
        this.f75081q0.subscribe(aVar.f75084r0);
    }
}
