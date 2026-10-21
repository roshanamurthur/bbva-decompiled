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
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes11.dex */
public final class BlockingFlowableNext<T> implements Iterable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<? extends T> f70175p0;

    public static final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T> f70176p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Publisher<? extends T> f70177q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f70178r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f70179s0 = true;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f70180t0 = true;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Throwable f70181u0;
        public boolean v0;

        public a(Publisher<? extends T> publisher, b<T> bVar) {
            this.f70177q0 = publisher;
            this.f70176p0 = bVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Throwable th2 = this.f70181u0;
            if (th2 != null) {
                throw ExceptionHelper.wrapOrThrow(th2);
            }
            if (!this.f70179s0) {
                return false;
            }
            if (this.f70180t0) {
                b<T> bVar = this.f70176p0;
                try {
                    if (!this.v0) {
                        this.v0 = true;
                        bVar.f70183r0.set(1);
                        Flowable.fromPublisher(this.f70177q0).materialize().subscribe((FlowableSubscriber<? super Notification<T>>) bVar);
                    }
                    bVar.f70183r0.set(1);
                    BlockingHelper.verifyNonBlocking();
                    Notification notification = (Notification) bVar.f70182q0.take();
                    if (!notification.isOnNext()) {
                        this.f70179s0 = false;
                        if (notification.isOnComplete()) {
                            return false;
                        }
                        if (!notification.isOnError()) {
                            throw new IllegalStateException("Should not reach here");
                        }
                        Throwable error = notification.getError();
                        this.f70181u0 = error;
                        throw ExceptionHelper.wrapOrThrow(error);
                    }
                    this.f70180t0 = false;
                    this.f70178r0 = (T) notification.getValue();
                } catch (InterruptedException e5) {
                    bVar.dispose();
                    this.f70181u0 = e5;
                    throw ExceptionHelper.wrapOrThrow(e5);
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public final T next() {
            Throwable th2 = this.f70181u0;
            if (th2 != null) {
                throw ExceptionHelper.wrapOrThrow(th2);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f70180t0 = true;
            return this.f70178r0;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    public BlockingFlowableNext(Publisher<? extends T> publisher) {
        this.f70175p0 = publisher;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this.f70175p0, new b());
    }

    public static final class b<T> extends DisposableSubscriber<Notification<T>> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ArrayBlockingQueue f70182q0 = new ArrayBlockingQueue(1);

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicInteger f70183r0 = new AtomicInteger();

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            RxJavaPlugins.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Notification notification = (Notification) obj;
            if (this.f70183r0.getAndSet(0) != 1 && notification.isOnNext()) {
                return;
            }
            while (true) {
                ArrayBlockingQueue arrayBlockingQueue = this.f70182q0;
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
