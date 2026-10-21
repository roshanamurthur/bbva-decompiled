package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeTimeoutPublisher<T, U> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<U> f71778p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MaybeSource<? extends T> f71779q0;

    public static final class a<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71780p0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f71780p0 = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71780p0.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71780p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71780p0.onSuccess(t10);
        }
    }

    public static final class b<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71781p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final c<T, U> f71782q0 = new c<>(this);

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final MaybeSource<? extends T> f71783r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final a<T> f71784s0;

        public b(MaybeObserver<? super T> maybeObserver, MaybeSource<? extends T> maybeSource) {
            this.f71781p0 = maybeObserver;
            this.f71783r0 = maybeSource;
            this.f71784s0 = maybeSource != null ? new a<>(maybeObserver) : null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            SubscriptionHelper.cancel(this.f71782q0);
            a<T> aVar = this.f71784s0;
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            SubscriptionHelper.cancel(this.f71782q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f71781p0.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.f71782q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f71781p0.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            SubscriptionHelper.cancel(this.f71782q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f71781p0.onSuccess(t10);
            }
        }
    }

    public static final class c<T, U> extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T, U> f71785p0;

        public c(b<T, U> bVar) {
            this.f71785p0 = bVar;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            b<T, U> bVar = this.f71785p0;
            bVar.getClass();
            if (DisposableHelper.dispose(bVar)) {
                MaybeSource<? extends T> maybeSource = bVar.f71783r0;
                if (maybeSource != null) {
                    maybeSource.subscribe(bVar.f71784s0);
                } else {
                    bVar.f71781p0.onError(new TimeoutException());
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            b<T, U> bVar = this.f71785p0;
            bVar.getClass();
            if (DisposableHelper.dispose(bVar)) {
                bVar.f71781p0.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            get().cancel();
            b<T, U> bVar = this.f71785p0;
            bVar.getClass();
            if (DisposableHelper.dispose(bVar)) {
                MaybeSource<? extends T> maybeSource = bVar.f71783r0;
                if (maybeSource != null) {
                    maybeSource.subscribe(bVar.f71784s0);
                } else {
                    bVar.f71781p0.onError(new TimeoutException());
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public MaybeTimeoutPublisher(MaybeSource<T> maybeSource, Publisher<U> publisher, MaybeSource<? extends T> maybeSource2) {
        super(maybeSource);
        this.f71778p0 = publisher;
        this.f71779q0 = maybeSource2;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        b bVar = new b(maybeObserver, this.f71779q0);
        maybeObserver.onSubscribe(bVar);
        this.f71778p0.subscribe(bVar.f71782q0);
        this.source.subscribe(bVar);
    }
}
