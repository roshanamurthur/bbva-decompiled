package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatMapMaybePublisher<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<T> f76108q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends MaybeSource<? extends R>> f76109r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ErrorMode f76110s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f76111t0;

    public FlowableConcatMapMaybePublisher(Publisher<T> publisher, Function<? super T, ? extends MaybeSource<? extends R>> function, ErrorMode errorMode, int i10) {
        this.f76108q0 = publisher;
        this.f76109r0 = function;
        this.f76110s0 = errorMode;
        this.f76111t0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f76108q0.subscribe(new FlowableConcatMapMaybe.a(subscriber, this.f76109r0, this.f76111t0, this.f76110s0));
    }
}
