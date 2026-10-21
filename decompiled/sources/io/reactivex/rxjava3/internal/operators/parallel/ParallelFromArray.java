package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.parallel.ParallelFlowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelFromArray<T> extends ParallelFlowable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Publisher<T>[] f77510a;

    public ParallelFromArray(Publisher<T>[] publisherArr) {
        this.f77510a = publisherArr;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public int parallelism() {
        return this.f77510a.length;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f77510a[i10].subscribe(subscriberArr[i10]);
            }
        }
    }
}
