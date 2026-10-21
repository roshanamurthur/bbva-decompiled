package io.reactivex.internal.operators.mixed;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFlatMapObservable<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f72005p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends ObservableSource<? extends R>> f72006q0;

    public static final class a<T, R> extends AtomicReference<Disposable> implements Observer<R>, SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f72007p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends R>> f72008q0;

        public a(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function) {
            this.f72007p0 = observer;
            this.f72008q0 = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72007p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72007p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(R r3) {
            this.f72007p0.onNext(r3);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            try {
                ((ObservableSource) ObjectHelper.requireNonNull(this.f72008q0.apply(t10), "The mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f72007p0.onError(th2);
            }
        }
    }

    public SingleFlatMapObservable(SingleSource<T> singleSource, Function<? super T, ? extends ObservableSource<? extends R>> function) {
        this.f72005p0 = singleSource;
        this.f72006q0 = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        a aVar = new a(observer, this.f72006q0);
        observer.onSubscribe(aVar);
        this.f72005p0.subscribe(aVar);
    }
}
