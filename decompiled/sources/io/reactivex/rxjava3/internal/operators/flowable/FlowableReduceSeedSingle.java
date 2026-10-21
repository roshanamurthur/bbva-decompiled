package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableReduceSeedSingle<T, R> extends Single<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<T> f75229p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final R f75230q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiFunction<R, ? super T, R> f75231r0;

    public static final class a<T, R> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super R> f75232p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<R, ? super T, R> f75233q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public R f75234r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f75235s0;

        public a(SingleObserver<? super R> singleObserver, BiFunction<R, ? super T, R> biFunction, R r3) {
            this.f75232p0 = singleObserver;
            this.f75234r0 = r3;
            this.f75233q0 = biFunction;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f75235s0.cancel();
            this.f75235s0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75235s0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            R r3 = this.f75234r0;
            if (r3 != null) {
                this.f75234r0 = null;
                this.f75235s0 = SubscriptionHelper.CANCELLED;
                this.f75232p0.onSuccess(r3);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f75234r0 == null) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f75234r0 = null;
            this.f75235s0 = SubscriptionHelper.CANCELLED;
            this.f75232p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            R r3 = this.f75234r0;
            if (r3 != null) {
                try {
                    R rApply = this.f75233q0.apply(r3, t10);
                    Objects.requireNonNull(rApply, "The reducer returned a null value");
                    this.f75234r0 = rApply;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f75235s0.cancel();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75235s0, subscription)) {
                this.f75235s0 = subscription;
                this.f75232p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableReduceSeedSingle(Publisher<T> publisher, R r3, BiFunction<R, ? super T, R> biFunction) {
        this.f75229p0 = publisher;
        this.f75230q0 = r3;
        this.f75231r0 = biFunction;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.f75229p0.subscribe(new a(singleObserver, this.f75231r0, this.f75230q0));
    }
}
