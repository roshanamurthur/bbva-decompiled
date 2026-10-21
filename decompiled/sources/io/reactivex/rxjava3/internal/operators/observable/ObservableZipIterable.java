package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableZipIterable<T, U, V> extends Observable<V> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observable<? extends T> f77449p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Iterable<U> f77450q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiFunction<? super T, ? super U, ? extends V> f77451r0;

    public static final class a<T, U, V> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super V> f77452p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Iterator<U> f77453q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final BiFunction<? super T, ? super U, ? extends V> f77454r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f77455s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f77456t0;

        public a(Observer<? super V> observer, Iterator<U> it, BiFunction<? super T, ? super U, ? extends V> biFunction) {
            this.f77452p0 = observer;
            this.f77453q0 = it;
            this.f77454r0 = biFunction;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77455s0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77455s0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f77456t0) {
                return;
            }
            this.f77456t0 = true;
            this.f77452p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f77456t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77456t0 = true;
                this.f77452p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            Observer<? super V> observer = this.f77452p0;
            Iterator<U> it = this.f77453q0;
            if (this.f77456t0) {
                return;
            }
            try {
                U next = it.next();
                Objects.requireNonNull(next, "The iterator returned a null value");
                try {
                    V vApply = this.f77454r0.apply(t10, next);
                    Objects.requireNonNull(vApply, "The zipper function returned a null value");
                    observer.onNext(vApply);
                    try {
                        if (it.hasNext()) {
                            return;
                        }
                        this.f77456t0 = true;
                        this.f77455s0.dispose();
                        observer.onComplete();
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f77456t0 = true;
                        this.f77455s0.dispose();
                        observer.onError(th2);
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.f77456t0 = true;
                    this.f77455s0.dispose();
                    observer.onError(th3);
                }
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                this.f77456t0 = true;
                this.f77455s0.dispose();
                observer.onError(th4);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77455s0, disposable)) {
                this.f77455s0 = disposable;
                this.f77452p0.onSubscribe(this);
            }
        }
    }

    public ObservableZipIterable(Observable<? extends T> observable, Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        this.f77449p0 = observable;
        this.f77450q0 = iterable;
        this.f77451r0 = biFunction;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super V> observer) {
        try {
            Iterator<U> it = this.f77450q0.iterator();
            Objects.requireNonNull(it, "The iterator returned by other is null");
            Iterator<U> it2 = it;
            try {
                if (!it2.hasNext()) {
                    EmptyDisposable.complete(observer);
                } else {
                    this.f77449p0.subscribe(new a(observer, it2, this.f77451r0));
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
