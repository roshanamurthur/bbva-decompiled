package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import java.util.Objects;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelConcatMap<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f77467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends R>> f77468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f77469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ErrorMode f77470d;

    public ParallelConcatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends Publisher<? extends R>> function, int i10, ErrorMode errorMode) {
        this.f77467a = parallelFlowable;
        Objects.requireNonNull(function, "mapper");
        this.f77468b = function;
        this.f77469c = i10;
        Objects.requireNonNull(errorMode, "errorMode");
        this.f77470d = errorMode;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public int parallelism() {
        return this.f77467a.parallelism();
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                subscriberArr2[i10] = FlowableConcatMap.subscribe(subscriberArr[i10], this.f77468b, this.f77469c, this.f77470d);
            }
            this.f77467a.subscribe(subscriberArr2);
        }
    }
}
