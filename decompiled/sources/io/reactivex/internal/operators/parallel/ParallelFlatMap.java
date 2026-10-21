package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.parallel.ParallelFlowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelFlatMap<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f73251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends R>> f73252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f73253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f73254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f73255e;

    public ParallelFlatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends Publisher<? extends R>> function, boolean z10, int i10, int i11) {
        this.f73251a = parallelFlowable;
        this.f73252b = function;
        this.f73253c = z10;
        this.f73254d = i10;
        this.f73255e = i11;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f73251a.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                subscriberArr2[i10] = FlowableFlatMap.subscribe(subscriberArr[i10], this.f73252b, this.f73253c, this.f73254d, this.f73255e);
            }
            this.f73251a.subscribe(subscriberArr2);
        }
    }
}
