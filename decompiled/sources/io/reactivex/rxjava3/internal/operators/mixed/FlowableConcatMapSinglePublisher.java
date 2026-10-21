package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatMapSinglePublisher<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<T> f76126q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends SingleSource<? extends R>> f76127r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ErrorMode f76128s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f76129t0;

    public FlowableConcatMapSinglePublisher(Publisher<T> publisher, Function<? super T, ? extends SingleSource<? extends R>> function, ErrorMode errorMode, int i10) {
        this.f76126q0 = publisher;
        this.f76127r0 = function;
        this.f76128s0 = errorMode;
        this.f76129t0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f76126q0.subscribe(new FlowableConcatMapSingle.a(subscriber, this.f76127r0, this.f76129t0, this.f76128s0));
    }
}
