package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSkipUntil<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<U> f77167p0;

    public final class a implements Observer<U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ArrayCompositeDisposable f77168p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T> f77169q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SerializedObserver<T> f77170r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f77171s0;

        public a(ArrayCompositeDisposable arrayCompositeDisposable, b bVar, SerializedObserver serializedObserver) {
            this.f77168p0 = arrayCompositeDisposable;
            this.f77169q0 = bVar;
            this.f77170r0 = serializedObserver;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f77169q0.f77175s0 = true;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77168p0.dispose();
            this.f77170r0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(U u2) {
            this.f77171s0.dispose();
            this.f77169q0.f77175s0 = true;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77171s0, disposable)) {
                this.f77171s0 = disposable;
                this.f77168p0.setResource(1, disposable);
            }
        }
    }

    public static final class b<T> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77172p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ArrayCompositeDisposable f77173q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f77174r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f77175s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f77176t0;

        public b(SerializedObserver serializedObserver, ArrayCompositeDisposable arrayCompositeDisposable) {
            this.f77172p0 = serializedObserver;
            this.f77173q0 = arrayCompositeDisposable;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f77173q0.dispose();
            this.f77172p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77173q0.dispose();
            this.f77172p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f77176t0) {
                this.f77172p0.onNext(t10);
            } else if (this.f77175s0) {
                this.f77176t0 = true;
                this.f77172p0.onNext(t10);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77174r0, disposable)) {
                this.f77174r0 = disposable;
                this.f77173q0.setResource(0, disposable);
            }
        }
    }

    public ObservableSkipUntil(ObservableSource<T> observableSource, ObservableSource<U> observableSource2) {
        super(observableSource);
        this.f77167p0 = observableSource2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        ArrayCompositeDisposable arrayCompositeDisposable = new ArrayCompositeDisposable(2);
        serializedObserver.onSubscribe(arrayCompositeDisposable);
        b bVar = new b(serializedObserver, arrayCompositeDisposable);
        this.f77167p0.subscribe(new a(arrayCompositeDisposable, bVar, serializedObserver));
        this.source.subscribe(bVar);
    }
}
