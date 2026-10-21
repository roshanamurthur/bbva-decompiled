package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: DisposeOnCancel.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b implements Future<Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Disposable f78021p0;

    public b(Disposable disposable) {
        this.f78021p0 = disposable;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        this.f78021p0.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
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
    public final Object get(long j10, @NonNull TimeUnit timeUnit) {
        return null;
    }
}
