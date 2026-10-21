package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelMapTry<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f73296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function<? super T, ? extends R> f73297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f73298c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73299a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f73299a = iArr;
            try {
                iArr[ParallelFailureHandling.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73299a[ParallelFailureHandling.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73299a[ParallelFailureHandling.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b<T, R> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ConditionalSubscriber<? super R> f73300p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends R> f73301q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f73302r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f73303s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f73304t0;

        public b(ConditionalSubscriber<? super R> conditionalSubscriber, Function<? super T, ? extends R> function, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.f73300p0 = conditionalSubscriber;
            this.f73301q0 = function;
            this.f73302r0 = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f73303s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f73304t0) {
                return;
            }
            this.f73304t0 = true;
            this.f73300p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f73304t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73304t0 = true;
                this.f73300p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10) || this.f73304t0) {
                return;
            }
            this.f73303s0.request(1L);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f73303s0, subscription)) {
                this.f73303s0 = subscription;
                this.f73300p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f73303s0.request(j10);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            int i10;
            if (this.f73304t0) {
                return false;
            }
            long j10 = 0;
            do {
                try {
                    return this.f73300p0.tryOnNext(ObjectHelper.requireNonNull(this.f73301q0.apply(t10), "The mapper returned a null value"));
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    try {
                        j10++;
                        i10 = a.f73299a[((ParallelFailureHandling) ObjectHelper.requireNonNull(this.f73302r0.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal()];
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
        public final Subscriber<? super R> f73305p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends R> f73306q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f73307r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f73308s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f73309t0;

        public c(Subscriber<? super R> subscriber, Function<? super T, ? extends R> function, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.f73305p0 = subscriber;
            this.f73306q0 = function;
            this.f73307r0 = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f73308s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f73309t0) {
                return;
            }
            this.f73309t0 = true;
            this.f73305p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f73309t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73309t0 = true;
                this.f73305p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10) || this.f73309t0) {
                return;
            }
            this.f73308s0.request(1L);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f73308s0, subscription)) {
                this.f73308s0 = subscription;
                this.f73305p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f73308s0.request(j10);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            int i10;
            if (this.f73309t0) {
                return false;
            }
            long j10 = 0;
            do {
                try {
                    this.f73305p0.onNext(ObjectHelper.requireNonNull(this.f73306q0.apply(t10), "The mapper returned a null value"));
                    return true;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    try {
                        j10++;
                        i10 = a.f73299a[((ParallelFailureHandling) ObjectHelper.requireNonNull(this.f73307r0.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal()];
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
        this.f73296a = parallelFlowable;
        this.f73297b = function;
        this.f73298c = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f73296a.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                Subscriber<? super R> subscriber = subscriberArr[i10];
                boolean z10 = subscriber instanceof ConditionalSubscriber;
                BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction = this.f73298c;
                Function<? super T, ? extends R> function = this.f73297b;
                if (z10) {
                    subscriberArr2[i10] = new b((ConditionalSubscriber) subscriber, function, biFunction);
                } else {
                    subscriberArr2[i10] = new c(subscriber, function, biFunction);
                }
            }
            this.f73296a.subscribe(subscriberArr2);
        }
    }
}
