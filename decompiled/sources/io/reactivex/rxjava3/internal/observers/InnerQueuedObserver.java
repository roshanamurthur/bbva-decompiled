package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.QueueDisposable;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final InnerQueuedObserverSupport<T> f74212p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f74213q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public SimpleQueue<T> f74214r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile boolean f74215s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f74216t0;

    public InnerQueuedObserver(InnerQueuedObserverSupport<T> innerQueuedObserverSupport, int i10) {
        this.f74212p0 = innerQueuedObserverSupport;
        this.f74213q0 = i10;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    public boolean isDone() {
        return this.f74215s0;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        this.f74212p0.innerComplete(this);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th2) {
        this.f74212p0.innerError(this, th2);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t10) {
        int i10 = this.f74216t0;
        InnerQueuedObserverSupport<T> innerQueuedObserverSupport = this.f74212p0;
        if (i10 == 0) {
            innerQueuedObserverSupport.innerNext(this, t10);
        } else {
            innerQueuedObserverSupport.drain();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            if (disposable instanceof QueueDisposable) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iRequestFusion = queueDisposable.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f74216t0 = iRequestFusion;
                    this.f74214r0 = queueDisposable;
                    this.f74215s0 = true;
                    this.f74212p0.innerComplete(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f74216t0 = iRequestFusion;
                    this.f74214r0 = queueDisposable;
                    return;
                }
            }
            this.f74214r0 = QueueDrainHelper.createQueue(-this.f74213q0);
        }
    }

    public SimpleQueue<T> queue() {
        return this.f74214r0;
    }

    public void setDone() {
        this.f74215s0 = true;
    }
}
