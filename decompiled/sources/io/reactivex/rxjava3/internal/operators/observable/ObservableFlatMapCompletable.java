package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFlatMapCompletable<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends CompletableSource> f76669p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f76670q0;

    public ObservableFlatMapCompletable(ObservableSource<T> observableSource, Function<? super T, ? extends CompletableSource> function, boolean z10) {
        super(observableSource);
        this.f76669p0 = function;
        this.f76670q0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f76669p0, this.f76670q0));
    }

    public static final class a<T> extends BasicIntQueueDisposable<T> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76671p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super T, ? extends CompletableSource> f76673r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f76674s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f76676u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicThrowable f76672q0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final CompositeDisposable f76675t0 = new CompositeDisposable();

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.ObservableFlatMapCompletable$a$a, reason: collision with other inner class name */
        public final class C0408a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public C0408a() {
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a aVar = a.this;
                aVar.f76675t0.delete(this);
                aVar.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a aVar = a.this;
                aVar.f76675t0.delete(this);
                aVar.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(Observer<? super T> observer, Function<? super T, ? extends CompletableSource> function, boolean z10) {
            this.f76671p0 = observer;
            this.f76673r0 = function;
            this.f76674s0 = z10;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.v0 = true;
            this.f76676u0.dispose();
            this.f76675t0.dispose();
            this.f76672q0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76676u0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.f76672q0.tryTerminateConsumer(this.f76671p0);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76672q0.tryAddThrowableOrReport(th2)) {
                if (this.f76674s0) {
                    if (decrementAndGet() == 0) {
                        this.f76672q0.tryTerminateConsumer(this.f76671p0);
                    }
                } else {
                    this.v0 = true;
                    this.f76676u0.dispose();
                    this.f76675t0.dispose();
                    this.f76672q0.tryTerminateConsumer(this.f76671p0);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            try {
                CompletableSource completableSourceApply = this.f76673r0.apply(t10);
                Objects.requireNonNull(completableSourceApply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = completableSourceApply;
                getAndIncrement();
                C0408a c0408a = new C0408a();
                if (this.v0 || !this.f76675t0.add(c0408a)) {
                    return;
                }
                completableSource.subscribe(c0408a);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f76676u0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76676u0, disposable)) {
                this.f76676u0 = disposable;
                this.f76671p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            return null;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            return i10 & 2;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
        }
    }
}
