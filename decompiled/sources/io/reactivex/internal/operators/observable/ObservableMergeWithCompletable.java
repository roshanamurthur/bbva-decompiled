package io.reactivex.internal.operators.observable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableMergeWithCompletable<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f72588p0;

    public static final class a<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72589p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Disposable> f72590q0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final C0347a f72591r0 = new C0347a(this);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f72592s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f72593t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f72594u0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.ObservableMergeWithCompletable$a$a, reason: collision with other inner class name */
        public static final class C0347a extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?> f72595p0;

            public C0347a(a<?> aVar) {
                this.f72595p0 = aVar;
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                a<?> aVar = this.f72595p0;
                aVar.f72594u0 = true;
                if (aVar.f72593t0) {
                    HalfSerializer.onComplete(aVar.f72589p0, aVar, aVar.f72592s0);
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th2) {
                a<?> aVar = this.f72595p0;
                DisposableHelper.dispose(aVar.f72590q0);
                HalfSerializer.onError(aVar.f72589p0, th2, aVar, aVar.f72592s0);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(Observer<? super T> observer) {
            this.f72589p0 = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f72590q0);
            DisposableHelper.dispose(this.f72591r0);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f72590q0.get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72593t0 = true;
            if (this.f72594u0) {
                HalfSerializer.onComplete(this.f72589p0, this, this.f72592s0);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f72591r0);
            HalfSerializer.onError(this.f72589p0, th2, this, this.f72592s0);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            HalfSerializer.onNext(this.f72589p0, t10, this, this.f72592s0);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f72590q0, disposable);
        }
    }

    public ObservableMergeWithCompletable(Observable<T> observable, CompletableSource completableSource) {
        super(observable);
        this.f72588p0 = completableSource;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a(observer);
        observer.onSubscribe(aVar);
        this.source.subscribe(aVar);
        this.f72588p0.subscribe(aVar.f72591r0);
    }
}
