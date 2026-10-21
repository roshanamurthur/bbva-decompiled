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
public final class FlowableElementAtSingle<T> extends Single<T> implements FuseToFlowable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f70549p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f70550q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final T f70551r0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f70552p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f70553q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final T f70554r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f70555s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f70556t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f70557u0;

        public a(SingleObserver<? super T> singleObserver, long j10, T t10) {
            this.f70552p0 = singleObserver;
            this.f70553q0 = j10;
            this.f70554r0 = t10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70555s0.cancel();
            this.f70555s0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70555s0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f70555s0 = SubscriptionHelper.CANCELLED;
            if (this.f70557u0) {
                return;
            }
            this.f70557u0 = true;
            SingleObserver<? super T> singleObserver = this.f70552p0;
            T t10 = this.f70554r0;
            if (t10 != null) {
                singleObserver.onSuccess(t10);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70557u0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f70557u0 = true;
            this.f70555s0 = SubscriptionHelper.CANCELLED;
            this.f70552p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70557u0) {
                return;
            }
            long j10 = this.f70556t0;
            if (j10 != this.f70553q0) {
                this.f70556t0 = j10 + 1;
                return;
            }
            this.f70557u0 = true;
            this.f70555s0.cancel();
            this.f70555s0 = SubscriptionHelper.CANCELLED;
            this.f70552p0.onSuccess(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70555s0, subscription)) {
                this.f70555s0 = subscription;
                this.f70552p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableElementAtSingle(Flowable<T> flowable, long j10, T t10) {
        this.f70549p0 = flowable;
        this.f70550q0 = j10;
        this.f70551r0 = t10;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableElementAt(this.f70549p0, this.f70550q0, this.f70551r0, true));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f70549p0.subscribe((FlowableSubscriber) new a(singleObserver, this.f70550q0, this.f70551r0));
    }
}
