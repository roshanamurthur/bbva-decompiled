package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeConcatArrayDelayError<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MaybeSource<? extends T>[] f75763q0;

    public static final class a<T> extends AtomicInteger implements MaybeObserver<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75764p0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final MaybeSource<? extends T>[] f75768t0;
        public int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public long f75770w0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicLong f75765q0 = new AtomicLong();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final SequentialDisposable f75767s0 = new SequentialDisposable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Object> f75766r0 = new AtomicReference<>(NotificationLite.COMPLETE);

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicThrowable f75769u0 = new AtomicThrowable();

        public a(Subscriber<? super T> subscriber, MaybeSource<? extends T>[] maybeSourceArr) {
            this.f75764p0 = subscriber;
            this.f75768t0 = maybeSourceArr;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f75766r0;
            do {
                SequentialDisposable sequentialDisposable = this.f75767s0;
                if (sequentialDisposable.isDisposed()) {
                    atomicReference.lazySet(null);
                    return;
                }
                Object obj = atomicReference.get();
                if (obj != null) {
                    NotificationLite notificationLite = NotificationLite.COMPLETE;
                    Subscriber<? super T> subscriber = this.f75764p0;
                    if (obj != notificationLite) {
                        long j10 = this.f75770w0;
                        if (j10 != this.f75765q0.get()) {
                            this.f75770w0 = j10 + 1;
                            atomicReference.lazySet(null);
                            subscriber.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!sequentialDisposable.isDisposed()) {
                        int i10 = this.v0;
                        MaybeSource<? extends T>[] maybeSourceArr = this.f75768t0;
                        if (i10 == maybeSourceArr.length) {
                            this.f75769u0.tryTerminateConsumer(subscriber);
                            return;
                        } else {
                            this.v0 = i10 + 1;
                            maybeSourceArr[i10].subscribe(this);
                        }
                    }
                }
            } while (decrementAndGet() != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f75767s0.dispose();
            this.f75769u0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f75766r0.lazySet(NotificationLite.COMPLETE);
            a();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75766r0.lazySet(NotificationLite.COMPLETE);
            if (this.f75769u0.tryAddThrowableOrReport(th2)) {
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f75767s0.replace(disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f75766r0.lazySet(t10);
            a();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f75765q0, j10);
                a();
            }
        }
    }

    public MaybeConcatArrayDelayError(MaybeSource<? extends T>[] maybeSourceArr) {
        this.f75763q0 = maybeSourceArr;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber, this.f75763q0);
        subscriber.onSubscribe(aVar);
        aVar.a();
    }
}
