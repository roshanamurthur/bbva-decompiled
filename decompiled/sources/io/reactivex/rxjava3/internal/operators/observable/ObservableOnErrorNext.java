package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableOnErrorNext<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends ObservableSource<? extends T>> f76918p0;

    public static final class a<T> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76919p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends ObservableSource<? extends T>> f76920q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SequentialDisposable f76921r0 = new SequentialDisposable();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f76922s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f76923t0;

        public a(Observer<? super T> observer, Function<? super Throwable, ? extends ObservableSource<? extends T>> function) {
            this.f76919p0 = observer;
            this.f76920q0 = function;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f76923t0) {
                return;
            }
            this.f76923t0 = true;
            this.f76922s0 = true;
            this.f76919p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            boolean z10 = this.f76922s0;
            Observer<? super T> observer = this.f76919p0;
            if (z10) {
                if (this.f76923t0) {
                    RxJavaPlugins.onError(th2);
                    return;
                } else {
                    observer.onError(th2);
                    return;
                }
            }
            this.f76922s0 = true;
            try {
                ObservableSource<? extends T> observableSourceApply = this.f76920q0.apply(th2);
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

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f76923t0) {
                return;
            }
            this.f76919p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f76921r0.replace(disposable);
        }
    }

    public ObservableOnErrorNext(ObservableSource<T> observableSource, Function<? super Throwable, ? extends ObservableSource<? extends T>> function) {
        super(observableSource);
        this.f76918p0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a(observer, this.f76918p0);
        observer.onSubscribe(aVar.f76921r0);
        this.source.subscribe(aVar);
    }
}
