package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import org.reactivestreams.Publisher;

/* JADX INFO: compiled from: AbstractFlowableWithUpstream.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class a<T, R> extends Flowable<R> implements HasUpstreamPublisher<T> {
    protected final Flowable<T> source;

    public a(Flowable<T> flowable) {
        this.source = (Flowable) ObjectHelper.requireNonNull(flowable, "source is null");
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public final Publisher<T> source() {
        return this.source;
    }
}
