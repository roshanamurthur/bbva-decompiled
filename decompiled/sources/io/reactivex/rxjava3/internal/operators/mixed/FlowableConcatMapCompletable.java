package io.reactivex.rxjava3.internal.operators.mixed;

import a.d;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatMapCompletable<T> extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f76080p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends CompletableSource> f76081q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ErrorMode f76082r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f76083s0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        public volatile boolean E0;
        public int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f76084p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends CompletableSource> f76085q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ErrorMode f76086r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f76087s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final C0389a f76088t0 = new C0389a(this);

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f76089u0;
        public final SpscArrayQueue v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Subscription f76090w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f76091x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f76092y0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.mixed.FlowableConcatMapCompletable$a$a, reason: collision with other inner class name */
        public static final class C0389a extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?> f76093p0;

            public C0389a(a<?> aVar) {
                this.f76093p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a<?> aVar = this.f76093p0;
                aVar.f76091x0 = false;
                aVar.a();
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a<?> aVar = this.f76093p0;
                if (aVar.f76087s0.tryAddThrowableOrReport(th2)) {
                    if (aVar.f76086r0 != ErrorMode.IMMEDIATE) {
                        aVar.f76091x0 = false;
                        aVar.a();
                        return;
                    }
                    aVar.f76090w0.cancel();
                    aVar.f76087s0.tryTerminateConsumer(aVar.f76084p0);
                    if (aVar.getAndIncrement() == 0) {
                        aVar.v0.clear();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }
        }

        public a(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, ErrorMode errorMode, int i10) {
            this.f76084p0 = completableObserver;
            this.f76085q0 = function;
            this.f76086r0 = errorMode;
            this.f76089u0 = i10;
            this.v0 = new SpscArrayQueue(i10);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.E0) {
                if (!this.f76091x0) {
                    if (this.f76086r0 == ErrorMode.BOUNDARY && this.f76087s0.get() != null) {
                        this.v0.clear();
                        this.f76087s0.tryTerminateConsumer(this.f76084p0);
                        return;
                    }
                    boolean z10 = this.f76092y0;
                    d dVar = (Object) this.v0.poll();
                    boolean z11 = dVar == null;
                    if (z10 && z11) {
                        this.f76087s0.tryTerminateConsumer(this.f76084p0);
                        return;
                    }
                    if (!z11) {
                        int i10 = this.f76089u0;
                        int i11 = i10 - (i10 >> 1);
                        int i12 = this.F0 + 1;
                        if (i12 == i11) {
                            this.F0 = 0;
                            this.f76090w0.request(i11);
                        } else {
                            this.F0 = i12;
                        }
                        try {
                            CompletableSource completableSourceApply = this.f76085q0.apply(dVar);
                            Objects.requireNonNull(completableSourceApply, "The mapper returned a null CompletableSource");
                            CompletableSource completableSource = completableSourceApply;
                            this.f76091x0 = true;
                            completableSource.subscribe(this.f76088t0);
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            this.v0.clear();
                            this.f76090w0.cancel();
                            this.f76087s0.tryAddThrowableOrReport(th2);
                            this.f76087s0.tryTerminateConsumer(this.f76084p0);
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.v0.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.E0 = true;
            this.f76090w0.cancel();
            C0389a c0389a = this.f76088t0;
            c0389a.getClass();
            DisposableHelper.dispose(c0389a);
            this.f76087s0.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.v0.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.E0;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f76092y0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f76087s0.tryAddThrowableOrReport(th2)) {
                if (this.f76086r0 != ErrorMode.IMMEDIATE) {
                    this.f76092y0 = true;
                    a();
                    return;
                }
                C0389a c0389a = this.f76088t0;
                c0389a.getClass();
                DisposableHelper.dispose(c0389a);
                this.f76087s0.tryTerminateConsumer(this.f76084p0);
                if (getAndIncrement() == 0) {
                    this.v0.clear();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.v0.offer(t10)) {
                a();
            } else {
                this.f76090w0.cancel();
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f76090w0, subscription)) {
                this.f76090w0 = subscription;
                this.f76084p0.onSubscribe(this);
                subscription.request(this.f76089u0);
            }
        }
    }

    public FlowableConcatMapCompletable(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, ErrorMode errorMode, int i10) {
        this.f76080p0 = flowable;
        this.f76081q0 = function;
        this.f76082r0 = errorMode;
        this.f76083s0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f76080p0.subscribe((FlowableSubscriber) new a(completableObserver, this.f76081q0, this.f76082r0, this.f76083s0));
    }
}
