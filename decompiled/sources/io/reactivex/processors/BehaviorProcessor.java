package io.reactivex.processors;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class BehaviorProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Object[] f73861w0 = new Object[0];

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final a[] f73862x0 = new a[0];

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final a[] f73863y0 = new a[0];

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f73864q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Lock f73865r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Lock f73866s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final AtomicReference<Object> f73867t0 = new AtomicReference<>();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final AtomicReference<Throwable> f73868u0;
    public long v0;

    public static final class a<T> extends AtomicLong implements Subscription, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f73869p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BehaviorProcessor<T> f73870q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f73871r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f73872s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public AppendOnlyLinkedArrayList<Object> f73873t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f73874u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public long f73875w0;

        public a(Subscriber<? super T> subscriber, BehaviorProcessor<T> behaviorProcessor) {
            this.f73869p0 = subscriber;
            this.f73870q0 = behaviorProcessor;
        }

        public final void a() {
            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
            while (!this.v0) {
                synchronized (this) {
                    try {
                        appendOnlyLinkedArrayList = this.f73873t0;
                        if (appendOnlyLinkedArrayList == null) {
                            this.f73872s0 = false;
                            return;
                        }
                        this.f73873t0 = null;
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
            if (!this.f73874u0) {
                synchronized (this) {
                    try {
                        if (this.v0) {
                            return;
                        }
                        if (this.f73875w0 == j10) {
                            return;
                        }
                        if (this.f73872s0) {
                            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f73873t0;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                                this.f73873t0 = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.add(obj);
                            return;
                        }
                        this.f73871r0 = true;
                        this.f73874u0 = true;
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
            this.f73870q0.e(this);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this, j10);
            }
        }

        @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
        public final boolean test(Object obj) {
            if (this.v0) {
                return true;
            }
            if (NotificationLite.isComplete(obj)) {
                this.f73869p0.onComplete();
                return true;
            }
            if (NotificationLite.isError(obj)) {
                this.f73869p0.onError(NotificationLite.getError(obj));
                return true;
            }
            long j10 = get();
            if (j10 == 0) {
                cancel();
                this.f73869p0.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
            this.f73869p0.onNext((Object) NotificationLite.getValue(obj));
            if (j10 == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
    }

    public BehaviorProcessor() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f73865r0 = reentrantReadWriteLock.readLock();
        this.f73866s0 = reentrantReadWriteLock.writeLock();
        this.f73864q0 = new AtomicReference<>(f73862x0);
        this.f73868u0 = new AtomicReference<>();
    }

    @CheckReturnValue
    @NonNull
    public static <T> BehaviorProcessor<T> create() {
        return new BehaviorProcessor<>();
    }

    @CheckReturnValue
    @NonNull
    public static <T> BehaviorProcessor<T> createDefault(T t10) {
        ObjectHelper.requireNonNull(t10, "defaultValue is null");
        BehaviorProcessor<T> behaviorProcessor = new BehaviorProcessor<>();
        behaviorProcessor.f73867t0.lazySet(ObjectHelper.requireNonNull(t10, "defaultValue is null"));
        return behaviorProcessor;
    }

    public final void e(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f73864q0;
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
                aVarArr = f73862x0;
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
        Lock lock = this.f73866s0;
        lock.lock();
        this.v0++;
        this.f73867t0.lazySet(obj);
        lock.unlock();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        Object obj = this.f73867t0.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Nullable
    public T getValue() {
        Object obj = this.f73867t0.get();
        if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) NotificationLite.getValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public Object[] getValues() {
        Object[] objArr = f73861w0;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return NotificationLite.isComplete(this.f73867t0.get());
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.f73864q0.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return NotificationLite.isError(this.f73867t0.get());
    }

    public boolean hasValue() {
        Object obj = this.f73867t0.get();
        return (obj == null || NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? false : true;
    }

    public boolean offer(T t10) {
        if (t10 == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        a<T>[] aVarArr = this.f73864q0.get();
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
        AtomicReference<Throwable> atomicReference = this.f73868u0;
        Throwable th2 = ExceptionHelper.TERMINATED;
        while (!atomicReference.compareAndSet(null, th2)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        Object objComplete = NotificationLite.complete();
        AtomicReference<a<T>[]> atomicReference2 = this.f73864q0;
        a<T>[] andSet = atomicReference2.get();
        a<T>[] aVarArr = f73863y0;
        if (andSet != aVarArr && (andSet = atomicReference2.getAndSet(aVarArr)) != aVarArr) {
            f(objComplete);
        }
        for (a<T> aVar : andSet) {
            aVar.b(this.v0, objComplete);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference<Throwable> atomicReference = this.f73868u0;
        while (!atomicReference.compareAndSet(null, th2)) {
            if (atomicReference.get() != null) {
                RxJavaPlugins.onError(th2);
                return;
            }
        }
        Object objError = NotificationLite.error(th2);
        AtomicReference<a<T>[]> atomicReference2 = this.f73864q0;
        a<T>[] andSet = atomicReference2.get();
        a<T>[] aVarArr = f73863y0;
        if (andSet != aVarArr && (andSet = atomicReference2.getAndSet(aVarArr)) != aVarArr) {
            f(objError);
        }
        for (a<T> aVar : andSet) {
            aVar.b(this.v0, objError);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        ObjectHelper.requireNonNull(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f73868u0.get() != null) {
            return;
        }
        Object next = NotificationLite.next(t10);
        f(next);
        for (a<T> aVar : this.f73864q0.get()) {
            aVar.b(this.v0, next);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (this.f73868u0.get() != null) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a<T> aVar = new a<>(subscriber, this);
        subscriber.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f73864q0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f73863y0) {
                Throwable th2 = this.f73868u0.get();
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
                                if (!aVar.f73871r0) {
                                    BehaviorProcessor<T> behaviorProcessor = aVar.f73870q0;
                                    Lock lock = behaviorProcessor.f73865r0;
                                    lock.lock();
                                    aVar.f73875w0 = behaviorProcessor.v0;
                                    Object obj = behaviorProcessor.f73867t0.get();
                                    lock.unlock();
                                    aVar.f73872s0 = obj != null;
                                    aVar.f73871r0 = true;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public T[] getValues(T[] tArr) {
        Object obj = this.f73867t0.get();
        if (obj != null && !NotificationLite.isComplete(obj) && !NotificationLite.isError(obj)) {
            Object value = NotificationLite.getValue(obj);
            if (tArr.length != 0) {
                tArr[0] = value;
                if (tArr.length == 1) {
                    return tArr;
                }
                tArr[1] = 0;
                return tArr;
            }
            T[] tArr2 = (T[]) ((Object[]) androidx.collection.a.b(tArr, 1));
            tArr2[0] = value;
            return tArr2;
        }
        if (tArr.length != 0) {
            tArr[0] = 0;
        }
        return tArr;
    }
}
