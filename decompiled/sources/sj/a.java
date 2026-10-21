package sj;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: FlowableStageSubscriber.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class a<T> extends CompletableFuture<T> implements FlowableSubscriber<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<Subscription> f93224p0 = new AtomicReference<>();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public T f93225q0;

    public abstract void afterSubscribe(Subscription subscription);

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        cancelUpstream();
        return super.cancel(z10);
    }

    public final void cancelUpstream() {
        SubscriptionHelper.cancel(this.f93224p0);
    }

    public final void clear() {
        this.f93225q0 = null;
        this.f93224p0.lazySet(SubscriptionHelper.CANCELLED);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean complete(T t10) {
        cancelUpstream();
        return super.complete(t10);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean completeExceptionally(Throwable th2) {
        cancelUpstream();
        return super.completeExceptionally(th2);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th2) {
        clear();
        if (completeExceptionally(th2)) {
            return;
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(@NonNull Subscription subscription) {
        if (SubscriptionHelper.setOnce(this.f93224p0, subscription)) {
            afterSubscribe(subscription);
        }
    }
}
