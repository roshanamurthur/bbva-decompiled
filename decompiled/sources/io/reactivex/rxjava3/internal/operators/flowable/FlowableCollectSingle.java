package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableCollectSingle<T, U> extends Single<U> implements FuseToFlowable<U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f74576p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Supplier<? extends U> f74577q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiConsumer<? super U, ? super T> f74578r0;

    public static final class a<T, U> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super U> f74579p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiConsumer<? super U, ? super T> f74580q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final U f74581r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f74582s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f74583t0;

        public a(SingleObserver<? super U> singleObserver, U u2, BiConsumer<? super U, ? super T> biConsumer) {
            this.f74579p0 = singleObserver;
            this.f74580q0 = biConsumer;
            this.f74581r0 = u2;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74582s0.cancel();
            this.f74582s0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74582s0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f74583t0) {
                return;
            }
            this.f74583t0 = true;
            this.f74582s0 = SubscriptionHelper.CANCELLED;
            this.f74579p0.onSuccess(this.f74581r0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74583t0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f74583t0 = true;
            this.f74582s0 = SubscriptionHelper.CANCELLED;
            this.f74579p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f74583t0) {
                return;
            }
            try {
                this.f74580q0.accept(this.f74581r0, t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f74582s0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74582s0, subscription)) {
                this.f74582s0 = subscription;
                this.f74579p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableCollectSingle(Flowable<T> flowable, Supplier<? extends U> supplier, BiConsumer<? super U, ? super T> biConsumer) {
        this.f74576p0 = flowable;
        this.f74577q0 = supplier;
        this.f74578r0 = biConsumer;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    public Flowable<U> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableCollect(this.f74576p0, this.f74577q0, this.f74578r0));
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super U> singleObserver) {
        try {
            U u2 = this.f74577q0.get();
            Objects.requireNonNull(u2, "The initialSupplier returned a null value");
            this.f74576p0.subscribe((FlowableSubscriber) new a(singleObserver, u2, this.f74578r0));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
