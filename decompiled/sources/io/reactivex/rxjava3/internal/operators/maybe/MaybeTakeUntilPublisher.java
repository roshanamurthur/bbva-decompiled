package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeTakeUntilPublisher<T, U> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<U> f76004p0;

    public static final class a<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f76005p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final C0388a<U> f76006q0 = new C0388a<>(this);

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.maybe.MaybeTakeUntilPublisher$a$a, reason: collision with other inner class name */
        public static final class C0388a<U> extends AtomicReference<Subscription> implements FlowableSubscriber<U> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, U> f76007p0;

            public C0388a(a<?, U> aVar) {
                this.f76007p0 = aVar;
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                a<?, U> aVar = this.f76007p0;
                aVar.getClass();
                if (DisposableHelper.dispose(aVar)) {
                    aVar.f76005p0.onComplete();
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th2) {
                a<?, U> aVar = this.f76007p0;
                aVar.getClass();
                if (DisposableHelper.dispose(aVar)) {
                    aVar.f76005p0.onError(th2);
                } else {
                    RxJavaPlugins.onError(th2);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Object obj) {
                SubscriptionHelper.cancel(this);
                a<?, U> aVar = this.f76007p0;
                aVar.getClass();
                if (DisposableHelper.dispose(aVar)) {
                    aVar.f76005p0.onComplete();
                }
            }

            @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
            public final void onSubscribe(Subscription subscription) {
                SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
            }
        }

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f76005p0 = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            SubscriptionHelper.cancel(this.f76006q0);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            SubscriptionHelper.cancel(this.f76006q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f76005p0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.f76006q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f76005p0.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            SubscriptionHelper.cancel(this.f76006q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f76005p0.onSuccess(t10);
            }
        }
    }

    public MaybeTakeUntilPublisher(MaybeSource<T> maybeSource, Publisher<U> publisher) {
        super(maybeSource);
        this.f76004p0 = publisher;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        a aVar = new a(maybeObserver);
        maybeObserver.onSubscribe(aVar);
        this.f76004p0.subscribe(aVar.f76006q0);
        this.source.subscribe(aVar);
    }
}
