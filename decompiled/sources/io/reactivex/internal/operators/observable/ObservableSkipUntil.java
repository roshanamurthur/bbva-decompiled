package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSkipUntil<T, U> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<U> f72890p0;

    public final class a implements Observer<U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ArrayCompositeDisposable f72891p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T> f72892q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SerializedObserver<T> f72893r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f72894s0;

        public a(ArrayCompositeDisposable arrayCompositeDisposable, b bVar, SerializedObserver serializedObserver) {
            this.f72891p0 = arrayCompositeDisposable;
            this.f72892q0 = bVar;
            this.f72893r0 = serializedObserver;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72892q0.f72898s0 = true;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72891p0.dispose();
            this.f72893r0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(U u2) {
            this.f72894s0.dispose();
            this.f72892q0.f72898s0 = true;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72894s0, disposable)) {
                this.f72894s0 = disposable;
                this.f72891p0.setResource(1, disposable);
            }
        }
    }

    public static final class b<T> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72895p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ArrayCompositeDisposable f72896q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f72897r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f72898s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f72899t0;

        public b(SerializedObserver serializedObserver, ArrayCompositeDisposable arrayCompositeDisposable) {
            this.f72895p0 = serializedObserver;
            this.f72896q0 = arrayCompositeDisposable;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72896q0.dispose();
            this.f72895p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72896q0.dispose();
            this.f72895p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72899t0) {
                this.f72895p0.onNext(t10);
            } else if (this.f72898s0) {
                this.f72899t0 = true;
                this.f72895p0.onNext(t10);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72897r0, disposable)) {
                this.f72897r0 = disposable;
                this.f72896q0.setResource(0, disposable);
            }
        }
    }

    public ObservableSkipUntil(ObservableSource<T> observableSource, ObservableSource<U> observableSource2) {
        super(observableSource);
        this.f72890p0 = observableSource2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        ArrayCompositeDisposable arrayCompositeDisposable = new ArrayCompositeDisposable(2);
        serializedObserver.onSubscribe(arrayCompositeDisposable);
        b bVar = new b(serializedObserver, arrayCompositeDisposable);
        this.f72890p0.subscribe(new a(arrayCompositeDisposable, bVar, serializedObserver));
        this.source.subscribe(bVar);
    }
}
