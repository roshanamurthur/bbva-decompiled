package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeTakeUntilPublisher<T, U> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<U> f71766p0;

    public static final class a<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71767p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final C0324a<U> f71768q0 = new C0324a<>(this);

        /* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher$a$a, reason: collision with other inner class name */
        public static final class C0324a<U> extends AtomicReference<Subscription> implements FlowableSubscriber<U> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, U> f71769p0;

            public C0324a(a<?, U> aVar) {
                this.f71769p0 = aVar;
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                a<?, U> aVar = this.f71769p0;
                aVar.getClass();
                if (DisposableHelper.dispose(aVar)) {
                    aVar.f71767p0.onComplete();
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th2) {
                a<?, U> aVar = this.f71769p0;
                aVar.getClass();
                if (DisposableHelper.dispose(aVar)) {
                    aVar.f71767p0.onError(th2);
                } else {
                    RxJavaPlugins.onError(th2);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Object obj) {
                SubscriptionHelper.cancel(this);
                a<?, U> aVar = this.f71769p0;
                aVar.getClass();
                if (DisposableHelper.dispose(aVar)) {
                    aVar.f71767p0.onComplete();
                }
            }

            @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
            public final void onSubscribe(Subscription subscription) {
                SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
            }
        }

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f71767p0 = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            SubscriptionHelper.cancel(this.f71768q0);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            SubscriptionHelper.cancel(this.f71768q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f71767p0.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.f71768q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f71767p0.onError(th2);
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
            SubscriptionHelper.cancel(this.f71768q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f71767p0.onSuccess(t10);
            }
        }
    }

    public MaybeTakeUntilPublisher(MaybeSource<T> maybeSource, Publisher<U> publisher) {
        super(maybeSource);
        this.f71766p0 = publisher;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        a aVar = new a(maybeObserver);
        maybeObserver.onSubscribe(aVar);
        this.f71766p0.subscribe(aVar.f71768q0);
        this.source.subscribe(aVar);
    }
}
