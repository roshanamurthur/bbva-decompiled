package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.ResumeSingleObserver;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDelayWithPublisher<T, U> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f77667p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<U> f77668q0;

    public static final class a<T, U> extends AtomicReference<Disposable> implements FlowableSubscriber<U>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f77669p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SingleSource<T> f77670q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f77671r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f77672s0;

        public a(SingleObserver<? super T> singleObserver, SingleSource<T> singleSource) {
            this.f77669p0 = singleObserver;
            this.f77670q0 = singleSource;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77672s0.cancel();
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f77671r0) {
                return;
            }
            this.f77671r0 = true;
            this.f77670q0.subscribe(new ResumeSingleObserver(this, this.f77669p0));
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f77671r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77671r0 = true;
                this.f77669p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(U u2) {
            this.f77672s0.cancel();
            onComplete();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f77672s0, subscription)) {
                this.f77672s0 = subscription;
                this.f77669p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public SingleDelayWithPublisher(SingleSource<T> singleSource, Publisher<U> publisher) {
        this.f77667p0 = singleSource;
        this.f77668q0 = publisher;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f77668q0.subscribe(new a(singleObserver, this.f77667p0));
    }
}
