package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableLastMaybe<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<T> f75059p0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75060p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f75061q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f75062r0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f75060p0 = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f75061q0.cancel();
            this.f75061q0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75061q0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75061q0 = SubscriptionHelper.CANCELLED;
            T t10 = this.f75062r0;
            MaybeObserver<? super T> maybeObserver = this.f75060p0;
            if (t10 == null) {
                maybeObserver.onComplete();
            } else {
                this.f75062r0 = null;
                maybeObserver.onSuccess(t10);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f75061q0 = SubscriptionHelper.CANCELLED;
            this.f75062r0 = null;
            this.f75060p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f75062r0 = t10;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75061q0, subscription)) {
                this.f75061q0 = subscription;
                this.f75060p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableLastMaybe(Publisher<T> publisher) {
        this.f75059p0 = publisher;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f75059p0.subscribe(new a(maybeObserver));
    }
}
