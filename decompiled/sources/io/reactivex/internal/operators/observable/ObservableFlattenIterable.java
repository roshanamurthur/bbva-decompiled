package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFlattenIterable<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends Iterable<? extends R>> f72430p0;

    public static final class a<T, R> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f72431p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Iterable<? extends R>> f72432q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f72433r0;

        public a(Observer<? super R> observer, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.f72431p0 = observer;
            this.f72432q0 = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72433r0.dispose();
            this.f72433r0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72433r0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Disposable disposable = this.f72433r0;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                return;
            }
            this.f72433r0 = disposableHelper;
            this.f72431p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            Disposable disposable = this.f72433r0;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72433r0 = disposableHelper;
                this.f72431p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72433r0 == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                Iterator<? extends R> it = this.f72432q0.apply(t10).iterator();
                while (it.hasNext()) {
                    try {
                        try {
                            this.f72431p0.onNext(ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            this.f72433r0.dispose();
                            onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        this.f72433r0.dispose();
                        onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                this.f72433r0.dispose();
                onError(th4);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72433r0, disposable)) {
                this.f72433r0 = disposable;
                this.f72431p0.onSubscribe(this);
            }
        }
    }

    public ObservableFlattenIterable(ObservableSource<T> observableSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        super(observableSource);
        this.f72430p0 = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.source.subscribe(new a(observer, this.f72430p0));
    }
}
