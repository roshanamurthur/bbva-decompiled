package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableMapPublisher<T, U> extends Flowable<U> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<T> f75079q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends U> f75080r0;

    public FlowableMapPublisher(Publisher<T> publisher, Function<? super T, ? extends U> function) {
        this.f75079q0 = publisher;
        this.f75080r0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        this.f75079q0.subscribe(new FlowableMap.b(subscriber, this.f75080r0));
    }
}
