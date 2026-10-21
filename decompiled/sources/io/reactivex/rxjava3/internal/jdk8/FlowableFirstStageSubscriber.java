package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;
import sj.a;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFirstStageSubscriber<T> extends a<T> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f74026r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final T f74027s0;

    public FlowableFirstStageSubscriber(boolean z10, T t10) {
        this.f74026r0 = z10;
        this.f74027s0 = t10;
    }

    @Override // sj.a
    public void afterSubscribe(Subscription subscription) {
        subscription.request(1L);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (isDone()) {
            return;
        }
        clear();
        if (this.f74026r0) {
            complete(this.f74027s0);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        complete(t10);
    }
}
