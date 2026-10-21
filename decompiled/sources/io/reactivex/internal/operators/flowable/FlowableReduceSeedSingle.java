package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableReduceSeedSingle<T, R> extends Single<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<T> f70972p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final R f70973q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiFunction<R, ? super T, R> f70974r0;

    public static final class a<T, R> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super R> f70975p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<R, ? super T, R> f70976q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public R f70977r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f70978s0;

        public a(SingleObserver<? super R> singleObserver, BiFunction<R, ? super T, R> biFunction, R r3) {
            this.f70975p0 = singleObserver;
            this.f70977r0 = r3;
            this.f70976q0 = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70978s0.cancel();
            this.f70978s0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70978s0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            R r3 = this.f70977r0;
            if (r3 != null) {
                this.f70977r0 = null;
                this.f70978s0 = SubscriptionHelper.CANCELLED;
                this.f70975p0.onSuccess(r3);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70977r0 == null) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f70977r0 = null;
            this.f70978s0 = SubscriptionHelper.CANCELLED;
            this.f70975p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            R r3 = this.f70977r0;
            if (r3 != null) {
                try {
                    this.f70977r0 = (R) ObjectHelper.requireNonNull(this.f70976q0.apply(r3, t10), "The reducer returned a null value");
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f70978s0.cancel();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70978s0, subscription)) {
                this.f70978s0 = subscription;
                this.f70975p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableReduceSeedSingle(Publisher<T> publisher, R r3, BiFunction<R, ? super T, R> biFunction) {
        this.f70972p0 = publisher;
        this.f70973q0 = r3;
        this.f70974r0 = biFunction;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.f70972p0.subscribe(new a(singleObserver, this.f70974r0, this.f70973q0));
    }
}
