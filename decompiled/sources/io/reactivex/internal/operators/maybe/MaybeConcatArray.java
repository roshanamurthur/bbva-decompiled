package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeConcatArray<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MaybeSource<? extends T>[] f71522q0;

    public static final class a<T> extends AtomicInteger implements MaybeObserver<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71523p0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final MaybeSource<? extends T>[] f71527t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f71528u0;
        public long v0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicLong f71524q0 = new AtomicLong();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final SequentialDisposable f71526s0 = new SequentialDisposable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Object> f71525r0 = new AtomicReference<>(NotificationLite.COMPLETE);

        public a(Subscriber<? super T> subscriber, MaybeSource<? extends T>[] maybeSourceArr) {
            this.f71523p0 = subscriber;
            this.f71527t0 = maybeSourceArr;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f71525r0;
            do {
                SequentialDisposable sequentialDisposable = this.f71526s0;
                if (sequentialDisposable.isDisposed()) {
                    atomicReference.lazySet(null);
                    return;
                }
                Object obj = atomicReference.get();
                if (obj != null) {
                    NotificationLite notificationLite = NotificationLite.COMPLETE;
                    Subscriber<? super T> subscriber = this.f71523p0;
                    if (obj != notificationLite) {
                        long j10 = this.v0;
                        if (j10 != this.f71524q0.get()) {
                            this.v0 = j10 + 1;
                            atomicReference.lazySet(null);
                            subscriber.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!sequentialDisposable.isDisposed()) {
                        int i10 = this.f71528u0;
                        MaybeSource<? extends T>[] maybeSourceArr = this.f71527t0;
                        if (i10 == maybeSourceArr.length) {
                            subscriber.onComplete();
                            return;
                        } else {
                            this.f71528u0 = i10 + 1;
                            maybeSourceArr[i10].subscribe(this);
                        }
                    }
                }
            } while (decrementAndGet() != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f71526s0.dispose();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71525r0.lazySet(NotificationLite.COMPLETE);
            a();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71523p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            this.f71526s0.replace(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71525r0.lazySet(t10);
            a();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f71524q0, j10);
                a();
            }
        }
    }

    public MaybeConcatArray(MaybeSource<? extends T>[] maybeSourceArr) {
        this.f71522q0 = maybeSourceArr;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber, this.f71522q0);
        subscriber.onSubscribe(aVar);
        aVar.a();
    }
}
