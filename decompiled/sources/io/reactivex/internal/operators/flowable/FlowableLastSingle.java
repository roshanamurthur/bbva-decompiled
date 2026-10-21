package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableLastSingle<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<T> f70787p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f70788q0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f70789p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f70790q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f70791r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public T f70792s0;

        public a(SingleObserver<? super T> singleObserver, T t10) {
            this.f70789p0 = singleObserver;
            this.f70790q0 = t10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70791r0.cancel();
            this.f70791r0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70791r0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f70791r0 = SubscriptionHelper.CANCELLED;
            T t10 = this.f70792s0;
            SingleObserver<? super T> singleObserver = this.f70789p0;
            if (t10 != null) {
                this.f70792s0 = null;
                singleObserver.onSuccess(t10);
                return;
            }
            T t11 = this.f70790q0;
            if (t11 != null) {
                singleObserver.onSuccess(t11);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f70791r0 = SubscriptionHelper.CANCELLED;
            this.f70792s0 = null;
            this.f70789p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f70792s0 = t10;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70791r0, subscription)) {
                this.f70791r0 = subscription;
                this.f70789p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableLastSingle(Publisher<T> publisher, T t10) {
        this.f70787p0 = publisher;
        this.f70788q0 = t10;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f70787p0.subscribe(new a(singleObserver, this.f70788q0));
    }
}
