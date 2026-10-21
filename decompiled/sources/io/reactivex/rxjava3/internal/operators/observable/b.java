package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.subjects.Subject;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: ObservableWindowSubscribeIntercept.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Subject<T> f77459p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicBoolean f77460q0 = new AtomicBoolean();

    public b(UnicastSubject unicastSubject) {
        this.f77459p0 = unicastSubject;
    }

    public final boolean d() {
        AtomicBoolean atomicBoolean = this.f77460q0;
        return !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer<? super T> observer) {
        this.f77459p0.subscribe(observer);
        this.f77460q0.set(true);
    }
}
