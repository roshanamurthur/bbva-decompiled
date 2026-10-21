package rj;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: FutureDisposable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class e extends AtomicReference<Future<?>> implements Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f93100p0;

    public e(Future<?> future, boolean z10) {
        super(future);
        this.f93100p0 = z10;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        Future<?> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.cancel(this.f93100p0);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == null || future.isDone();
    }
}
