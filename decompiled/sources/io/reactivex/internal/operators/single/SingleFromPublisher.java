package io.reactivex.internal.operators.single;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFromPublisher<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<? extends T> f73518p0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73519p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f73520q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f73521r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f73522s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f73523t0;

        public a(SingleObserver<? super T> singleObserver) {
            this.f73519p0 = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f73523t0 = true;
            this.f73520q0.cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73523t0;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f73522s0) {
                return;
            }
            this.f73522s0 = true;
            T t10 = this.f73521r0;
            this.f73521r0 = null;
            SingleObserver<? super T> singleObserver = this.f73519p0;
            if (t10 == null) {
                singleObserver.onError(new NoSuchElementException("The source Publisher is empty"));
            } else {
                singleObserver.onSuccess(t10);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f73522s0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f73522s0 = true;
            this.f73521r0 = null;
            this.f73519p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f73522s0) {
                return;
            }
            if (this.f73521r0 == null) {
                this.f73521r0 = t10;
                return;
            }
            this.f73520q0.cancel();
            this.f73522s0 = true;
            this.f73521r0 = null;
            this.f73519p0.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f73520q0, subscription)) {
                this.f73520q0 = subscription;
                this.f73519p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public SingleFromPublisher(Publisher<? extends T> publisher) {
        this.f73518p0 = publisher;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f73518p0.subscribe(new a(singleObserver));
    }
}
