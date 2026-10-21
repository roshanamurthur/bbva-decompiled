package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.DisposableObserver;
import io.reactivex.rxjava3.observers.SerializedObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDebounce<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends ObservableSource<U>> f76538p0;

    public static final class a<T, U> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76539p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<U>> f76540q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f76541r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<Disposable> f76542s0 = new AtomicReference<>();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile long f76543t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f76544u0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.ObservableDebounce$a$a, reason: collision with other inner class name */
        public static final class C0405a<T, U> extends DisposableObserver<U> {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final a<T, U> f76545q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final long f76546r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final T f76547s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public boolean f76548t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public final AtomicBoolean f76549u0 = new AtomicBoolean();

            public C0405a(a<T, U> aVar, long j10, T t10) {
                this.f76545q0 = aVar;
                this.f76546r0 = j10;
                this.f76547s0 = t10;
            }

            public final void a() {
                if (this.f76549u0.compareAndSet(false, true)) {
                    a<T, U> aVar = this.f76545q0;
                    long j10 = this.f76546r0;
                    T t10 = this.f76547s0;
                    if (j10 == aVar.f76543t0) {
                        aVar.f76539p0.onNext(t10);
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                if (this.f76548t0) {
                    return;
                }
                this.f76548t0 = true;
                a();
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th2) {
                if (this.f76548t0) {
                    RxJavaPlugins.onError(th2);
                } else {
                    this.f76548t0 = true;
                    this.f76545q0.onError(th2);
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(U u2) {
                if (this.f76548t0) {
                    return;
                }
                this.f76548t0 = true;
                dispose();
                a();
            }
        }

        public a(SerializedObserver serializedObserver, Function function) {
            this.f76539p0 = serializedObserver;
            this.f76540q0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76541r0.dispose();
            DisposableHelper.dispose(this.f76542s0);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76541r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f76544u0) {
                return;
            }
            this.f76544u0 = true;
            AtomicReference<Disposable> atomicReference = this.f76542s0;
            Disposable disposable = atomicReference.get();
            if (disposable != DisposableHelper.DISPOSED) {
                C0405a c0405a = (C0405a) disposable;
                if (c0405a != null) {
                    c0405a.a();
                }
                DisposableHelper.dispose(atomicReference);
                this.f76539p0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f76542s0);
            this.f76539p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f76544u0) {
                return;
            }
            long j10 = this.f76543t0 + 1;
            this.f76543t0 = j10;
            Disposable disposable = this.f76542s0.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                ObservableSource<U> observableSourceApply = this.f76540q0.apply(t10);
                Objects.requireNonNull(observableSourceApply, "The ObservableSource supplied is null");
                ObservableSource<U> observableSource = observableSourceApply;
                C0405a c0405a = new C0405a(this, j10, t10);
                AtomicReference<Disposable> atomicReference = this.f76542s0;
                while (!atomicReference.compareAndSet(disposable, c0405a)) {
                    if (atomicReference.get() != disposable) {
                        return;
                    }
                }
                observableSource.subscribe(c0405a);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                dispose();
                this.f76539p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76541r0, disposable)) {
                this.f76541r0 = disposable;
                this.f76539p0.onSubscribe(this);
            }
        }
    }

    public ObservableDebounce(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<U>> function) {
        super(observableSource);
        this.f76538p0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(new SerializedObserver(observer), this.f76538p0));
    }
}
