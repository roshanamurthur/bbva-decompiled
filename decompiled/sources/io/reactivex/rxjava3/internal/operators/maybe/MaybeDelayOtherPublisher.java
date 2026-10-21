package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDelayOtherPublisher<T, U> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<U> f75799p0;

    public static final class a<T, U> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T> f75800p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Publisher<U> f75801q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f75802r0;

        public a(MaybeObserver<? super T> maybeObserver, Publisher<U> publisher) {
            this.f75800p0 = new b<>(maybeObserver);
            this.f75801q0 = publisher;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f75802r0.dispose();
            this.f75802r0 = DisposableHelper.DISPOSED;
            SubscriptionHelper.cancel(this.f75800p0);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75800p0.get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f75802r0 = DisposableHelper.DISPOSED;
            this.f75801q0.subscribe(this.f75800p0);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75802r0 = DisposableHelper.DISPOSED;
            b<T> bVar = this.f75800p0;
            bVar.f75805r0 = th2;
            this.f75801q0.subscribe(bVar);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f75802r0, disposable)) {
                this.f75802r0 = disposable;
                this.f75800p0.f75803p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f75802r0 = DisposableHelper.DISPOSED;
            b<T> bVar = this.f75800p0;
            bVar.f75804q0 = t10;
            this.f75801q0.subscribe(bVar);
        }
    }

    public static final class b<T> extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75803p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public T f75804q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Throwable f75805r0;

        public b(MaybeObserver<? super T> maybeObserver) {
            this.f75803p0 = maybeObserver;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Throwable th2 = this.f75805r0;
            MaybeObserver<? super T> maybeObserver = this.f75803p0;
            if (th2 != null) {
                maybeObserver.onError(th2);
                return;
            }
            T t10 = this.f75804q0;
            if (t10 != null) {
                maybeObserver.onSuccess(t10);
            } else {
                maybeObserver.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            Throwable th3 = this.f75805r0;
            MaybeObserver<? super T> maybeObserver = this.f75803p0;
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

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public MaybeDelayOtherPublisher(MaybeSource<T> maybeSource, Publisher<U> publisher) {
        super(maybeSource);
        this.f75799p0 = publisher;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f75799p0));
    }
}
