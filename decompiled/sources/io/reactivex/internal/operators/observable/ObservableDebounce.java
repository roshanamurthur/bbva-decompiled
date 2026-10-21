package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDebounce<T, U> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends ObservableSource<U>> f72257p0;

    public static final class a<T, U> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72258p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<U>> f72259q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f72260r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<Disposable> f72261s0 = new AtomicReference<>();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile long f72262t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f72263u0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.ObservableDebounce$a$a, reason: collision with other inner class name */
        public static final class C0340a<T, U> extends DisposableObserver<U> {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final a<T, U> f72264q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final long f72265r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final T f72266s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public boolean f72267t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public final AtomicBoolean f72268u0 = new AtomicBoolean();

            public C0340a(a<T, U> aVar, long j10, T t10) {
                this.f72264q0 = aVar;
                this.f72265r0 = j10;
                this.f72266s0 = t10;
            }

            public final void a() {
                if (this.f72268u0.compareAndSet(false, true)) {
                    a<T, U> aVar = this.f72264q0;
                    long j10 = this.f72265r0;
                    T t10 = this.f72266s0;
                    if (j10 == aVar.f72262t0) {
                        aVar.f72258p0.onNext(t10);
                    }
                }
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                if (this.f72267t0) {
                    return;
                }
                this.f72267t0 = true;
                a();
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th2) {
                if (this.f72267t0) {
                    RxJavaPlugins.onError(th2);
                } else {
                    this.f72267t0 = true;
                    this.f72264q0.onError(th2);
                }
            }

            @Override // io.reactivex.Observer
            public final void onNext(U u2) {
                if (this.f72267t0) {
                    return;
                }
                this.f72267t0 = true;
                dispose();
                a();
            }
        }

        public a(SerializedObserver serializedObserver, Function function) {
            this.f72258p0 = serializedObserver;
            this.f72259q0 = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72260r0.dispose();
            DisposableHelper.dispose(this.f72261s0);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72260r0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72263u0) {
                return;
            }
            this.f72263u0 = true;
            AtomicReference<Disposable> atomicReference = this.f72261s0;
            Disposable disposable = atomicReference.get();
            if (disposable != DisposableHelper.DISPOSED) {
                C0340a c0340a = (C0340a) disposable;
                if (c0340a != null) {
                    c0340a.a();
                }
                DisposableHelper.dispose(atomicReference);
                this.f72258p0.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f72261s0);
            this.f72258p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72263u0) {
                return;
            }
            long j10 = this.f72262t0 + 1;
            this.f72262t0 = j10;
            Disposable disposable = this.f72261s0.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f72259q0.apply(t10), "The ObservableSource supplied is null");
                C0340a c0340a = new C0340a(this, j10, t10);
                AtomicReference<Disposable> atomicReference = this.f72261s0;
                while (!atomicReference.compareAndSet(disposable, c0340a)) {
                    if (atomicReference.get() != disposable) {
                        return;
                    }
                }
                observableSource.subscribe(c0340a);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                dispose();
                this.f72258p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72260r0, disposable)) {
                this.f72260r0 = disposable;
                this.f72258p0.onSubscribe(this);
            }
        }
    }

    public ObservableDebounce(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<U>> function) {
        super(observableSource);
        this.f72257p0 = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(new SerializedObserver(observer), this.f72257p0));
    }
}
