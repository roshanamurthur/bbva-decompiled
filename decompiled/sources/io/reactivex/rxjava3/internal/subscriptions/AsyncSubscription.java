package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class AsyncSubscription extends AtomicLong implements Subscription, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<Subscription> f78065p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<Disposable> f78066q0;

    public AsyncSubscription() {
        this.f78066q0 = new AtomicReference<>();
        this.f78065p0 = new AtomicReference<>();
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.cancel(this.f78065p0);
        DisposableHelper.dispose(this.f78066q0);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f78065p0.get() == SubscriptionHelper.CANCELLED;
    }

    public boolean replaceResource(Disposable disposable) {
        return DisposableHelper.replace(this.f78066q0, disposable);
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        SubscriptionHelper.deferredRequest(this.f78065p0, this, j10);
    }

    public boolean setResource(Disposable disposable) {
        return DisposableHelper.set(this.f78066q0, disposable);
    }

    public void setSubscription(Subscription subscription) {
        SubscriptionHelper.deferredSetOnce(this.f78065p0, this, subscription);
    }

    public AsyncSubscription(Disposable disposable) {
        this();
        this.f78066q0.lazySet(disposable);
    }
}
