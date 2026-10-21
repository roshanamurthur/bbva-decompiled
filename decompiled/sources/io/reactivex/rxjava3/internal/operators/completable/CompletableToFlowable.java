package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromCompletable;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableToFlowable<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CompletableSource f74404q0;

    public CompletableToFlowable(CompletableSource completableSource) {
        this.f74404q0 = completableSource;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.f74404q0.subscribe(new FlowableFromCompletable.FromCompletableObserver(subscriber));
    }
}
