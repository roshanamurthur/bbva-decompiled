package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.BlockingHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BlockingBaseObserver<T> extends CountDownLatch implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public T f74182p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Throwable f74183q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Disposable f74184r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile boolean f74185s0;

    public BlockingBaseObserver() {
        super(1);
    }

    public final T blockingGet() {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e5) {
                dispose();
                throw ExceptionHelper.wrapOrThrow(e5);
            }
        }
        Throwable th2 = this.f74183q0;
        if (th2 == null) {
            return this.f74182p0;
        }
        throw ExceptionHelper.wrapOrThrow(th2);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f74185s0 = true;
        Disposable disposable = this.f74184r0;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f74185s0;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f74184r0 = disposable;
        if (this.f74185s0) {
            disposable.dispose();
        }
    }
}
