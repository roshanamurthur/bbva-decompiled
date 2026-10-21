package io.reactivex.internal.operators.single;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.ResumeSingleObserver;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDelayWithPublisher<T, U> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73413p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<U> f73414q0;

    public static final class a<T, U> extends AtomicReference<Disposable> implements FlowableSubscriber<U>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73415p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SingleSource<T> f73416q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f73417r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f73418s0;

        public a(SingleObserver<? super T> singleObserver, SingleSource<T> singleSource) {
            this.f73415p0 = singleObserver;
            this.f73416q0 = singleSource;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f73418s0.cancel();
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f73417r0) {
                return;
            }
            this.f73417r0 = true;
            this.f73416q0.subscribe(new ResumeSingleObserver(this, this.f73415p0));
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f73417r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73417r0 = true;
                this.f73415p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(U u2) {
            this.f73418s0.cancel();
            onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f73418s0, subscription)) {
                this.f73418s0 = subscription;
                this.f73415p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public SingleDelayWithPublisher(SingleSource<T> singleSource, Publisher<U> publisher) {
        this.f73413p0 = singleSource;
        this.f73414q0 = publisher;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f73414q0.subscribe(new a(singleObserver, this.f73413p0));
    }
}
