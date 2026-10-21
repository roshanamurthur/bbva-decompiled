package io.reactivex.internal.operators.parallel;

import io.reactivex.parallel.ParallelFlowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelFromArray<T> extends ParallelFlowable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Publisher<T>[] f73256a;

    public ParallelFromArray(Publisher<T>[] publisherArr) {
        this.f73256a = publisherArr;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f73256a.length;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f73256a[i10].subscribe(subscriberArr[i10]);
            }
        }
    }
}
