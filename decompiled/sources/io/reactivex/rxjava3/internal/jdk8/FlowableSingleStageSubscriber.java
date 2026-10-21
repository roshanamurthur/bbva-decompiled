package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;
import sj.a;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSingleStageSubscriber<T> extends a<T> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f74056r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final T f74057s0;

    public FlowableSingleStageSubscriber(boolean z10, T t10) {
        this.f74056r0 = z10;
        this.f74057s0 = t10;
    }

    @Override // sj.a
    public void afterSubscribe(Subscription subscription) {
        subscription.request(2L);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (isDone()) {
            return;
        }
        T t10 = this.f93225q0;
        clear();
        if (t10 != null) {
            complete(t10);
        } else if (this.f74056r0) {
            complete(this.f74057s0);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f93225q0 == null) {
            this.f93225q0 = t10;
        } else {
            this.f93225q0 = null;
            completeExceptionally(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }
}
