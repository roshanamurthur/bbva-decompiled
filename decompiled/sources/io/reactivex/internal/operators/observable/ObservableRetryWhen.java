package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableRetryWhen<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super Observable<Throwable>, ? extends ObservableSource<?>> f72777p0;

    public static final class a<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72778p0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Subject<Throwable> f72781s0;
        public final ObservableSource<T> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f72784w0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicInteger f72779q0 = new AtomicInteger();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicThrowable f72780r0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final a<T>.C0351a f72782t0 = new C0351a();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<Disposable> f72783u0 = new AtomicReference<>();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.ObservableRetryWhen$a$a, reason: collision with other inner class name */
        public final class C0351a extends AtomicReference<Disposable> implements Observer<Object> {
            public C0351a() {
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                a aVar = a.this;
                DisposableHelper.dispose(aVar.f72783u0);
                HalfSerializer.onComplete(aVar.f72778p0, aVar, aVar.f72780r0);
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th2) {
                a aVar = a.this;
                DisposableHelper.dispose(aVar.f72783u0);
                HalfSerializer.onError(aVar.f72778p0, th2, aVar, aVar.f72780r0);
            }

            @Override // io.reactivex.Observer
            public final void onNext(Object obj) {
                a.this.a();
            }

            @Override // io.reactivex.Observer
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(Observer<? super T> observer, Subject<Throwable> subject, ObservableSource<T> observableSource) {
            this.f72778p0 = observer;
            this.f72781s0 = subject;
            this.v0 = observableSource;
        }

        public final void a() {
            if (this.f72779q0.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f72784w0) {
                        this.f72784w0 = true;
                        this.v0.subscribe(this);
                    }
                    if (this.f72779q0.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f72783u0);
            DisposableHelper.dispose(this.f72782t0);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f72783u0.get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            DisposableHelper.dispose(this.f72782t0);
            HalfSerializer.onComplete(this.f72778p0, this, this.f72780r0);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            DisposableHelper.replace(this.f72783u0, null);
            this.f72784w0 = false;
            this.f72781s0.onNext(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            HalfSerializer.onNext(this.f72778p0, t10, this, this.f72780r0);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.f72783u0, disposable);
        }
    }

    public ObservableRetryWhen(ObservableSource<T> observableSource, Function<? super Observable<Throwable>, ? extends ObservableSource<?>> function) {
        super(observableSource);
        this.f72777p0 = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        Subject<T> serialized = PublishSubject.create().toSerialized();
        try {
            ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f72777p0.apply(serialized), "The handler returned a null ObservableSource");
            a aVar = new a(observer, serialized, this.source);
            observer.onSubscribe(aVar);
            observableSource.subscribe(aVar.f72782t0);
            aVar.a();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}
