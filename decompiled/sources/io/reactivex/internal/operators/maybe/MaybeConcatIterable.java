package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeConcatIterable<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Iterable<? extends MaybeSource<? extends T>> f71537q0;

    public static final class a<T> extends AtomicInteger implements MaybeObserver<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71538p0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Iterator<? extends MaybeSource<? extends T>> f71542t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f71543u0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicLong f71539q0 = new AtomicLong();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final SequentialDisposable f71541s0 = new SequentialDisposable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Object> f71540r0 = new AtomicReference<>(NotificationLite.COMPLETE);

        public a(Subscriber<? super T> subscriber, Iterator<? extends MaybeSource<? extends T>> it) {
            this.f71538p0 = subscriber;
            this.f71542t0 = it;
        }

        public final void a() {
            Iterator<? extends MaybeSource<? extends T>> it = this.f71542t0;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f71540r0;
            do {
                SequentialDisposable sequentialDisposable = this.f71541s0;
                if (sequentialDisposable.isDisposed()) {
                    atomicReference.lazySet(null);
                    return;
                }
                Object obj = atomicReference.get();
                if (obj != null) {
                    NotificationLite notificationLite = NotificationLite.COMPLETE;
                    Subscriber<? super T> subscriber = this.f71538p0;
                    if (obj != notificationLite) {
                        long j10 = this.f71543u0;
                        if (j10 != this.f71539q0.get()) {
                            this.f71543u0 = j10 + 1;
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
                                    ((MaybeSource) ObjectHelper.requireNonNull(it.next(), "The source Iterator returned a null MaybeSource")).subscribe(this);
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
            this.f71541s0.dispose();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71540r0.lazySet(NotificationLite.COMPLETE);
            a();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71538p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            this.f71541s0.replace(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71540r0.lazySet(t10);
            a();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f71539q0, j10);
                a();
            }
        }
    }

    public MaybeConcatIterable(Iterable<? extends MaybeSource<? extends T>> iterable) {
        this.f71537q0 = iterable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        try {
            a aVar = new a(subscriber, (Iterator) ObjectHelper.requireNonNull(this.f71537q0.iterator(), "The sources Iterable returned a null Iterator"));
            subscriber.onSubscribe(aVar);
            aVar.a();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
