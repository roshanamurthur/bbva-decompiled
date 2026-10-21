package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableFromPublisher<T> extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<T> f74309p0;

    public CompletableFromPublisher(Publisher<T> publisher) {
        this.f74309p0 = publisher;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f74309p0.subscribe(new a(completableObserver));
    }

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74310p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f74311q0;

        public a(CompletableObserver completableObserver) {
            this.f74310p0 = completableObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74311q0.cancel();
            this.f74311q0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74311q0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74310p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f74310p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74311q0, subscription)) {
                this.f74311q0 = subscription;
                this.f74310p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
        }
    }
}
