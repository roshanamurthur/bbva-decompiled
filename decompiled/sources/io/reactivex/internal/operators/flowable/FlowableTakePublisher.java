package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableTakePublisher<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<T> f71253q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f71254r0;

    public FlowableTakePublisher(Publisher<T> publisher, long j10) {
        this.f71253q0 = publisher;
        this.f71254r0 = j10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.f71253q0.subscribe(new FlowableTake.a(subscriber, this.f71254r0));
    }
}
