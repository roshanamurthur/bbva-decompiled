package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.internal.util.BlockingHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.observers.DisposableObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingObservableLatest<T> implements Iterable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f76280p0;

    public BlockingObservableLatest(ObservableSource<T> observableSource) {
        this.f76280p0 = observableSource;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a();
        Observable.wrap(this.f76280p0).materialize().subscribe(aVar);
        return aVar;
    }

    public static final class a<T> extends DisposableObserver<Notification<T>> implements Iterator<T> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Notification<T> f76281q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Semaphore f76282r0 = new Semaphore(0);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<Notification<T>> f76283s0 = new AtomicReference<>();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Notification<T> notification = this.f76281q0;
            if (notification != null && notification.isOnError()) {
                throw ExceptionHelper.wrapOrThrow(this.f76281q0.getError());
            }
            if (this.f76281q0 == null) {
                try {
                    BlockingHelper.verifyNonBlocking();
                    this.f76282r0.acquire();
                    Notification<T> andSet = this.f76283s0.getAndSet(null);
                    this.f76281q0 = andSet;
                    if (andSet.isOnError()) {
                        throw ExceptionHelper.wrapOrThrow(andSet.getError());
                    }
                } catch (InterruptedException e5) {
                    dispose();
                    this.f76281q0 = Notification.createOnError(e5);
                    throw ExceptionHelper.wrapOrThrow(e5);
                }
            }
            return this.f76281q0.isOnNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T value = this.f76281q0.getValue();
            this.f76281q0 = null;
            return value;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f76283s0.getAndSet((Notification) obj) == null) {
                this.f76282r0.release();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
        }
    }
}
