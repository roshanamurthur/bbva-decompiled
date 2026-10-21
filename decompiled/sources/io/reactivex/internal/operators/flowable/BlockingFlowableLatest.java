package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes11.dex */
public final class BlockingFlowableLatest<T> implements Iterable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<? extends T> f70166p0;

    public BlockingFlowableLatest(Publisher<? extends T> publisher) {
        this.f70166p0 = publisher;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a();
        Flowable.fromPublisher(this.f70166p0).materialize().subscribe((FlowableSubscriber<? super Notification<T>>) aVar);
        return aVar;
    }

    public static final class a<T> extends DisposableSubscriber<Notification<T>> implements Iterator<T> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Semaphore f70167q0 = new Semaphore(0);

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Notification<T>> f70168r0 = new AtomicReference<>();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Notification<T> f70169s0;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Notification<T> notification = this.f70169s0;
            if (notification != null && notification.isOnError()) {
                throw ExceptionHelper.wrapOrThrow(this.f70169s0.getError());
            }
            Notification<T> notification2 = this.f70169s0;
            if ((notification2 == null || notification2.isOnNext()) && this.f70169s0 == null) {
                try {
                    BlockingHelper.verifyNonBlocking();
                    this.f70167q0.acquire();
                    Notification<T> andSet = this.f70168r0.getAndSet(null);
                    this.f70169s0 = andSet;
                    if (andSet.isOnError()) {
                        throw ExceptionHelper.wrapOrThrow(andSet.getError());
                    }
                } catch (InterruptedException e5) {
                    dispose();
                    this.f70169s0 = Notification.createOnError(e5);
                    throw ExceptionHelper.wrapOrThrow(e5);
                }
            }
            return this.f70169s0.isOnNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext() || !this.f70169s0.isOnNext()) {
                throw new NoSuchElementException();
            }
            T value = this.f70169s0.getValue();
            this.f70169s0 = null;
            return value;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            RxJavaPlugins.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f70168r0.getAndSet((Notification) obj) == null) {
                this.f70167q0.release();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }
    }
}
