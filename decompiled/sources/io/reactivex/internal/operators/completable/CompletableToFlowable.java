package io.reactivex.internal.operators.completable;

import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.internal.observers.SubscriberCompletableObserver;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableToFlowable<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CompletableSource f70140q0;

    public CompletableToFlowable(CompletableSource completableSource) {
        this.f70140q0 = completableSource;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.f70140q0.subscribe(new SubscriberCompletableObserver(subscriber));
    }
}
