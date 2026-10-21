package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class AsyncProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final a[] f78264t0 = new a[0];

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final a[] f78265u0 = new a[0];

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f78266q0 = new AtomicReference<>(f78264t0);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Throwable f78267r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public T f78268s0;

    public static final class a<T> extends DeferredScalarSubscription<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AsyncProcessor<T> f78269p0;

        public a(Subscriber<? super T> subscriber, AsyncProcessor<T> asyncProcessor) {
            super(subscriber);
            this.f78269p0 = asyncProcessor;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            if (super.tryCancel()) {
                this.f78269p0.e(this);
            }
        }

        public final void onComplete() {
            if (isCancelled()) {
                return;
            }
            this.downstream.onComplete();
        }

        public final void onError(Throwable th2) {
            if (isCancelled()) {
                RxJavaPlugins.onError(th2);
            } else {
                this.downstream.onError(th2);
            }
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> AsyncProcessor<T> create() {
        return new AsyncProcessor<>();
    }

    public final void e(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78266q0;
            a<T>[] aVarArr2 = atomicReference.get();
            int length = aVarArr2.length;
            if (length == 0) {
                return;
            }
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
            if (length == 1) {
                aVarArr = f78264t0;
            } else {
                a<T>[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr2, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr = aVarArr3;
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
        if (this.f78266q0.get() == f78265u0) {
            return this.f78267r0;
        }
        return null;
    }

    @CheckReturnValue
    @Nullable
    public T getValue() {
        if (this.f78266q0.get() == f78265u0) {
            return this.f78268s0;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasComplete() {
        return this.f78266q0.get() == f78265u0 && this.f78267r0 == null;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasSubscribers() {
        return this.f78266q0.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasThrowable() {
        return this.f78266q0.get() == f78265u0 && this.f78267r0 != null;
    }

    @CheckReturnValue
    public boolean hasValue() {
        return this.f78266q0.get() == f78265u0 && this.f78268s0 != null;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        AtomicReference<a<T>[]> atomicReference = this.f78266q0;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = f78265u0;
        if (aVarArr == aVarArr2) {
            return;
        }
        T t10 = this.f78268s0;
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        int i10 = 0;
        if (t10 == null) {
            int length = andSet.length;
            while (i10 < length) {
                andSet[i10].onComplete();
                i10++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i10 < length2) {
            andSet[i10].complete(t10);
            i10++;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(@NonNull Throwable th2) {
        ExceptionHelper.nullCheck(th2, "onError called with a null Throwable.");
        AtomicReference<a<T>[]> atomicReference = this.f78266q0;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = f78265u0;
        if (aVarArr == aVarArr2) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f78268s0 = null;
        this.f78267r0 = th2;
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            aVar.onError(th2);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(@NonNull T t10) {
        ExceptionHelper.nullCheck(t10, "onNext called with a null value.");
        if (this.f78266q0.get() == f78265u0) {
            return;
        }
        this.f78268s0 = t10;
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(@NonNull Subscription subscription) {
        if (this.f78266q0.get() == f78265u0) {
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
            AtomicReference<a<T>[]> atomicReference = this.f78266q0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f78265u0) {
                Throwable th2 = this.f78267r0;
                if (th2 != null) {
                    subscriber.onError(th2);
                    return;
                }
                T t10 = this.f78268s0;
                if (t10 != null) {
                    aVar.complete(t10);
                    return;
                } else {
                    aVar.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (aVar.isCancelled()) {
                        e(aVar);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVarArr);
        }
    }
}
