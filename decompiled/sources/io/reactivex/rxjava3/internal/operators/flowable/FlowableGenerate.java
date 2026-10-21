package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableGenerate<T, S> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Supplier<S> f74943q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiFunction<S, Emitter<T>, S> f74944r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Consumer<? super S> f74945s0;

    public static final class a<T, S> extends AtomicLong implements Emitter<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f74946p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<S, ? super Emitter<T>, S> f74947q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Consumer<? super S> f74948r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public S f74949s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f74950t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f74951u0;
        public boolean v0;

        public a(Subscriber<? super T> subscriber, BiFunction<S, ? super Emitter<T>, S> biFunction, Consumer<? super S> consumer, S s4) {
            this.f74946p0 = subscriber;
            this.f74947q0 = biFunction;
            this.f74948r0 = consumer;
            this.f74949s0 = s4;
        }

        public final void a(S s4) {
            try {
                this.f74948r0.accept(s4);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f74950t0) {
                return;
            }
            this.f74950t0 = true;
            if (BackpressureHelper.add(this, 1L) == 0) {
                S s4 = this.f74949s0;
                this.f74949s0 = null;
                a(s4);
            }
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onComplete() {
            if (this.f74951u0) {
                return;
            }
            this.f74951u0 = true;
            this.f74946p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onError(Throwable th2) {
            if (this.f74951u0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (th2 == null) {
                th2 = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
            }
            this.f74951u0 = true;
            this.f74946p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onNext(T t10) {
            if (this.f74951u0) {
                return;
            }
            if (this.v0) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t10 == null) {
                onError(ExceptionHelper.createNullPointerException("onNext called with a null value."));
            } else {
                this.v0 = true;
                this.f74946p0.onNext(t10);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10) && BackpressureHelper.add(this, j10) == 0) {
                S sApply = this.f74949s0;
                BiFunction<S, ? super Emitter<T>, S> biFunction = this.f74947q0;
                do {
                    long j11 = 0;
                    while (true) {
                        if (j11 == j10) {
                            j10 = get();
                            if (j11 == j10) {
                                break;
                            }
                        } else {
                            if (this.f74950t0) {
                                this.f74949s0 = null;
                                a(sApply);
                                return;
                            }
                            this.v0 = false;
                            try {
                                sApply = biFunction.apply(sApply, this);
                                if (this.f74951u0) {
                                    this.f74950t0 = true;
                                    this.f74949s0 = null;
                                    a(sApply);
                                    return;
                                }
                                j11++;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.f74950t0 = true;
                                this.f74949s0 = null;
                                onError(th2);
                                a(sApply);
                                return;
                            }
                        }
                    }
                    this.f74949s0 = sApply;
                    j10 = addAndGet(-j11);
                } while (j10 != 0);
            }
        }
    }

    public FlowableGenerate(Supplier<S> supplier, BiFunction<S, Emitter<T>, S> biFunction, Consumer<? super S> consumer) {
        this.f74943q0 = supplier;
        this.f74944r0 = biFunction;
        this.f74945s0 = consumer;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        try {
            subscriber.onSubscribe(new a(subscriber, this.f74944r0, this.f74945s0, this.f74943q0.get()));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
