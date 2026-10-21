package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableRetryPredicate<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Predicate<? super Throwable> f77047p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f77048q0;

    public static final class a<T> extends AtomicInteger implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77049p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SequentialDisposable f77050q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ObservableSource<? extends T> f77051r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Predicate<? super Throwable> f77052s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f77053t0;

        public a(Observer<? super T> observer, long j10, Predicate<? super Throwable> predicate, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.f77049p0 = observer;
            this.f77050q0 = sequentialDisposable;
            this.f77051r0 = observableSource;
            this.f77052s0 = predicate;
            this.f77053t0 = j10;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f77050q0.isDisposed()) {
                    this.f77051r0.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f77049p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            long j10 = this.f77053t0;
            if (j10 != Long.MAX_VALUE) {
                this.f77053t0 = j10 - 1;
            }
            Observer<? super T> observer = this.f77049p0;
            if (j10 == 0) {
                observer.onError(th2);
                return;
            }
            try {
                if (this.f77052s0.test(th2)) {
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
            this.f77049p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f77050q0.replace(disposable);
        }
    }

    public ObservableRetryPredicate(Observable<T> observable, long j10, Predicate<? super Throwable> predicate) {
        super(observable);
        this.f77047p0 = predicate;
        this.f77048q0 = j10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        new a(observer, this.f77048q0, this.f77047p0, sequentialDisposable, this.source).a();
    }
}
