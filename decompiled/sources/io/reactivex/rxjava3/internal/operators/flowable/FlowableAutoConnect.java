package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableAutoConnect<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ConnectableFlowable<? extends T> f74476q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f74477r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Consumer<? super Disposable> f74478s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final AtomicInteger f74479t0 = new AtomicInteger();

    public FlowableAutoConnect(ConnectableFlowable<? extends T> connectableFlowable, int i10, Consumer<? super Disposable> consumer) {
        this.f74476q0 = connectableFlowable;
        this.f74477r0 = i10;
        this.f74478s0 = consumer;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        ConnectableFlowable<? extends T> connectableFlowable = this.f74476q0;
        connectableFlowable.subscribe((Subscriber<? super Object>) subscriber);
        if (this.f74479t0.incrementAndGet() == this.f74477r0) {
            connectableFlowable.connect(this.f74478s0);
        }
    }
}
