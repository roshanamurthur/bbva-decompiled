package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableRetryBiPredicate<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BiPredicate<? super Integer, ? super Throwable> f77041p0;

    public static final class a<T> extends AtomicInteger implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77042p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SequentialDisposable f77043q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ObservableSource<? extends T> f77044r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final BiPredicate<? super Integer, ? super Throwable> f77045s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f77046t0;

        public a(Observer<? super T> observer, BiPredicate<? super Integer, ? super Throwable> biPredicate, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.f77042p0 = observer;
            this.f77043q0 = sequentialDisposable;
            this.f77044r0 = observableSource;
            this.f77045s0 = biPredicate;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f77043q0.isDisposed()) {
                    this.f77044r0.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f77042p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            Observer<? super T> observer = this.f77042p0;
            try {
                BiPredicate<? super Integer, ? super Throwable> biPredicate = this.f77045s0;
                int i10 = this.f77046t0 + 1;
                this.f77046t0 = i10;
                if (biPredicate.test(Integer.valueOf(i10), th2)) {
                    a();
                } else {
                    observer.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                observer.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f77042p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f77043q0.replace(disposable);
        }
    }

    public ObservableRetryBiPredicate(Observable<T> observable, BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        super(observable);
        this.f77041p0 = biPredicate;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        new a(observer, this.f77041p0, sequentialDisposable, this.source).a();
    }
}
