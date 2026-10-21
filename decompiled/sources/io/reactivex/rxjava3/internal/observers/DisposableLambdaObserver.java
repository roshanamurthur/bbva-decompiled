package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class DisposableLambdaObserver<T> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observer<? super T> f74198p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super Disposable> f74199q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Action f74200r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Disposable f74201s0;

    public DisposableLambdaObserver(Observer<? super T> observer, Consumer<? super Disposable> consumer, Action action) {
        this.f74198p0 = observer;
        this.f74199q0 = consumer;
        this.f74200r0 = action;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        Disposable disposable = this.f74201s0;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper) {
            this.f74201s0 = disposableHelper;
            try {
                this.f74200r0.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f74201s0.isDisposed();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        Disposable disposable = this.f74201s0;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper) {
            this.f74201s0 = disposableHelper;
            this.f74198p0.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th2) {
        Disposable disposable = this.f74201s0;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable == disposableHelper) {
            RxJavaPlugins.onError(th2);
        } else {
            this.f74201s0 = disposableHelper;
            this.f74198p0.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t10) {
        this.f74198p0.onNext(t10);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(Disposable disposable) {
        Observer<? super T> observer = this.f74198p0;
        try {
            this.f74199q0.accept(disposable);
            if (DisposableHelper.validate(this.f74201s0, disposable)) {
                this.f74201s0 = disposable;
                observer.onSubscribe(this);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            disposable.dispose();
            this.f74201s0 = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th2, observer);
        }
    }
}
