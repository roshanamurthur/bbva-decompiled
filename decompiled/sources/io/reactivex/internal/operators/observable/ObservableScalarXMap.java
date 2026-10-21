package io.reactivex.internal.operators.observable;

import a.d;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableScalarXMap {

    public static final class ScalarDisposable<T> extends AtomicInteger implements QueueDisposable<T>, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72805p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f72806q0;

        public ScalarDisposable(Observer<? super T> observer, T t10) {
            this.f72805p0 = observer;
            this.f72806q0 = t10;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            set(3);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == 3;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t10) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f72806q0;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
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
                T t10 = this.f72806q0;
                Observer<? super T> observer = this.f72805p0;
                observer.onNext(t10);
                if (get() == 2) {
                    lazySet(3);
                    observer.onComplete();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t10, T t11) {
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    public static final class a<T, R> extends Observable<R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T f72807p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends R>> f72808q0;

        public a(T t10, Function<? super T, ? extends ObservableSource<? extends R>> function) {
            this.f72807p0 = t10;
            this.f72808q0 = function;
        }

        @Override // io.reactivex.Observable
        public final void subscribeActual(Observer<? super R> observer) {
            try {
                ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f72808q0.apply(this.f72807p0), "The mapper returned a null ObservableSource");
                if (!(observableSource instanceof Callable)) {
                    observableSource.subscribe(observer);
                    return;
                }
                try {
                    Object objCall = ((Callable) observableSource).call();
                    if (objCall == null) {
                        EmptyDisposable.complete(observer);
                        return;
                    }
                    ScalarDisposable scalarDisposable = new ScalarDisposable(observer, objCall);
                    observer.onSubscribe(scalarDisposable);
                    scalarDisposable.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    EmptyDisposable.error(th2, observer);
                }
            } catch (Throwable th3) {
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
        if (!(observableSource instanceof Callable)) {
            return false;
        }
        try {
            d dVar = (Object) ((Callable) observableSource).call();
            if (dVar == null) {
                EmptyDisposable.complete(observer);
                return true;
            }
            try {
                ObservableSource observableSource2 = (ObservableSource) ObjectHelper.requireNonNull(function.apply(dVar), "The mapper returned a null ObservableSource");
                if (observableSource2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) observableSource2).call();
                        if (objCall == null) {
                            EmptyDisposable.complete(observer);
                            return true;
                        }
                        ScalarDisposable scalarDisposable = new ScalarDisposable(observer, objCall);
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
