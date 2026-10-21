package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFromUnsafeSource<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f76740p0;

    public ObservableFromUnsafeSource(ObservableSource<T> observableSource) {
        this.f76740p0 = observableSource;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f76740p0.subscribe(observer);
    }
}
