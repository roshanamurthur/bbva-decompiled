package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class FutureSingleObserver<T> extends CountDownLatch implements SingleObserver<T>, Future<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public T f69956p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Throwable f69957q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<Disposable> f69958r0;

    public FutureSingleObserver() {
        super(1);
        this.f69958r0 = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        DisposableHelper disposableHelper;
        while (true) {
            AtomicReference<Disposable> atomicReference = this.f69958r0;
            Disposable disposable = atomicReference.get();
            if (disposable == this || disposable == (disposableHelper = DisposableHelper.DISPOSED)) {
                return false;
            }
            do {
                if (atomicReference.compareAndSet(disposable, disposableHelper)) {
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    countDown();
                    return true;
                }
            } while (atomicReference.get() == disposable);
        }
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th2 = this.f69957q0;
        if (th2 == null) {
            return this.f69956p0;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return DisposableHelper.isDisposed(this.f69958r0.get());
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th2) {
        while (true) {
            AtomicReference<Disposable> atomicReference = this.f69958r0;
            Disposable disposable = atomicReference.get();
            if (disposable == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f69957q0 = th2;
            do {
                if (atomicReference.compareAndSet(disposable, this)) {
                    countDown();
                    return;
                }
            } while (atomicReference.get() == disposable);
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.f69958r0, disposable);
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t10) {
        AtomicReference<Disposable> atomicReference = this.f69958r0;
        Disposable disposable = atomicReference.get();
        if (disposable == DisposableHelper.DISPOSED) {
            return;
        }
        this.f69956p0 = t10;
        while (!atomicReference.compareAndSet(disposable, this) && atomicReference.get() == disposable) {
        }
        countDown();
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            if (!await(j10, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.timeoutMessage(j10, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th2 = this.f69957q0;
            if (th2 == null) {
                return this.f69956p0;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
    }
}
