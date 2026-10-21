package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableAnySingle<T> extends Single<Boolean> implements FuseToFlowable<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f74470p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super T> f74471q0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Boolean> f74472p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Predicate<? super T> f74473q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f74474r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f74475s0;

        public a(SingleObserver<? super Boolean> singleObserver, Predicate<? super T> predicate) {
            this.f74472p0 = singleObserver;
            this.f74473q0 = predicate;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74474r0.cancel();
            this.f74474r0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74474r0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f74475s0) {
                return;
            }
            this.f74475s0 = true;
            this.f74474r0 = SubscriptionHelper.CANCELLED;
            this.f74472p0.onSuccess(Boolean.FALSE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74475s0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f74475s0 = true;
            this.f74474r0 = SubscriptionHelper.CANCELLED;
            this.f74472p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f74475s0) {
                return;
            }
            try {
                if (this.f74473q0.test(t10)) {
                    this.f74475s0 = true;
                    this.f74474r0.cancel();
                    this.f74474r0 = SubscriptionHelper.CANCELLED;
                    this.f74472p0.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f74474r0.cancel();
                this.f74474r0 = SubscriptionHelper.CANCELLED;
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74474r0, subscription)) {
                this.f74474r0 = subscription;
                this.f74472p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableAnySingle(Flowable<T> flowable, Predicate<? super T> predicate) {
        this.f74470p0 = flowable;
        this.f74471q0 = predicate;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    public Flowable<Boolean> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableAny(this.f74470p0, this.f74471q0));
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f74470p0.subscribe((FlowableSubscriber) new a(singleObserver, this.f74471q0));
    }
}
