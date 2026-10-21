package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFromPublisher<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<? extends T> f77795p0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f77796p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f77797q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f77798r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f77799s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f77800t0;

        public a(SingleObserver<? super T> singleObserver) {
            this.f77796p0 = singleObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77800t0 = true;
            this.f77797q0.cancel();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77800t0;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f77799s0) {
                return;
            }
            this.f77799s0 = true;
            T t10 = this.f77798r0;
            this.f77798r0 = null;
            SingleObserver<? super T> singleObserver = this.f77796p0;
            if (t10 == null) {
                singleObserver.onError(new NoSuchElementException("The source Publisher is empty"));
            } else {
                singleObserver.onSuccess(t10);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f77799s0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f77799s0 = true;
            this.f77798r0 = null;
            this.f77796p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f77799s0) {
                return;
            }
            if (this.f77798r0 == null) {
                this.f77798r0 = t10;
                return;
            }
            this.f77797q0.cancel();
            this.f77799s0 = true;
            this.f77798r0 = null;
            this.f77796p0.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f77797q0, subscription)) {
                this.f77797q0 = subscription;
                this.f77796p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public SingleFromPublisher(Publisher<? extends T> publisher) {
        this.f77795p0 = publisher;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f77795p0.subscribe(new a(singleObserver));
    }
}
