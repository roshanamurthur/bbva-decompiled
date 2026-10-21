package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelDoOnNextTry<T> extends ParallelFlowable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f73220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer<? super T> f73221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f73222c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73223a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f73223a = iArr;
            try {
                iArr[ParallelFailureHandling.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73223a[ParallelFailureHandling.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73223a[ParallelFailureHandling.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b<T> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ConditionalSubscriber<? super T> f73224p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super T> f73225q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f73226r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f73227s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f73228t0;

        public b(ConditionalSubscriber<? super T> conditionalSubscriber, Consumer<? super T> consumer, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.f73224p0 = conditionalSubscriber;
            this.f73225q0 = consumer;
            this.f73226r0 = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f73227s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f73228t0) {
                return;
            }
            this.f73228t0 = true;
            this.f73224p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f73228t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73228t0 = true;
                this.f73224p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10) || this.f73228t0) {
                return;
            }
            this.f73227s0.request(1L);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f73227s0, subscription)) {
                this.f73227s0 = subscription;
                this.f73224p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f73227s0.request(j10);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            int i10;
            if (this.f73228t0) {
                return false;
            }
            long j10 = 0;
            do {
                try {
                    this.f73225q0.accept(t10);
                    return this.f73224p0.tryOnNext(t10);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    try {
                        j10++;
                        i10 = a.f73223a[((ParallelFailureHandling) ObjectHelper.requireNonNull(this.f73226r0.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal()];
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
        public final Subscriber<? super T> f73229p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super T> f73230q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f73231r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f73232s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f73233t0;

        public c(Subscriber<? super T> subscriber, Consumer<? super T> consumer, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.f73229p0 = subscriber;
            this.f73230q0 = consumer;
            this.f73231r0 = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f73232s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f73233t0) {
                return;
            }
            this.f73233t0 = true;
            this.f73229p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f73233t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73233t0 = true;
                this.f73229p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10)) {
                return;
            }
            this.f73232s0.request(1L);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f73232s0, subscription)) {
                this.f73232s0 = subscription;
                this.f73229p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f73232s0.request(j10);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            int i10;
            if (this.f73233t0) {
                return false;
            }
            long j10 = 0;
            do {
                try {
                    this.f73230q0.accept(t10);
                    this.f73229p0.onNext(t10);
                    return true;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    try {
                        j10++;
                        i10 = a.f73223a[((ParallelFailureHandling) ObjectHelper.requireNonNull(this.f73231r0.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal()];
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
        this.f73220a = parallelFlowable;
        this.f73221b = consumer;
        this.f73222c = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f73220a.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                Subscriber<? super T> subscriber = subscriberArr[i10];
                boolean z10 = subscriber instanceof ConditionalSubscriber;
                BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction = this.f73222c;
                Consumer<? super T> consumer = this.f73221b;
                if (z10) {
                    subscriberArr2[i10] = new b((ConditionalSubscriber) subscriber, consumer, biFunction);
                } else {
                    subscriberArr2[i10] = new c(subscriber, consumer, biFunction);
                }
            }
            this.f73220a.subscribe(subscriberArr2);
        }
    }
}
