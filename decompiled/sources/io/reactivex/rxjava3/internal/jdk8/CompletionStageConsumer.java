package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletionStageConsumer<T> extends CompletableFuture<T> implements MaybeObserver<T>, SingleObserver<T>, CompletableObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<Disposable> f74008p0 = new AtomicReference<>();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f74009q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final T f74010r0;

    public CompletionStageConsumer(boolean z10, T t10) {
        this.f74009q0 = z10;
        this.f74010r0 = t10;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        DisposableHelper.dispose(this.f74008p0);
        return super.cancel(z10);
    }

    @Override // java.util.concurrent.CompletableFuture
    public boolean complete(T t10) {
        DisposableHelper.dispose(this.f74008p0);
        return super.complete(t10);
    }

    @Override // java.util.concurrent.CompletableFuture
    public boolean completeExceptionally(Throwable th2) {
        DisposableHelper.dispose(this.f74008p0);
        return super.completeExceptionally(th2);
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onComplete() {
        if (this.f74009q0) {
            complete(this.f74010r0);
        } else {
            completeExceptionally(new NoSuchElementException("The source was empty"));
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onError(Throwable th2) {
        this.f74008p0.lazySet(DisposableHelper.DISPOSED);
        if (completeExceptionally(th2)) {
            return;
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onSubscribe(@NonNull Disposable disposable) {
        DisposableHelper.setOnce(this.f74008p0, disposable);
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(@NonNull T t10) {
        this.f74008p0.lazySet(DisposableHelper.DISPOSED);
        complete(t10);
    }
}
