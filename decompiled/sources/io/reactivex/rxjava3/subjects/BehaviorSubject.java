package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes12.dex */
public final class BehaviorSubject<T> extends Subject<T> {
    public static final a[] v0 = new a[0];

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final a[] f78373w0 = new a[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<Object> f78374p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f78375q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Lock f78376r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Lock f78377s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final AtomicReference<Throwable> f78378t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f78379u0;

    public static final class a<T> implements Disposable, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f78380p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BehaviorSubject<T> f78381q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f78382r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f78383s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public AppendOnlyLinkedArrayList<Object> f78384t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f78385u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public long f78386w0;

        public a(Observer<? super T> observer, BehaviorSubject<T> behaviorSubject) {
            this.f78380p0 = observer;
            this.f78381q0 = behaviorSubject;
        }

        public final void a() {
            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
            while (!this.v0) {
                synchronized (this) {
                    try {
                        appendOnlyLinkedArrayList = this.f78384t0;
                        if (appendOnlyLinkedArrayList == null) {
                            this.f78383s0 = false;
                            return;
                        }
                        this.f78384t0 = null;
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
            if (!this.f78385u0) {
                synchronized (this) {
                    try {
                        if (this.v0) {
                            return;
                        }
                        if (this.f78386w0 == j10) {
                            return;
                        }
                        if (this.f78383s0) {
                            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f78384t0;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                                this.f78384t0 = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.add(obj);
                            return;
                        }
                        this.f78382r0 = true;
                        this.f78385u0 = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            this.f78381q0.d(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.v0;
        }

        @Override // io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            return this.v0 || NotificationLite.accept(obj, this.f78380p0);
        }
    }

    public BehaviorSubject(T t10) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f78376r0 = reentrantReadWriteLock.readLock();
        this.f78377s0 = reentrantReadWriteLock.writeLock();
        this.f78375q0 = new AtomicReference<>(v0);
        this.f78374p0 = new AtomicReference<>(t10);
        this.f78378t0 = new AtomicReference<>();
    }

    @CheckReturnValue
    @NonNull
    public static <T> BehaviorSubject<T> create() {
        return new BehaviorSubject<>(null);
    }

    @CheckReturnValue
    @NonNull
    public static <T> BehaviorSubject<T> createDefault(T t10) {
        Objects.requireNonNull(t10, "defaultValue is null");
        return new BehaviorSubject<>(t10);
    }

    public final void d(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78375q0;
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
                aVarArr = v0;
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

    @Override // io.reactivex.rxjava3.subjects.Subject
    @CheckReturnValue
    @Nullable
    public Throwable getThrowable() {
        Object obj = this.f78374p0.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @CheckReturnValue
    @Nullable
    public T getValue() {
        Object obj = this.f78374p0.get();
        if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) NotificationLite.getValue(obj);
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    @CheckReturnValue
    public boolean hasComplete() {
        return NotificationLite.isComplete(this.f78374p0.get());
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    @CheckReturnValue
    public boolean hasObservers() {
        return this.f78375q0.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    @CheckReturnValue
    public boolean hasThrowable() {
        return NotificationLite.isError(this.f78374p0.get());
    }

    @CheckReturnValue
    public boolean hasValue() {
        Object obj = this.f78374p0.get();
        return (obj == null || NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? false : true;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        AtomicReference<Throwable> atomicReference = this.f78378t0;
        Throwable th2 = ExceptionHelper.TERMINATED;
        while (!atomicReference.compareAndSet(null, th2)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        Object objComplete = NotificationLite.complete();
        Lock lock = this.f78377s0;
        lock.lock();
        this.f78379u0++;
        this.f78374p0.lazySet(objComplete);
        lock.unlock();
        for (a<T> aVar : this.f78375q0.getAndSet(f78373w0)) {
            aVar.b(this.f78379u0, objComplete);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th2) {
        ExceptionHelper.nullCheck(th2, "onError called with a null Throwable.");
        AtomicReference<Throwable> atomicReference = this.f78378t0;
        while (!atomicReference.compareAndSet(null, th2)) {
            if (atomicReference.get() != null) {
                RxJavaPlugins.onError(th2);
                return;
            }
        }
        Object objError = NotificationLite.error(th2);
        Lock lock = this.f78377s0;
        lock.lock();
        this.f78379u0++;
        this.f78374p0.lazySet(objError);
        lock.unlock();
        for (a<T> aVar : this.f78375q0.getAndSet(f78373w0)) {
            aVar.b(this.f78379u0, objError);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t10) {
        ExceptionHelper.nullCheck(t10, "onNext called with a null value.");
        if (this.f78378t0.get() != null) {
            return;
        }
        Object next = NotificationLite.next(t10);
        Lock lock = this.f78377s0;
        lock.lock();
        this.f78379u0++;
        this.f78374p0.lazySet(next);
        lock.unlock();
        for (a<T> aVar : this.f78375q0.get()) {
            aVar.b(this.f78379u0, next);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.f78378t0.get() != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a<T> aVar = new a<>(observer, this);
        observer.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78375q0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f78373w0) {
                Throwable th2 = this.f78378t0.get();
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
                                if (!aVar.f78382r0) {
                                    BehaviorSubject<T> behaviorSubject = aVar.f78381q0;
                                    Lock lock = behaviorSubject.f78376r0;
                                    lock.lock();
                                    aVar.f78386w0 = behaviorSubject.f78379u0;
                                    Object obj = behaviorSubject.f78374p0.get();
                                    lock.unlock();
                                    aVar.f78383s0 = obj != null;
                                    aVar.f78382r0 = true;
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
