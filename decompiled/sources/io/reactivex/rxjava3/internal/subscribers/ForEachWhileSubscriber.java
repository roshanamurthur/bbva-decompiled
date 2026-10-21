package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ForEachWhileSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Predicate<? super T> f78038p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super Throwable> f78039q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Action f78040r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f78041s0;

    public ForEachWhileSubscriber(Predicate<? super T> predicate, Consumer<? super Throwable> consumer, Action action) {
        this.f78038p0 = predicate;
        this.f78039q0 = consumer;
        this.f78040r0 = action;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f78041s0) {
            return;
        }
        this.f78041s0 = true;
        try {
            this.f78040r0.run();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        if (this.f78041s0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f78041s0 = true;
        try {
            this.f78039q0.accept(th2);
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            RxJavaPlugins.onError(new CompositeException(th2, th3));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f78041s0) {
            return;
        }
        try {
            if (this.f78038p0.test(t10)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            dispose();
            onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
    }
}
