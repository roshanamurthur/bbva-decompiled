package io.reactivex.internal.operators.mixed;

import a.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatMapMaybe<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Flowable<T> f71847q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends MaybeSource<? extends R>> f71848r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ErrorMode f71849s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f71850t0;

    public static final class a<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public volatile boolean E0;
        public long F0;
        public int G0;
        public R H0;
        public volatile int I0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f71851p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f71852q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f71853r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f71854s0 = new AtomicLong();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicThrowable f71855t0 = new AtomicThrowable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final C0326a<R> f71856u0 = new C0326a<>(this);
        public final SpscArrayQueue v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final ErrorMode f71857w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Subscription f71858x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f71859y0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe$a$a, reason: collision with other inner class name */
        public static final class C0326a<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, R> f71860p0;

            public C0326a(a<?, R> aVar) {
                this.f71860p0 = aVar;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                a<?, R> aVar = this.f71860p0;
                aVar.I0 = 0;
                aVar.a();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f71860p0;
                if (!aVar.f71855t0.addThrowable(th2)) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
                if (aVar.f71857w0 != ErrorMode.END) {
                    aVar.f71858x0.cancel();
                }
                aVar.I0 = 0;
                aVar.a();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(R r3) {
                a<?, R> aVar = this.f71860p0;
                aVar.H0 = r3;
                aVar.I0 = 2;
                aVar.a();
            }
        }

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends MaybeSource<? extends R>> function, int i10, ErrorMode errorMode) {
            this.f71851p0 = subscriber;
            this.f71852q0 = function;
            this.f71853r0 = i10;
            this.f71857w0 = errorMode;
            this.v0 = new SpscArrayQueue(i10);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f71851p0;
            ErrorMode errorMode = this.f71857w0;
            SpscArrayQueue spscArrayQueue = this.v0;
            AtomicThrowable atomicThrowable = this.f71855t0;
            AtomicLong atomicLong = this.f71854s0;
            int i10 = this.f71853r0;
            int i11 = i10 - (i10 >> 1);
            int iAddAndGet = 1;
            while (true) {
                if (!this.E0) {
                    int i12 = this.I0;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i12 == 0))) {
                        break;
                    }
                    if (i12 == 0) {
                        boolean z10 = this.f71859y0;
                        d dVar = (Object) spscArrayQueue.poll();
                        boolean z11 = dVar == null;
                        if (z10 && z11) {
                            Throwable thTerminate = atomicThrowable.terminate();
                            if (thTerminate == null) {
                                subscriber.onComplete();
                                return;
                            } else {
                                subscriber.onError(thTerminate);
                                return;
                            }
                        }
                        if (!z11) {
                            int i13 = this.G0 + 1;
                            if (i13 == i11) {
                                this.G0 = 0;
                                this.f71858x0.request(i11);
                            } else {
                                this.G0 = i13;
                            }
                            try {
                                MaybeSource maybeSource = (MaybeSource) ObjectHelper.requireNonNull(this.f71852q0.apply(dVar), "The mapper returned a null MaybeSource");
                                this.I0 = 1;
                                maybeSource.subscribe(this.f71856u0);
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.f71858x0.cancel();
                                spscArrayQueue.clear();
                                atomicThrowable.addThrowable(th2);
                                subscriber.onError(atomicThrowable.terminate());
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
            subscriber.onError(atomicThrowable.terminate());
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.E0 = true;
            this.f71858x0.cancel();
            C0326a<R> c0326a = this.f71856u0;
            c0326a.getClass();
            DisposableHelper.dispose(c0326a);
            if (getAndIncrement() == 0) {
                this.v0.clear();
                this.H0 = null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71859y0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (!this.f71855t0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (this.f71857w0 == ErrorMode.IMMEDIATE) {
                C0326a<R> c0326a = this.f71856u0;
                c0326a.getClass();
                DisposableHelper.dispose(c0326a);
            }
            this.f71859y0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.v0.offer(t10)) {
                a();
            } else {
                this.f71858x0.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71858x0, subscription)) {
                this.f71858x0 = subscription;
                this.f71851p0.onSubscribe(this);
                subscription.request(this.f71853r0);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            BackpressureHelper.add(this.f71854s0, j10);
            a();
        }
    }

    public FlowableConcatMapMaybe(Flowable<T> flowable, Function<? super T, ? extends MaybeSource<? extends R>> function, ErrorMode errorMode, int i10) {
        this.f71847q0 = flowable;
        this.f71848r0 = function;
        this.f71849s0 = errorMode;
        this.f71850t0 = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f71847q0.subscribe((FlowableSubscriber) new a(subscriber, this.f71848r0, this.f71850t0, this.f71849s0));
    }
}
