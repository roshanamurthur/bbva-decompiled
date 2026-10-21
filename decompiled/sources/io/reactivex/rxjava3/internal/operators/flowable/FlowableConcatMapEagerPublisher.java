package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatMapEagerPublisher<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<T> f74640q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends R>> f74641r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f74642s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f74643t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ErrorMode f74644u0;

    public FlowableConcatMapEagerPublisher(Publisher<T> publisher, Function<? super T, ? extends Publisher<? extends R>> function, int i10, int i11, ErrorMode errorMode) {
        this.f74640q0 = publisher;
        this.f74641r0 = function;
        this.f74642s0 = i10;
        this.f74643t0 = i11;
        this.f74644u0 = errorMode;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f74640q0.subscribe(new FlowableConcatMapEager.a(subscriber, this.f74641r0, this.f74642s0, this.f74643t0, this.f74644u0));
    }
}
