package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableRepeat<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f76986p0;

    public static final class a<T> extends AtomicInteger implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76987p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SequentialDisposable f76988q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ObservableSource<? extends T> f76989r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f76990s0;

        public a(Observer<? super T> observer, long j10, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.f76987p0 = observer;
            this.f76988q0 = sequentialDisposable;
            this.f76989r0 = observableSource;
            this.f76990s0 = j10;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f76988q0.isDisposed()) {
                    this.f76989r0.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            long j10 = this.f76990s0;
            if (j10 != Long.MAX_VALUE) {
                this.f76990s0 = j10 - 1;
            }
            if (j10 != 0) {
                a();
            } else {
                this.f76987p0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f76987p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f76987p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f76988q0.replace(disposable);
        }
    }

    public ObservableRepeat(Observable<T> observable, long j10) {
        super(observable);
        this.f76986p0 = j10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        long j10 = this.f76986p0;
        new a(observer, j10 != Long.MAX_VALUE ? j10 - 1 : Long.MAX_VALUE, sequentialDisposable, this.source).a();
    }
}
