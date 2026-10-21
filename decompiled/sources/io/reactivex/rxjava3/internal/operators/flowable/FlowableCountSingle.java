package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableCountSingle<T> extends Single<Long> implements FuseToFlowable<Long> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f74673p0;

    public static final class a implements FlowableSubscriber<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Long> f74674p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f74675q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f74676r0;

        public a(SingleObserver<? super Long> singleObserver) {
            this.f74674p0 = singleObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74675q0.cancel();
            this.f74675q0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74675q0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74675q0 = SubscriptionHelper.CANCELLED;
            this.f74674p0.onSuccess(Long.valueOf(this.f74676r0));
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f74675q0 = SubscriptionHelper.CANCELLED;
            this.f74674p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f74676r0++;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74675q0, subscription)) {
                this.f74675q0 = subscription;
                this.f74674p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableCountSingle(Flowable<T> flowable) {
        this.f74673p0 = flowable;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    public Flowable<Long> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableCount(this.f74673p0));
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super Long> singleObserver) {
        this.f74673p0.subscribe((FlowableSubscriber) new a(singleObserver));
    }
}
