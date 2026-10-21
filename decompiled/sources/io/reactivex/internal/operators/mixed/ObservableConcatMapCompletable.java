package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatMapCompletable<T> extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observable<T> f71926p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends CompletableSource> f71927q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ErrorMode f71928r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f71929s0;

    public static final class a<T> extends AtomicInteger implements Observer<T>, Disposable {
        public volatile boolean E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f71930p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends CompletableSource> f71931q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ErrorMode f71932r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f71933s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final C0331a f71934t0 = new C0331a(this);

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f71935u0;
        public SimpleQueue<T> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Disposable f71936w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f71937x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f71938y0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable$a$a, reason: collision with other inner class name */
        public static final class C0331a extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?> f71939p0;

            public C0331a(a<?> aVar) {
                this.f71939p0 = aVar;
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                a<?> aVar = this.f71939p0;
                aVar.f71937x0 = false;
                aVar.a();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th2) {
                a<?> aVar = this.f71939p0;
                if (!aVar.f71933s0.addThrowable(th2)) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
                if (aVar.f71932r0 != ErrorMode.IMMEDIATE) {
                    aVar.f71937x0 = false;
                    aVar.a();
                    return;
                }
                aVar.E0 = true;
                aVar.f71936w0.dispose();
                Throwable thTerminate = aVar.f71933s0.terminate();
                if (thTerminate != ExceptionHelper.TERMINATED) {
                    aVar.f71930p0.onError(thTerminate);
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
            this.f71930p0 = completableObserver;
            this.f71931q0 = function;
            this.f71932r0 = errorMode;
            this.f71935u0 = i10;
        }

        public final void a() {
            CompletableSource completableSource;
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicThrowable atomicThrowable = this.f71933s0;
            ErrorMode errorMode = this.f71932r0;
            while (!this.E0) {
                if (!this.f71937x0) {
                    if (errorMode == ErrorMode.BOUNDARY && atomicThrowable.get() != null) {
                        this.E0 = true;
                        this.v0.clear();
                        this.f71930p0.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z11 = this.f71938y0;
                    try {
                        T tPoll = this.v0.poll();
                        if (tPoll != null) {
                            completableSource = (CompletableSource) ObjectHelper.requireNonNull(this.f71931q0.apply(tPoll), "The mapper returned a null CompletableSource");
                            z10 = false;
                        } else {
                            completableSource = null;
                            z10 = true;
                        }
                        if (z11 && z10) {
                            this.E0 = true;
                            Throwable thTerminate = atomicThrowable.terminate();
                            if (thTerminate != null) {
                                this.f71930p0.onError(thTerminate);
                                return;
                            } else {
                                this.f71930p0.onComplete();
                                return;
                            }
                        }
                        if (!z10) {
                            this.f71937x0 = true;
                            completableSource.subscribe(this.f71934t0);
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.E0 = true;
                        this.v0.clear();
                        this.f71936w0.dispose();
                        atomicThrowable.addThrowable(th2);
                        this.f71930p0.onError(atomicThrowable.terminate());
                        return;
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
            this.f71936w0.dispose();
            C0331a c0331a = this.f71934t0;
            c0331a.getClass();
            DisposableHelper.dispose(c0331a);
            if (getAndIncrement() == 0) {
                this.v0.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.E0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f71938y0 = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (!this.f71933s0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (this.f71932r0 != ErrorMode.IMMEDIATE) {
                this.f71938y0 = true;
                a();
                return;
            }
            this.E0 = true;
            C0331a c0331a = this.f71934t0;
            c0331a.getClass();
            DisposableHelper.dispose(c0331a);
            Throwable thTerminate = this.f71933s0.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.f71930p0.onError(thTerminate);
            }
            if (getAndIncrement() == 0) {
                this.v0.clear();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (t10 != null) {
                this.v0.offer(t10);
            }
            a();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71936w0, disposable)) {
                this.f71936w0 = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.v0 = queueDisposable;
                        this.f71938y0 = true;
                        this.f71930p0.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.v0 = queueDisposable;
                        this.f71930p0.onSubscribe(this);
                        return;
                    }
                }
                this.v0 = new SpscLinkedArrayQueue(this.f71935u0);
                this.f71930p0.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapCompletable(Observable<T> observable, Function<? super T, ? extends CompletableSource> function, ErrorMode errorMode, int i10) {
        this.f71926p0 = observable;
        this.f71927q0 = function;
        this.f71928r0 = errorMode;
        this.f71929s0 = i10;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        Observable<T> observable = this.f71926p0;
        Function<? super T, ? extends CompletableSource> function = this.f71927q0;
        if (bn.a.h(observable, function, completableObserver)) {
            return;
        }
        observable.subscribe(new a(completableObserver, function, this.f71928r0, this.f71929s0));
    }
}
