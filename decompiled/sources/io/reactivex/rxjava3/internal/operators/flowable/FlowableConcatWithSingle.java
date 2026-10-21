package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatWithSingle<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SingleSource<? extends T> f74668q0;

    public static final class a<T> extends SinglePostCompleteSubscriber<T, T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<Disposable> f74669p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public SingleSource<? extends T> f74670q0;

        public a(Subscriber<? super T> subscriber, SingleSource<? extends T> singleSource) {
            super(subscriber);
            this.f74670q0 = singleSource;
            this.f74669p0 = new AtomicReference<>();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            DisposableHelper.dispose(this.f74669p0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.upstream = SubscriptionHelper.CANCELLED;
            SingleSource<? extends T> singleSource = this.f74670q0;
            this.f74670q0 = null;
            singleSource.subscribe(this);
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

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f74669p0, disposable);
        }
    }

    public FlowableConcatWithSingle(Flowable<T> flowable, SingleSource<? extends T> singleSource) {
        super(flowable);
        this.f74668q0 = singleSource;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f74668q0));
    }
}
