package io.reactivex.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ResourceCompletableObserver implements CompletableObserver, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<Disposable> f73810p0 = new AtomicReference<>();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ListCompositeDisposable f73811q0 = new ListCompositeDisposable();

    public final void add(@NonNull Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "resource is null");
        this.f73811q0.add(disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (DisposableHelper.dispose(this.f73810p0)) {
            this.f73811q0.dispose();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f73810p0.get());
    }

    @Override // io.reactivex.CompletableObserver
    public final void onSubscribe(@NonNull Disposable disposable) {
        if (EndConsumerHelper.setOnce(this.f73810p0, disposable, getClass())) {
            onStart();
        }
    }

    public void onStart() {
    }
}
