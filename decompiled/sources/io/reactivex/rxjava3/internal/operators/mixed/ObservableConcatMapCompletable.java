package io.reactivex.rxjava3.internal.operators.mixed;

import com.google.android.play.core.splitinstall.internal.k;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.QueueDisposable;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatMapCompletable<T> extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observable<T> f76190p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends CompletableSource> f76191q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ErrorMode f76192r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f76193s0;

    public static final class a<T> extends AtomicInteger implements Observer<T>, Disposable {
        public volatile boolean E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f76194p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends CompletableSource> f76195q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ErrorMode f76196r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f76197s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final C0395a f76198t0 = new C0395a(this);

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f76199u0;
        public SimpleQueue<T> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Disposable f76200w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f76201x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f76202y0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.mixed.ObservableConcatMapCompletable$a$a, reason: collision with other inner class name */
        public static final class C0395a extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?> f76203p0;

            public C0395a(a<?> aVar) {
                this.f76203p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a<?> aVar = this.f76203p0;
                aVar.f76201x0 = false;
                aVar.a();
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a<?> aVar = this.f76203p0;
                if (aVar.f76197s0.tryAddThrowableOrReport(th2)) {
                    if (aVar.f76196r0 != ErrorMode.IMMEDIATE) {
                        aVar.f76201x0 = false;
                        aVar.a();
                        return;
                    }
                    aVar.E0 = true;
                    aVar.f76200w0.dispose();
                    aVar.f76197s0.tryTerminateConsumer(aVar.f76194p0);
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
            this.f76194p0 = completableObserver;
            this.f76195q0 = function;
            this.f76196r0 = errorMode;
            this.f76199u0 = i10;
        }

        public final void a() {
            CompletableSource completableSource;
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicThrowable atomicThrowable = this.f76197s0;
            ErrorMode errorMode = this.f76196r0;
            while (!this.E0) {
                if (!this.f76201x0) {
                    if (errorMode == ErrorMode.BOUNDARY && atomicThrowable.get() != null) {
                        this.E0 = true;
                        this.v0.clear();
                        atomicThrowable.tryTerminateConsumer(this.f76194p0);
                        return;
                    }
                    boolean z11 = this.f76202y0;
                    try {
                        T tPoll = this.v0.poll();
                        if (tPoll != null) {
                            CompletableSource completableSourceApply = this.f76195q0.apply(tPoll);
                            Objects.requireNonNull(completableSourceApply, "The mapper returned a null CompletableSource");
                            completableSource = completableSourceApply;
                            z10 = false;
                        } else {
                            completableSource = null;
                            z10 = true;
                        }
                        if (z11 && z10) {
                            this.E0 = true;
                            atomicThrowable.tryTerminateConsumer(this.f76194p0);
                            return;
                        } else if (!z10) {
                            this.f76201x0 = true;
                            completableSource.subscribe(this.f76198t0);
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.E0 = true;
                        this.v0.clear();
                        this.f76200w0.dispose();
                        atomicThrowable.tryAddThrowableOrReport(th2);
                        atomicThrowable.tryTerminateConsumer(this.f76194p0);
                        return;
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
            this.f76200w0.dispose();
            C0395a c0395a = this.f76198t0;
            c0395a.getClass();
            DisposableHelper.dispose(c0395a);
            this.f76197s0.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.v0.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.E0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76202y0 = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76197s0.tryAddThrowableOrReport(th2)) {
                if (this.f76196r0 != ErrorMode.IMMEDIATE) {
                    this.f76202y0 = true;
                    a();
                    return;
                }
                this.E0 = true;
                C0395a c0395a = this.f76198t0;
                c0395a.getClass();
                DisposableHelper.dispose(c0395a);
                this.f76197s0.tryTerminateConsumer(this.f76194p0);
                if (getAndIncrement() == 0) {
                    this.v0.clear();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (t10 != null) {
                this.v0.offer(t10);
            }
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76200w0, disposable)) {
                this.f76200w0 = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.v0 = queueDisposable;
                        this.f76202y0 = true;
                        this.f76194p0.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.v0 = queueDisposable;
                        this.f76194p0.onSubscribe(this);
                        return;
                    }
                }
                this.v0 = new SpscLinkedArrayQueue(this.f76199u0);
                this.f76194p0.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapCompletable(Observable<T> observable, Function<? super T, ? extends CompletableSource> function, ErrorMode errorMode, int i10) {
        this.f76190p0 = observable;
        this.f76191q0 = function;
        this.f76192r0 = errorMode;
        this.f76193s0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        Observable<T> observable = this.f76190p0;
        Function<? super T, ? extends CompletableSource> function = this.f76191q0;
        if (k.b(observable, function, completableObserver)) {
            return;
        }
        observable.subscribe(new a(completableObserver, function, this.f76192r0, this.f76193s0));
    }
}
