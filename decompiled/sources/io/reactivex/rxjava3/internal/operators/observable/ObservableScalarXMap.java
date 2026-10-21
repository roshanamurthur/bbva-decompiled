package io.reactivex.rxjava3.internal.operators.observable;

import a.d;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.fuseable.QueueDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableScalarXMap {

    public static final class ScalarDisposable<T> extends AtomicInteger implements QueueDisposable<T>, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77082p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f77083q0;

        public ScalarDisposable(Observer<? super T> observer, T t10) {
            this.f77082p0 = observer;
            this.f77083q0 = t10;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            set(3);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == 3;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public boolean offer(T t10) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f77083q0;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                T t10 = this.f77083q0;
                Observer<? super T> observer = this.f77082p0;
                observer.onNext(t10);
                if (get() == 2) {
                    lazySet(3);
                    observer.onComplete();
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public boolean offer(T t10, T t11) {
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    public static final class a<T, R> extends Observable<R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T f77084p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends R>> f77085q0;

        public a(T t10, Function<? super T, ? extends ObservableSource<? extends R>> function) {
            this.f77084p0 = t10;
            this.f77085q0 = function;
        }

        @Override // io.reactivex.rxjava3.core.Observable
        public final void subscribeActual(Observer<? super R> observer) {
            try {
                ObservableSource<? extends R> observableSourceApply = this.f77085q0.apply(this.f77084p0);
                Objects.requireNonNull(observableSourceApply, "The mapper returned a null ObservableSource");
                ObservableSource<? extends R> observableSource = observableSourceApply;
                if (!(observableSource instanceof Supplier)) {
                    observableSource.subscribe(observer);
                    return;
                }
                try {
                    Object obj = ((Supplier) observableSource).get();
                    if (obj == null) {
                        EmptyDisposable.complete(observer);
                        return;
                    }
                    ScalarDisposable scalarDisposable = new ScalarDisposable(observer, obj);
                    observer.onSubscribe(scalarDisposable);
                    scalarDisposable.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    EmptyDisposable.error(th2, observer);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptyDisposable.error(th3, observer);
            }
        }
    }

    public ObservableScalarXMap() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Observable<U> scalarXMap(T t10, Function<? super T, ? extends ObservableSource<? extends U>> function) {
        return RxJavaPlugins.onAssembly(new a(t10, function));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(ObservableSource<T> observableSource, Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function) {
        if (!(observableSource instanceof Supplier)) {
            return false;
        }
        try {
            d dVar = (Object) ((Supplier) observableSource).get();
            if (dVar == null) {
                EmptyDisposable.complete(observer);
                return true;
            }
            try {
                ObservableSource<? extends R> observableSourceApply = function.apply(dVar);
                Objects.requireNonNull(observableSourceApply, "The mapper returned a null ObservableSource");
                ObservableSource<? extends R> observableSource2 = observableSourceApply;
                if (observableSource2 instanceof Supplier) {
                    try {
                        Object obj = ((Supplier) observableSource2).get();
                        if (obj == null) {
                            EmptyDisposable.complete(observer);
                            return true;
                        }
                        ScalarDisposable scalarDisposable = new ScalarDisposable(observer, obj);
                        observer.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        EmptyDisposable.error(th2, observer);
                        return true;
                    }
                } else {
                    observableSource2.subscribe(observer);
                }
                return true;
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptyDisposable.error(th3, observer);
                return true;
            }
        } catch (Throwable th4) {
            Exceptions.throwIfFatal(th4);
            EmptyDisposable.error(th4, observer);
            return true;
        }
    }
}
