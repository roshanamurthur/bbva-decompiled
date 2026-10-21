package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableElementAtMaybe<T> extends Maybe<T> implements FuseToFlowable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f70542p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f70543q0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f70544p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f70545q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f70546r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f70547s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f70548t0;

        public a(MaybeObserver<? super T> maybeObserver, long j10) {
            this.f70544p0 = maybeObserver;
            this.f70545q0 = j10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70546r0.cancel();
            this.f70546r0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70546r0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f70546r0 = SubscriptionHelper.CANCELLED;
            if (this.f70548t0) {
                return;
            }
            this.f70548t0 = true;
            this.f70544p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70548t0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f70548t0 = true;
            this.f70546r0 = SubscriptionHelper.CANCELLED;
            this.f70544p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70548t0) {
                return;
            }
            long j10 = this.f70547s0;
            if (j10 != this.f70545q0) {
                this.f70547s0 = j10 + 1;
                return;
            }
            this.f70548t0 = true;
            this.f70546r0.cancel();
            this.f70546r0 = SubscriptionHelper.CANCELLED;
            this.f70544p0.onSuccess(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70546r0, subscription)) {
                this.f70546r0 = subscription;
                this.f70544p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableElementAtMaybe(Flowable<T> flowable, long j10) {
        this.f70542p0 = flowable;
        this.f70543q0 = j10;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableElementAt(this.f70542p0, this.f70543q0, null, false));
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f70542p0.subscribe((FlowableSubscriber) new a(maybeObserver, this.f70543q0));
    }
}
