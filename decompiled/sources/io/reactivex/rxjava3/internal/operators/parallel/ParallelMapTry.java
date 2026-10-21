package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.parallel.ParallelFailureHandling;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelMapTry<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f77550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function<? super T, ? extends R> f77551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f77552c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77553a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f77553a = iArr;
            try {
                iArr[ParallelFailureHandling.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77553a[ParallelFailureHandling.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77553a[ParallelFailureHandling.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b<T, R> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ConditionalSubscriber<? super R> f77554p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends R> f77555q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f77556r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f77557s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f77558t0;

        public b(ConditionalSubscriber<? super R> conditionalSubscriber, Function<? super T, ? extends R> function, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.f77554p0 = conditionalSubscriber;
            this.f77555q0 = function;
            this.f77556r0 = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f77557s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f77558t0) {
                return;
            }
            this.f77558t0 = true;
            this.f77554p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f77558t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77558t0 = true;
                this.f77554p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10) || this.f77558t0) {
                return;
            }
            this.f77557s0.request(1L);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f77557s0, subscription)) {
                this.f77557s0 = subscription;
                this.f77554p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f77557s0.request(j10);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            int i10;
            if (this.f77558t0) {
                return false;
            }
            long j10 = 0;
            do {
                try {
                    R rApply = this.f77555q0.apply(t10);
                    Objects.requireNonNull(rApply, "The mapper returned a null value");
                    return this.f77554p0.tryOnNext(rApply);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    try {
                        j10++;
                        ParallelFailureHandling parallelFailureHandlingApply = this.f77556r0.apply(Long.valueOf(j10), th2);
                        Objects.requireNonNull(parallelFailureHandlingApply, "The errorHandler returned a null ParallelFailureHandling");
                        i10 = a.f77553a[parallelFailureHandlingApply.ordinal()];
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        cancel();
                        onError(new CompositeException(th2, th3));
                        return false;
                    }
                }
            } while (i10 == 1);
            if (i10 != 2) {
                if (i10 != 3) {
                    cancel();
                    onError(th2);
                    return false;
                }
                cancel();
                onComplete();
            }
            return false;
        }
    }

    public static final class c<T, R> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f77559p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends R> f77560q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f77561r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f77562s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f77563t0;

        public c(Subscriber<? super R> subscriber, Function<? super T, ? extends R> function, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.f77559p0 = subscriber;
            this.f77560q0 = function;
            this.f77561r0 = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f77562s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f77563t0) {
                return;
            }
            this.f77563t0 = true;
            this.f77559p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f77563t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77563t0 = true;
                this.f77559p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10) || this.f77563t0) {
                return;
            }
            this.f77562s0.request(1L);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f77562s0, subscription)) {
                this.f77562s0 = subscription;
                this.f77559p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f77562s0.request(j10);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            int i10;
            if (this.f77563t0) {
                return false;
            }
            long j10 = 0;
            do {
                try {
                    R rApply = this.f77560q0.apply(t10);
                    Objects.requireNonNull(rApply, "The mapper returned a null value");
                    this.f77559p0.onNext(rApply);
                    return true;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    try {
                        j10++;
                        ParallelFailureHandling parallelFailureHandlingApply = this.f77561r0.apply(Long.valueOf(j10), th2);
                        Objects.requireNonNull(parallelFailureHandlingApply, "The errorHandler returned a null ParallelFailureHandling");
                        i10 = a.f77553a[parallelFailureHandlingApply.ordinal()];
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        cancel();
                        onError(new CompositeException(th2, th3));
                        return false;
                    }
                }
            } while (i10 == 1);
            if (i10 != 2) {
                if (i10 != 3) {
                    cancel();
                    onError(th2);
                    return false;
                }
                cancel();
                onComplete();
            }
            return false;
        }
    }

    public ParallelMapTry(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends R> function, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        this.f77550a = parallelFlowable;
        this.f77551b = function;
        this.f77552c = biFunction;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public int parallelism() {
        return this.f77550a.parallelism();
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                Subscriber<? super R> subscriber = subscriberArr[i10];
                boolean z10 = subscriber instanceof ConditionalSubscriber;
                BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction = this.f77552c;
                Function<? super T, ? extends R> function = this.f77551b;
                if (z10) {
                    subscriberArr2[i10] = new b((ConditionalSubscriber) subscriber, function, biFunction);
                } else {
                    subscriberArr2[i10] = new c(subscriber, function, biFunction);
                }
            }
            this.f77550a.subscribe(subscriberArr2);
        }
    }
}
