package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BlockingBaseObserver<T> extends CountDownLatch implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public T f69932p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Throwable f69933q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Disposable f69934r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile boolean f69935s0;

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
        Throwable th2 = this.f69933q0;
        if (th2 == null) {
            return this.f69932p0;
        }
        throw ExceptionHelper.wrapOrThrow(th2);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f69935s0 = true;
        Disposable disposable = this.f69934r0;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f69935s0;
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f69934r0 = disposable;
        if (this.f69935s0) {
            disposable.dispose();
        }
    }
}
