package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class BlockingObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    public static final Object TERMINATED = new Object();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Queue<Object> f69940p0;

    public BlockingObserver(Queue<Object> queue) {
        this.f69940p0 = queue;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        if (DisposableHelper.dispose(this)) {
            this.f69940p0.offer(TERMINATED);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        this.f69940p0.offer(NotificationLite.complete());
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        this.f69940p0.offer(NotificationLite.error(th2));
    }

    @Override // io.reactivex.Observer
    public void onNext(T t10) {
        this.f69940p0.offer(NotificationLite.next(t10));
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }
}
