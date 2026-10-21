package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableRepeatUntil<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BooleanSupplier f72714p0;

    public static final class a<T> extends AtomicInteger implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72715p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SequentialDisposable f72716q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ObservableSource<? extends T> f72717r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final BooleanSupplier f72718s0;

        public a(Observer<? super T> observer, BooleanSupplier booleanSupplier, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.f72715p0 = observer;
            this.f72716q0 = sequentialDisposable;
            this.f72717r0 = observableSource;
            this.f72718s0 = booleanSupplier;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Observer<? super T> observer = this.f72715p0;
            try {
                if (this.f72718s0.getAsBoolean()) {
                    observer.onComplete();
                } else if (getAndIncrement() == 0) {
                    int iAddAndGet = 1;
                    do {
                        this.f72717r0.subscribe(this);
                        iAddAndGet = addAndGet(-iAddAndGet);
                    } while (iAddAndGet != 0);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                observer.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72715p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72715p0.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f72716q0.replace(disposable);
        }
    }

    public ObservableRepeatUntil(Observable<T> observable, BooleanSupplier booleanSupplier) {
        super(observable);
        this.f72714p0 = booleanSupplier;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        a aVar = new a(observer, this.f72714p0, sequentialDisposable, this.source);
        if (aVar.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            do {
                aVar.f72717r0.subscribe(aVar);
                iAddAndGet = aVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }
}
