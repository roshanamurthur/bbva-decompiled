package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.ListCompositeDisposable;
import io.reactivex.rxjava3.internal.util.EndConsumerHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ResourceSingleObserver<T> implements SingleObserver<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<Disposable> f78226p0 = new AtomicReference<>();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ListCompositeDisposable f78227q0 = new ListCompositeDisposable();

    public final void add(@NonNull Disposable disposable) {
        Objects.requireNonNull(disposable, "resource is null");
        this.f78227q0.add(disposable);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (DisposableHelper.dispose(this.f78226p0)) {
            this.f78227q0.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f78226p0.get());
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(@NonNull Disposable disposable) {
        if (EndConsumerHelper.setOnce(this.f78226p0, disposable, getClass())) {
            onStart();
        }
    }

    public void onStart() {
    }
}
