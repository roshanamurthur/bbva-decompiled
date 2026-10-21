package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.util.BlockingHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingMultiObserver<T> extends CountDownLatch implements SingleObserver<T>, CompletableObserver, MaybeObserver<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public T f74189p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Throwable f74190q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Disposable f74191r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile boolean f74192s0;

    public BlockingMultiObserver() {
        super(1);
    }

    public final void a() {
        this.f74192s0 = true;
        Disposable disposable = this.f74191r0;
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
        Throwable th2 = this.f74190q0;
        if (th2 == null) {
            return true;
        }
        throw ExceptionHelper.wrapOrThrow(th2);
    }

    public void blockingConsume(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        try {
            if (getCount() != 0) {
                try {
                    BlockingHelper.verifyNonBlocking();
                    await();
                } catch (InterruptedException e5) {
                    a();
                    consumer2.accept(e5);
                    return;
                }
            }
            Throwable th2 = this.f74190q0;
            if (th2 != null) {
                consumer2.accept(th2);
                return;
            }
            T t10 = this.f74189p0;
            if (t10 != null) {
                consumer.accept(t10);
            } else {
                action.run();
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            RxJavaPlugins.onError(th3);
        }
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
        Throwable th2 = this.f74190q0;
        if (th2 == null) {
            return this.f74189p0;
        }
        throw ExceptionHelper.wrapOrThrow(th2);
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public void onComplete() {
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onError(Throwable th2) {
        this.f74190q0 = th2;
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        this.f74191r0 = disposable;
        if (this.f74192s0) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(T t10) {
        this.f74189p0 = t10;
        countDown();
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
        Throwable th2 = this.f74190q0;
        if (th2 == null) {
            T t11 = this.f74189p0;
            return t11 != null ? t11 : t10;
        }
        throw ExceptionHelper.wrapOrThrow(th2);
    }
}
