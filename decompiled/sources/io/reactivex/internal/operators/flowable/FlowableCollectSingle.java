package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableCollectSingle<T, U> extends Single<U> implements FuseToFlowable<U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f70322p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<? extends U> f70323q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiConsumer<? super U, ? super T> f70324r0;

    public static final class a<T, U> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super U> f70325p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiConsumer<? super U, ? super T> f70326q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final U f70327r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f70328s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f70329t0;

        public a(SingleObserver<? super U> singleObserver, U u2, BiConsumer<? super U, ? super T> biConsumer) {
            this.f70325p0 = singleObserver;
            this.f70326q0 = biConsumer;
            this.f70327r0 = u2;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70328s0.cancel();
            this.f70328s0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70328s0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70329t0) {
                return;
            }
            this.f70329t0 = true;
            this.f70328s0 = SubscriptionHelper.CANCELLED;
            this.f70325p0.onSuccess(this.f70327r0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70329t0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f70329t0 = true;
            this.f70328s0 = SubscriptionHelper.CANCELLED;
            this.f70325p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70329t0) {
                return;
            }
            try {
                this.f70326q0.accept(this.f70327r0, t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f70328s0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70328s0, subscription)) {
                this.f70328s0 = subscription;
                this.f70325p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableCollectSingle(Flowable<T> flowable, Callable<? extends U> callable, BiConsumer<? super U, ? super T> biConsumer) {
        this.f70322p0 = flowable;
        this.f70323q0 = callable;
        this.f70324r0 = biConsumer;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<U> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableCollect(this.f70322p0, this.f70323q0, this.f70324r0));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super U> singleObserver) {
        try {
            this.f70322p0.subscribe((FlowableSubscriber) new a(singleObserver, ObjectHelper.requireNonNull(this.f70323q0.call(), "The initialSupplier returned a null value"), this.f70324r0));
        } catch (Throwable th2) {
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
