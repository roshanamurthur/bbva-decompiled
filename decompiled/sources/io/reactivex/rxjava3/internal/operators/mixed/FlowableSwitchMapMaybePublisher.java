package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.functions.Function;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSwitchMapMaybePublisher<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<T> f76158q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends MaybeSource<? extends R>> f76159r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f76160s0;

    public FlowableSwitchMapMaybePublisher(Publisher<T> publisher, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10) {
        this.f76158q0 = publisher;
        this.f76159r0 = function;
        this.f76160s0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f76158q0.subscribe(new FlowableSwitchMapMaybe.a(subscriber, this.f76159r0, this.f76160s0));
    }
}
