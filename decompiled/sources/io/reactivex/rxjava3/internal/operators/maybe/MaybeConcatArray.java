package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeConcatArray<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MaybeSource<? extends T>[] f75756q0;

    public static final class a<T> extends AtomicInteger implements MaybeObserver<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75757p0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final MaybeSource<? extends T>[] f75761t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f75762u0;
        public long v0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicLong f75758q0 = new AtomicLong();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final SequentialDisposable f75760s0 = new SequentialDisposable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Object> f75759r0 = new AtomicReference<>(NotificationLite.COMPLETE);

        public a(Subscriber<? super T> subscriber, MaybeSource<? extends T>[] maybeSourceArr) {
            this.f75757p0 = subscriber;
            this.f75761t0 = maybeSourceArr;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f75759r0;
            do {
                SequentialDisposable sequentialDisposable = this.f75760s0;
                if (sequentialDisposable.isDisposed()) {
                    atomicReference.lazySet(null);
                    return;
                }
                Object obj = atomicReference.get();
                if (obj != null) {
                    NotificationLite notificationLite = NotificationLite.COMPLETE;
                    Subscriber<? super T> subscriber = this.f75757p0;
                    if (obj != notificationLite) {
                        long j10 = this.v0;
                        if (j10 != this.f75758q0.get()) {
                            this.v0 = j10 + 1;
                            atomicReference.lazySet(null);
                            subscriber.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!sequentialDisposable.isDisposed()) {
                        int i10 = this.f75762u0;
                        MaybeSource<? extends T>[] maybeSourceArr = this.f75761t0;
                        if (i10 == maybeSourceArr.length) {
                            subscriber.onComplete();
                            return;
                        } else {
                            this.f75762u0 = i10 + 1;
                            maybeSourceArr[i10].subscribe(this);
                        }
                    }
                }
            } while (decrementAndGet() != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f75760s0.dispose();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f75759r0.lazySet(NotificationLite.COMPLETE);
            a();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75757p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f75760s0.replace(disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f75759r0.lazySet(t10);
            a();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f75758q0, j10);
                a();
            }
        }
    }

    public MaybeConcatArray(MaybeSource<? extends T>[] maybeSourceArr) {
        this.f75756q0 = maybeSourceArr;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber, this.f75756q0);
        subscriber.onSubscribe(aVar);
        aVar.a();
    }
}
