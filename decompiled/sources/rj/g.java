package rj;

import io.reactivex.rxjava3.annotations.NonNull;

/* JADX INFO: compiled from: RunnableDisposable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class g extends f<Runnable> {
    @Override // rj.f
    public final void a(@NonNull Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
