package io.reactivex.rxjava3.internal.jdk8;

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
import java.util.Optional;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelMapTryOptional<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f74154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function<? super T, Optional<? extends R>> f74155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f74156c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74157a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f74157a = iArr;
            try {
                iArr[ParallelFailureHandling.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74157a[ParallelFailureHandling.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74157a[ParallelFailureHandling.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b<T, R> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ConditionalSubscriber<? super R> f74158p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, Optional<? extends R>> f74159q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f74160r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f74161s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f74162t0;

        public b(ConditionalSubscriber<? super R> conditionalSubscriber, Function<? super T, Optional<? extends R>> function, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.f74158p0 = conditionalSubscriber;
            this.f74159q0 = function;
            this.f74160r0 = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74161s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f74162t0) {
                return;
            }
            this.f74162t0 = true;
            this.f74158p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74162t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f74162t0 = true;
                this.f74158p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10) || this.f74162t0) {
                return;
            }
            this.f74161s0.request(1L);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74161s0, subscription)) {
                this.f74161s0 = subscription;
                this.f74158p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f74161s0.request(j10);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            int i10;
            if (this.f74162t0) {
                return false;
            }
            long j10 = 0;
            do {
                try {
                    Optional<? extends R> optionalApply = this.f74159q0.apply(t10);
                    Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                    Optional optionalB = cm.a.b(optionalApply);
                    return optionalB.isPresent() && this.f74158p0.tryOnNext((Object) optionalB.get());
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    try {
                        j10++;
                        ParallelFailureHandling parallelFailureHandlingApply = this.f74160r0.apply(Long.valueOf(j10), th2);
                        Objects.requireNonNull(parallelFailureHandlingApply, "The errorHandler returned a null ParallelFailureHandling");
                        i10 = a.f74157a[parallelFailureHandlingApply.ordinal()];
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
        public final Subscriber<? super R> f74163p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, Optional<? extends R>> f74164q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f74165r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f74166s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f74167t0;

        public c(Subscriber<? super R> subscriber, Function<? super T, Optional<? extends R>> function, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.f74163p0 = subscriber;
            this.f74164q0 = function;
            this.f74165r0 = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74166s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f74167t0) {
                return;
            }
            this.f74167t0 = true;
            this.f74163p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74167t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f74167t0 = true;
                this.f74163p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10) || this.f74167t0) {
                return;
            }
            this.f74166s0.request(1L);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74166s0, subscription)) {
                this.f74166s0 = subscription;
                this.f74163p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f74166s0.request(j10);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            int i10;
            if (this.f74167t0) {
                return false;
            }
            long j10 = 0;
            do {
                try {
                    Optional<? extends R> optionalApply = this.f74164q0.apply(t10);
                    Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                    Optional optionalB = cm.a.b(optionalApply);
                    if (!optionalB.isPresent()) {
                        return false;
                    }
                    this.f74163p0.onNext((Object) optionalB.get());
                    return true;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    try {
                        j10++;
                        ParallelFailureHandling parallelFailureHandlingApply = this.f74165r0.apply(Long.valueOf(j10), th2);
                        Objects.requireNonNull(parallelFailureHandlingApply, "The errorHandler returned a null ParallelFailureHandling");
                        i10 = a.f74157a[parallelFailureHandlingApply.ordinal()];
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

    public ParallelMapTryOptional(ParallelFlowable<T> parallelFlowable, Function<? super T, Optional<? extends R>> function, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        this.f74154a = parallelFlowable;
        this.f74155b = function;
        this.f74156c = biFunction;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public int parallelism() {
        return this.f74154a.parallelism();
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                Subscriber<? super R> subscriber = subscriberArr[i10];
                boolean z10 = subscriber instanceof ConditionalSubscriber;
                BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction = this.f74156c;
                Function<? super T, Optional<? extends R>> function = this.f74155b;
                if (z10) {
                    subscriberArr2[i10] = new b((ConditionalSubscriber) subscriber, function, biFunction);
                } else {
                    subscriberArr2[i10] = new c(subscriber, function, biFunction);
                }
            }
            this.f74154a.subscribe(subscriberArr2);
        }
    }
}
