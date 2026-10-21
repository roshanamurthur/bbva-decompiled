package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableRetryPredicate<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Predicate<? super Throwable> f72770p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f72771q0;

    public static final class a<T> extends AtomicInteger implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72772p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SequentialDisposable f72773q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ObservableSource<? extends T> f72774r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Predicate<? super Throwable> f72775s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f72776t0;

        public a(Observer<? super T> observer, long j10, Predicate<? super Throwable> predicate, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.f72772p0 = observer;
            this.f72773q0 = sequentialDisposable;
            this.f72774r0 = observableSource;
            this.f72775s0 = predicate;
            this.f72776t0 = j10;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f72773q0.isDisposed()) {
                    this.f72774r0.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72772p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            long j10 = this.f72776t0;
            if (j10 != Long.MAX_VALUE) {
                this.f72776t0 = j10 - 1;
            }
            Observer<? super T> observer = this.f72772p0;
            if (j10 == 0) {
                observer.onError(th2);
                return;
            }
            try {
                if (this.f72775s0.test(th2)) {
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
            this.f72772p0.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f72773q0.replace(disposable);
        }
    }

    public ObservableRetryPredicate(Observable<T> observable, long j10, Predicate<? super Throwable> predicate) {
        super(observable);
        this.f72770p0 = predicate;
        this.f72771q0 = j10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        new a(observer, this.f72771q0, this.f72770p0, sequentialDisposable, this.source).a();
    }
}
