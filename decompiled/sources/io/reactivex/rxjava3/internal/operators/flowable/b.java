package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.processors.FlowableProcessor;
import io.reactivex.rxjava3.processors.UnicastProcessor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: FlowableWindowSubscribeIntercept.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final FlowableProcessor<T> f75738q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicBoolean f75739r0 = new AtomicBoolean();

    public b(UnicastProcessor unicastProcessor) {
        this.f75738q0 = unicastProcessor;
    }

    public final boolean e() {
        AtomicBoolean atomicBoolean = this.f75739r0;
        return !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void subscribeActual(Subscriber<? super T> subscriber) {
        this.f75738q0.subscribe(subscriber);
        this.f75739r0.set(true);
    }
}
