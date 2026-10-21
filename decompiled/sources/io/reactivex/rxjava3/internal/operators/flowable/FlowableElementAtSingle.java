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
public final class FlowableElementAtSingle<T> extends Single<T> implements FuseToFlowable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f74816p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f74817q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final T f74818r0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f74819p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f74820q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final T f74821r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f74822s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f74823t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f74824u0;

        public a(SingleObserver<? super T> singleObserver, long j10, T t10) {
            this.f74819p0 = singleObserver;
            this.f74820q0 = j10;
            this.f74821r0 = t10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74822s0.cancel();
            this.f74822s0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74822s0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74822s0 = SubscriptionHelper.CANCELLED;
            if (this.f74824u0) {
                return;
            }
            this.f74824u0 = true;
            SingleObserver<? super T> singleObserver = this.f74819p0;
            T t10 = this.f74821r0;
            if (t10 != null) {
                singleObserver.onSuccess(t10);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74824u0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f74824u0 = true;
            this.f74822s0 = SubscriptionHelper.CANCELLED;
            this.f74819p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f74824u0) {
                return;
            }
            long j10 = this.f74823t0;
            if (j10 != this.f74820q0) {
                this.f74823t0 = j10 + 1;
                return;
            }
            this.f74824u0 = true;
            this.f74822s0.cancel();
            this.f74822s0 = SubscriptionHelper.CANCELLED;
            this.f74819p0.onSuccess(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74822s0, subscription)) {
                this.f74822s0 = subscription;
                this.f74819p0.onSubscribe(this);
                subscription.request(this.f74820q0 + 1);
            }
        }
    }

    public FlowableElementAtSingle(Flowable<T> flowable, long j10, T t10) {
        this.f74816p0 = flowable;
        this.f74817q0 = j10;
        this.f74818r0 = t10;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableElementAt(this.f74816p0, this.f74817q0, this.f74818r0, true));
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f74816p0.subscribe((FlowableSubscriber) new a(singleObserver, this.f74817q0, this.f74818r0));
    }
}
