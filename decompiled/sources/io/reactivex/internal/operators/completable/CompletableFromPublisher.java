package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableFromPublisher<T> extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<T> f70052p0;

    public CompletableFromPublisher(Publisher<T> publisher) {
        this.f70052p0 = publisher;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f70052p0.subscribe(new a(completableObserver));
    }

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70053p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f70054q0;

        public a(CompletableObserver completableObserver) {
            this.f70053p0 = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70054q0.cancel();
            this.f70054q0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70054q0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f70053p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f70053p0.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70054q0, subscription)) {
                this.f70054q0 = subscription;
                this.f70053p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
        }
    }
}
