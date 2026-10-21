package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscriberCompletableObserver<T> implements CompletableObserver, Subscription {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Subscriber<? super T> f69970p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Disposable f69971q0;

    public SubscriberCompletableObserver(Subscriber<? super T> subscriber) {
        this.f69970p0 = subscriber;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        this.f69971q0.dispose();
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        this.f69970p0.onComplete();
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th2) {
        this.f69970p0.onError(th2);
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.f69971q0, disposable)) {
            this.f69971q0 = disposable;
            this.f69970p0.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
    }
}
