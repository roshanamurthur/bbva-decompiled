package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public abstract class DisposableSubscriber<T> implements FlowableSubscriber<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<Subscription> f78697p0 = new AtomicReference<>();

    public final void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.cancel(this.f78697p0);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f78697p0.get() == SubscriptionHelper.CANCELLED;
    }

    public void onStart() {
        this.f78697p0.get().request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (EndConsumerHelper.setOnce(this.f78697p0, subscription, getClass())) {
            onStart();
        }
    }

    public final void request(long j10) {
        this.f78697p0.get().request(j10);
    }
}
