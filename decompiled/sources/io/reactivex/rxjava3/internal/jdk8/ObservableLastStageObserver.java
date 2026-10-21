package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;
import sj.b;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableLastStageObserver<T> extends b<T> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f74119r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final T f74120s0;

    public ObservableLastStageObserver(boolean z10, T t10) {
        this.f74119r0 = z10;
        this.f74120s0 = t10;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        if (isDone()) {
            return;
        }
        T t10 = this.f93227q0;
        clear();
        if (t10 != null) {
            complete(t10);
        } else if (this.f74119r0) {
            complete(this.f74120s0);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t10) {
        this.f93227q0 = t10;
    }
}
