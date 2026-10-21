package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: DisposeOnCancel.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b implements Future<Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Disposable f73730p0;

    public b(Disposable disposable) {
        this.f73730p0 = disposable;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        this.f73730p0.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return null;
    }
}
