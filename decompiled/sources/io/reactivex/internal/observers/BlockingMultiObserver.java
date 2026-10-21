package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes8.dex */
public final class BlockingMultiObserver<T> extends CountDownLatch implements SingleObserver<T>, CompletableObserver, MaybeObserver<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public T f69936p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Throwable f69937q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Disposable f69938r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile boolean f69939s0;

    public BlockingMultiObserver() {
        super(1);
    }

    public final void a() {
        this.f69939s0 = true;
        Disposable disposable = this.f69938r0;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public boolean blockingAwait(long j10, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                if (!await(j10, timeUnit)) {
                    a();
                    return false;
                }
            } catch (InterruptedException e5) {
                a();
                throw ExceptionHelper.wrapOrThrow(e5);
            }
        }
        Throwable th2 = this.f69937q0;
        if (th2 == null) {
            return true;
        }
        throw ExceptionHelper.wrapOrThrow(th2);
    }

    public T blockingGet() {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e5) {
                a();
                throw ExceptionHelper.wrapOrThrow(e5);
            }
        }
        Throwable th2 = this.f69937q0;
        if (th2 == null) {
            return this.f69936p0;
        }
        throw ExceptionHelper.wrapOrThrow(th2);
    }

    public Throwable blockingGetError() {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e5) {
                a();
                return e5;
            }
        }
        return this.f69937q0;
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th2) {
        this.f69937q0 = th2;
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
        this.f69938r0 = disposable;
        if (this.f69939s0) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t10) {
        this.f69936p0 = t10;
        countDown();
    }

    public Throwable blockingGetError(long j10, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                if (!await(j10, timeUnit)) {
                    a();
                    throw ExceptionHelper.wrapOrThrow(new TimeoutException(ExceptionHelper.timeoutMessage(j10, timeUnit)));
                }
            } catch (InterruptedException e5) {
                a();
                throw ExceptionHelper.wrapOrThrow(e5);
            }
        }
        return this.f69937q0;
    }

    public T blockingGet(T t10) {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e5) {
                a();
                throw ExceptionHelper.wrapOrThrow(e5);
            }
        }
        Throwable th2 = this.f69937q0;
        if (th2 == null) {
            T t11 = this.f69936p0;
            return t11 != null ? t11 : t10;
        }
        throw ExceptionHelper.wrapOrThrow(th2);
    }
}
