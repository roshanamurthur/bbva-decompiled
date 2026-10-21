package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeConcatIterable<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Iterable<? extends MaybeSource<? extends T>> f75771q0;

    public static final class a<T> extends AtomicInteger implements MaybeObserver<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75772p0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Iterator<? extends MaybeSource<? extends T>> f75776t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f75777u0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicLong f75773q0 = new AtomicLong();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final SequentialDisposable f75775s0 = new SequentialDisposable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Object> f75774r0 = new AtomicReference<>(NotificationLite.COMPLETE);

        public a(Subscriber<? super T> subscriber, Iterator<? extends MaybeSource<? extends T>> it) {
            this.f75772p0 = subscriber;
            this.f75776t0 = it;
        }

        public final void a() {
            Iterator<? extends MaybeSource<? extends T>> it = this.f75776t0;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f75774r0;
            do {
                SequentialDisposable sequentialDisposable = this.f75775s0;
                if (sequentialDisposable.isDisposed()) {
                    atomicReference.lazySet(null);
                    return;
                }
                Object obj = atomicReference.get();
                if (obj != null) {
                    NotificationLite notificationLite = NotificationLite.COMPLETE;
                    Subscriber<? super T> subscriber = this.f75772p0;
                    if (obj != notificationLite) {
                        long j10 = this.f75777u0;
                        if (j10 != this.f75773q0.get()) {
                            this.f75777u0 = j10 + 1;
                            atomicReference.lazySet(null);
                            subscriber.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!sequentialDisposable.isDisposed()) {
                        try {
                            if (it.hasNext()) {
                                try {
                                    MaybeSource<? extends T> next = it.next();
                                    Objects.requireNonNull(next, "The source Iterator returned a null MaybeSource");
                                    next.subscribe(this);
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    subscriber.onError(th2);
                                    return;
                                }
                            } else {
                                subscriber.onComplete();
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            subscriber.onError(th3);
                            return;
                        }
                    }
                }
            } while (decrementAndGet() != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f75775s0.dispose();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f75774r0.lazySet(NotificationLite.COMPLETE);
            a();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75772p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f75775s0.replace(disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f75774r0.lazySet(t10);
            a();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f75773q0, j10);
                a();
            }
        }
    }

    public MaybeConcatIterable(Iterable<? extends MaybeSource<? extends T>> iterable) {
        this.f75771q0 = iterable;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        try {
            Iterator<? extends MaybeSource<? extends T>> it = this.f75771q0.iterator();
            Objects.requireNonNull(it, "The sources Iterable returned a null Iterator");
            a aVar = new a(subscriber, it);
            subscriber.onSubscribe(aVar);
            aVar.a();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
