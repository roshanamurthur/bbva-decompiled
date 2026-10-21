package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableSingleSingle<T> extends Single<T> implements FuseToFlowable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f71150p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f71151q0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f71152p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f71153q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f71154r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f71155s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public T f71156t0;

        public a(SingleObserver<? super T> singleObserver, T t10) {
            this.f71152p0 = singleObserver;
            this.f71153q0 = t10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71154r0.cancel();
            this.f71154r0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71154r0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f71155s0) {
                return;
            }
            this.f71155s0 = true;
            this.f71154r0 = SubscriptionHelper.CANCELLED;
            T t10 = this.f71156t0;
            this.f71156t0 = null;
            if (t10 == null) {
                t10 = this.f71153q0;
            }
            SingleObserver<? super T> singleObserver = this.f71152p0;
            if (t10 != null) {
                singleObserver.onSuccess(t10);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f71155s0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f71155s0 = true;
            this.f71154r0 = SubscriptionHelper.CANCELLED;
            this.f71152p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f71155s0) {
                return;
            }
            if (this.f71156t0 == null) {
                this.f71156t0 = t10;
                return;
            }
            this.f71155s0 = true;
            this.f71154r0.cancel();
            this.f71154r0 = SubscriptionHelper.CANCELLED;
            this.f71152p0.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71154r0, subscription)) {
                this.f71154r0 = subscription;
                this.f71152p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSingleSingle(Flowable<T> flowable, T t10) {
        this.f71150p0 = flowable;
        this.f71151q0 = t10;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableSingle(this.f71150p0, this.f71151q0, true));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f71150p0.subscribe((FlowableSubscriber) new a(singleObserver, this.f71151q0));
    }
}
