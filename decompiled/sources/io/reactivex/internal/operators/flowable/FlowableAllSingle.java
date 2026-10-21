package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableAllSingle<T> extends Single<Boolean> implements FuseToFlowable<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f70188p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super T> f70189q0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Boolean> f70190p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Predicate<? super T> f70191q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f70192r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f70193s0;

        public a(SingleObserver<? super Boolean> singleObserver, Predicate<? super T> predicate) {
            this.f70190p0 = singleObserver;
            this.f70191q0 = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70192r0.cancel();
            this.f70192r0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70192r0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70193s0) {
                return;
            }
            this.f70193s0 = true;
            this.f70192r0 = SubscriptionHelper.CANCELLED;
            this.f70190p0.onSuccess(Boolean.TRUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70193s0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f70193s0 = true;
            this.f70192r0 = SubscriptionHelper.CANCELLED;
            this.f70190p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70193s0) {
                return;
            }
            try {
                if (this.f70191q0.test(t10)) {
                    return;
                }
                this.f70193s0 = true;
                this.f70192r0.cancel();
                this.f70192r0 = SubscriptionHelper.CANCELLED;
                this.f70190p0.onSuccess(Boolean.FALSE);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f70192r0.cancel();
                this.f70192r0 = SubscriptionHelper.CANCELLED;
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70192r0, subscription)) {
                this.f70192r0 = subscription;
                this.f70190p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableAllSingle(Flowable<T> flowable, Predicate<? super T> predicate) {
        this.f70188p0 = flowable;
        this.f70189q0 = predicate;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<Boolean> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableAll(this.f70188p0, this.f70189q0));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f70188p0.subscribe((FlowableSubscriber) new a(singleObserver, this.f70189q0));
    }
}
