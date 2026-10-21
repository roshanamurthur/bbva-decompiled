package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSingleSingle<T> extends Single<T> implements FuseToFlowable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f75408p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f75409q0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f75410p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f75411q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f75412r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f75413s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public T f75414t0;

        public a(SingleObserver<? super T> singleObserver, T t10) {
            this.f75410p0 = singleObserver;
            this.f75411q0 = t10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f75412r0.cancel();
            this.f75412r0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75412r0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f75413s0) {
                return;
            }
            this.f75413s0 = true;
            this.f75412r0 = SubscriptionHelper.CANCELLED;
            T t10 = this.f75414t0;
            this.f75414t0 = null;
            if (t10 == null) {
                t10 = this.f75411q0;
            }
            SingleObserver<? super T> singleObserver = this.f75410p0;
            if (t10 != null) {
                singleObserver.onSuccess(t10);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f75413s0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f75413s0 = true;
            this.f75412r0 = SubscriptionHelper.CANCELLED;
            this.f75410p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f75413s0) {
                return;
            }
            if (this.f75414t0 == null) {
                this.f75414t0 = t10;
                return;
            }
            this.f75413s0 = true;
            this.f75412r0.cancel();
            this.f75412r0 = SubscriptionHelper.CANCELLED;
            this.f75410p0.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75412r0, subscription)) {
                this.f75412r0 = subscription;
                this.f75410p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSingleSingle(Flowable<T> flowable, T t10) {
        this.f75408p0 = flowable;
        this.f75409q0 = t10;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableSingle(this.f75408p0, this.f75409q0, true));
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f75408p0.subscribe((FlowableSubscriber) new a(singleObserver, this.f75409q0));
    }
}
