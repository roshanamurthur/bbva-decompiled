package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTakeUntil<T, U> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends U> f72960p0;

    public static final class a<T, U> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72961p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Disposable> f72962q0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final a<T, U>.C0352a f72963r0 = new C0352a();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f72964s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.ObservableTakeUntil$a$a, reason: collision with other inner class name */
        public final class C0352a extends AtomicReference<Disposable> implements Observer<U> {
            public C0352a() {
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                a aVar = a.this;
                DisposableHelper.dispose(aVar.f72962q0);
                HalfSerializer.onComplete(aVar.f72961p0, aVar, aVar.f72964s0);
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th2) {
                a aVar = a.this;
                DisposableHelper.dispose(aVar.f72962q0);
                HalfSerializer.onError(aVar.f72961p0, th2, aVar, aVar.f72964s0);
            }

            @Override // io.reactivex.Observer
            public final void onNext(U u2) {
                DisposableHelper.dispose(this);
                a aVar = a.this;
                DisposableHelper.dispose(aVar.f72962q0);
                HalfSerializer.onComplete(aVar.f72961p0, aVar, aVar.f72964s0);
            }

            @Override // io.reactivex.Observer
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(Observer<? super T> observer) {
            this.f72961p0 = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f72962q0);
            DisposableHelper.dispose(this.f72963r0);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f72962q0.get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            DisposableHelper.dispose(this.f72963r0);
            HalfSerializer.onComplete(this.f72961p0, this, this.f72964s0);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f72963r0);
            HalfSerializer.onError(this.f72961p0, th2, this, this.f72964s0);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            HalfSerializer.onNext(this.f72961p0, t10, this, this.f72964s0);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f72962q0, disposable);
        }
    }

    public ObservableTakeUntil(ObservableSource<T> observableSource, ObservableSource<? extends U> observableSource2) {
        super(observableSource);
        this.f72960p0 = observableSource2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a(observer);
        observer.onSubscribe(aVar);
        this.f72960p0.subscribe(aVar.f72963r0);
        this.source.subscribe(aVar);
    }
}
