package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.DefaultObserver;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingObservableMostRecent<T> implements Iterable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72020p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f72021q0;

    public static final class a<T> extends DefaultObserver<T> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public volatile Object f72022q0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.BlockingObservableMostRecent$a$a, reason: collision with other inner class name */
        public final class C0337a implements Iterator<T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public Object f72023p0;

            public C0337a() {
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                Object obj = a.this.f72022q0;
                this.f72023p0 = obj;
                return !NotificationLite.isComplete(obj);
            }

            @Override // java.util.Iterator
            public final T next() {
                try {
                    if (this.f72023p0 == null) {
                        this.f72023p0 = a.this.f72022q0;
                    }
                    if (NotificationLite.isComplete(this.f72023p0)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.isError(this.f72023p0)) {
                        throw ExceptionHelper.wrapOrThrow(NotificationLite.getError(this.f72023p0));
                    }
                    T t10 = (T) NotificationLite.getValue(this.f72023p0);
                    this.f72023p0 = null;
                    return t10;
                } catch (Throwable th2) {
                    this.f72023p0 = null;
                    throw th2;
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72022q0 = NotificationLite.complete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72022q0 = NotificationLite.error(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72022q0 = NotificationLite.next(t10);
        }
    }

    public BlockingObservableMostRecent(ObservableSource<T> observableSource, T t10) {
        this.f72020p0 = observableSource;
        this.f72021q0 = t10;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        T t10 = this.f72021q0;
        a aVar = new a();
        aVar.f72022q0 = NotificationLite.next(t10);
        this.f72020p0.subscribe(aVar);
        return new a.C0337a();
    }
}
