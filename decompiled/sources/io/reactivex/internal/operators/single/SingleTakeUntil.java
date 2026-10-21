package io.reactivex.internal.operators.single;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleTakeUntil<T, U> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73558p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<U> f73559q0;

    public static final class a<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73560p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b f73561q0 = new b(this);

        public a(SingleObserver<? super T> singleObserver) {
            this.f73560p0 = singleObserver;
        }

        public final void a(Throwable th2) {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (andSet != null) {
                andSet.dispose();
            }
            this.f73560p0.onError(th2);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            b bVar = this.f73561q0;
            bVar.getClass();
            SubscriptionHelper.cancel(bVar);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            b bVar = this.f73561q0;
            bVar.getClass();
            SubscriptionHelper.cancel(bVar);
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || getAndSet(disposableHelper) == disposableHelper) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73560p0.onError(th2);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            b bVar = this.f73561q0;
            bVar.getClass();
            SubscriptionHelper.cancel(bVar);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f73560p0.onSuccess(t10);
            }
        }
    }

    public static final class b extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<?> f73562p0;

        public b(a<?> aVar) {
            this.f73562p0 = aVar;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.f73562p0.a(new CancellationException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f73562p0.a(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (SubscriptionHelper.cancel(this)) {
                this.f73562p0.a(new CancellationException());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public SingleTakeUntil(SingleSource<T> singleSource, Publisher<U> publisher) {
        this.f73558p0 = singleSource;
        this.f73559q0 = publisher;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        a aVar = new a(singleObserver);
        singleObserver.onSubscribe(aVar);
        this.f73559q0.subscribe(aVar.f73561q0);
        this.f73558p0.subscribe(aVar);
    }
}
