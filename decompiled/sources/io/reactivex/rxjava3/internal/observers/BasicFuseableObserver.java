package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.QueueDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BasicFuseableObserver<T, R> implements Observer<T>, QueueDisposable<R> {
    protected boolean done;
    protected final Observer<? super R> downstream;

    /* JADX INFO: renamed from: qd, reason: collision with root package name */
    protected QueueDisposable<T> f74180qd;
    protected int sourceMode;
    protected Disposable upstream;

    public BasicFuseableObserver(Observer<? super R> observer) {
        this.downstream = observer;
    }

    public boolean beforeDownstream() {
        return true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public void clear() {
        this.f74180qd.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.upstream.dispose();
    }

    public final void fail(Throwable th2) {
        Exceptions.throwIfFatal(th2);
        this.upstream.dispose();
        onError(th2);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.f74180qd.isEmpty();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final boolean offer(R r3) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.downstream.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th2) {
        if (this.done) {
            RxJavaPlugins.onError(th2);
        } else {
            this.done = true;
            this.downstream.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            if (disposable instanceof QueueDisposable) {
                this.f74180qd = (QueueDisposable) disposable;
            }
            if (beforeDownstream()) {
                this.downstream.onSubscribe(this);
                afterDownstream();
            }
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
    public int requestFusion(int i10) {
        return transitiveBoundaryFusion(i10);
    }

    public final int transitiveBoundaryFusion(int i10) {
        QueueDisposable<T> queueDisposable = this.f74180qd;
        if (queueDisposable == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = queueDisposable.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.sourceMode = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final boolean offer(R r3, R r4) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void afterDownstream() {
    }
}
