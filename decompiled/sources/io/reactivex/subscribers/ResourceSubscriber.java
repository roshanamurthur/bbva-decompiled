package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ResourceSubscriber<T> implements FlowableSubscriber<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<Subscription> f78698p0 = new AtomicReference<>();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ListCompositeDisposable f78699q0 = new ListCompositeDisposable();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicLong f78700r0 = new AtomicLong();

    public final void add(Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "resource is null");
        this.f78699q0.add(disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (SubscriptionHelper.cancel(this.f78698p0)) {
            this.f78699q0.dispose();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f78698p0.get() == SubscriptionHelper.CANCELLED;
    }

    public void onStart() {
        request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (EndConsumerHelper.setOnce(this.f78698p0, subscription, getClass())) {
            long andSet = this.f78700r0.getAndSet(0L);
            if (andSet != 0) {
                subscription.request(andSet);
            }
            onStart();
        }
    }

    public final void request(long j10) {
        SubscriptionHelper.deferredRequest(this.f78698p0, this.f78700r0, j10);
    }
}
