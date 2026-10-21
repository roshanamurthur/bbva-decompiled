package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ResourceObserver<T> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<Disposable> f73814p0 = new AtomicReference<>();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ListCompositeDisposable f73815q0 = new ListCompositeDisposable();

    public final void add(@NonNull Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "resource is null");
        this.f73815q0.add(disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (DisposableHelper.dispose(this.f73814p0)) {
            this.f73815q0.dispose();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f73814p0.get());
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (EndConsumerHelper.setOnce(this.f73814p0, disposable, getClass())) {
            onStart();
        }
    }

    public void onStart() {
    }
}
