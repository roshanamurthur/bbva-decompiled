package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.internal.util.BlockingHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.subscribers.DisposableSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingFlowableLatest<T> implements Iterable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<? extends T> f74428p0;

    public BlockingFlowableLatest(Publisher<? extends T> publisher) {
        this.f74428p0 = publisher;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a();
        Flowable.fromPublisher(this.f74428p0).materialize().subscribe((FlowableSubscriber<? super Notification<T>>) aVar);
        return aVar;
    }

    public static final class a<T> extends DisposableSubscriber<Notification<T>> implements Iterator<T> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Semaphore f74429q0 = new Semaphore(0);

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Notification<T>> f74430r0 = new AtomicReference<>();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Notification<T> f74431s0;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Notification<T> notification = this.f74431s0;
            if (notification != null && notification.isOnError()) {
                throw ExceptionHelper.wrapOrThrow(this.f74431s0.getError());
            }
            Notification<T> notification2 = this.f74431s0;
            if ((notification2 == null || notification2.isOnNext()) && this.f74431s0 == null) {
                try {
                    BlockingHelper.verifyNonBlocking();
                    this.f74429q0.acquire();
                    Notification<T> andSet = this.f74430r0.getAndSet(null);
                    this.f74431s0 = andSet;
                    if (andSet.isOnError()) {
                        throw ExceptionHelper.wrapOrThrow(andSet.getError());
                    }
                } catch (InterruptedException e5) {
                    dispose();
                    this.f74431s0 = Notification.createOnError(e5);
                    throw ExceptionHelper.wrapOrThrow(e5);
                }
            }
            return this.f74431s0.isOnNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext() || !this.f74431s0.isOnNext()) {
                throw new NoSuchElementException();
            }
            T value = this.f74431s0.getValue();
            this.f74431s0 = null;
            return value;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            RxJavaPlugins.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f74430r0.getAndSet((Notification) obj) == null) {
                this.f74429q0.release();
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
