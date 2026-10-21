package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Collection;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableToListSingle<T, U extends Collection<? super T>> extends Single<U> implements FuseToFlowable<U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f75595p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Supplier<U> f75596q0;

    public static final class a<T, U extends Collection<? super T>> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super U> f75597p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f75598q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public U f75599r0;

        public a(SingleObserver<? super U> singleObserver, U u2) {
            this.f75597p0 = singleObserver;
            this.f75599r0 = u2;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f75598q0.cancel();
            this.f75598q0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75598q0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75598q0 = SubscriptionHelper.CANCELLED;
            this.f75597p0.onSuccess(this.f75599r0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f75599r0 = null;
            this.f75598q0 = SubscriptionHelper.CANCELLED;
            this.f75597p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f75599r0.add(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75598q0, subscription)) {
                this.f75598q0 = subscription;
                this.f75597p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableToListSingle(Flowable<T> flowable) {
        this(flowable, ArrayListSupplier.asSupplier());
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    public Flowable<U> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableToList(this.f75595p0, this.f75596q0));
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super U> singleObserver) {
        try {
            this.f75595p0.subscribe((FlowableSubscriber) new a(singleObserver, (Collection) ExceptionHelper.nullCheck(this.f75596q0.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }

    public FlowableToListSingle(Flowable<T> flowable, Supplier<U> supplier) {
        this.f75595p0 = flowable;
        this.f75596q0 = supplier;
    }
}
