package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFlattenStreamAsObservable<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Single<T> f74170p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Stream<? extends R>> f74171q0;

    public SingleFlattenStreamAsObservable(Single<T> single, Function<? super T, ? extends Stream<? extends R>> function) {
        this.f74170p0 = single;
        this.f74171q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(@NonNull Observer<? super R> observer) {
        this.f74170p0.subscribe(new MaybeFlattenStreamAsObservable.a(observer, this.f74171q0));
    }
}
