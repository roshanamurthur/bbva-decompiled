package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;
import sj.b;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFirstStageObserver<T> extends b<T> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f74101r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final T f74102s0;

    public ObservableFirstStageObserver(boolean z10, T t10) {
        this.f74101r0 = z10;
        this.f74102s0 = t10;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        if (isDone()) {
            return;
        }
        clear();
        if (this.f74101r0) {
            complete(this.f74102s0);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t10) {
        complete(t10);
    }
}
