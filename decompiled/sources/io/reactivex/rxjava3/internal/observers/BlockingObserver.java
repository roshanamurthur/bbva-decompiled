package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    public static final Object TERMINATED = new Object();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Queue<Object> f74193p0;

    public BlockingObserver(Queue<Object> queue) {
        this.f74193p0 = queue;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        if (DisposableHelper.dispose(this)) {
            this.f74193p0.offer(TERMINATED);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        this.f74193p0.offer(NotificationLite.complete());
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th2) {
        this.f74193p0.offer(NotificationLite.error(th2));
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t10) {
        this.f74193p0.offer(NotificationLite.next(t10));
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }
}
