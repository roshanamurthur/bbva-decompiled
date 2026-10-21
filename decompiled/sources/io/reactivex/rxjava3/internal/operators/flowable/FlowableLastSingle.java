package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableLastSingle<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<T> f75063p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f75064q0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f75065p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f75066q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f75067r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public T f75068s0;

        public a(SingleObserver<? super T> singleObserver, T t10) {
            this.f75065p0 = singleObserver;
            this.f75066q0 = t10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f75067r0.cancel();
            this.f75067r0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75067r0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75067r0 = SubscriptionHelper.CANCELLED;
            T t10 = this.f75068s0;
            SingleObserver<? super T> singleObserver = this.f75065p0;
            if (t10 != null) {
                this.f75068s0 = null;
                singleObserver.onSuccess(t10);
                return;
            }
            T t11 = this.f75066q0;
            if (t11 != null) {
                singleObserver.onSuccess(t11);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f75067r0 = SubscriptionHelper.CANCELLED;
            this.f75068s0 = null;
            this.f75065p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f75068s0 = t10;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75067r0, subscription)) {
                this.f75067r0 = subscription;
                this.f75065p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableLastSingle(Publisher<T> publisher, T t10) {
        this.f75063p0 = publisher;
        this.f75064q0 = t10;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f75063p0.subscribe(new a(singleObserver, this.f75064q0));
    }
}
