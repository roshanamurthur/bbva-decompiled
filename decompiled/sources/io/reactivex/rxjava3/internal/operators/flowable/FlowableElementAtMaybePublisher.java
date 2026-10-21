package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableElementAtMaybePublisher<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<T> f74814p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f74815q0;

    public FlowableElementAtMaybePublisher(Publisher<T> publisher, long j10) {
        this.f74814p0 = publisher;
        this.f74815q0 = j10;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f74814p0.subscribe(new FlowableElementAtMaybe.a(maybeObserver, this.f74815q0));
    }
}
