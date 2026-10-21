package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class PublishProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final a[] f78296s0 = new a[0];

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final a[] f78297t0 = new a[0];

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f78298q0 = new AtomicReference<>(f78297t0);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Throwable f78299r0;

    public static final class a<T> extends AtomicLong implements Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f78300p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final PublishProcessor<T> f78301q0;

        public a(Subscriber<? super T> subscriber, PublishProcessor<T> publishProcessor) {
            this.f78300p0 = subscriber;
            this.f78301q0 = publishProcessor;
        }

        public final void a(T t10) {
            long j10 = get();
            if (j10 == Long.MIN_VALUE) {
                return;
            }
            Subscriber<? super T> subscriber = this.f78300p0;
            if (j10 != 0) {
                subscriber.onNext(t10);
                BackpressureHelper.producedCancel(this, 1L);
            } else {
                cancel();
                subscriber.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f78301q0.e(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.addCancel(this, j10);
            }
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> PublishProcessor<T> create() {
        return new PublishProcessor<>();
    }

    public final void e(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78298q0;
            a<T>[] aVarArr2 = atomicReference.get();
            if (aVarArr2 == f78296s0 || aVarArr2 == (aVarArr = f78297t0)) {
                return;
            }
            int length = aVarArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (aVarArr2[i10] == aVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length != 1) {
                aVarArr = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr, 0, i10);
                System.arraycopy(aVarArr2, i10 + 1, aVarArr, i10, (length - i10) - 1);
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    @Nullable
    public Throwable getThrowable() {
        if (this.f78298q0.get() == f78296s0) {
            return this.f78299r0;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasComplete() {
        return this.f78298q0.get() == f78296s0 && this.f78299r0 == null;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasSubscribers() {
        return this.f78298q0.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasThrowable() {
        return this.f78298q0.get() == f78296s0 && this.f78299r0 != null;
    }

    @CheckReturnValue
    public boolean offer(@NonNull T t10) {
        ExceptionHelper.nullCheck(t10, "offer called with a null value.");
        a<T>[] aVarArr = this.f78298q0.get();
        for (a<T> aVar : aVarArr) {
            if (aVar.get() == 0) {
                return false;
            }
        }
        for (a<T> aVar2 : aVarArr) {
            aVar2.a(t10);
        }
        return true;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        AtomicReference<a<T>[]> atomicReference = this.f78298q0;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = f78296s0;
        if (aVarArr == aVarArr2) {
            return;
        }
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (aVar.get() != Long.MIN_VALUE) {
                aVar.f78300p0.onComplete();
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(@NonNull Throwable th2) {
        ExceptionHelper.nullCheck(th2, "onError called with a null Throwable.");
        AtomicReference<a<T>[]> atomicReference = this.f78298q0;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = f78296s0;
        if (aVarArr == aVarArr2) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f78299r0 = th2;
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (aVar.get() != Long.MIN_VALUE) {
                aVar.f78300p0.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(@NonNull T t10) {
        ExceptionHelper.nullCheck(t10, "onNext called with a null value.");
        for (a<T> aVar : this.f78298q0.get()) {
            aVar.a(t10);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(@NonNull Subscription subscription) {
        if (this.f78298q0.get() == f78296s0) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(@NonNull Subscriber<? super T> subscriber) {
        a<T> aVar = new a<>(subscriber, this);
        subscriber.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78298q0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f78296s0) {
                Throwable th2 = this.f78299r0;
                if (th2 != null) {
                    subscriber.onError(th2);
                    return;
                } else {
                    subscriber.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (aVar.get() == Long.MIN_VALUE) {
                        e(aVar);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVarArr);
        }
    }
}
