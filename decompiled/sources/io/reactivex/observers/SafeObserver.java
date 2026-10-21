package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class SafeObserver<T> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observer<? super T> f73818p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Disposable f73819q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f73820r0;

    public SafeObserver(@NonNull Observer<? super T> observer) {
        this.f73818p0 = observer;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.f73819q0.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f73819q0.isDisposed();
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f73820r0) {
            return;
        }
        this.f73820r0 = true;
        Disposable disposable = this.f73819q0;
        Observer<? super T> observer = this.f73818p0;
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

    @Override // io.reactivex.Observer
    public void onError(@NonNull Throwable th2) {
        if (this.f73820r0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f73820r0 = true;
        Disposable disposable = this.f73819q0;
        Observer<? super T> observer = this.f73818p0;
        if (disposable != null) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
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

    @Override // io.reactivex.Observer
    public void onNext(@NonNull T t10) {
        if (this.f73820r0) {
            return;
        }
        Disposable disposable = this.f73819q0;
        Observer<? super T> observer = this.f73818p0;
        if (disposable == null) {
            this.f73820r0 = true;
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
            NullPointerException nullPointerException2 = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f73819q0.dispose();
                onError(nullPointerException2);
                return;
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                onError(new CompositeException(nullPointerException2, th4));
                return;
            }
        }
        try {
            observer.onNext(t10);
        } catch (Throwable th5) {
            Exceptions.throwIfFatal(th5);
            try {
                this.f73819q0.dispose();
                onError(th5);
            } catch (Throwable th6) {
                Exceptions.throwIfFatal(th6);
                onError(new CompositeException(th5, th6));
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(@NonNull Disposable disposable) {
        if (DisposableHelper.validate(this.f73819q0, disposable)) {
            this.f73819q0 = disposable;
            try {
                this.f73818p0.onSubscribe(this);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f73820r0 = true;
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
