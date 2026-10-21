package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingObservableLatest<T> implements Iterable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72016p0;

    public BlockingObservableLatest(ObservableSource<T> observableSource) {
        this.f72016p0 = observableSource;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a();
        Observable.wrap(this.f72016p0).materialize().subscribe(aVar);
        return aVar;
    }

    public static final class a<T> extends DisposableObserver<Notification<T>> implements Iterator<T> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Notification<T> f72017q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Semaphore f72018r0 = new Semaphore(0);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<Notification<T>> f72019s0 = new AtomicReference<>();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Notification<T> notification = this.f72017q0;
            if (notification != null && notification.isOnError()) {
                throw ExceptionHelper.wrapOrThrow(this.f72017q0.getError());
            }
            if (this.f72017q0 == null) {
                try {
                    BlockingHelper.verifyNonBlocking();
                    this.f72018r0.acquire();
                    Notification<T> andSet = this.f72019s0.getAndSet(null);
                    this.f72017q0 = andSet;
                    if (andSet.isOnError()) {
                        throw ExceptionHelper.wrapOrThrow(andSet.getError());
                    }
                } catch (InterruptedException e5) {
                    dispose();
                    this.f72017q0 = Notification.createOnError(e5);
                    throw ExceptionHelper.wrapOrThrow(e5);
                }
            }
            return this.f72017q0.isOnNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T value = this.f72017q0.getValue();
            this.f72017q0 = null;
            return value;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f72019s0.getAndSet((Notification) obj) == null) {
                this.f72018r0.release();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
        }
    }
}
