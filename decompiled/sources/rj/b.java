package rj;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: compiled from: AutoCloseableDisposable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b extends f<AutoCloseable> {
    @Override // rj.f
    public final void a(@NonNull AutoCloseable autoCloseable) {
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "AutoCloseableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
