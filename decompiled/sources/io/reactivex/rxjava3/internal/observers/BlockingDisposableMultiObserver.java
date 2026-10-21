package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.util.BlockingHelper;
import java.util.concurrent.CountDownLatch;
import rj.d;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingDisposableMultiObserver<T> extends CountDownLatch implements MaybeObserver<T>, SingleObserver<T>, CompletableObserver, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public T f74186p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Throwable f74187q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final SequentialDisposable f74188r0;

    public BlockingDisposableMultiObserver() {
        super(1);
        this.f74188r0 = new SequentialDisposable();
    }

    public void blockingConsume(CompletableObserver completableObserver) {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e5) {
                dispose();
                completableObserver.onError(e5);
                return;
            }
        }
        if (isDisposed()) {
            return;
        }
        Throwable th2 = this.f74187q0;
        if (th2 != null) {
            completableObserver.onError(th2);
        } else {
            completableObserver.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.f74188r0.dispose();
        countDown();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f74188r0.isDisposed();
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onComplete() {
        this.f74188r0.lazySet(d.a());
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onError(@NonNull Throwable th2) {
        this.f74187q0 = th2;
        this.f74188r0.lazySet(d.a());
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onSubscribe(@NonNull Disposable disposable) {
        DisposableHelper.setOnce(this.f74188r0, disposable);
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(@NonNull T t10) {
        this.f74186p0 = t10;
        this.f74188r0.lazySet(d.a());
        countDown();
    }

    public void blockingConsume(SingleObserver<? super T> singleObserver) {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e5) {
                dispose();
                singleObserver.onError(e5);
                return;
            }
        }
        if (isDisposed()) {
            return;
        }
        Throwable th2 = this.f74187q0;
        if (th2 != null) {
            singleObserver.onError(th2);
        } else {
            singleObserver.onSuccess(this.f74186p0);
        }
    }

    public void blockingConsume(MaybeObserver<? super T> maybeObserver) {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e5) {
                dispose();
                maybeObserver.onError(e5);
                return;
            }
        }
        if (isDisposed()) {
            return;
        }
        Throwable th2 = this.f74187q0;
        if (th2 != null) {
            maybeObserver.onError(th2);
            return;
        }
        T t10 = this.f74186p0;
        if (t10 == null) {
            maybeObserver.onComplete();
        } else {
            maybeObserver.onSuccess(t10);
        }
    }
}
