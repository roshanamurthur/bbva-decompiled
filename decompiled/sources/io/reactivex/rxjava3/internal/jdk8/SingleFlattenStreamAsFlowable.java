package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.stream.Stream;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFlattenStreamAsFlowable<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Single<T> f74168q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends Stream<? extends R>> f74169r0;

    public SingleFlattenStreamAsFlowable(Single<T> single, Function<? super T, ? extends Stream<? extends R>> function) {
        this.f74168q0 = single;
        this.f74169r0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(@NonNull Subscriber<? super R> subscriber) {
        this.f74168q0.subscribe(new MaybeFlattenStreamAsFlowable.a(subscriber, this.f74169r0));
    }
}
