package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableMergeWithCompletable<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CompletableSource f70809q0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70810p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Subscription> f70811q0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final C0309a f70812r0 = new C0309a(this);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f70813s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicLong f70814t0 = new AtomicLong();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f70815u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable$a$a, reason: collision with other inner class name */
        public static final class C0309a extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?> f70816p0;

            public C0309a(a<?> aVar) {
                this.f70816p0 = aVar;
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                a<?> aVar = this.f70816p0;
                aVar.v0 = true;
                if (aVar.f70815u0) {
                    HalfSerializer.onComplete(aVar.f70810p0, aVar, aVar.f70813s0);
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th2) {
                a<?> aVar = this.f70816p0;
                SubscriptionHelper.cancel(aVar.f70811q0);
                HalfSerializer.onError(aVar.f70810p0, th2, aVar, aVar.f70813s0);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(Subscriber<? super T> subscriber) {
            this.f70810p0 = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.cancel(this.f70811q0);
            DisposableHelper.dispose(this.f70812r0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f70815u0 = true;
            if (this.v0) {
                HalfSerializer.onComplete(this.f70810p0, this, this.f70813s0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f70812r0);
            HalfSerializer.onError(this.f70810p0, th2, this, this.f70813s0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            HalfSerializer.onNext(this.f70810p0, t10, this, this.f70813s0);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this.f70811q0, this.f70814t0, subscription);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f70811q0, this.f70814t0, j10);
        }
    }

    public FlowableMergeWithCompletable(Flowable<T> flowable, CompletableSource completableSource) {
        super(flowable);
        this.f70809q0 = completableSource;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber);
        subscriber.onSubscribe(aVar);
        this.source.subscribe((FlowableSubscriber) aVar);
        this.f70809q0.subscribe(aVar.f70812r0);
    }
}
