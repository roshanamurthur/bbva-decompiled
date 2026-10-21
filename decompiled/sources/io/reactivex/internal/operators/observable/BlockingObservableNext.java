package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.ObservableSource;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingObservableNext<T> implements Iterable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72025p0;

    public static final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T> f72026p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ObservableSource<T> f72027q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f72028r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f72029s0 = true;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f72030t0 = true;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Throwable f72031u0;
        public boolean v0;

        public a(ObservableSource<T> observableSource, b<T> bVar) {
            this.f72027q0 = observableSource;
            this.f72026p0 = bVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Throwable th2 = this.f72031u0;
            if (th2 != null) {
                throw ExceptionHelper.wrapOrThrow(th2);
            }
            if (!this.f72029s0) {
                return false;
            }
            if (this.f72030t0) {
                boolean z10 = this.v0;
                b<T> bVar = this.f72026p0;
                if (!z10) {
                    this.v0 = true;
                    bVar.f72033r0.set(1);
                    new ObservableMaterialize(this.f72027q0).subscribe(bVar);
                }
                try {
                    bVar.f72033r0.set(1);
                    BlockingHelper.verifyNonBlocking();
                    Notification notification = (Notification) bVar.f72032q0.take();
                    if (!notification.isOnNext()) {
                        this.f72029s0 = false;
                        if (notification.isOnComplete()) {
                            return false;
                        }
                        Throwable error = notification.getError();
                        this.f72031u0 = error;
                        throw ExceptionHelper.wrapOrThrow(error);
                    }
                    this.f72030t0 = false;
                    this.f72028r0 = (T) notification.getValue();
                } catch (InterruptedException e5) {
                    bVar.dispose();
                    this.f72031u0 = e5;
                    throw ExceptionHelper.wrapOrThrow(e5);
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public final T next() {
            Throwable th2 = this.f72031u0;
            if (th2 != null) {
                throw ExceptionHelper.wrapOrThrow(th2);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f72030t0 = true;
            return this.f72028r0;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    public BlockingObservableNext(ObservableSource<T> observableSource) {
        this.f72025p0 = observableSource;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this.f72025p0, new b());
    }

    public static final class b<T> extends DisposableObserver<Notification<T>> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ArrayBlockingQueue f72032q0 = new ArrayBlockingQueue(1);

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicInteger f72033r0 = new AtomicInteger();

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            Notification notification = (Notification) obj;
            if (this.f72033r0.getAndSet(0) != 1 && notification.isOnNext()) {
                return;
            }
            while (true) {
                ArrayBlockingQueue arrayBlockingQueue = this.f72032q0;
                if (arrayBlockingQueue.offer(notification)) {
                    return;
                }
                Notification notification2 = (Notification) arrayBlockingQueue.poll();
                if (notification2 != null && !notification2.isOnNext()) {
                    notification = notification2;
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
        }
    }
}
