package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableWithLatestFrom<T, U, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BiFunction<? super T, ? super U, ? extends R> f77413p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ObservableSource<? extends U> f77414q0;

    public static final class a<T, U, R> extends AtomicReference<U> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f77415p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<? super T, ? super U, ? extends R> f77416q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Disposable> f77417r0 = new AtomicReference<>();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<Disposable> f77418s0 = new AtomicReference<>();

        public a(SerializedObserver serializedObserver, BiFunction biFunction) {
            this.f77415p0 = serializedObserver;
            this.f77416q0 = biFunction;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f77417r0);
            DisposableHelper.dispose(this.f77418s0);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f77417r0.get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            DisposableHelper.dispose(this.f77418s0);
            this.f77415p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f77418s0);
            this.f77415p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            Observer<? super R> observer = this.f77415p0;
            U u2 = get();
            if (u2 != null) {
                try {
                    R rApply = this.f77416q0.apply(t10, u2);
                    Objects.requireNonNull(rApply, "The combiner returned a null value");
                    observer.onNext(rApply);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    dispose();
                    observer.onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f77417r0, disposable);
        }
    }

    public ObservableWithLatestFrom(ObservableSource<T> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction, ObservableSource<? extends U> observableSource2) {
        super(observableSource);
        this.f77413p0 = biFunction;
        this.f77414q0 = observableSource2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        a aVar = new a(serializedObserver, this.f77413p0);
        serializedObserver.onSubscribe(aVar);
        this.f77414q0.subscribe(new b(aVar));
        this.source.subscribe(aVar);
    }

    public final class b implements Observer<U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T, U, R> f77419p0;

        public b(a aVar) {
            this.f77419p0 = aVar;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            a<T, U, R> aVar = this.f77419p0;
            DisposableHelper.dispose(aVar.f77417r0);
            aVar.f77415p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(U u2) {
            this.f77419p0.lazySet(u2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f77419p0.f77418s0, disposable);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
        }
    }
}
