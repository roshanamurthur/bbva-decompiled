package rj;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ReferenceDisposable.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class f<T> extends AtomicReference<T> implements Disposable {
    public abstract void a(@NonNull T t10);

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get() == null;
    }
}
