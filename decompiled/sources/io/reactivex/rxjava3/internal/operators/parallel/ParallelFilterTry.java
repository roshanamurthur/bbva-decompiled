package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.parallel.ParallelFailureHandling;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelFilterTry<T> extends ParallelFlowable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f77492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Predicate<? super T> f77493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f77494c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77495a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f77495a = iArr;
            try {
                iArr[ParallelFailureHandling.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77495a[ParallelFailureHandling.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77495a[ParallelFailureHandling.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static abstract class b<T> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Predicate<? super T> f77496p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f77497q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f77498r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f77499s0;

        public b(Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.f77496p0 = predicate;
            this.f77497q0 = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f77498r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10) || this.f77499s0) {
                return;
            }
            this.f77498r0.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f77498r0.request(j10);
        }
    }

    public static final class c<T> extends b<T> {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ConditionalSubscriber<? super T> f77500t0;

        public c(ConditionalSubscriber<? super T> conditionalSubscriber, Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            super(predicate, biFunction);
            this.f77500t0 = conditionalSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f77499s0) {
                return;
            }
            this.f77499s0 = true;
            this.f77500t0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f77499s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77499s0 = true;
                this.f77500t0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f77498r0, subscription)) {
                this.f77498r0 = subscription;
                this.f77500t0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            int i10;
            if (!this.f77499s0) {
                long j10 = 0;
                do {
                    try {
                        return this.f77496p0.test(t10) && this.f77500t0.tryOnNext(t10);
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        try {
                            j10++;
                            ParallelFailureHandling parallelFailureHandlingApply = this.f77497q0.apply(Long.valueOf(j10), th2);
                            Objects.requireNonNull(parallelFailureHandlingApply, "The errorHandler returned a null ParallelFailureHandling");
                            i10 = a.f77495a[parallelFailureHandlingApply.ordinal()];
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
        public final Subscriber<? super T> f77501t0;

        public d(Subscriber<? super T> subscriber, Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            super(predicate, biFunction);
            this.f77501t0 = subscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f77499s0) {
                return;
            }
            this.f77499s0 = true;
            this.f77501t0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f77499s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77499s0 = true;
                this.f77501t0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f77498r0, subscription)) {
                this.f77498r0 = subscription;
                this.f77501t0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            int i10;
            if (!this.f77499s0) {
                long j10 = 0;
                do {
                    try {
                        if (!this.f77496p0.test(t10)) {
                            return false;
                        }
                        this.f77501t0.onNext(t10);
                        return true;
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        try {
                            j10++;
                            ParallelFailureHandling parallelFailureHandlingApply = this.f77497q0.apply(Long.valueOf(j10), th2);
                            Objects.requireNonNull(parallelFailureHandlingApply, "The errorHandler returned a null ParallelFailureHandling");
                            i10 = a.f77495a[parallelFailureHandlingApply.ordinal()];
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
        this.f77492a = parallelFlowable;
        this.f77493b = predicate;
        this.f77494c = biFunction;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public int parallelism() {
        return this.f77492a.parallelism();
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                Subscriber<? super T> subscriber = subscriberArr[i10];
                boolean z10 = subscriber instanceof ConditionalSubscriber;
                BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction = this.f77494c;
                Predicate<? super T> predicate = this.f77493b;
                if (z10) {
                    subscriberArr2[i10] = new c((ConditionalSubscriber) subscriber, predicate, biFunction);
                } else {
                    subscriberArr2[i10] = new d(subscriber, predicate, biFunction);
                }
            }
            this.f77492a.subscribe(subscriberArr2);
        }
    }
}
