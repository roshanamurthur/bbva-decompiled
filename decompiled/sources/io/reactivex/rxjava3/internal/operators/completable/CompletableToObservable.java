package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromCompletable;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableToObservable<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f74405p0;

    public CompletableToObservable(CompletableSource completableSource) {
        this.f74405p0 = completableSource;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f74405p0.subscribe(new ObservableFromCompletable.FromCompletableObserver(observer));
    }
}
