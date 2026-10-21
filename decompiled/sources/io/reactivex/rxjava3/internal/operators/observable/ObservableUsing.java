package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableUsing<T, D> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<? extends D> f77336p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super D, ? extends ObservableSource<? extends T>> f77337q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Consumer<? super D> f77338r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f77339s0;

    public static final class a<T, D> extends AtomicBoolean implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77340p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final D f77341q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Consumer<? super D> f77342r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f77343s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f77344t0;

        public a(Observer<? super T> observer, D d2, Consumer<? super D> consumer, boolean z10) {
            this.f77340p0 = observer;
            this.f77341q0 = d2;
            this.f77342r0 = consumer;
            this.f77343s0 = z10;
        }

        public final void a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f77342r0.accept(this.f77341q0);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f77343s0) {
                a();
                this.f77344t0.dispose();
                this.f77344t0 = DisposableHelper.DISPOSED;
            } else {
                this.f77344t0.dispose();
                this.f77344t0 = DisposableHelper.DISPOSED;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            boolean z10 = this.f77343s0;
            Observer<? super T> observer = this.f77340p0;
            if (!z10) {
                observer.onComplete();
                this.f77344t0.dispose();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f77342r0.accept(this.f77341q0);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    observer.onError(th2);
                    return;
                }
            }
            this.f77344t0.dispose();
            observer.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            boolean z10 = this.f77343s0;
            Observer<? super T> observer = this.f77340p0;
            if (!z10) {
                observer.onError(th2);
                this.f77344t0.dispose();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f77342r0.accept(this.f77341q0);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    th2 = new CompositeException(th2, th3);
                }
            }
            this.f77344t0.dispose();
            observer.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f77340p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77344t0, disposable)) {
                this.f77344t0 = disposable;
                this.f77340p0.onSubscribe(this);
            }
        }
    }

    public ObservableUsing(Supplier<? extends D> supplier, Function<? super D, ? extends ObservableSource<? extends T>> function, Consumer<? super D> consumer, boolean z10) {
        this.f77336p0 = supplier;
        this.f77337q0 = function;
        this.f77338r0 = consumer;
        this.f77339s0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        Consumer<? super D> consumer = this.f77338r0;
        try {
            D d2 = this.f77336p0.get();
            try {
                ObservableSource<? extends T> observableSourceApply = this.f77337q0.apply(d2);
                Objects.requireNonNull(observableSourceApply, "The sourceSupplier returned a null ObservableSource");
                observableSourceApply.subscribe(new a(observer, d2, consumer, this.f77339s0));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                try {
                    consumer.accept(d2);
                    EmptyDisposable.error(th2, observer);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    EmptyDisposable.error(new CompositeException(th2, th3), observer);
                }
            }
        } catch (Throwable th4) {
            Exceptions.throwIfFatal(th4);
            EmptyDisposable.error(th4, observer);
        }
    }
}
