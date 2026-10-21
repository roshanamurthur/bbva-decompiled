package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatWithMaybe<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MaybeSource<? extends T> f74664q0;

    public static final class a<T> extends SinglePostCompleteSubscriber<T, T> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<Disposable> f74665p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public MaybeSource<? extends T> f74666q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f74667r0;

        public a(Subscriber<? super T> subscriber, MaybeSource<? extends T> maybeSource) {
            super(subscriber);
            this.f74666q0 = maybeSource;
            this.f74665p0 = new AtomicReference<>();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            DisposableHelper.dispose(this.f74665p0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f74667r0) {
                this.downstream.onComplete();
                return;
            }
            this.f74667r0 = true;
            this.upstream = SubscriptionHelper.CANCELLED;
            MaybeSource<? extends T> maybeSource = this.f74666q0;
            this.f74666q0 = null;
            maybeSource.subscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.produced++;
            this.downstream.onNext((Object) t10);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f74665p0, disposable);
        }
    }

    public FlowableConcatWithMaybe(Flowable<T> flowable, MaybeSource<? extends T> maybeSource) {
        super(flowable);
        this.f74664q0 = maybeSource;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f74664q0));
    }
}
