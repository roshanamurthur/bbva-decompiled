package vj;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.processors.FlowableProcessor;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: SerializedProcessor.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final FlowableProcessor<T> f94099q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f94100r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public AppendOnlyLinkedArrayList<Object> f94101s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public volatile boolean f94102t0;

    public a(FlowableProcessor<T> flowableProcessor) {
        this.f94099q0 = flowableProcessor;
    }

    public final void e() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f94101s0;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f94100r0 = false;
                        return;
                    }
                    this.f94101s0 = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            appendOnlyLinkedArrayList.accept(this.f94099q0);
        }
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @Nullable
    public final Throwable getThrowable() {
        return this.f94099q0.getThrowable();
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    public final boolean hasComplete() {
        return this.f94099q0.hasComplete();
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    public final boolean hasSubscribers() {
        return this.f94099q0.hasSubscribers();
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    public final boolean hasThrowable() {
        return this.f94099q0.hasThrowable();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.f94102t0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f94102t0) {
                    return;
                }
                this.f94102t0 = true;
                if (!this.f94100r0) {
                    this.f94100r0 = true;
                    this.f94099q0.onComplete();
                    return;
                }
                AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f94101s0;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                    this.f94101s0 = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.add(NotificationLite.complete());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th2) {
        if (this.f94102t0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f94102t0) {
                    this.f94102t0 = true;
                    if (this.f94100r0) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f94101s0;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f94101s0 = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.setFirst(NotificationLite.error(th2));
                        return;
                    }
                    this.f94100r0 = true;
                    z10 = false;
                }
                if (z10) {
                    RxJavaPlugins.onError(th2);
                } else {
                    this.f94099q0.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t10) {
        if (this.f94102t0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f94102t0) {
                    return;
                }
                if (!this.f94100r0) {
                    this.f94100r0 = true;
                    this.f94099q0.onNext(t10);
                    e();
                } else {
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f94101s0;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.f94101s0 = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.next(t10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (!this.f94102t0) {
            synchronized (this) {
                try {
                    boolean z10 = true;
                    if (!this.f94102t0) {
                        if (this.f94100r0) {
                            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f94101s0;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                                this.f94101s0 = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.add(NotificationLite.subscription(subscription));
                            return;
                        }
                        this.f94100r0 = true;
                        z10 = false;
                    }
                    if (!z10) {
                        this.f94099q0.onSubscribe(subscription);
                        e();
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        subscription.cancel();
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void subscribeActual(Subscriber<? super T> subscriber) {
        this.f94099q0.subscribe(subscriber);
    }
}
