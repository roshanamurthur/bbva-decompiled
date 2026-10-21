package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class SafeCompletableObserver implements CompletableObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableObserver f74223p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f74224q0;

    public SafeCompletableObserver(CompletableObserver completableObserver) {
        this.f74223p0 = completableObserver;
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public void onComplete() {
        if (this.f74224q0) {
            return;
        }
        try {
            this.f74223p0.onComplete();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public void onError(@NonNull Throwable th2) {
        if (this.f74224q0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        try {
            this.f74223p0.onError(th2);
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            RxJavaPlugins.onError(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public void onSubscribe(@NonNull Disposable disposable) {
        try {
            this.f74223p0.onSubscribe(disposable);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            this.f74224q0 = true;
            disposable.dispose();
            RxJavaPlugins.onError(th2);
        }
    }
}
