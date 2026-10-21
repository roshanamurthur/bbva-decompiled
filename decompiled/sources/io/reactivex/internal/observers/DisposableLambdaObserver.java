package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes8.dex */
public final class DisposableLambdaObserver<T> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observer<? super T> f69945p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super Disposable> f69946q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Action f69947r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Disposable f69948s0;

    public DisposableLambdaObserver(Observer<? super T> observer, Consumer<? super Disposable> consumer, Action action) {
        this.f69945p0 = observer;
        this.f69946q0 = consumer;
        this.f69947r0 = action;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        Disposable disposable = this.f69948s0;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper) {
            this.f69948s0 = disposableHelper;
            try {
                this.f69947r0.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            disposable.dispose();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f69948s0.isDisposed();
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        Disposable disposable = this.f69948s0;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper) {
            this.f69948s0 = disposableHelper;
            this.f69945p0.onComplete();
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        Disposable disposable = this.f69948s0;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable == disposableHelper) {
            RxJavaPlugins.onError(th2);
        } else {
            this.f69948s0 = disposableHelper;
            this.f69945p0.onError(th2);
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t10) {
        this.f69945p0.onNext(t10);
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        Observer<? super T> observer = this.f69945p0;
        try {
            this.f69946q0.accept(disposable);
            if (DisposableHelper.validate(this.f69948s0, disposable)) {
                this.f69948s0 = disposable;
                observer.onSubscribe(this);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            disposable.dispose();
            this.f69948s0 = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th2, observer);
        }
    }
}
