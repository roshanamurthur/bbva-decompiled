package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableRetryBiPredicate<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BiPredicate<? super Integer, ? super Throwable> f72764p0;

    public static final class a<T> extends AtomicInteger implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72765p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SequentialDisposable f72766q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ObservableSource<? extends T> f72767r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final BiPredicate<? super Integer, ? super Throwable> f72768s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f72769t0;

        public a(Observer<? super T> observer, BiPredicate<? super Integer, ? super Throwable> biPredicate, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.f72765p0 = observer;
            this.f72766q0 = sequentialDisposable;
            this.f72767r0 = observableSource;
            this.f72768s0 = biPredicate;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f72766q0.isDisposed()) {
                    this.f72767r0.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72765p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            Observer<? super T> observer = this.f72765p0;
            try {
                BiPredicate<? super Integer, ? super Throwable> biPredicate = this.f72768s0;
                int i10 = this.f72769t0 + 1;
                this.f72769t0 = i10;
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

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72765p0.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f72766q0.replace(disposable);
        }
    }

    public ObservableRetryBiPredicate(Observable<T> observable, BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        super(observable);
        this.f72764p0 = biPredicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        new a(observer, this.f72764p0, sequentialDisposable, this.source).a();
    }
}
