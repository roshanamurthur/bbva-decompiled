package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class SafeSubscriber<T> implements FlowableSubscriber<T>, Subscription {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Subscriber<? super T> f78701p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Subscription f78702q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f78703r0;

    public SafeSubscriber(Subscriber<? super T> subscriber) {
        this.f78701p0 = subscriber;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        try {
            this.f78702q0.cancel();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f78703r0) {
            return;
        }
        this.f78703r0 = true;
        Subscription subscription = this.f78702q0;
        Subscriber<? super T> subscriber = this.f78701p0;
        if (subscription != null) {
            try {
                subscriber.onComplete();
                return;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            subscriber.onSubscribe(EmptySubscription.INSTANCE);
            try {
                subscriber.onError(nullPointerException);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RxJavaPlugins.onError(new CompositeException(nullPointerException, th3));
            }
        } catch (Throwable th4) {
            Exceptions.throwIfFatal(th4);
            RxJavaPlugins.onError(new CompositeException(nullPointerException, th4));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        if (this.f78703r0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f78703r0 = true;
        Subscription subscription = this.f78702q0;
        Subscriber<? super T> subscriber = this.f78701p0;
        if (subscription != null) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                subscriber.onError(th2);
                return;
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RxJavaPlugins.onError(new CompositeException(th2, th3));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            subscriber.onSubscribe(EmptySubscription.INSTANCE);
            try {
                subscriber.onError(new CompositeException(th2, nullPointerException));
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(new CompositeException(th2, nullPointerException, th4));
            }
        } catch (Throwable th5) {
            Exceptions.throwIfFatal(th5);
            RxJavaPlugins.onError(new CompositeException(th2, nullPointerException, th5));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f78703r0) {
            return;
        }
        Subscription subscription = this.f78702q0;
        Subscriber<? super T> subscriber = this.f78701p0;
        if (subscription == null) {
            this.f78703r0 = true;
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                subscriber.onSubscribe(EmptySubscription.INSTANCE);
                try {
                    subscriber.onError(nullPointerException);
                    return;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(new CompositeException(nullPointerException, th2));
                    return;
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RxJavaPlugins.onError(new CompositeException(nullPointerException, th3));
                return;
            }
        }
        if (t10 == null) {
            NullPointerException nullPointerException2 = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f78702q0.cancel();
                onError(nullPointerException2);
                return;
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                onError(new CompositeException(nullPointerException2, th4));
                return;
            }
        }
        try {
            subscriber.onNext(t10);
        } catch (Throwable th5) {
            Exceptions.throwIfFatal(th5);
            try {
                this.f78702q0.cancel();
                onError(th5);
            } catch (Throwable th6) {
                Exceptions.throwIfFatal(th6);
                onError(new CompositeException(th5, th6));
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f78702q0, subscription)) {
            this.f78702q0 = subscription;
            try {
                this.f78701p0.onSubscribe(this);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f78703r0 = true;
                try {
                    subscription.cancel();
                    RxJavaPlugins.onError(th2);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RxJavaPlugins.onError(new CompositeException(th2, th3));
                }
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        try {
            this.f78702q0.request(j10);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            try {
                this.f78702q0.cancel();
                RxJavaPlugins.onError(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RxJavaPlugins.onError(new CompositeException(th2, th3));
            }
        }
    }
}
