package io.reactivex.internal.operators.mixed;

import a.d;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatMapCompletable<T> extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f71833p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends CompletableSource> f71834q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ErrorMode f71835r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f71836s0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        public volatile boolean E0;
        public int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f71837p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends CompletableSource> f71838q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ErrorMode f71839r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f71840s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final C0325a f71841t0 = new C0325a(this);

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f71842u0;
        public final SpscArrayQueue v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Subscription f71843w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f71844x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f71845y0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable$a$a, reason: collision with other inner class name */
        public static final class C0325a extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?> f71846p0;

            public C0325a(a<?> aVar) {
                this.f71846p0 = aVar;
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                a<?> aVar = this.f71846p0;
                aVar.f71844x0 = false;
                aVar.a();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th2) {
                a<?> aVar = this.f71846p0;
                if (!aVar.f71840s0.addThrowable(th2)) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
                if (aVar.f71839r0 != ErrorMode.IMMEDIATE) {
                    aVar.f71844x0 = false;
                    aVar.a();
                    return;
                }
                aVar.f71843w0.cancel();
                Throwable thTerminate = aVar.f71840s0.terminate();
                if (thTerminate != ExceptionHelper.TERMINATED) {
                    aVar.f71837p0.onError(thTerminate);
                }
                if (aVar.getAndIncrement() == 0) {
                    aVar.v0.clear();
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }
        }

        public a(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, ErrorMode errorMode, int i10) {
            this.f71837p0 = completableObserver;
            this.f71838q0 = function;
            this.f71839r0 = errorMode;
            this.f71842u0 = i10;
            this.v0 = new SpscArrayQueue(i10);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.E0) {
                if (!this.f71844x0) {
                    if (this.f71839r0 == ErrorMode.BOUNDARY && this.f71840s0.get() != null) {
                        this.v0.clear();
                        this.f71837p0.onError(this.f71840s0.terminate());
                        return;
                    }
                    boolean z10 = this.f71845y0;
                    d dVar = (Object) this.v0.poll();
                    boolean z11 = dVar == null;
                    if (z10 && z11) {
                        Throwable thTerminate = this.f71840s0.terminate();
                        if (thTerminate != null) {
                            this.f71837p0.onError(thTerminate);
                            return;
                        } else {
                            this.f71837p0.onComplete();
                            return;
                        }
                    }
                    if (!z11) {
                        int i10 = this.f71842u0;
                        int i11 = i10 - (i10 >> 1);
                        int i12 = this.F0 + 1;
                        if (i12 == i11) {
                            this.F0 = 0;
                            this.f71843w0.request(i11);
                        } else {
                            this.F0 = i12;
                        }
                        try {
                            CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(this.f71838q0.apply(dVar), "The mapper returned a null CompletableSource");
                            this.f71844x0 = true;
                            completableSource.subscribe(this.f71841t0);
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            this.v0.clear();
                            this.f71843w0.cancel();
                            this.f71840s0.addThrowable(th2);
                            this.f71837p0.onError(this.f71840s0.terminate());
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

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.E0 = true;
            this.f71843w0.cancel();
            C0325a c0325a = this.f71841t0;
            c0325a.getClass();
            DisposableHelper.dispose(c0325a);
            if (getAndIncrement() == 0) {
                this.v0.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.E0;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71845y0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (!this.f71840s0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (this.f71839r0 != ErrorMode.IMMEDIATE) {
                this.f71845y0 = true;
                a();
                return;
            }
            C0325a c0325a = this.f71841t0;
            c0325a.getClass();
            DisposableHelper.dispose(c0325a);
            Throwable thTerminate = this.f71840s0.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.f71837p0.onError(thTerminate);
            }
            if (getAndIncrement() == 0) {
                this.v0.clear();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.v0.offer(t10)) {
                a();
            } else {
                this.f71843w0.cancel();
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71843w0, subscription)) {
                this.f71843w0 = subscription;
                this.f71837p0.onSubscribe(this);
                subscription.request(this.f71842u0);
            }
        }
    }

    public FlowableConcatMapCompletable(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, ErrorMode errorMode, int i10) {
        this.f71833p0 = flowable;
        this.f71834q0 = function;
        this.f71835r0 = errorMode;
        this.f71836s0 = i10;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f71833p0.subscribe((FlowableSubscriber) new a(completableObserver, this.f71834q0, this.f71835r0, this.f71836s0));
    }
}
