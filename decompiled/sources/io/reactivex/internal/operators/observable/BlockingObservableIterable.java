package io.reactivex.internal.operators.observable;

import com.bbva.plugin.localstorage.command.RemoveCommand;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingObservableIterable<T> implements Iterable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends T> f72009p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f72010q0;

    public static final class a<T> extends AtomicReference<Disposable> implements Observer<T>, Iterator<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<T> f72011p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ReentrantLock f72012q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Condition f72013r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f72014s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile Throwable f72015t0;

        public a(int i10) {
            this.f72011p0 = new SpscLinkedArrayQueue<>(i10);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f72012q0 = reentrantLock;
            this.f72013r0 = reentrantLock.newCondition();
        }

        public final void a() {
            ReentrantLock reentrantLock = this.f72012q0;
            reentrantLock.lock();
            try {
                this.f72013r0.signalAll();
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            a();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (!isDisposed()) {
                boolean z10 = this.f72014s0;
                boolean zIsEmpty = this.f72011p0.isEmpty();
                if (z10) {
                    Throwable th2 = this.f72015t0;
                    if (th2 != null) {
                        throw ExceptionHelper.wrapOrThrow(th2);
                    }
                    if (zIsEmpty) {
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                try {
                    BlockingHelper.verifyNonBlocking();
                    this.f72012q0.lock();
                    while (!this.f72014s0 && this.f72011p0.isEmpty() && !isDisposed()) {
                        try {
                            this.f72013r0.await();
                        } catch (Throwable th3) {
                            this.f72012q0.unlock();
                            throw th3;
                        }
                    }
                    this.f72012q0.unlock();
                } catch (InterruptedException e5) {
                    DisposableHelper.dispose(this);
                    a();
                    throw ExceptionHelper.wrapOrThrow(e5);
                }
            }
            Throwable th4 = this.f72015t0;
            if (th4 == null) {
                return false;
            }
            throw ExceptionHelper.wrapOrThrow(th4);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                return this.f72011p0.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72014s0 = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72015t0 = th2;
            this.f72014s0 = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72011p0.offer(t10);
            a();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException(RemoveCommand.ID);
        }
    }

    public BlockingObservableIterable(ObservableSource<? extends T> observableSource, int i10) {
        this.f72009p0 = observableSource;
        this.f72010q0 = i10;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f72010q0);
        this.f72009p0.subscribe(aVar);
        return aVar;
    }
}
