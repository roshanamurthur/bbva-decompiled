package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelFlatMap<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f77502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends R>> f77503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f77504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f77505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f77506e;

    public ParallelFlatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends Publisher<? extends R>> function, boolean z10, int i10, int i11) {
        this.f77502a = parallelFlowable;
        this.f77503b = function;
        this.f77504c = z10;
        this.f77505d = i10;
        this.f77506e = i11;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public int parallelism() {
        return this.f77502a.parallelism();
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                subscriberArr2[i10] = FlowableFlatMap.subscribe(subscriberArr[i10], this.f77503b, this.f77504c, this.f77505d, this.f77506e);
            }
            this.f77502a.subscribe(subscriberArr2);
        }
    }
}
