package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import rj.d;

/* JADX INFO: loaded from: classes12.dex */
public final class SerialDisposable implements Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<Disposable> f73960p0;

    public SerialDisposable() {
        this.f73960p0 = new AtomicReference<>();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this.f73960p0);
    }

    @Nullable
    public Disposable get() {
        Disposable disposable = this.f73960p0.get();
        return disposable == DisposableHelper.DISPOSED ? d.a() : disposable;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f73960p0.get());
    }

    public boolean replace(@Nullable Disposable disposable) {
        return DisposableHelper.replace(this.f73960p0, disposable);
    }

    public boolean set(@Nullable Disposable disposable) {
        return DisposableHelper.set(this.f73960p0, disposable);
    }

    public SerialDisposable(@Nullable Disposable disposable) {
        this.f73960p0 = new AtomicReference<>(disposable);
    }
}
