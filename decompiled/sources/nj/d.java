package nj;

import io.reactivex.annotations.NonNull;

/* JADX INFO: compiled from: RunnableDisposable.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d extends c<Runnable> {
    @Override // nj.c
    public final void a(@NonNull Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
