package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableUsing<T, D> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<? extends D> f73059p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super D, ? extends ObservableSource<? extends T>> f73060q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Consumer<? super D> f73061r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f73062s0;

    public static final class a<T, D> extends AtomicBoolean implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f73063p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final D f73064q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Consumer<? super D> f73065r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f73066s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f73067t0;

        public a(Observer<? super T> observer, D d2, Consumer<? super D> consumer, boolean z10) {
            this.f73063p0 = observer;
            this.f73064q0 = d2;
            this.f73065r0 = consumer;
            this.f73066s0 = z10;
        }

        public final void a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f73065r0.accept(this.f73064q0);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            a();
            this.f73067t0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            boolean z10 = this.f73066s0;
            Observer<? super T> observer = this.f73063p0;
            if (!z10) {
                observer.onComplete();
                this.f73067t0.dispose();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f73065r0.accept(this.f73064q0);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    observer.onError(th2);
                    return;
                }
            }
            this.f73067t0.dispose();
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            boolean z10 = this.f73066s0;
            Observer<? super T> observer = this.f73063p0;
            if (!z10) {
                observer.onError(th2);
                this.f73067t0.dispose();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f73065r0.accept(this.f73064q0);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    th2 = new CompositeException(th2, th3);
                }
            }
            this.f73067t0.dispose();
            observer.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f73063p0.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73067t0, disposable)) {
                this.f73067t0 = disposable;
                this.f73063p0.onSubscribe(this);
            }
        }
    }

    public ObservableUsing(Callable<? extends D> callable, Function<? super D, ? extends ObservableSource<? extends T>> function, Consumer<? super D> consumer, boolean z10) {
        this.f73059p0 = callable;
        this.f73060q0 = function;
        this.f73061r0 = consumer;
        this.f73062s0 = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        Consumer<? super D> consumer = this.f73061r0;
        try {
            D dCall = this.f73059p0.call();
            try {
                ((ObservableSource) ObjectHelper.requireNonNull(this.f73060q0.apply(dCall), "The sourceSupplier returned a null ObservableSource")).subscribe(new a(observer, dCall, consumer, this.f73062s0));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                try {
                    consumer.accept(dCall);
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
