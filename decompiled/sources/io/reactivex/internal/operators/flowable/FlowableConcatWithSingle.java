package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableConcatWithSingle<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SingleSource<? extends T> f70403q0;

    public static final class a<T> extends SinglePostCompleteSubscriber<T, T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<Disposable> f70404p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public SingleSource<? extends T> f70405q0;

        public a(Subscriber<? super T> subscriber, SingleSource<? extends T> singleSource) {
            super(subscriber);
            this.f70405q0 = singleSource;
            this.f70404p0 = new AtomicReference<>();
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            DisposableHelper.dispose(this.f70404p0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.upstream = SubscriptionHelper.CANCELLED;
            SingleSource<? extends T> singleSource = this.f70405q0;
            this.f70405q0 = null;
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

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f70404p0, disposable);
        }
    }

    public FlowableConcatWithSingle(Flowable<T> flowable, SingleSource<? extends T> singleSource) {
        super(flowable);
        this.f70403q0 = singleSource;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f70403q0));
    }
}
