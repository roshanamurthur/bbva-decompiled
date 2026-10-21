package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDelayOtherPublisher<T, U> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<U> f71564p0;

    public static final class a<T, U> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T> f71565p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Publisher<U> f71566q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f71567r0;

        public a(MaybeObserver<? super T> maybeObserver, Publisher<U> publisher) {
            this.f71565p0 = new b<>(maybeObserver);
            this.f71566q0 = publisher;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71567r0.dispose();
            this.f71567r0 = DisposableHelper.DISPOSED;
            SubscriptionHelper.cancel(this.f71565p0);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71565p0.get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71567r0 = DisposableHelper.DISPOSED;
            this.f71566q0.subscribe(this.f71565p0);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71567r0 = DisposableHelper.DISPOSED;
            b<T> bVar = this.f71565p0;
            bVar.f71570r0 = th2;
            this.f71566q0.subscribe(bVar);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71567r0, disposable)) {
                this.f71567r0 = disposable;
                this.f71565p0.f71568p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71567r0 = DisposableHelper.DISPOSED;
            b<T> bVar = this.f71565p0;
            bVar.f71569q0 = t10;
            this.f71566q0.subscribe(bVar);
        }
    }

    public static final class b<T> extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71568p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public T f71569q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Throwable f71570r0;

        public b(MaybeObserver<? super T> maybeObserver) {
            this.f71568p0 = maybeObserver;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Throwable th2 = this.f71570r0;
            MaybeObserver<? super T> maybeObserver = this.f71568p0;
            if (th2 != null) {
                maybeObserver.onError(th2);
                return;
            }
            T t10 = this.f71569q0;
            if (t10 != null) {
                maybeObserver.onSuccess(t10);
            } else {
                maybeObserver.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            Throwable th3 = this.f71570r0;
            MaybeObserver<? super T> maybeObserver = this.f71568p0;
            if (th3 == null) {
                maybeObserver.onError(th2);
            } else {
                maybeObserver.onError(new CompositeException(th3, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                lazySet(subscriptionHelper);
                subscription.cancel();
                onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public MaybeDelayOtherPublisher(MaybeSource<T> maybeSource, Publisher<U> publisher) {
        super(maybeSource);
        this.f71564p0 = publisher;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f71564p0));
    }
}
