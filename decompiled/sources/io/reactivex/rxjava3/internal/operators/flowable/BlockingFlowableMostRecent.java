package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.subscribers.DefaultSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingFlowableMostRecent<T> implements Iterable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f74432p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f74433q0;

    public static final class a<T> extends DefaultSubscriber<T> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public volatile Object f74434q0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.flowable.BlockingFlowableMostRecent$a$a, reason: collision with other inner class name */
        public final class C0364a implements Iterator<T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public Object f74435p0;

            public C0364a() {
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                Object obj = a.this.f74434q0;
                this.f74435p0 = obj;
                return !NotificationLite.isComplete(obj);
            }

            @Override // java.util.Iterator
            public final T next() {
                try {
                    if (this.f74435p0 == null) {
                        this.f74435p0 = a.this.f74434q0;
                    }
                    if (NotificationLite.isComplete(this.f74435p0)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.isError(this.f74435p0)) {
                        throw ExceptionHelper.wrapOrThrow(NotificationLite.getError(this.f74435p0));
                    }
                    T t10 = (T) NotificationLite.getValue(this.f74435p0);
                    this.f74435p0 = null;
                    return t10;
                } catch (Throwable th2) {
                    this.f74435p0 = null;
                    throw th2;
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74434q0 = NotificationLite.complete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f74434q0 = NotificationLite.error(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f74434q0 = NotificationLite.next(t10);
        }
    }

    public BlockingFlowableMostRecent(Flowable<T> flowable, T t10) {
        this.f74432p0 = flowable;
        this.f74433q0 = t10;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        T t10 = this.f74433q0;
        a aVar = new a();
        aVar.f74434q0 = NotificationLite.next(t10);
        this.f74432p0.subscribe((FlowableSubscriber) aVar);
        return new a.C0364a();
    }
}
