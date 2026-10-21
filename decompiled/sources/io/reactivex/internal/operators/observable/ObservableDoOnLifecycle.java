package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.DisposableLambdaObserver;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDoOnLifecycle<T> extends a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Consumer<? super Disposable> f72341p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f72342q0;

    public ObservableDoOnLifecycle(Observable<T> observable, Consumer<? super Disposable> consumer, Action action) {
        super(observable);
        this.f72341p0 = consumer;
        this.f72342q0 = action;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new DisposableLambdaObserver(observer, this.f72341p0, this.f72342q0));
    }
}
