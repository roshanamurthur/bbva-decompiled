package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableAutoConnect<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ConnectableFlowable<? extends T> f70214q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f70215r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Consumer<? super Disposable> f70216s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final AtomicInteger f70217t0 = new AtomicInteger();

    public FlowableAutoConnect(ConnectableFlowable<? extends T> connectableFlowable, int i10, Consumer<? super Disposable> consumer) {
        this.f70214q0 = connectableFlowable;
        this.f70215r0 = i10;
        this.f70216s0 = consumer;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        ConnectableFlowable<? extends T> connectableFlowable = this.f70214q0;
        connectableFlowable.subscribe((Subscriber<? super Object>) subscriber);
        if (this.f70217t0.incrementAndGet() == this.f70215r0) {
            connectableFlowable.connect(this.f70216s0);
        }
    }
}
