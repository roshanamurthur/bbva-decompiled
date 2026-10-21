package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelFilterTry<T> extends ParallelFlowable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f73241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Predicate<? super T> f73242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f73243c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73244a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f73244a = iArr;
            try {
                iArr[ParallelFailureHandling.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73244a[ParallelFailureHandling.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73244a[ParallelFailureHandling.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static abstract class b<T> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Predicate<? super T> f73245p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f73246q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f73247r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f73248s0;

        public b(Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.f73245p0 = predicate;
            this.f73246q0 = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f73247r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10) || this.f73248s0) {
                return;
            }
            this.f73247r0.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f73247r0.request(j10);
        }
    }

    public static final class c<T> extends b<T> {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ConditionalSubscriber<? super T> f73249t0;

        public c(ConditionalSubscriber<? super T> conditionalSubscriber, Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            super(predicate, biFunction);
            this.f73249t0 = conditionalSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f73248s0) {
                return;
            }
            this.f73248s0 = true;
            this.f73249t0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f73248s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73248s0 = true;
                this.f73249t0.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f73247r0, subscription)) {
                this.f73247r0 = subscription;
                this.f73249t0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            int i10;
            if (!this.f73248s0) {
                long j10 = 0;
                do {
                    try {
                        return this.f73245p0.test(t10) && this.f73249t0.tryOnNext(t10);
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        try {
                            j10++;
                            i10 = a.f73244a[((ParallelFailureHandling) ObjectHelper.requireNonNull(this.f73246q0.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal()];
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            cancel();
                            onError(new CompositeException(th2, th3));
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
            return false;
        }
    }

    public static final class d<T> extends b<T> {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Subscriber<? super T> f73250t0;

        public d(Subscriber<? super T> subscriber, Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            super(predicate, biFunction);
            this.f73250t0 = subscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f73248s0) {
                return;
            }
            this.f73248s0 = true;
            this.f73250t0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f73248s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73248s0 = true;
                this.f73250t0.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f73247r0, subscription)) {
                this.f73247r0 = subscription;
                this.f73250t0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            int i10;
            if (!this.f73248s0) {
                long j10 = 0;
                do {
                    try {
                        if (!this.f73245p0.test(t10)) {
                            return false;
                        }
                        this.f73250t0.onNext(t10);
                        return true;
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        try {
                            j10++;
                            i10 = a.f73244a[((ParallelFailureHandling) ObjectHelper.requireNonNull(this.f73246q0.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal()];
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            cancel();
                            onError(new CompositeException(th2, th3));
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
            return false;
        }
    }

    public ParallelFilterTry(ParallelFlowable<T> parallelFlowable, Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        this.f73241a = parallelFlowable;
        this.f73242b = predicate;
        this.f73243c = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f73241a.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                Subscriber<? super T> subscriber = subscriberArr[i10];
                boolean z10 = subscriber instanceof ConditionalSubscriber;
                BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction = this.f73243c;
                Predicate<? super T> predicate = this.f73242b;
                if (z10) {
                    subscriberArr2[i10] = new c((ConditionalSubscriber) subscriber, predicate, biFunction);
                } else {
                    subscriberArr2[i10] = new d(subscriber, predicate, biFunction);
                }
            }
            this.f73241a.subscribe(subscriberArr2);
        }
    }
}
