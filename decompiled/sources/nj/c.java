package nj;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ReferenceDisposable.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c<T> extends AtomicReference<T> implements Disposable {
    public c(T t10) {
        super(ObjectHelper.requireNonNull(t10, "value is null"));
    }

    public abstract void a(@NonNull T t10);

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return get() == null;
    }
}
