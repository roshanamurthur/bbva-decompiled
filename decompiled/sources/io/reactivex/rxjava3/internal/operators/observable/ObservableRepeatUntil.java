package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableRepeatUntil<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BooleanSupplier f76991p0;

    public static final class a<T> extends AtomicInteger implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76992p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SequentialDisposable f76993q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ObservableSource<? extends T> f76994r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final BooleanSupplier f76995s0;

        public a(Observer<? super T> observer, BooleanSupplier booleanSupplier, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.f76992p0 = observer;
            this.f76993q0 = sequentialDisposable;
            this.f76994r0 = observableSource;
            this.f76995s0 = booleanSupplier;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Observer<? super T> observer = this.f76992p0;
            try {
                if (this.f76995s0.getAsBoolean()) {
                    observer.onComplete();
                } else if (getAndIncrement() == 0) {
                    int iAddAndGet = 1;
                    do {
                        this.f76994r0.subscribe(this);
                        iAddAndGet = addAndGet(-iAddAndGet);
                    } while (iAddAndGet != 0);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                observer.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f76992p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f76992p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f76993q0.replace(disposable);
        }
    }

    public ObservableRepeatUntil(Observable<T> observable, BooleanSupplier booleanSupplier) {
        super(observable);
        this.f76991p0 = booleanSupplier;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        a aVar = new a(observer, this.f76991p0, sequentialDisposable, this.source);
        if (aVar.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            do {
                aVar.f76994r0.subscribe(aVar);
                iAddAndGet = aVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }
}
