package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.internal.util.BlockingHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.observers.DisposableObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingObservableNext<T> implements Iterable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f76289p0;

    public static final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T> f76290p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ObservableSource<T> f76291q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f76292r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f76293s0 = true;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f76294t0 = true;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Throwable f76295u0;
        public boolean v0;

        public a(ObservableSource<T> observableSource, b<T> bVar) {
            this.f76291q0 = observableSource;
            this.f76290p0 = bVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Throwable th2 = this.f76295u0;
            if (th2 != null) {
                throw ExceptionHelper.wrapOrThrow(th2);
            }
            if (!this.f76293s0) {
                return false;
            }
            if (this.f76294t0) {
                boolean z10 = this.v0;
                b<T> bVar = this.f76290p0;
                if (!z10) {
                    this.v0 = true;
                    bVar.f76297r0.set(1);
                    new ObservableMaterialize(this.f76291q0).subscribe(bVar);
                }
                try {
                    bVar.f76297r0.set(1);
                    BlockingHelper.verifyNonBlocking();
                    Notification notification = (Notification) bVar.f76296q0.take();
                    if (!notification.isOnNext()) {
                        this.f76293s0 = false;
                        if (notification.isOnComplete()) {
                            return false;
                        }
                        Throwable error = notification.getError();
                        this.f76295u0 = error;
                        throw ExceptionHelper.wrapOrThrow(error);
                    }
                    this.f76294t0 = false;
                    this.f76292r0 = (T) notification.getValue();
                } catch (InterruptedException e5) {
                    bVar.dispose();
                    this.f76295u0 = e5;
                    throw ExceptionHelper.wrapOrThrow(e5);
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public final T next() {
            Throwable th2 = this.f76295u0;
            if (th2 != null) {
                throw ExceptionHelper.wrapOrThrow(th2);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f76294t0 = true;
            return this.f76292r0;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    public BlockingObservableNext(ObservableSource<T> observableSource) {
        this.f76289p0 = observableSource;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this.f76289p0, new b());
    }

    public static final class b<T> extends DisposableObserver<Notification<T>> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ArrayBlockingQueue f76296q0 = new ArrayBlockingQueue(1);

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicInteger f76297r0 = new AtomicInteger();

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            Notification notification = (Notification) obj;
            if (this.f76297r0.getAndSet(0) != 1 && notification.isOnNext()) {
                return;
            }
            while (true) {
                ArrayBlockingQueue arrayBlockingQueue = this.f76296q0;
                if (arrayBlockingQueue.offer(notification)) {
                    return;
                }
                Notification notification2 = (Notification) arrayBlockingQueue.poll();
                if (notification2 != null && !notification2.isOnNext()) {
                    notification = notification2;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
        }
    }
}
