package sj;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ObservableStageObserver.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class b<T> extends CompletableFuture<T> implements Observer<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<Disposable> f93226p0 = new AtomicReference<>();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public T f93227q0;

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        disposeUpstream();
        return super.cancel(z10);
    }

    public final void clear() {
        this.f93227q0 = null;
        this.f93226p0.lazySet(DisposableHelper.DISPOSED);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean complete(T t10) {
        disposeUpstream();
        return super.complete(t10);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean completeExceptionally(Throwable th2) {
        disposeUpstream();
        return super.completeExceptionally(th2);
    }

    public final void disposeUpstream() {
        DisposableHelper.dispose(this.f93226p0);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th2) {
        clear();
        if (completeExceptionally(th2)) {
            return;
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(@NonNull Disposable disposable) {
        DisposableHelper.setOnce(this.f93226p0, disposable);
    }
}
