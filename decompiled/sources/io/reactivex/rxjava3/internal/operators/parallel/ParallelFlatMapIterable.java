package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlattenIterable;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelFlatMapIterable<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f77507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function<? super T, ? extends Iterable<? extends R>> f77508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f77509c;

    public ParallelFlatMapIterable(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends Iterable<? extends R>> function, int i10) {
        this.f77507a = parallelFlowable;
        this.f77508b = function;
        this.f77509c = i10;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public int parallelism() {
        return this.f77507a.parallelism();
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                subscriberArr2[i10] = FlowableFlattenIterable.subscribe(subscriberArr[i10], this.f77508b, this.f77509c);
            }
            this.f77507a.subscribe(subscriberArr2);
        }
    }
}
