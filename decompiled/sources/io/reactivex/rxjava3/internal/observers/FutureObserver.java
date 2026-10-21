package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.BlockingHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FutureObserver<T> extends CountDownLatch implements Observer<T>, Future<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public T f74209p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Throwable f74210q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<Disposable> f74211r0;

    public FutureObserver() {
        super(1);
        this.f74211r0 = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        DisposableHelper disposableHelper;
        while (true) {
            AtomicReference<Disposable> atomicReference = this.f74211r0;
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
        Throwable th2 = this.f74210q0;
        if (th2 == null) {
            return this.f74209p0;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return DisposableHelper.isDisposed(this.f74211r0.get());
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        if (this.f74209p0 == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        AtomicReference<Disposable> atomicReference = this.f74211r0;
        Disposable disposable = atomicReference.get();
        if (disposable == this || disposable == DisposableHelper.DISPOSED) {
            return;
        }
        while (!atomicReference.compareAndSet(disposable, this)) {
            if (atomicReference.get() != disposable) {
                return;
            }
        }
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th2) {
        AtomicReference<Disposable> atomicReference;
        Disposable disposable;
        if (this.f74210q0 == null && (disposable = (atomicReference = this.f74211r0).get()) != this && disposable != DisposableHelper.DISPOSED) {
            while (!atomicReference.compareAndSet(disposable, this)) {
                if (atomicReference.get() != disposable) {
                }
            }
            this.f74210q0 = th2;
            countDown();
            return;
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t10) {
        if (this.f74209p0 == null) {
            this.f74209p0 = t10;
        } else {
            this.f74211r0.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.f74211r0, disposable);
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
            Throwable th2 = this.f74210q0;
            if (th2 == null) {
                return this.f74209p0;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
    }
}
