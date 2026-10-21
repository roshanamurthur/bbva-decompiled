package io.reactivex.rxjava3.internal.operators.mixed;

import a.d;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatMapMaybe<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Flowable<T> f76094q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends MaybeSource<? extends R>> f76095r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ErrorMode f76096s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f76097t0;

    public static final class a<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public volatile boolean E0;
        public long F0;
        public int G0;
        public R H0;
        public volatile int I0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f76098p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f76099q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f76100r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f76101s0 = new AtomicLong();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicThrowable f76102t0 = new AtomicThrowable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final C0390a<R> f76103u0 = new C0390a<>(this);
        public final SpscArrayQueue v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final ErrorMode f76104w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Subscription f76105x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f76106y0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.mixed.FlowableConcatMapMaybe$a$a, reason: collision with other inner class name */
        public static final class C0390a<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, R> f76107p0;

            public C0390a(a<?, R> aVar) {
                this.f76107p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a<?, R> aVar = this.f76107p0;
                aVar.I0 = 0;
                aVar.a();
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f76107p0;
                if (aVar.f76102t0.tryAddThrowableOrReport(th2)) {
                    if (aVar.f76104w0 != ErrorMode.END) {
                        aVar.f76105x0.cancel();
                    }
                    aVar.I0 = 0;
                    aVar.a();
                }
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(R r3) {
                a<?, R> aVar = this.f76107p0;
                aVar.H0 = r3;
                aVar.I0 = 2;
                aVar.a();
            }
        }

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends MaybeSource<? extends R>> function, int i10, ErrorMode errorMode) {
            this.f76098p0 = subscriber;
            this.f76099q0 = function;
            this.f76100r0 = i10;
            this.f76104w0 = errorMode;
            this.v0 = new SpscArrayQueue(i10);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f76098p0;
            ErrorMode errorMode = this.f76104w0;
            SpscArrayQueue spscArrayQueue = this.v0;
            AtomicThrowable atomicThrowable = this.f76102t0;
            AtomicLong atomicLong = this.f76101s0;
            int i10 = this.f76100r0;
            int i11 = i10 - (i10 >> 1);
            int iAddAndGet = 1;
            while (true) {
                if (!this.E0) {
                    int i12 = this.I0;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i12 == 0))) {
                        break;
                    }
                    if (i12 == 0) {
                        boolean z10 = this.f76106y0;
                        d dVar = (Object) spscArrayQueue.poll();
                        boolean z11 = dVar == null;
                        if (z10 && z11) {
                            atomicThrowable.tryTerminateConsumer(subscriber);
                            return;
                        }
                        if (!z11) {
                            int i13 = this.G0 + 1;
                            if (i13 == i11) {
                                this.G0 = 0;
                                this.f76105x0.request(i11);
                            } else {
                                this.G0 = i13;
                            }
                            try {
                                MaybeSource<? extends R> maybeSourceApply = this.f76099q0.apply(dVar);
                                Objects.requireNonNull(maybeSourceApply, "The mapper returned a null MaybeSource");
                                MaybeSource<? extends R> maybeSource = maybeSourceApply;
                                this.I0 = 1;
                                maybeSource.subscribe(this.f76103u0);
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.f76105x0.cancel();
                                spscArrayQueue.clear();
                                atomicThrowable.tryAddThrowableOrReport(th2);
                                atomicThrowable.tryTerminateConsumer(subscriber);
                                return;
                            }
                        }
                    } else if (i12 == 2) {
                        long j10 = this.F0;
                        if (j10 != atomicLong.get()) {
                            R r3 = this.H0;
                            this.H0 = null;
                            subscriber.onNext(r3);
                            this.F0 = j10 + 1;
                            this.I0 = 0;
                        }
                    }
                } else {
                    spscArrayQueue.clear();
                    this.H0 = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            spscArrayQueue.clear();
            this.H0 = null;
            atomicThrowable.tryTerminateConsumer(subscriber);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.E0 = true;
            this.f76105x0.cancel();
            C0390a<R> c0390a = this.f76103u0;
            c0390a.getClass();
            DisposableHelper.dispose(c0390a);
            this.f76102t0.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.v0.clear();
                this.H0 = null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f76106y0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f76102t0.tryAddThrowableOrReport(th2)) {
                if (this.f76104w0 == ErrorMode.IMMEDIATE) {
                    C0390a<R> c0390a = this.f76103u0;
                    c0390a.getClass();
                    DisposableHelper.dispose(c0390a);
                }
                this.f76106y0 = true;
                a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.v0.offer(t10)) {
                a();
            } else {
                this.f76105x0.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f76105x0, subscription)) {
                this.f76105x0 = subscription;
                this.f76098p0.onSubscribe(this);
                subscription.request(this.f76100r0);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            BackpressureHelper.add(this.f76101s0, j10);
            a();
        }
    }

    public FlowableConcatMapMaybe(Flowable<T> flowable, Function<? super T, ? extends MaybeSource<? extends R>> function, ErrorMode errorMode, int i10) {
        this.f76094q0 = flowable;
        this.f76095r0 = function;
        this.f76096s0 = errorMode;
        this.f76097t0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f76094q0.subscribe((FlowableSubscriber) new a(subscriber, this.f76095r0, this.f76097t0, this.f76096s0));
    }
}
