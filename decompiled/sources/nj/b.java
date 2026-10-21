package nj;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: FutureDisposable.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends AtomicReference<Future<?>> implements Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f85223p0;

    public b(Future<?> future, boolean z10) {
        super(future);
        this.f85223p0 = z10;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Future<?> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.cancel(this.f85223p0);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == null || future.isDone();
    }
}
