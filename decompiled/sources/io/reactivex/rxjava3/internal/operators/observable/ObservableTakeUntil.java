package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTakeUntil<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends U> f77237p0;

    public static final class a<T, U> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77238p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Disposable> f77239q0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final a<T, U>.C0417a f77240r0 = new C0417a();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f77241s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.ObservableTakeUntil$a$a, reason: collision with other inner class name */
        public final class C0417a extends AtomicReference<Disposable> implements Observer<U> {
            public C0417a() {
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                a aVar = a.this;
                DisposableHelper.dispose(aVar.f77239q0);
                HalfSerializer.onComplete(aVar.f77238p0, aVar, aVar.f77241s0);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th2) {
                a aVar = a.this;
                DisposableHelper.dispose(aVar.f77239q0);
                HalfSerializer.onError(aVar.f77238p0, th2, aVar, aVar.f77241s0);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(U u2) {
                DisposableHelper.dispose(this);
                a aVar = a.this;
                DisposableHelper.dispose(aVar.f77239q0);
                HalfSerializer.onComplete(aVar.f77238p0, aVar, aVar.f77241s0);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(Observer<? super T> observer) {
            this.f77238p0 = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f77239q0);
            DisposableHelper.dispose(this.f77240r0);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f77239q0.get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            DisposableHelper.dispose(this.f77240r0);
            HalfSerializer.onComplete(this.f77238p0, this, this.f77241s0);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f77240r0);
            HalfSerializer.onError(this.f77238p0, th2, this, this.f77241s0);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            HalfSerializer.onNext(this.f77238p0, t10, this, this.f77241s0);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f77239q0, disposable);
        }
    }

    public ObservableTakeUntil(ObservableSource<T> observableSource, ObservableSource<? extends U> observableSource2) {
        super(observableSource);
        this.f77237p0 = observableSource2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a(observer);
        observer.onSubscribe(aVar);
        this.f77237p0.subscribe(aVar.f77240r0);
        this.source.subscribe(aVar);
    }
}
