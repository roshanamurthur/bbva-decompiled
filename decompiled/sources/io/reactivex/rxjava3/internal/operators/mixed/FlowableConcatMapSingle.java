package io.reactivex.rxjava3.internal.operators.mixed;

import a.d;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
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
public final class FlowableConcatMapSingle<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Flowable<T> f76112q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends SingleSource<? extends R>> f76113r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ErrorMode f76114s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f76115t0;

    public static final class a<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public volatile boolean E0;
        public long F0;
        public int G0;
        public R H0;
        public volatile int I0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f76116p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends SingleSource<? extends R>> f76117q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f76118r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f76119s0 = new AtomicLong();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicThrowable f76120t0 = new AtomicThrowable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final C0391a<R> f76121u0 = new C0391a<>(this);
        public final SpscArrayQueue v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final ErrorMode f76122w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Subscription f76123x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f76124y0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.mixed.FlowableConcatMapSingle$a$a, reason: collision with other inner class name */
        public static final class C0391a<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, R> f76125p0;

            public C0391a(a<?, R> aVar) {
                this.f76125p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f76125p0;
                if (aVar.f76120t0.tryAddThrowableOrReport(th2)) {
                    if (aVar.f76122w0 != ErrorMode.END) {
                        aVar.f76123x0.cancel();
                    }
                    aVar.I0 = 0;
                    aVar.a();
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(R r3) {
                a<?, R> aVar = this.f76125p0;
                aVar.H0 = r3;
                aVar.I0 = 2;
                aVar.a();
            }
        }

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends SingleSource<? extends R>> function, int i10, ErrorMode errorMode) {
            this.f76116p0 = subscriber;
            this.f76117q0 = function;
            this.f76118r0 = i10;
            this.f76122w0 = errorMode;
            this.v0 = new SpscArrayQueue(i10);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f76116p0;
            ErrorMode errorMode = this.f76122w0;
            SpscArrayQueue spscArrayQueue = this.v0;
            AtomicThrowable atomicThrowable = this.f76120t0;
            AtomicLong atomicLong = this.f76119s0;
            int i10 = this.f76118r0;
            int i11 = i10 - (i10 >> 1);
            int iAddAndGet = 1;
            while (true) {
                if (!this.E0) {
                    int i12 = this.I0;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i12 == 0))) {
                        break;
                    }
                    if (i12 == 0) {
                        boolean z10 = this.f76124y0;
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
                                this.f76123x0.request(i11);
                            } else {
                                this.G0 = i13;
                            }
                            try {
                                SingleSource<? extends R> singleSourceApply = this.f76117q0.apply(dVar);
                                Objects.requireNonNull(singleSourceApply, "The mapper returned a null SingleSource");
                                SingleSource<? extends R> singleSource = singleSourceApply;
                                this.I0 = 1;
                                singleSource.subscribe(this.f76121u0);
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.f76123x0.cancel();
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
            this.f76123x0.cancel();
            C0391a<R> c0391a = this.f76121u0;
            c0391a.getClass();
            DisposableHelper.dispose(c0391a);
            this.f76120t0.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.v0.clear();
                this.H0 = null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f76124y0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f76120t0.tryAddThrowableOrReport(th2)) {
                if (this.f76122w0 == ErrorMode.IMMEDIATE) {
                    C0391a<R> c0391a = this.f76121u0;
                    c0391a.getClass();
                    DisposableHelper.dispose(c0391a);
                }
                this.f76124y0 = true;
                a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.v0.offer(t10)) {
                a();
            } else {
                this.f76123x0.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f76123x0, subscription)) {
                this.f76123x0 = subscription;
                this.f76116p0.onSubscribe(this);
                subscription.request(this.f76118r0);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            BackpressureHelper.add(this.f76119s0, j10);
            a();
        }
    }

    public FlowableConcatMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, ErrorMode errorMode, int i10) {
        this.f76112q0 = flowable;
        this.f76113r0 = function;
        this.f76114s0 = errorMode;
        this.f76115t0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f76112q0.subscribe((FlowableSubscriber) new a(subscriber, this.f76113r0, this.f76115t0, this.f76114s0));
    }
}
