package io.reactivex.internal.operators.flowable;

import com.bbva.plugin.localstorage.command.RemoveCommand;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class BlockingFlowableIterable<T> implements Iterable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f70157p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f70158q0;

    public static final class a<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Iterator<T>, Runnable, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SpscArrayQueue<T> f70159p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f70160q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f70161r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final ReentrantLock f70162s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Condition f70163t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f70164u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile Throwable f70165w0;

        public a(int i10) {
            this.f70159p0 = new SpscArrayQueue<>(i10);
            this.f70160q0 = i10;
            this.f70161r0 = i10 - (i10 >> 2);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f70162s0 = reentrantLock;
            this.f70163t0 = reentrantLock.newCondition();
        }

        public final void a() {
            ReentrantLock reentrantLock = this.f70162s0;
            reentrantLock.lock();
            try {
                this.f70163t0.signalAll();
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            SubscriptionHelper.cancel(this);
            a();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (!isDisposed()) {
                boolean z10 = this.v0;
                boolean zIsEmpty = this.f70159p0.isEmpty();
                if (z10) {
                    Throwable th2 = this.f70165w0;
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
                BlockingHelper.verifyNonBlocking();
                this.f70162s0.lock();
                while (!this.v0 && this.f70159p0.isEmpty() && !isDisposed()) {
                    try {
                        try {
                            this.f70163t0.await();
                        } catch (InterruptedException e5) {
                            run();
                            throw ExceptionHelper.wrapOrThrow(e5);
                        }
                    } catch (Throwable th3) {
                        this.f70162s0.unlock();
                        throw th3;
                    }
                }
                this.f70162s0.unlock();
            }
            Throwable th4 = this.f70165w0;
            if (th4 == null) {
                return false;
            }
            throw ExceptionHelper.wrapOrThrow(th4);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tPoll = this.f70159p0.poll();
            long j10 = this.f70164u0 + 1;
            if (j10 == this.f70161r0) {
                this.f70164u0 = 0L;
                get().request(j10);
            } else {
                this.f70164u0 = j10;
            }
            return tPoll;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.v0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f70165w0 = th2;
            this.v0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70159p0.offer(t10)) {
                a();
            } else {
                SubscriptionHelper.cancel(this);
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, this.f70160q0);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException(RemoveCommand.ID);
        }

        @Override // java.lang.Runnable
        public final void run() {
            SubscriptionHelper.cancel(this);
            a();
        }
    }

    public BlockingFlowableIterable(Flowable<T> flowable, int i10) {
        this.f70157p0 = flowable;
        this.f70158q0 = i10;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f70158q0);
        this.f70157p0.subscribe((FlowableSubscriber) aVar);
        return aVar;
    }
}
