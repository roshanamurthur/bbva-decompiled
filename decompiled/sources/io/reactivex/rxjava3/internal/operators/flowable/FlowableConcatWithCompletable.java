package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatWithCompletable<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CompletableSource f74659q0;

    public FlowableConcatWithCompletable(Flowable<T> flowable, CompletableSource completableSource) {
        super(flowable);
        this.f74659q0 = completableSource;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f74659q0));
    }

    public static final class a<T> extends AtomicReference<Disposable> implements FlowableSubscriber<T>, CompletableObserver, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f74660p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f74661q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public CompletableSource f74662r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f74663s0;

        public a(Subscriber<? super T> subscriber, CompletableSource completableSource) {
            this.f74660p0 = subscriber;
            this.f74662r0 = completableSource;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74661q0.cancel();
            DisposableHelper.dispose(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f74663s0) {
                this.f74660p0.onComplete();
                return;
            }
            this.f74663s0 = true;
            this.f74661q0 = SubscriptionHelper.CANCELLED;
            CompletableSource completableSource = this.f74662r0;
            this.f74662r0 = null;
            completableSource.subscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f74660p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f74660p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74661q0, subscription)) {
                this.f74661q0 = subscription;
                this.f74660p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f74661q0.request(j10);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }
}
