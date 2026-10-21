package io.reactivex.rxjava3.internal.jdk8;

import a.d;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableCollectWithCollectorSingle<T, A, R> extends Single<R> implements FuseToFlowable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f74018p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Collector<? super T, A, R> f74019q0;

    public static final class a<T, A, R> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super R> f74020p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiConsumer<A, T> f74021q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<A, R> f74022r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f74023s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f74024t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public A f74025u0;

        public a(SingleObserver<? super R> singleObserver, A a10, BiConsumer<A, T> biConsumer, Function<A, R> function) {
            this.f74020p0 = singleObserver;
            this.f74025u0 = a10;
            this.f74021q0 = biConsumer;
            this.f74022r0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74023s0.cancel();
            this.f74023s0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74023s0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            SingleObserver<? super R> singleObserver = this.f74020p0;
            if (this.f74024t0) {
                return;
            }
            this.f74024t0 = true;
            this.f74023s0 = SubscriptionHelper.CANCELLED;
            A a10 = this.f74025u0;
            this.f74025u0 = null;
            try {
                d dVar = (Object) this.f74022r0.apply(a10);
                Objects.requireNonNull(dVar, "The finisher returned a null value");
                singleObserver.onSuccess(dVar);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                singleObserver.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74024t0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f74024t0 = true;
            this.f74023s0 = SubscriptionHelper.CANCELLED;
            this.f74025u0 = null;
            this.f74020p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f74024t0) {
                return;
            }
            try {
                this.f74021q0.accept(this.f74025u0, t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f74023s0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(@NonNull Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74023s0, subscription)) {
                this.f74023s0 = subscription;
                this.f74020p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableCollectWithCollectorSingle(Flowable<T> flowable, Collector<? super T, A, R> collector) {
        this.f74018p0 = flowable;
        this.f74019q0 = collector;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    public Flowable<R> fuseToFlowable() {
        return new FlowableCollectWithCollector(this.f74018p0, this.f74019q0);
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(@NonNull SingleObserver<? super R> singleObserver) {
        Collector<? super T, A, R> collector = this.f74019q0;
        try {
            this.f74018p0.subscribe((FlowableSubscriber) new a(singleObserver, collector.supplier().get(), collector.accumulator(), collector.finisher()));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
