package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BasicFuseableObserver<T, R> implements Observer<T>, QueueDisposable<R> {
    protected boolean done;
    protected final Observer<? super R> downstream;

    /* JADX INFO: renamed from: qd, reason: collision with root package name */
    protected QueueDisposable<T> f69930qd;
    protected int sourceMode;
    protected Disposable upstream;

    public BasicFuseableObserver(Observer<? super R> observer) {
        this.downstream = observer;
    }

    public boolean beforeDownstream() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        this.f69930qd.clear();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.upstream.dispose();
    }

    public final void fail(Throwable th2) {
        Exceptions.throwIfFatal(th2);
        this.upstream.dispose();
        onError(th2);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.f69930qd.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r3) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.downstream.onComplete();
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        if (this.done) {
            RxJavaPlugins.onError(th2);
        } else {
            this.done = true;
            this.downstream.onError(th2);
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            if (disposable instanceof QueueDisposable) {
                this.f69930qd = (QueueDisposable) disposable;
            }
            if (beforeDownstream()) {
                this.downstream.onSubscribe(this);
                afterDownstream();
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int i10) {
        return transitiveBoundaryFusion(i10);
    }

    public final int transitiveBoundaryFusion(int i10) {
        QueueDisposable<T> queueDisposable = this.f69930qd;
        if (queueDisposable == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = queueDisposable.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.sourceMode = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r3, R r4) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void afterDownstream() {
    }
}
