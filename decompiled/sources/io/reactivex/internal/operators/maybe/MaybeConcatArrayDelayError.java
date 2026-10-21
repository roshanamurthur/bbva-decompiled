package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeConcatArrayDelayError<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MaybeSource<? extends T>[] f71529q0;

    public static final class a<T> extends AtomicInteger implements MaybeObserver<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71530p0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final MaybeSource<? extends T>[] f71534t0;
        public int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public long f71536w0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicLong f71531q0 = new AtomicLong();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final SequentialDisposable f71533s0 = new SequentialDisposable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Object> f71532r0 = new AtomicReference<>(NotificationLite.COMPLETE);

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicThrowable f71535u0 = new AtomicThrowable();

        public a(Subscriber<? super T> subscriber, MaybeSource<? extends T>[] maybeSourceArr) {
            this.f71530p0 = subscriber;
            this.f71534t0 = maybeSourceArr;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f71532r0;
            do {
                SequentialDisposable sequentialDisposable = this.f71533s0;
                if (sequentialDisposable.isDisposed()) {
                    atomicReference.lazySet(null);
                    return;
                }
                Object obj = atomicReference.get();
                if (obj != null) {
                    NotificationLite notificationLite = NotificationLite.COMPLETE;
                    Subscriber<? super T> subscriber = this.f71530p0;
                    if (obj != notificationLite) {
                        long j10 = this.f71536w0;
                        if (j10 != this.f71531q0.get()) {
                            this.f71536w0 = j10 + 1;
                            atomicReference.lazySet(null);
                            subscriber.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!sequentialDisposable.isDisposed()) {
                        int i10 = this.v0;
                        MaybeSource<? extends T>[] maybeSourceArr = this.f71534t0;
                        if (i10 == maybeSourceArr.length) {
                            AtomicThrowable atomicThrowable = this.f71535u0;
                            if (atomicThrowable.get() != null) {
                                subscriber.onError(atomicThrowable.terminate());
                                return;
                            } else {
                                subscriber.onComplete();
                                return;
                            }
                        }
                        this.v0 = i10 + 1;
                        maybeSourceArr[i10].subscribe(this);
                    }
                }
            } while (decrementAndGet() != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f71533s0.dispose();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71532r0.lazySet(NotificationLite.COMPLETE);
            a();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71532r0.lazySet(NotificationLite.COMPLETE);
            if (this.f71535u0.addThrowable(th2)) {
                a();
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            this.f71533s0.replace(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71532r0.lazySet(t10);
            a();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f71531q0, j10);
                a();
            }
        }
    }

    public MaybeConcatArrayDelayError(MaybeSource<? extends T>[] maybeSourceArr) {
        this.f71529q0 = maybeSourceArr;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber, this.f71529q0);
        subscriber.onSubscribe(aVar);
        aVar.a();
    }
}
