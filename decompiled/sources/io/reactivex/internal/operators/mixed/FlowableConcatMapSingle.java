package io.reactivex.internal.operators.mixed;

import a.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
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
public final class FlowableConcatMapSingle<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Flowable<T> f71861q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends SingleSource<? extends R>> f71862r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ErrorMode f71863s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f71864t0;

    public static final class a<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public volatile boolean E0;
        public long F0;
        public int G0;
        public R H0;
        public volatile int I0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f71865p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends SingleSource<? extends R>> f71866q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f71867r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f71868s0 = new AtomicLong();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicThrowable f71869t0 = new AtomicThrowable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final C0327a<R> f71870u0 = new C0327a<>(this);
        public final SpscArrayQueue v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final ErrorMode f71871w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Subscription f71872x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f71873y0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.FlowableConcatMapSingle$a$a, reason: collision with other inner class name */
        public static final class C0327a<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, R> f71874p0;

            public C0327a(a<?, R> aVar) {
                this.f71874p0 = aVar;
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f71874p0;
                if (!aVar.f71869t0.addThrowable(th2)) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
                if (aVar.f71871w0 != ErrorMode.END) {
                    aVar.f71872x0.cancel();
                }
                aVar.I0 = 0;
                aVar.a();
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(R r3) {
                a<?, R> aVar = this.f71874p0;
                aVar.H0 = r3;
                aVar.I0 = 2;
                aVar.a();
            }
        }

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends SingleSource<? extends R>> function, int i10, ErrorMode errorMode) {
            this.f71865p0 = subscriber;
            this.f71866q0 = function;
            this.f71867r0 = i10;
            this.f71871w0 = errorMode;
            this.v0 = new SpscArrayQueue(i10);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f71865p0;
            ErrorMode errorMode = this.f71871w0;
            SpscArrayQueue spscArrayQueue = this.v0;
            AtomicThrowable atomicThrowable = this.f71869t0;
            AtomicLong atomicLong = this.f71868s0;
            int i10 = this.f71867r0;
            int i11 = i10 - (i10 >> 1);
            int iAddAndGet = 1;
            while (true) {
                if (!this.E0) {
                    int i12 = this.I0;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i12 == 0))) {
                        break;
                    }
                    if (i12 == 0) {
                        boolean z10 = this.f71873y0;
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
                                this.f71872x0.request(i11);
                            } else {
                                this.G0 = i13;
                            }
                            try {
                                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.f71866q0.apply(dVar), "The mapper returned a null SingleSource");
                                this.I0 = 1;
                                singleSource.subscribe(this.f71870u0);
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.f71872x0.cancel();
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
            this.f71872x0.cancel();
            C0327a<R> c0327a = this.f71870u0;
            c0327a.getClass();
            DisposableHelper.dispose(c0327a);
            if (getAndIncrement() == 0) {
                this.v0.clear();
                this.H0 = null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71873y0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (!this.f71869t0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (this.f71871w0 == ErrorMode.IMMEDIATE) {
                C0327a<R> c0327a = this.f71870u0;
                c0327a.getClass();
                DisposableHelper.dispose(c0327a);
            }
            this.f71873y0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.v0.offer(t10)) {
                a();
            } else {
                this.f71872x0.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71872x0, subscription)) {
                this.f71872x0 = subscription;
                this.f71865p0.onSubscribe(this);
                subscription.request(this.f71867r0);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            BackpressureHelper.add(this.f71868s0, j10);
            a();
        }
    }

    public FlowableConcatMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, ErrorMode errorMode, int i10) {
        this.f71861q0 = flowable;
        this.f71862r0 = function;
        this.f71863s0 = errorMode;
        this.f71864t0 = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f71861q0.subscribe((FlowableSubscriber) new a(subscriber, this.f71862r0, this.f71864t0, this.f71863s0));
    }
}
