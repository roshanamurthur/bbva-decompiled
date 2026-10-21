package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.functions.Function;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSwitchMapCompletablePublisher<T> extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<T> f76141p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends CompletableSource> f76142q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f76143r0;

    public FlowableSwitchMapCompletablePublisher(Publisher<T> publisher, Function<? super T, ? extends CompletableSource> function, boolean z10) {
        this.f76141p0 = publisher;
        this.f76142q0 = function;
        this.f76143r0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f76141p0.subscribe(new FlowableSwitchMapCompletable.a(completableObserver, this.f76142q0, this.f76143r0));
    }
}
