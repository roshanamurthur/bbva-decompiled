package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final InnerQueuedObserverSupport<T> f69959p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f69960q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public SimpleQueue<T> f69961r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile boolean f69962s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f69963t0;

    public InnerQueuedObserver(InnerQueuedObserverSupport<T> innerQueuedObserverSupport, int i10) {
        this.f69959p0 = innerQueuedObserverSupport;
        this.f69960q0 = i10;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public int fusionMode() {
        return this.f69963t0;
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    public boolean isDone() {
        return this.f69962s0;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        this.f69959p0.innerComplete(this);
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        this.f69959p0.innerError(this, th2);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t10) {
        int i10 = this.f69963t0;
        InnerQueuedObserverSupport<T> innerQueuedObserverSupport = this.f69959p0;
        if (i10 == 0) {
            innerQueuedObserverSupport.innerNext(this, t10);
        } else {
            innerQueuedObserverSupport.drain();
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            if (disposable instanceof QueueDisposable) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iRequestFusion = queueDisposable.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f69963t0 = iRequestFusion;
                    this.f69961r0 = queueDisposable;
                    this.f69962s0 = true;
                    this.f69959p0.innerComplete(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f69963t0 = iRequestFusion;
                    this.f69961r0 = queueDisposable;
                    return;
                }
            }
            this.f69961r0 = QueueDrainHelper.createQueue(-this.f69960q0);
        }
    }

    public SimpleQueue<T> queue() {
        return this.f69961r0;
    }

    public void setDone() {
        this.f69962s0 = true;
    }
}
