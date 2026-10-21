package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableLastMaybe<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<T> f70783p0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f70784p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f70785q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f70786r0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f70784p0 = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70785q0.cancel();
            this.f70785q0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70785q0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f70785q0 = SubscriptionHelper.CANCELLED;
            T t10 = this.f70786r0;
            MaybeObserver<? super T> maybeObserver = this.f70784p0;
            if (t10 == null) {
                maybeObserver.onComplete();
            } else {
                this.f70786r0 = null;
                maybeObserver.onSuccess(t10);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f70785q0 = SubscriptionHelper.CANCELLED;
            this.f70786r0 = null;
            this.f70784p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f70786r0 = t10;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70785q0, subscription)) {
                this.f70785q0 = subscription;
                this.f70784p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableLastMaybe(Publisher<T> publisher) {
        this.f70783p0 = publisher;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f70783p0.subscribe(new a(maybeObserver));
    }
}
