package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import java.util.stream.Stream;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelFlatMapStream<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f74141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function<? super T, ? extends Stream<? extends R>> f74142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f74143c;

    public ParallelFlatMapStream(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends Stream<? extends R>> function, int i10) {
        this.f74141a = parallelFlowable;
        this.f74142b = function;
        this.f74143c = i10;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public int parallelism() {
        return this.f74141a.parallelism();
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                subscriberArr2[i10] = FlowableFlatMapStream.subscribe(subscriberArr[i10], this.f74142b, this.f74143c);
            }
            this.f74141a.subscribe(subscriberArr2);
        }
    }
}
