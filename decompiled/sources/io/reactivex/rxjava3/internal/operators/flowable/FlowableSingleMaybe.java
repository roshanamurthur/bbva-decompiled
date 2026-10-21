package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSingleMaybe<T> extends Maybe<T> implements FuseToFlowable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f75403p0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75404p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f75405q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f75406r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public T f75407s0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f75404p0 = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f75405q0.cancel();
            this.f75405q0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75405q0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f75406r0) {
                return;
            }
            this.f75406r0 = true;
            this.f75405q0 = SubscriptionHelper.CANCELLED;
            T t10 = this.f75407s0;
            this.f75407s0 = null;
            MaybeObserver<? super T> maybeObserver = this.f75404p0;
            if (t10 == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(t10);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f75406r0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f75406r0 = true;
            this.f75405q0 = SubscriptionHelper.CANCELLED;
            this.f75404p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f75406r0) {
                return;
            }
            if (this.f75407s0 == null) {
                this.f75407s0 = t10;
                return;
            }
            this.f75406r0 = true;
            this.f75405q0.cancel();
            this.f75405q0 = SubscriptionHelper.CANCELLED;
            this.f75404p0.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75405q0, subscription)) {
                this.f75405q0 = subscription;
                this.f75404p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSingleMaybe(Flowable<T> flowable) {
        this.f75403p0 = flowable;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableSingle(this.f75403p0, null, false));
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f75403p0.subscribe((FlowableSubscriber) new a(maybeObserver));
    }
}
