package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes12.dex */
public final class BehaviorSubject<T> extends Subject<T> {
    public static final Object[] v0 = new Object[0];

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final a[] f78617w0 = new a[0];

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final a[] f78618x0 = new a[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<Object> f78619p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f78620q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Lock f78621r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Lock f78622s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final AtomicReference<Throwable> f78623t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f78624u0;

    public static final class a<T> implements Disposable, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f78625p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BehaviorSubject<T> f78626q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f78627r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f78628s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public AppendOnlyLinkedArrayList<Object> f78629t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f78630u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public long f78631w0;

        public a(Observer<? super T> observer, BehaviorSubject<T> behaviorSubject) {
            this.f78625p0 = observer;
            this.f78626q0 = behaviorSubject;
        }

        public final void a() {
            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
            while (!this.v0) {
                synchronized (this) {
                    try {
                        appendOnlyLinkedArrayList = this.f78629t0;
                        if (appendOnlyLinkedArrayList == null) {
                            this.f78628s0 = false;
                            return;
                        }
                        this.f78629t0 = null;
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
            if (!this.f78630u0) {
                synchronized (this) {
                    try {
                        if (this.v0) {
                            return;
                        }
                        if (this.f78631w0 == j10) {
                            return;
                        }
                        if (this.f78628s0) {
                            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f78629t0;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                                this.f78629t0 = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.add(obj);
                            return;
                        }
                        this.f78627r0 = true;
                        this.f78630u0 = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            this.f78626q0.d(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.v0;
        }

        @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
        public final boolean test(Object obj) {
            return this.v0 || NotificationLite.accept(obj, this.f78625p0);
        }
    }

    public BehaviorSubject() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f78621r0 = reentrantReadWriteLock.readLock();
        this.f78622s0 = reentrantReadWriteLock.writeLock();
        this.f78620q0 = new AtomicReference<>(f78617w0);
        this.f78619p0 = new AtomicReference<>();
        this.f78623t0 = new AtomicReference<>();
    }

    @CheckReturnValue
    @NonNull
    public static <T> BehaviorSubject<T> create() {
        return new BehaviorSubject<>();
    }

    @CheckReturnValue
    @NonNull
    public static <T> BehaviorSubject<T> createDefault(T t10) {
        BehaviorSubject<T> behaviorSubject = new BehaviorSubject<>();
        behaviorSubject.f78619p0.lazySet(ObjectHelper.requireNonNull(t10, "defaultValue is null"));
        return behaviorSubject;
    }

    public final void d(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78620q0;
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
                aVarArr = f78617w0;
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

    @Override // io.reactivex.subjects.Subject
    @Nullable
    public Throwable getThrowable() {
        Object obj = this.f78619p0.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Nullable
    public T getValue() {
        Object obj = this.f78619p0.get();
        if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) NotificationLite.getValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public Object[] getValues() {
        Object[] objArr = v0;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return NotificationLite.isComplete(this.f78619p0.get());
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return this.f78620q0.get().length != 0;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return NotificationLite.isError(this.f78619p0.get());
    }

    public boolean hasValue() {
        Object obj = this.f78619p0.get();
        return (obj == null || NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? false : true;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        AtomicReference<Throwable> atomicReference = this.f78623t0;
        Throwable th2 = ExceptionHelper.TERMINATED;
        while (!atomicReference.compareAndSet(null, th2)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        Object objComplete = NotificationLite.complete();
        AtomicReference<a<T>[]> atomicReference2 = this.f78620q0;
        a<T>[] aVarArr = f78618x0;
        a<T>[] andSet = atomicReference2.getAndSet(aVarArr);
        if (andSet != aVarArr) {
            Lock lock = this.f78622s0;
            lock.lock();
            this.f78624u0++;
            this.f78619p0.lazySet(objComplete);
            lock.unlock();
        }
        for (a<T> aVar : andSet) {
            aVar.b(this.f78624u0, objComplete);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference<Throwable> atomicReference = this.f78623t0;
        while (!atomicReference.compareAndSet(null, th2)) {
            if (atomicReference.get() != null) {
                RxJavaPlugins.onError(th2);
                return;
            }
        }
        Object objError = NotificationLite.error(th2);
        AtomicReference<a<T>[]> atomicReference2 = this.f78620q0;
        a<T>[] aVarArr = f78618x0;
        a<T>[] andSet = atomicReference2.getAndSet(aVarArr);
        if (andSet != aVarArr) {
            Lock lock = this.f78622s0;
            lock.lock();
            this.f78624u0++;
            this.f78619p0.lazySet(objError);
            lock.unlock();
        }
        for (a<T> aVar : andSet) {
            aVar.b(this.f78624u0, objError);
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t10) {
        ObjectHelper.requireNonNull(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f78623t0.get() != null) {
            return;
        }
        Object next = NotificationLite.next(t10);
        Lock lock = this.f78622s0;
        lock.lock();
        this.f78624u0++;
        this.f78619p0.lazySet(next);
        lock.unlock();
        for (a<T> aVar : this.f78620q0.get()) {
            aVar.b(this.f78624u0, next);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.f78623t0.get() != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a<T> aVar = new a<>(observer, this);
        observer.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78620q0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f78618x0) {
                Throwable th2 = this.f78623t0.get();
                if (th2 == ExceptionHelper.TERMINATED) {
                    observer.onComplete();
                    return;
                } else {
                    observer.onError(th2);
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
                        d(aVar);
                        return;
                    }
                    if (aVar.v0) {
                        return;
                    }
                    synchronized (aVar) {
                        try {
                            if (!aVar.v0) {
                                if (!aVar.f78627r0) {
                                    BehaviorSubject<T> behaviorSubject = aVar.f78626q0;
                                    Lock lock = behaviorSubject.f78621r0;
                                    lock.lock();
                                    aVar.f78631w0 = behaviorSubject.f78624u0;
                                    Object obj = behaviorSubject.f78619p0.get();
                                    lock.unlock();
                                    aVar.f78628s0 = obj != null;
                                    aVar.f78627r0 = true;
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
        Object obj = this.f78619p0.get();
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
