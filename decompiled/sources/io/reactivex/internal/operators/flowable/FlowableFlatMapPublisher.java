package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableFlatMapPublisher<T, U> extends Flowable<U> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<T> f70618q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends U>> f70619r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f70620s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f70621t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f70622u0;

    public FlowableFlatMapPublisher(Publisher<T> publisher, Function<? super T, ? extends Publisher<? extends U>> function, boolean z10, int i10, int i11) {
        this.f70618q0 = publisher;
        this.f70619r0 = function;
        this.f70620s0 = z10;
        this.f70621t0 = i10;
        this.f70622u0 = i11;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        Publisher<T> publisher = this.f70618q0;
        Function<? super T, ? extends Publisher<? extends U>> function = this.f70619r0;
        if (FlowableScalarXMap.tryScalarXMapSubscribe(publisher, subscriber, function)) {
            return;
        }
        publisher.subscribe(FlowableFlatMap.subscribe(subscriber, function, this.f70620s0, this.f70621t0, this.f70622u0));
    }
}
