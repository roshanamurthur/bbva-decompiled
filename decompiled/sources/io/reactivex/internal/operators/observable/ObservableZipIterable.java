package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableZipIterable<T, U, V> extends Observable<V> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observable<? extends T> f73200p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Iterable<U> f73201q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiFunction<? super T, ? super U, ? extends V> f73202r0;

    public static final class a<T, U, V> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super V> f73203p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Iterator<U> f73204q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final BiFunction<? super T, ? super U, ? extends V> f73205r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f73206s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f73207t0;

        public a(Observer<? super V> observer, Iterator<U> it, BiFunction<? super T, ? super U, ? extends V> biFunction) {
            this.f73203p0 = observer;
            this.f73204q0 = it;
            this.f73205r0 = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f73206s0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73206s0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f73207t0) {
                return;
            }
            this.f73207t0 = true;
            this.f73203p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f73207t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73207t0 = true;
                this.f73203p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            Observer<? super V> observer = this.f73203p0;
            Iterator<U> it = this.f73204q0;
            if (this.f73207t0) {
                return;
            }
            try {
                try {
                    observer.onNext((Object) ObjectHelper.requireNonNull(this.f73205r0.apply(t10, ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (it.hasNext()) {
                            return;
                        }
                        this.f73207t0 = true;
                        this.f73206s0.dispose();
                        observer.onComplete();
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f73207t0 = true;
                        this.f73206s0.dispose();
                        observer.onError(th2);
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.f73207t0 = true;
                    this.f73206s0.dispose();
                    observer.onError(th3);
                }
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                this.f73207t0 = true;
                this.f73206s0.dispose();
                observer.onError(th4);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73206s0, disposable)) {
                this.f73206s0 = disposable;
                this.f73203p0.onSubscribe(this);
            }
        }
    }

    public ObservableZipIterable(Observable<? extends T> observable, Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        this.f73200p0 = observable;
        this.f73201q0 = iterable;
        this.f73202r0 = biFunction;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super V> observer) {
        try {
            Iterator it = (Iterator) ObjectHelper.requireNonNull(this.f73201q0.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(observer);
                } else {
                    this.f73200p0.subscribe(new a(observer, it, this.f73202r0));
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptyDisposable.error(th2, observer);
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptyDisposable.error(th3, observer);
        }
    }
}
