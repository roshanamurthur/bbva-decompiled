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
public final class ObservableRetryWhen<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super Observable<Throwable>, ? extends ObservableSource<?>> f77054p0;

    public static final class a<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77055p0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Subject<Throwable> f77058s0;
        public final ObservableSource<T> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f77061w0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicInteger f77056q0 = new AtomicInteger();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicThrowable f77057r0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final a<T>.C0416a f77059t0 = new C0416a();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<Disposable> f77060u0 = new AtomicReference<>();

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.ObservableRetryWhen$a$a, reason: collision with other inner class name */
        public final class C0416a extends AtomicReference<Disposable> implements Observer<Object> {
            public C0416a() {
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                a aVar = a.this;
                DisposableHelper.dispose(aVar.f77060u0);
                HalfSerializer.onComplete(aVar.f77055p0, aVar, aVar.f77057r0);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th2) {
                a aVar = a.this;
                DisposableHelper.dispose(aVar.f77060u0);
                HalfSerializer.onError(aVar.f77055p0, th2, aVar, aVar.f77057r0);
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

        public a(Observer<? super T> observer, Subject<Throwable> subject, ObservableSource<T> observableSource) {
            this.f77055p0 = observer;
            this.f77058s0 = subject;
            this.v0 = observableSource;
        }

        public final void a() {
            if (this.f77056q0.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f77061w0) {
                        this.f77061w0 = true;
                        this.v0.subscribe(this);
                    }
                    if (this.f77056q0.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f77060u0);
            DisposableHelper.dispose(this.f77059t0);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f77060u0.get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            DisposableHelper.dispose(this.f77059t0);
            HalfSerializer.onComplete(this.f77055p0, this, this.f77057r0);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            DisposableHelper.replace(this.f77060u0, null);
            this.f77061w0 = false;
            this.f77058s0.onNext(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            HalfSerializer.onNext(this.f77055p0, t10, this, this.f77057r0);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.f77060u0, disposable);
        }
    }

    public ObservableRetryWhen(ObservableSource<T> observableSource, Function<? super Observable<Throwable>, ? extends ObservableSource<?>> function) {
        super(observableSource);
        this.f77054p0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        Subject<T> serialized = PublishSubject.create().toSerialized();
        try {
            ObservableSource<?> observableSourceApply = this.f77054p0.apply(serialized);
            Objects.requireNonNull(observableSourceApply, "The handler returned a null ObservableSource");
            ObservableSource<?> observableSource = observableSourceApply;
            a aVar = new a(observer, serialized, this.source);
            observer.onSubscribe(aVar);
            observableSource.subscribe(aVar.f77059t0);
            aVar.a();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}
