package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableToListSingle<T, U extends Collection<? super T>> extends Single<U> implements FuseToFlowable<U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f71339p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<U> f71340q0;

    public static final class a<T, U extends Collection<? super T>> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super U> f71341p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f71342q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public U f71343r0;

        public a(SingleObserver<? super U> singleObserver, U u2) {
            this.f71341p0 = singleObserver;
            this.f71343r0 = u2;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71342q0.cancel();
            this.f71342q0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71342q0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71342q0 = SubscriptionHelper.CANCELLED;
            this.f71341p0.onSuccess(this.f71343r0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f71343r0 = null;
            this.f71342q0 = SubscriptionHelper.CANCELLED;
            this.f71341p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f71343r0.add(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71342q0, subscription)) {
                this.f71342q0 = subscription;
                this.f71341p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableToListSingle(Flowable<T> flowable) {
        this(flowable, ArrayListSupplier.asCallable());
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<U> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableToList(this.f71339p0, this.f71340q0));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super U> singleObserver) {
        try {
            this.f71339p0.subscribe((FlowableSubscriber) new a(singleObserver, (Collection) ObjectHelper.requireNonNull(this.f71340q0.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }

    public FlowableToListSingle(Flowable<T> flowable, Callable<U> callable) {
        this.f71339p0 = flowable;
        this.f71340q0 = callable;
    }
}
