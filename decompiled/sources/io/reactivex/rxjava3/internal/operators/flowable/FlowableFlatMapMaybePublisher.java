package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.functions.Function;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFlatMapMaybePublisher<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<T> f74885q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends MaybeSource<? extends R>> f74886r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f74887s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f74888t0;

    public FlowableFlatMapMaybePublisher(Publisher<T> publisher, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10, int i10) {
        this.f74885q0 = publisher;
        this.f74886r0 = function;
        this.f74887s0 = z10;
        this.f74888t0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f74885q0.subscribe(new FlowableFlatMapMaybe.a(this.f74888t0, this.f74886r0, subscriber, this.f74887s0));
    }
}
