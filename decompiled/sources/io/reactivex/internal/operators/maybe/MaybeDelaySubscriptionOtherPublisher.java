package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDelaySubscriptionOtherPublisher<T, U> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<U> f71571p0;

    public static final class a<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71572p0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f71572p0 = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71572p0.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71572p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71572p0.onSuccess(t10);
        }
    }

    public static final class b<T> implements FlowableSubscriber<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T> f71573p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public MaybeSource<T> f71574q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f71575r0;

        public b(MaybeObserver<? super T> maybeObserver, MaybeSource<T> maybeSource) {
            this.f71573p0 = new a<>(maybeObserver);
            this.f71574q0 = maybeSource;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71575r0.cancel();
            this.f71575r0 = SubscriptionHelper.CANCELLED;
            DisposableHelper.dispose(this.f71573p0);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f71573p0.get());
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Subscription subscription = this.f71575r0;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                this.f71575r0 = subscriptionHelper;
                MaybeSource<T> maybeSource = this.f71574q0;
                this.f71574q0 = null;
                maybeSource.subscribe(this.f71573p0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            Subscription subscription = this.f71575r0;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription == subscriptionHelper) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f71575r0 = subscriptionHelper;
                this.f71573p0.f71572p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Subscription subscription = this.f71575r0;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                subscription.cancel();
                this.f71575r0 = subscriptionHelper;
                MaybeSource<T> maybeSource = this.f71574q0;
                this.f71574q0 = null;
                maybeSource.subscribe(this.f71573p0);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71575r0, subscription)) {
                this.f71575r0 = subscription;
                this.f71573p0.f71572p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public MaybeDelaySubscriptionOtherPublisher(MaybeSource<T> maybeSource, Publisher<U> publisher) {
        super(maybeSource);
        this.f71571p0 = publisher;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f71571p0.subscribe(new b(maybeObserver, this.source));
    }
}
