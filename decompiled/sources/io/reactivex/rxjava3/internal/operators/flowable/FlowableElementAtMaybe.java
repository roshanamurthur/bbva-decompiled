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
public final class FlowableElementAtMaybe<T> extends Maybe<T> implements FuseToFlowable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f74807p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f74808q0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f74809p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f74810q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f74811r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f74812s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f74813t0;

        public a(MaybeObserver<? super T> maybeObserver, long j10) {
            this.f74809p0 = maybeObserver;
            this.f74810q0 = j10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74811r0.cancel();
            this.f74811r0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74811r0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74811r0 = SubscriptionHelper.CANCELLED;
            if (this.f74813t0) {
                return;
            }
            this.f74813t0 = true;
            this.f74809p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74813t0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f74813t0 = true;
            this.f74811r0 = SubscriptionHelper.CANCELLED;
            this.f74809p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f74813t0) {
                return;
            }
            long j10 = this.f74812s0;
            if (j10 != this.f74810q0) {
                this.f74812s0 = j10 + 1;
                return;
            }
            this.f74813t0 = true;
            this.f74811r0.cancel();
            this.f74811r0 = SubscriptionHelper.CANCELLED;
            this.f74809p0.onSuccess(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74811r0, subscription)) {
                this.f74811r0 = subscription;
                this.f74809p0.onSubscribe(this);
                subscription.request(this.f74810q0 + 1);
            }
        }
    }

    public FlowableElementAtMaybe(Flowable<T> flowable, long j10) {
        this.f74807p0 = flowable;
        this.f74808q0 = j10;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableElementAt(this.f74807p0, this.f74808q0, null, false));
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f74807p0.subscribe((FlowableSubscriber) new a(maybeObserver, this.f74808q0));
    }
}
