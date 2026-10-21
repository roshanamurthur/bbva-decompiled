package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class SubscriberResourceWrapper<T> extends AtomicReference<Disposable> implements FlowableSubscriber<T>, Disposable, Subscription {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Subscriber<? super T> f73770p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<Subscription> f73771q0 = new AtomicReference<>();

    public SubscriberResourceWrapper(Subscriber<? super T> subscriber) {
        this.f73770p0 = subscriber;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.cancel(this.f73771q0);
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f73771q0.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        DisposableHelper.dispose(this);
        this.f73770p0.onComplete();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        DisposableHelper.dispose(this);
        this.f73770p0.onError(th2);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        this.f73770p0.onNext(t10);
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this.f73771q0, subscription)) {
            this.f73770p0.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        if (SubscriptionHelper.validate(j10)) {
            this.f73771q0.get().request(j10);
        }
    }

    public void setResource(Disposable disposable) {
        DisposableHelper.set(this, disposable);
    }
}
