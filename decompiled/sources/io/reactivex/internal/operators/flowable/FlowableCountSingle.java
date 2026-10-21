package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableCountSingle<T> extends Single<Long> implements FuseToFlowable<Long> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f70408p0;

    public static final class a implements FlowableSubscriber<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Long> f70409p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f70410q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f70411r0;

        public a(SingleObserver<? super Long> singleObserver) {
            this.f70409p0 = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70410q0.cancel();
            this.f70410q0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70410q0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f70410q0 = SubscriptionHelper.CANCELLED;
            this.f70409p0.onSuccess(Long.valueOf(this.f70411r0));
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f70410q0 = SubscriptionHelper.CANCELLED;
            this.f70409p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f70411r0++;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70410q0, subscription)) {
                this.f70410q0 = subscription;
                this.f70409p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableCountSingle(Flowable<T> flowable) {
        this.f70408p0 = flowable;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<Long> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableCount(this.f70408p0));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Long> singleObserver) {
        this.f70408p0.subscribe((FlowableSubscriber) new a(singleObserver));
    }
}
