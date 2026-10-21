package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.observables.ConnectableObservable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableAutoConnect<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ConnectableObservable<? extends T> f72065p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f72066q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Consumer<? super Disposable> f72067r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicInteger f72068s0 = new AtomicInteger();

    public ObservableAutoConnect(ConnectableObservable<? extends T> connectableObservable, int i10, Consumer<? super Disposable> consumer) {
        this.f72065p0 = connectableObservable;
        this.f72066q0 = i10;
        this.f72067r0 = consumer;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        ConnectableObservable<? extends T> connectableObservable = this.f72065p0;
        connectableObservable.subscribe((Observer<? super Object>) observer);
        if (this.f72068s0.incrementAndGet() == this.f72066q0) {
            connectableObservable.connect(this.f72067r0);
        }
    }
}
