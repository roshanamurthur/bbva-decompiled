package io.reactivex.internal.util;

import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class EmptyComponent implements FlowableSubscriber<Object>, Observer<Object>, MaybeObserver<Object>, SingleObserver<Object>, CompletableObserver, Subscription, Disposable {
    private static final /* synthetic */ EmptyComponent[] $VALUES;
    public static final EmptyComponent INSTANCE;

    static {
        EmptyComponent emptyComponent = new EmptyComponent("INSTANCE", 0);
        INSTANCE = emptyComponent;
        $VALUES = new EmptyComponent[]{emptyComponent};
    }

    public EmptyComponent() {
        throw null;
    }

    public static <T> Observer<T> asObserver() {
        return INSTANCE;
    }

    public static <T> Subscriber<T> asSubscriber() {
        return INSTANCE;
    }

    public static EmptyComponent valueOf(String str) {
        return (EmptyComponent) Enum.valueOf(EmptyComponent.class, str);
    }

    public static EmptyComponent[] values() {
        return (EmptyComponent[]) $VALUES.clone();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return true;
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        RxJavaPlugins.onError(th2);
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        disposable.dispose();
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        subscription.cancel();
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(Object obj) {
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(Object obj) {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
    }
}
