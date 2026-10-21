package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.BlockingHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FutureMultiObserver<T> extends CountDownLatch implements MaybeObserver<T>, SingleObserver<T>, CompletableObserver, Future<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public T f74206p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Throwable f74207q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<Disposable> f74208r0;

    public FutureMultiObserver() {
        super(1);
        this.f74208r0 = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        DisposableHelper disposableHelper;
        while (true) {
            AtomicReference<Disposable> atomicReference = this.f74208r0;
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
        Throwable th2 = this.f74207q0;
        if (th2 == null) {
            return this.f74206p0;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return DisposableHelper.isDisposed(this.f74208r0.get());
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onComplete() {
        AtomicReference<Disposable> atomicReference = this.f74208r0;
        Disposable disposable = atomicReference.get();
        if (disposable == DisposableHelper.DISPOSED) {
            return;
        }
        while (!atomicReference.compareAndSet(disposable, this) && atomicReference.get() == disposable) {
        }
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onError(Throwable th2) {
        while (true) {
            AtomicReference<Disposable> atomicReference = this.f74208r0;
            Disposable disposable = atomicReference.get();
            if (disposable == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f74207q0 = th2;
            do {
                if (atomicReference.compareAndSet(disposable, this)) {
                    countDown();
                    return;
                }
            } while (atomicReference.get() == disposable);
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.f74208r0, disposable);
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(T t10) {
        AtomicReference<Disposable> atomicReference = this.f74208r0;
        Disposable disposable = atomicReference.get();
        if (disposable == DisposableHelper.DISPOSED) {
            return;
        }
        this.f74206p0 = t10;
        while (!atomicReference.compareAndSet(disposable, this) && atomicReference.get() == disposable) {
        }
        countDown();
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            if (!await(j10, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.timeoutMessage(j10, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th2 = this.f74207q0;
            if (th2 == null) {
                return this.f74206p0;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
    }
}
