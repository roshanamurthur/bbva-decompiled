package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableWithLatestFrom<T, U, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BiFunction<? super T, ? super U, ? extends R> f73164p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ObservableSource<? extends U> f73165q0;

    public static final class a<T, U, R> extends AtomicReference<U> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f73166p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<? super T, ? super U, ? extends R> f73167q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Disposable> f73168r0 = new AtomicReference<>();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<Disposable> f73169s0 = new AtomicReference<>();

        public a(SerializedObserver serializedObserver, BiFunction biFunction) {
            this.f73166p0 = serializedObserver;
            this.f73167q0 = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f73168r0);
            DisposableHelper.dispose(this.f73169s0);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f73168r0.get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            DisposableHelper.dispose(this.f73169s0);
            this.f73166p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f73169s0);
            this.f73166p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            Observer<? super R> observer = this.f73166p0;
            U u2 = get();
            if (u2 != null) {
                try {
                    observer.onNext((Object) ObjectHelper.requireNonNull(this.f73167q0.apply(t10, u2), "The combiner returned a null value"));
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    dispose();
                    observer.onError(th2);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f73168r0, disposable);
        }
    }

    public ObservableWithLatestFrom(ObservableSource<T> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction, ObservableSource<? extends U> observableSource2) {
        super(observableSource);
        this.f73164p0 = biFunction;
        this.f73165q0 = observableSource2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        a aVar = new a(serializedObserver, this.f73164p0);
        serializedObserver.onSubscribe(aVar);
        this.f73165q0.subscribe(new b(aVar));
        this.source.subscribe(aVar);
    }

    public final class b implements Observer<U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T, U, R> f73170p0;

        public b(a aVar) {
            this.f73170p0 = aVar;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            a<T, U, R> aVar = this.f73170p0;
            DisposableHelper.dispose(aVar.f73168r0);
            aVar.f73166p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(U u2) {
            this.f73170p0.lazySet(u2);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f73170p0.f73169s0, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
        }
    }
}
