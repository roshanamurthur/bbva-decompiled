package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class BehaviorProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Object[] f78270w0 = null;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final a[] f78271x0 = new a[0];

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final a[] f78272y0 = new a[0];

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f78273q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Lock f78274r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Lock f78275s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final AtomicReference<Object> f78276t0 = new AtomicReference<>();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final AtomicReference<Throwable> f78277u0;
    public long v0;

    public static final class a<T> extends AtomicLong implements Subscription, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f78278p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BehaviorProcessor<T> f78279q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f78280r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f78281s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public AppendOnlyLinkedArrayList<Object> f78282t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f78283u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public long f78284w0;

        public a(Subscriber<? super T> subscriber, BehaviorProcessor<T> behaviorProcessor) {
            this.f78278p0 = subscriber;
            this.f78279q0 = behaviorProcessor;
        }

        public final void a() {
            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
            while (!this.v0) {
                synchronized (this) {
                    try {
                        appendOnlyLinkedArrayList = this.f78282t0;
                        if (appendOnlyLinkedArrayList == null) {
                            this.f78281s0 = false;
                            return;
                        }
                        this.f78282t0 = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                appendOnlyLinkedArrayList.forEachWhile(this);
            }
        }

        public final void b(long j10, Object obj) {
            if (this.v0) {
                return;
            }
            if (!this.f78283u0) {
                synchronized (this) {
                    try {
                        if (this.v0) {
                            return;
                        }
                        if (this.f78284w0 == j10) {
                            return;
                        }
                        if (this.f78281s0) {
                            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f78282t0;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                                this.f78282t0 = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.add(obj);
                            return;
                        }
                        this.f78280r0 = true;
                        this.f78283u0 = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            this.f78279q0.e(this);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this, j10);
            }
        }

        @Override // io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            if (this.v0) {
                return true;
            }
            if (NotificationLite.isComplete(obj)) {
                this.f78278p0.onComplete();
                return true;
            }
            if (NotificationLite.isError(obj)) {
                this.f78278p0.onError(NotificationLite.getError(obj));
                return true;
            }
            long j10 = get();
            if (j10 == 0) {
                cancel();
                this.f78278p0.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
            this.f78278p0.onNext((Object) NotificationLite.getValue(obj));
            if (j10 == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
    }

    public BehaviorProcessor() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f78274r0 = reentrantReadWriteLock.readLock();
        this.f78275s0 = reentrantReadWriteLock.writeLock();
        this.f78273q0 = new AtomicReference<>(f78271x0);
        this.f78277u0 = new AtomicReference<>();
    }

    @CheckReturnValue
    @NonNull
    public static <T> BehaviorProcessor<T> create() {
        return new BehaviorProcessor<>();
    }

    @CheckReturnValue
    @NonNull
    public static <T> BehaviorProcessor<T> createDefault(T t10) {
        Objects.requireNonNull(t10, "defaultValue is null");
        BehaviorProcessor<T> behaviorProcessor = new BehaviorProcessor<>();
        behaviorProcessor.f78276t0.lazySet(t10);
        return behaviorProcessor;
    }

    public final void e(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78273q0;
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
                aVarArr = f78271x0;
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

    public final void f(Object obj) {
        Lock lock = this.f78275s0;
        lock.lock();
        this.v0++;
        this.f78276t0.lazySet(obj);
        lock.unlock();
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    @Nullable
    public Throwable getThrowable() {
        Object obj = this.f78276t0.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @CheckReturnValue
    @Nullable
    public T getValue() {
        Object obj = this.f78276t0.get();
        if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) NotificationLite.getValue(obj);
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasComplete() {
        return NotificationLite.isComplete(this.f78276t0.get());
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasSubscribers() {
        return this.f78273q0.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasThrowable() {
        return NotificationLite.isError(this.f78276t0.get());
    }

    @CheckReturnValue
    public boolean hasValue() {
        Object obj = this.f78276t0.get();
        return (obj == null || NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? false : true;
    }

    @CheckReturnValue
    public boolean offer(@NonNull T t10) {
        ExceptionHelper.nullCheck(t10, "offer called with a null value.");
        a<T>[] aVarArr = this.f78273q0.get();
        for (a<T> aVar : aVarArr) {
            if (aVar.get() == 0) {
                return false;
            }
        }
        Object next = NotificationLite.next(t10);
        f(next);
        for (a<T> aVar2 : aVarArr) {
            aVar2.b(this.v0, next);
        }
        return true;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        AtomicReference<Throwable> atomicReference = this.f78277u0;
        Throwable th2 = ExceptionHelper.TERMINATED;
        while (!atomicReference.compareAndSet(null, th2)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        Object objComplete = NotificationLite.complete();
        f(objComplete);
        for (a<T> aVar : this.f78273q0.getAndSet(f78272y0)) {
            aVar.b(this.v0, objComplete);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(@NonNull Throwable th2) {
        ExceptionHelper.nullCheck(th2, "onError called with a null Throwable.");
        AtomicReference<Throwable> atomicReference = this.f78277u0;
        while (!atomicReference.compareAndSet(null, th2)) {
            if (atomicReference.get() != null) {
                RxJavaPlugins.onError(th2);
                return;
            }
        }
        Object objError = NotificationLite.error(th2);
        f(objError);
        for (a<T> aVar : this.f78273q0.getAndSet(f78272y0)) {
            aVar.b(this.v0, objError);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(@NonNull T t10) {
        ExceptionHelper.nullCheck(t10, "onNext called with a null value.");
        if (this.f78277u0.get() != null) {
            return;
        }
        Object next = NotificationLite.next(t10);
        f(next);
        for (a<T> aVar : this.f78273q0.get()) {
            aVar.b(this.v0, next);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(@NonNull Subscription subscription) {
        if (this.f78277u0.get() != null) {
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
            AtomicReference<a<T>[]> atomicReference = this.f78273q0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f78272y0) {
                Throwable th2 = this.f78277u0.get();
                if (th2 == ExceptionHelper.TERMINATED) {
                    subscriber.onComplete();
                    return;
                } else {
                    subscriber.onError(th2);
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (aVar.v0) {
                        e(aVar);
                        return;
                    }
                    if (aVar.v0) {
                        return;
                    }
                    synchronized (aVar) {
                        try {
                            if (!aVar.v0) {
                                if (!aVar.f78280r0) {
                                    BehaviorProcessor<T> behaviorProcessor = aVar.f78279q0;
                                    Lock lock = behaviorProcessor.f78274r0;
                                    lock.lock();
                                    aVar.f78284w0 = behaviorProcessor.v0;
                                    Object obj = behaviorProcessor.f78276t0.get();
                                    lock.unlock();
                                    aVar.f78281s0 = obj != null;
                                    aVar.f78280r0 = true;
                                    if (obj != null && !aVar.test(obj)) {
                                        aVar.a();
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
            } while (atomicReference.get() == aVarArr);
        }
    }
}
