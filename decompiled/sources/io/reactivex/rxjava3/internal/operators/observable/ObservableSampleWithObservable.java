package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSampleWithObservable<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<?> f77073p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f77074q0;

    public static final class a<T> extends c<T> {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicInteger f77075t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f77076u0;

        public a(ObservableSource observableSource, SerializedObserver serializedObserver) {
            super(observableSource, serializedObserver);
            this.f77075t0 = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable.c
        public final void a() {
            this.f77076u0 = true;
            if (this.f77075t0.getAndIncrement() == 0) {
                T andSet = getAndSet(null);
                if (andSet != null) {
                    this.f77077p0.onNext(andSet);
                }
                this.f77077p0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable.c
        public final void b() {
            if (this.f77075t0.getAndIncrement() == 0) {
                do {
                    boolean z10 = this.f77076u0;
                    T andSet = getAndSet(null);
                    if (andSet != null) {
                        this.f77077p0.onNext(andSet);
                    }
                    if (z10) {
                        this.f77077p0.onComplete();
                        return;
                    }
                } while (this.f77075t0.decrementAndGet() != 0);
            }
        }
    }

    public static final class b<T> extends c<T> {
        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable.c
        public final void a() {
            this.f77077p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable.c
        public final void b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f77077p0.onNext(andSet);
            }
        }
    }

    public static abstract class c<T> extends AtomicReference<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77077p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ObservableSource<?> f77078q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Disposable> f77079r0 = new AtomicReference<>();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f77080s0;

        public c(ObservableSource observableSource, SerializedObserver serializedObserver) {
            this.f77077p0 = serializedObserver;
            this.f77078q0 = observableSource;
        }

        public abstract void a();

        public abstract void b();

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f77079r0);
            this.f77080s0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77079r0.get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            DisposableHelper.dispose(this.f77079r0);
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f77079r0);
            this.f77077p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            lazySet(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77080s0, disposable)) {
                this.f77080s0 = disposable;
                this.f77077p0.onSubscribe(this);
                if (this.f77079r0.get() == null) {
                    this.f77078q0.subscribe(new d(this));
                }
            }
        }
    }

    public static final class d<T> implements Observer<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final c<T> f77081p0;

        public d(c<T> cVar) {
            this.f77081p0 = cVar;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            c<T> cVar = this.f77081p0;
            cVar.f77080s0.dispose();
            cVar.a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            c<T> cVar = this.f77081p0;
            cVar.f77080s0.dispose();
            cVar.f77077p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f77081p0.b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f77081p0.f77079r0, disposable);
        }
    }

    public ObservableSampleWithObservable(ObservableSource<T> observableSource, ObservableSource<?> observableSource2, boolean z10) {
        super(observableSource);
        this.f77073p0 = observableSource2;
        this.f77074q0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        boolean z10 = this.f77074q0;
        ObservableSource<?> observableSource = this.f77073p0;
        if (z10) {
            this.source.subscribe(new a(observableSource, serializedObserver));
        } else {
            this.source.subscribe(new b(observableSource, serializedObserver));
        }
    }
}
