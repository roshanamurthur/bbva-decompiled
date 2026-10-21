package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class SafeObserver<T> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observer<? super T> f78228p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Disposable f78229q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f78230r0;

    public SafeObserver(@NonNull Observer<? super T> observer) {
        this.f78228p0 = observer;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.f78229q0.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f78229q0.isDisposed();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        if (this.f78230r0) {
            return;
        }
        this.f78230r0 = true;
        Disposable disposable = this.f78229q0;
        Observer<? super T> observer = this.f78228p0;
        if (disposable != null) {
            try {
                observer.onComplete();
                return;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            observer.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                observer.onError(nullPointerException);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RxJavaPlugins.onError(new CompositeException(nullPointerException, th3));
            }
        } catch (Throwable th4) {
            Exceptions.throwIfFatal(th4);
            RxJavaPlugins.onError(new CompositeException(nullPointerException, th4));
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(@NonNull Throwable th2) {
        if (this.f78230r0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f78230r0 = true;
        Disposable disposable = this.f78229q0;
        Observer<? super T> observer = this.f78228p0;
        if (disposable != null) {
            if (th2 == null) {
                th2 = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
            }
            try {
                observer.onError(th2);
                return;
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RxJavaPlugins.onError(new CompositeException(th2, th3));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            observer.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                observer.onError(new CompositeException(th2, nullPointerException));
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(new CompositeException(th2, nullPointerException, th4));
            }
        } catch (Throwable th5) {
            Exceptions.throwIfFatal(th5);
            RxJavaPlugins.onError(new CompositeException(th2, nullPointerException, th5));
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(@NonNull T t10) {
        if (this.f78230r0) {
            return;
        }
        Disposable disposable = this.f78229q0;
        Observer<? super T> observer = this.f78228p0;
        if (disposable == null) {
            this.f78230r0 = true;
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                observer.onSubscribe(EmptyDisposable.INSTANCE);
                try {
                    observer.onError(nullPointerException);
                    return;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(new CompositeException(nullPointerException, th2));
                    return;
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RxJavaPlugins.onError(new CompositeException(nullPointerException, th3));
                return;
            }
        }
        if (t10 == null) {
            NullPointerException nullPointerExceptionCreateNullPointerException = ExceptionHelper.createNullPointerException("onNext called with a null value.");
            try {
                this.f78229q0.dispose();
                onError(nullPointerExceptionCreateNullPointerException);
                return;
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                onError(new CompositeException(nullPointerExceptionCreateNullPointerException, th4));
                return;
            }
        }
        try {
            observer.onNext(t10);
        } catch (Throwable th5) {
            Exceptions.throwIfFatal(th5);
            try {
                this.f78229q0.dispose();
                onError(th5);
            } catch (Throwable th6) {
                Exceptions.throwIfFatal(th6);
                onError(new CompositeException(th5, th6));
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(@NonNull Disposable disposable) {
        if (DisposableHelper.validate(this.f78229q0, disposable)) {
            this.f78229q0 = disposable;
            try {
                this.f78228p0.onSubscribe(this);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f78230r0 = true;
                try {
                    disposable.dispose();
                    RxJavaPlugins.onError(th2);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RxJavaPlugins.onError(new CompositeException(th2, th3));
                }
            }
        }
    }
}
