package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlatMapObservable<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f76180p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends ObservableSource<? extends R>> f76181q0;

    public static final class a<T, R> extends AtomicReference<Disposable> implements Observer<R>, MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f76182p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends R>> f76183q0;

        public a(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function) {
            this.f76182p0 = observer;
            this.f76183q0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76182p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f76182p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(R r3) {
            this.f76182p0.onNext(r3);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            try {
                ObservableSource<? extends R> observableSourceApply = this.f76183q0.apply(t10);
                Objects.requireNonNull(observableSourceApply, "The mapper returned a null Publisher");
                ObservableSource<? extends R> observableSource = observableSourceApply;
                if (isDisposed()) {
                    return;
                }
                observableSource.subscribe(this);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f76182p0.onError(th2);
            }
        }
    }

    public MaybeFlatMapObservable(MaybeSource<T> maybeSource, Function<? super T, ? extends ObservableSource<? extends R>> function) {
        this.f76180p0 = maybeSource;
        this.f76181q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        a aVar = new a(observer, this.f76181q0);
        observer.onSubscribe(aVar);
        this.f76180p0.subscribe(aVar);
    }
}
