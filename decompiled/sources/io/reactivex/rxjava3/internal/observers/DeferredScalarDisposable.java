package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {
    protected final Observer<? super T> downstream;
    protected T value;

    public DeferredScalarDisposable(Observer<? super T> observer) {
        this.downstream = observer;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public final void complete(T t10) {
        int i10 = get();
        if ((i10 & 54) != 0) {
            return;
        }
        Observer<? super T> observer = this.downstream;
        if (i10 == 8) {
            this.value = t10;
            lazySet(16);
            observer.onNext(null);
        } else {
            lazySet(2);
            observer.onNext(t10);
        }
        if (get() != 4) {
            observer.onComplete();
        }
    }

    public void dispose() {
        set(4);
        this.value = null;
    }

    public final void error(Throwable th2) {
        if ((get() & 54) != 0) {
            RxJavaPlugins.onError(th2);
        } else {
            lazySet(2);
            this.downstream.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onComplete() {
        complete();
    }

    public void onError(Throwable th2) {
        error(th2);
    }

    public void onSuccess(T t10) {
        complete(t10);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    @Nullable
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        T t10 = this.value;
        this.value = null;
        lazySet(32);
        return t10;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
    public final int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryDispose() {
        return getAndSet(4) != 4;
    }

    public final void complete() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.downstream.onComplete();
    }
}
