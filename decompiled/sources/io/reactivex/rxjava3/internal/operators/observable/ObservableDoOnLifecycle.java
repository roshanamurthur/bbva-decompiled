package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.observers.DisposableLambdaObserver;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDoOnLifecycle<T> extends a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Consumer<? super Disposable> f76622p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f76623q0;

    public ObservableDoOnLifecycle(Observable<T> observable, Consumer<? super Disposable> consumer, Action action) {
        super(observable);
        this.f76622p0 = consumer;
        this.f76623q0 = action;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new DisposableLambdaObserver(observer, this.f76622p0, this.f76623q0));
    }
}
