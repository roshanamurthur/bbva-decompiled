package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableMapPublisher<T, U> extends Flowable<U> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<T> f70807q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends U> f70808r0;

    public FlowableMapPublisher(Publisher<T> publisher, Function<? super T, ? extends U> function) {
        this.f70807q0 = publisher;
        this.f70808r0 = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        this.f70807q0.subscribe(new FlowableMap.b(subscriber, this.f70808r0));
    }
}
