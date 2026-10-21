package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableTakePublisher<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<T> f75509q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f75510r0;

    public FlowableTakePublisher(Publisher<T> publisher, long j10) {
        this.f75509q0 = publisher;
        this.f75510r0 = j10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.f75509q0.subscribe(new FlowableTake.a(subscriber, this.f75510r0));
    }
}
