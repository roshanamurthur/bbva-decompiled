package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableRepeatWhen<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super Observable<Object>, ? extends ObservableSource<?>> f76996p0;

    public static final class a<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76997p0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Subject<Object> f77000s0;
        public final ObservableSource<T> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f77003w0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicInteger f76998q0 = new AtomicInteger();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicThrowable f76999r0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final a<T>.C0415a f77001t0 = new C0415a();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<Disposable> f77002u0 = new AtomicReference<>();

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.ObservableRepeatWhen$a$a, reason: collision with other inner class name */
        public final class C0415a extends AtomicReference<Disposable> implements Observer<Object> {
            public C0415a() {
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                a aVar = a.this;
                DisposableHelper.dispose(aVar.f77002u0);
                HalfSerializer.onComplete(aVar.f76997p0, aVar, aVar.f76999r0);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th2) {
                a aVar = a.this;
                DisposableHelper.dispose(aVar.f77002u0);
                HalfSerializer.onError(aVar.f76997p0, th2, aVar, aVar.f76999r0);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(Object obj) {
                a.this.a();
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(Observer<? super T> observer, Subject<Object> subject, ObservableSource<T> observableSource) {
            this.f76997p0 = observer;
            this.f77000s0 = subject;
            this.v0 = observableSource;
        }

        public final void a() {
            if (this.f76998q0.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f77003w0) {
                        this.f77003w0 = true;
                        this.v0.subscribe(this);
                    }
                    if (this.f76998q0.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f77002u0);
            DisposableHelper.dispose(this.f77001t0);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f77002u0.get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            DisposableHelper.replace(this.f77002u0, null);
            this.f77003w0 = false;
            this.f77000s0.onNext(0);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f77001t0);
            HalfSerializer.onError(this.f76997p0, th2, this, this.f76999r0);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            HalfSerializer.onNext(this.f76997p0, t10, this, this.f76999r0);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f77002u0, disposable);
        }
    }

    public ObservableRepeatWhen(ObservableSource<T> observableSource, Function<? super Observable<Object>, ? extends ObservableSource<?>> function) {
        super(observableSource);
        this.f76996p0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        Subject<T> serialized = PublishSubject.create().toSerialized();
        try {
            ObservableSource<?> observableSourceApply = this.f76996p0.apply(serialized);
            Objects.requireNonNull(observableSourceApply, "The handler returned a null ObservableSource");
            ObservableSource<?> observableSource = observableSourceApply;
            a aVar = new a(observer, serialized, this.source);
            observer.onSubscribe(aVar);
            observableSource.subscribe(aVar.f77001t0);
            aVar.a();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}
