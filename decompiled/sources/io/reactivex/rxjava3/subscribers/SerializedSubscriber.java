package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class SerializedSubscriber<T> implements FlowableSubscriber<T>, Subscription {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Subscriber<? super T> f78459p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f78460q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Subscription f78461r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f78462s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public AppendOnlyLinkedArrayList<Object> f78463t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public volatile boolean f78464u0;

    public SerializedSubscriber(Subscriber<? super T> subscriber) {
        this(subscriber, false);
    }

    public final void a() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        do {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f78463t0;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f78462s0 = false;
                        return;
                    }
                    this.f78463t0 = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (!appendOnlyLinkedArrayList.accept(this.f78459p0));
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        this.f78461r0.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f78464u0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f78464u0) {
                    return;
                }
                if (!this.f78462s0) {
                    this.f78464u0 = true;
                    this.f78462s0 = true;
                    this.f78459p0.onComplete();
                } else {
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f78463t0;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.f78463t0 = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.complete());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        if (this.f78464u0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f78464u0) {
                    if (this.f78462s0) {
                        this.f78464u0 = true;
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f78463t0;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f78463t0 = appendOnlyLinkedArrayList;
                        }
                        Object objError = NotificationLite.error(th2);
                        if (this.f78460q0) {
                            appendOnlyLinkedArrayList.add(objError);
                        } else {
                            appendOnlyLinkedArrayList.setFirst(objError);
                        }
                        return;
                    }
                    this.f78464u0 = true;
                    this.f78462s0 = true;
                    z10 = false;
                }
                if (z10) {
                    RxJavaPlugins.onError(th2);
                } else {
                    this.f78459p0.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(@NonNull T t10) {
        if (this.f78464u0) {
            return;
        }
        if (t10 == null) {
            this.f78461r0.cancel();
            onError(ExceptionHelper.createNullPointerException("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f78464u0) {
                    return;
                }
                if (!this.f78462s0) {
                    this.f78462s0 = true;
                    this.f78459p0.onNext(t10);
                    a();
                } else {
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f78463t0;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.f78463t0 = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.next(t10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(@NonNull Subscription subscription) {
        if (SubscriptionHelper.validate(this.f78461r0, subscription)) {
            this.f78461r0 = subscription;
            this.f78459p0.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        this.f78461r0.request(j10);
    }

    public SerializedSubscriber(@NonNull Subscriber<? super T> subscriber, boolean z10) {
        this.f78459p0 = subscriber;
        this.f78460q0 = z10;
    }
}
