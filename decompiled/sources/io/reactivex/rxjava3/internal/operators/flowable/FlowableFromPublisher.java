package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFromPublisher<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<? extends T> f74940q0;

    public FlowableFromPublisher(Publisher<? extends T> publisher) {
        this.f74940q0 = publisher;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.f74940q0.subscribe(subscriber);
    }
}
