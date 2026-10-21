package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableOnErrorNext<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends ObservableSource<? extends T>> f72628p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f72629q0;

    public static final class a<T> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72630p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends ObservableSource<? extends T>> f72631q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f72632r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final SequentialDisposable f72633s0 = new SequentialDisposable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f72634t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f72635u0;

        public a(Observer<? super T> observer, Function<? super Throwable, ? extends ObservableSource<? extends T>> function, boolean z10) {
            this.f72630p0 = observer;
            this.f72631q0 = function;
            this.f72632r0 = z10;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72635u0) {
                return;
            }
            this.f72635u0 = true;
            this.f72634t0 = true;
            this.f72630p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            boolean z10 = this.f72634t0;
            Observer<? super T> observer = this.f72630p0;
            if (z10) {
                if (this.f72635u0) {
                    RxJavaPlugins.onError(th2);
                    return;
                } else {
                    observer.onError(th2);
                    return;
                }
            }
            this.f72634t0 = true;
            if (this.f72632r0 && !(th2 instanceof Exception)) {
                observer.onError(th2);
                return;
            }
            try {
                ObservableSource<? extends T> observableSourceApply = this.f72631q0.apply(th2);
                if (observableSourceApply != null) {
                    observableSourceApply.subscribe(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th2);
                observer.onError(nullPointerException);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                observer.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72635u0) {
                return;
            }
            this.f72630p0.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f72633s0.replace(disposable);
        }
    }

    public ObservableOnErrorNext(ObservableSource<T> observableSource, Function<? super Throwable, ? extends ObservableSource<? extends T>> function, boolean z10) {
        super(observableSource);
        this.f72628p0 = function;
        this.f72629q0 = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a(observer, this.f72628p0, this.f72629q0);
        observer.onSubscribe(aVar.f72633s0);
        this.source.subscribe(aVar);
    }
}
