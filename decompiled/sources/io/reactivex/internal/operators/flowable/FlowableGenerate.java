package io.reactivex.internal.operators.flowable;

import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableGenerate<T, S> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<S> f70667q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiFunction<S, Emitter<T>, S> f70668r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Consumer<? super S> f70669s0;

    public static final class a<T, S> extends AtomicLong implements Emitter<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70670p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<S, ? super Emitter<T>, S> f70671q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Consumer<? super S> f70672r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public S f70673s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f70674t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f70675u0;
        public boolean v0;

        public a(Subscriber<? super T> subscriber, BiFunction<S, ? super Emitter<T>, S> biFunction, Consumer<? super S> consumer, S s4) {
            this.f70670p0 = subscriber;
            this.f70671q0 = biFunction;
            this.f70672r0 = consumer;
            this.f70673s0 = s4;
        }

        public final void a(S s4) {
            try {
                this.f70672r0.accept(s4);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f70674t0) {
                return;
            }
            this.f70674t0 = true;
            if (BackpressureHelper.add(this, 1L) == 0) {
                S s4 = this.f70673s0;
                this.f70673s0 = null;
                a(s4);
            }
        }

        @Override // io.reactivex.Emitter
        public final void onComplete() {
            if (this.f70675u0) {
                return;
            }
            this.f70675u0 = true;
            this.f70670p0.onComplete();
        }

        @Override // io.reactivex.Emitter
        public final void onError(Throwable th2) {
            if (this.f70675u0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f70675u0 = true;
            this.f70670p0.onError(th2);
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t10) {
            if (this.f70675u0) {
                return;
            }
            if (this.v0) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.v0 = true;
                this.f70670p0.onNext(t10);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10) && BackpressureHelper.add(this, j10) == 0) {
                S sApply = this.f70673s0;
                BiFunction<S, ? super Emitter<T>, S> biFunction = this.f70671q0;
                do {
                    long j11 = 0;
                    while (true) {
                        if (j11 == j10) {
                            j10 = get();
                            if (j11 == j10) {
                                break;
                            }
                        } else {
                            if (this.f70674t0) {
                                this.f70673s0 = null;
                                a(sApply);
                                return;
                            }
                            this.v0 = false;
                            try {
                                sApply = biFunction.apply(sApply, this);
                                if (this.f70675u0) {
                                    this.f70674t0 = true;
                                    this.f70673s0 = null;
                                    a(sApply);
                                    return;
                                }
                                j11++;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.f70674t0 = true;
                                this.f70673s0 = null;
                                onError(th2);
                                a(sApply);
                                return;
                            }
                        }
                    }
                    this.f70673s0 = sApply;
                    j10 = addAndGet(-j11);
                } while (j10 != 0);
            }
        }
    }

    public FlowableGenerate(Callable<S> callable, BiFunction<S, Emitter<T>, S> biFunction, Consumer<? super S> consumer) {
        this.f70667q0 = callable;
        this.f70668r0 = biFunction;
        this.f70669s0 = consumer;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        try {
            subscriber.onSubscribe(new a(subscriber, this.f70668r0, this.f70669s0, this.f70667q0.call()));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
