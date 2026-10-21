package io.reactivex.rxjava3.internal.fuseable;

/* JADX INFO: loaded from: classes12.dex */
public final class CancellableQueueFuseable<T> extends AbstractEmptyQueueFuseable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public volatile boolean f74004p0;

    @Override // io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable, org.reactivestreams.Subscription
    public void cancel() {
        this.f74004p0 = true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable, io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.f74004p0 = true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable, io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f74004p0;
    }
}
