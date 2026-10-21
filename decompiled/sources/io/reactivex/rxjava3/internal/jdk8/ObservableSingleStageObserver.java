package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;
import sj.b;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSingleStageObserver<T> extends b<T> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f74124r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final T f74125s0;

    public ObservableSingleStageObserver(boolean z10, T t10) {
        this.f74124r0 = z10;
        this.f74125s0 = t10;
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
        } else if (this.f74124r0) {
            complete(this.f74125s0);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t10) {
        if (this.f93227q0 == null) {
            this.f93227q0 = t10;
        } else {
            this.f93227q0 = null;
            completeExceptionally(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }
}
