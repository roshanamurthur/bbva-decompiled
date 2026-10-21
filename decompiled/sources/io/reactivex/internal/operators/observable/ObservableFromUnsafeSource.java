package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFromUnsafeSource<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72454p0;

    public ObservableFromUnsafeSource(ObservableSource<T> observableSource) {
        this.f72454p0 = observableSource;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f72454p0.subscribe(observer);
    }
}
