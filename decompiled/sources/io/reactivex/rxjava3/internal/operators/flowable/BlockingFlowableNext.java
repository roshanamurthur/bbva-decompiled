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
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingFlowableNext<T> implements Iterable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<? extends T> f74437p0;

    public static final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T> f74438p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Publisher<? extends T> f74439q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f74440r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f74441s0 = true;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f74442t0 = true;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Throwable f74443u0;
        public boolean v0;

        public a(Publisher<? extends T> publisher, b<T> bVar) {
            this.f74439q0 = publisher;
            this.f74438p0 = bVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Throwable th2 = this.f74443u0;
            if (th2 != null) {
                throw ExceptionHelper.wrapOrThrow(th2);
            }
            if (!this.f74441s0) {
                return false;
            }
            if (this.f74442t0) {
                b<T> bVar = this.f74438p0;
                try {
                    if (!this.v0) {
                        this.v0 = true;
                        bVar.f74445r0.set(1);
                        Flowable.fromPublisher(this.f74439q0).materialize().subscribe((FlowableSubscriber<? super Notification<T>>) bVar);
                    }
                    bVar.f74445r0.set(1);
                    BlockingHelper.verifyNonBlocking();
                    Notification notification = (Notification) bVar.f74444q0.take();
                    if (!notification.isOnNext()) {
                        this.f74441s0 = false;
                        if (notification.isOnComplete()) {
                            return false;
                        }
                        Throwable error = notification.getError();
                        this.f74443u0 = error;
                        throw ExceptionHelper.wrapOrThrow(error);
                    }
                    this.f74442t0 = false;
                    this.f74440r0 = (T) notification.getValue();
                } catch (InterruptedException e5) {
                    bVar.dispose();
                    this.f74443u0 = e5;
                    throw ExceptionHelper.wrapOrThrow(e5);
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public final T next() {
            Throwable th2 = this.f74443u0;
            if (th2 != null) {
                throw ExceptionHelper.wrapOrThrow(th2);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f74442t0 = true;
            return this.f74440r0;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    public BlockingFlowableNext(Publisher<? extends T> publisher) {
        this.f74437p0 = publisher;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this.f74437p0, new b());
    }

    public static final class b<T> extends DisposableSubscriber<Notification<T>> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ArrayBlockingQueue f74444q0 = new ArrayBlockingQueue(1);

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicInteger f74445r0 = new AtomicInteger();

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            RxJavaPlugins.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Notification notification = (Notification) obj;
            if (this.f74445r0.getAndSet(0) != 1 && notification.isOnNext()) {
                return;
            }
            while (true) {
                ArrayBlockingQueue arrayBlockingQueue = this.f74444q0;
                if (arrayBlockingQueue.offer(notification)) {
                    return;
                }
                Notification notification2 = (Notification) arrayBlockingQueue.poll();
                if (notification2 != null && !notification2.isOnNext()) {
                    notification = notification2;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }
    }
}
