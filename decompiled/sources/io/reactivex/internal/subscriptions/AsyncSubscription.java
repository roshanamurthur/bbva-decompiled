package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class AsyncSubscription extends AtomicLong implements Subscription, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<Subscription> f73774p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<Disposable> f73775q0;

    public AsyncSubscription() {
        this.f73775q0 = new AtomicReference<>();
        this.f73774p0 = new AtomicReference<>();
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.cancel(this.f73774p0);
        DisposableHelper.dispose(this.f73775q0);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f73774p0.get() == SubscriptionHelper.CANCELLED;
    }

    public boolean replaceResource(Disposable disposable) {
        return DisposableHelper.replace(this.f73775q0, disposable);
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        SubscriptionHelper.deferredRequest(this.f73774p0, this, j10);
    }

    public boolean setResource(Disposable disposable) {
        return DisposableHelper.set(this.f73775q0, disposable);
    }

    public void setSubscription(Subscription subscription) {
        SubscriptionHelper.deferredSetOnce(this.f73774p0, this, subscription);
    }

    public AsyncSubscription(Disposable disposable) {
        this();
        this.f73775q0.lazySet(disposable);
    }
}
