package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.parallel.ParallelFailureHandling;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelDoOnNextTry<T> extends ParallelFlowable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f77471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer<? super T> f77472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f77473c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77474a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f77474a = iArr;
            try {
                iArr[ParallelFailureHandling.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77474a[ParallelFailureHandling.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77474a[ParallelFailureHandling.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b<T> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ConditionalSubscriber<? super T> f77475p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super T> f77476q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f77477r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f77478s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f77479t0;

        public b(ConditionalSubscriber<? super T> conditionalSubscriber, Consumer<? super T> consumer, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.f77475p0 = conditionalSubscriber;
            this.f77476q0 = consumer;
            this.f77477r0 = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f77478s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f77479t0) {
                return;
            }
            this.f77479t0 = true;
            this.f77475p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f77479t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77479t0 = true;
                this.f77475p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10) || this.f77479t0) {
                return;
            }
            this.f77478s0.request(1L);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f77478s0, subscription)) {
                this.f77478s0 = subscription;
                this.f77475p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f77478s0.request(j10);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            int i10;
            if (this.f77479t0) {
                return false;
            }
            long j10 = 0;
            do {
                try {
                    this.f77476q0.accept(t10);
                    return this.f77475p0.tryOnNext(t10);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    try {
                        j10++;
                        ParallelFailureHandling parallelFailureHandlingApply = this.f77477r0.apply(Long.valueOf(j10), th2);
                        Objects.requireNonNull(parallelFailureHandlingApply, "The errorHandler returned a null ParallelFailureHandling");
                        i10 = a.f77474a[parallelFailureHandlingApply.ordinal()];
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

    public static final class c<T> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f77480p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super T> f77481q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f77482r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f77483s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f77484t0;

        public c(Subscriber<? super T> subscriber, Consumer<? super T> consumer, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.f77480p0 = subscriber;
            this.f77481q0 = consumer;
            this.f77482r0 = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f77483s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f77484t0) {
                return;
            }
            this.f77484t0 = true;
            this.f77480p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f77484t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77484t0 = true;
                this.f77480p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10)) {
                return;
            }
            this.f77483s0.request(1L);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f77483s0, subscription)) {
                this.f77483s0 = subscription;
                this.f77480p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f77483s0.request(j10);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            int i10;
            if (this.f77484t0) {
                return false;
            }
            long j10 = 0;
            do {
                try {
                    this.f77481q0.accept(t10);
                    this.f77480p0.onNext(t10);
                    return true;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    try {
                        j10++;
                        ParallelFailureHandling parallelFailureHandlingApply = this.f77482r0.apply(Long.valueOf(j10), th2);
                        Objects.requireNonNull(parallelFailureHandlingApply, "The errorHandler returned a null ParallelFailureHandling");
                        i10 = a.f77474a[parallelFailureHandlingApply.ordinal()];
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

    public ParallelDoOnNextTry(ParallelFlowable<T> parallelFlowable, Consumer<? super T> consumer, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        this.f77471a = parallelFlowable;
        this.f77472b = consumer;
        this.f77473c = biFunction;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public int parallelism() {
        return this.f77471a.parallelism();
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                Subscriber<? super T> subscriber = subscriberArr[i10];
                boolean z10 = subscriber instanceof ConditionalSubscriber;
                BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction = this.f77473c;
                Consumer<? super T> consumer = this.f77472b;
                if (z10) {
                    subscriberArr2[i10] = new b((ConditionalSubscriber) subscriber, consumer, biFunction);
                } else {
                    subscriberArr2[i10] = new c(subscriber, consumer, biFunction);
                }
            }
            this.f77471a.subscribe(subscriberArr2);
        }
    }
}
