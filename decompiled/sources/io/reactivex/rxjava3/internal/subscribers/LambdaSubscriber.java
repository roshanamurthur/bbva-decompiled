package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class LambdaSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription, Disposable, LambdaConsumerIntrospection {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Consumer<? super T> f78051p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super Throwable> f78052q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Action f78053r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Consumer<? super Subscription> f78054s0;

    public LambdaSubscriber(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super Subscription> consumer3) {
        this.f78051p0 = consumer;
        this.f78052q0 = consumer2;
        this.f78053r0 = action;
        this.f78054s0 = consumer3;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        cancel();
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        return this.f78052q0 != Functions.ON_ERROR_MISSING;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        Subscription subscription = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (subscription != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.f78053r0.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        Subscription subscription = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (subscription == subscriptionHelper) {
            RxJavaPlugins.onError(th2);
            return;
        }
        lazySet(subscriptionHelper);
        try {
            this.f78052q0.accept(th2);
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            RxJavaPlugins.onError(new CompositeException(th2, th3));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f78051p0.accept(t10);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            get().cancel();
            onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this, subscription)) {
            try {
                this.f78054s0.accept(this);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                subscription.cancel();
                onError(th2);
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        get().request(j10);
    }
}
