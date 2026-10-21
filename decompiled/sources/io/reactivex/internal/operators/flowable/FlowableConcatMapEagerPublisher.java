package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableConcatMapEagerPublisher<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<T> f70385q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends R>> f70386r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f70387s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f70388t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ErrorMode f70389u0;

    public FlowableConcatMapEagerPublisher(Publisher<T> publisher, Function<? super T, ? extends Publisher<? extends R>> function, int i10, int i11, ErrorMode errorMode) {
        this.f70385q0 = publisher;
        this.f70386r0 = function;
        this.f70387s0 = i10;
        this.f70388t0 = i11;
        this.f70389u0 = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f70385q0.subscribe(new FlowableConcatMapEager.a(subscriber, this.f70386r0, this.f70387s0, this.f70388t0, this.f70389u0));
    }
}
