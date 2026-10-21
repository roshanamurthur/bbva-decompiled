package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableRepeat<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f72709p0;

    public static final class a<T> extends AtomicInteger implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72710p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SequentialDisposable f72711q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ObservableSource<? extends T> f72712r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f72713s0;

        public a(Observer<? super T> observer, long j10, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.f72710p0 = observer;
            this.f72711q0 = sequentialDisposable;
            this.f72712r0 = observableSource;
            this.f72713s0 = j10;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f72711q0.isDisposed()) {
                    this.f72712r0.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            long j10 = this.f72713s0;
            if (j10 != Long.MAX_VALUE) {
                this.f72713s0 = j10 - 1;
            }
            if (j10 != 0) {
                a();
            } else {
                this.f72710p0.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72710p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72710p0.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f72711q0.replace(disposable);
        }
    }

    public ObservableRepeat(Observable<T> observable, long j10) {
        super(observable);
        this.f72709p0 = j10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        long j10 = this.f72709p0;
        new a(observer, j10 != Long.MAX_VALUE ? j10 - 1 : Long.MAX_VALUE, sequentialDisposable, this.source).a();
    }
}
