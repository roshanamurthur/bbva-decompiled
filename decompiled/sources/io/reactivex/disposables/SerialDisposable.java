package io.reactivex.disposables;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class SerialDisposable implements Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<Disposable> f69885p0;

    public SerialDisposable() {
        this.f69885p0 = new AtomicReference<>();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this.f69885p0);
    }

    @Nullable
    public Disposable get() {
        Disposable disposable = this.f69885p0.get();
        return disposable == DisposableHelper.DISPOSED ? Disposables.disposed() : disposable;
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f69885p0.get());
    }

    public boolean replace(@Nullable Disposable disposable) {
        return DisposableHelper.replace(this.f69885p0, disposable);
    }

    public boolean set(@Nullable Disposable disposable) {
        return DisposableHelper.set(this.f69885p0, disposable);
    }

    public SerialDisposable(@Nullable Disposable disposable) {
        this.f69885p0 = new AtomicReference<>(disposable);
    }
}
