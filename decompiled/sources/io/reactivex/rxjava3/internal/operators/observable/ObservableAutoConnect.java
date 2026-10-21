package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableAutoConnect<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ConnectableObservable<? extends T> f76329p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f76330q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Consumer<? super Disposable> f76331r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicInteger f76332s0 = new AtomicInteger();

    public ObservableAutoConnect(ConnectableObservable<? extends T> connectableObservable, int i10, Consumer<? super Disposable> consumer) {
        this.f76329p0 = connectableObservable;
        this.f76330q0 = i10;
        this.f76331r0 = consumer;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        ConnectableObservable<? extends T> connectableObservable = this.f76329p0;
        connectableObservable.subscribe((Observer<? super Object>) observer);
        if (this.f76332s0.incrementAndGet() == this.f76330q0) {
            connectableObservable.connect(this.f76331r0);
        }
    }
}
