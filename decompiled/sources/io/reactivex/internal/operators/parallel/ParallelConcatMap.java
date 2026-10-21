package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.parallel.ParallelFlowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelConcatMap<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f73216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends R>> f73217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f73218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ErrorMode f73219d;

    public ParallelConcatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends Publisher<? extends R>> function, int i10, ErrorMode errorMode) {
        this.f73216a = parallelFlowable;
        this.f73217b = (Function) ObjectHelper.requireNonNull(function, "mapper");
        this.f73218c = i10;
        this.f73219d = (ErrorMode) ObjectHelper.requireNonNull(errorMode, "errorMode");
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f73216a.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                subscriberArr2[i10] = FlowableConcatMap.subscribe(subscriberArr[i10], this.f73217b, this.f73218c, this.f73219d);
            }
            this.f73216a.subscribe(subscriberArr2);
        }
    }
}
