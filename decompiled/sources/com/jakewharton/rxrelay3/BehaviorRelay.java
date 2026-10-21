package com.jakewharton.rxrelay3;

import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes10.dex */
public final class BehaviorRelay<T> extends Relay<T> {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Object[] f50722u0 = new Object[0];
    public static final a[] v0 = new a[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<T> f50723p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f50724q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Lock f50725r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Lock f50726s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public long f50727t0;

    public static final class a<T> implements Disposable, AppendOnlyLinkedArrayList.NonThrowingPredicate<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f50728p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BehaviorRelay<T> f50729q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f50730r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f50731s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public AppendOnlyLinkedArrayList<T> f50732t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f50733u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public long f50734w0;

        public a(Observer<? super T> observer, BehaviorRelay<T> behaviorRelay) {
            this.f50728p0 = observer;
            this.f50729q0 = behaviorRelay;
        }

        public final void a() {
            AppendOnlyLinkedArrayList<T> appendOnlyLinkedArrayList;
            Object[] objArr;
            while (!this.v0) {
                synchronized (this) {
                    try {
                        appendOnlyLinkedArrayList = this.f50732t0;
                        if (appendOnlyLinkedArrayList == null) {
                            this.f50731s0 = false;
                            return;
                        }
                        this.f50732t0 = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                for (Object[] objArr2 = appendOnlyLinkedArrayList.f50719a; objArr2 != null; objArr2 = objArr2[4]) {
                    for (int i10 = 0; i10 < 4 && (objArr = objArr2[i10]) != null; i10++) {
                        test(objArr);
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            this.f50729q0.d(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.v0;
        }

        @Override // com.jakewharton.rxrelay3.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.rxjava3.functions.Predicate
        public final boolean test(T t10) {
            if (this.v0) {
                return false;
            }
            this.f50728p0.onNext(t10);
            return false;
        }
    }

    public BehaviorRelay() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f50725r0 = reentrantReadWriteLock.readLock();
        this.f50726s0 = reentrantReadWriteLock.writeLock();
        this.f50724q0 = new AtomicReference<>(v0);
        this.f50723p0 = new AtomicReference<>();
    }

    @CheckReturnValue
    @NonNull
    public static <T> BehaviorRelay<T> create() {
        return new BehaviorRelay<>();
    }

    @CheckReturnValue
    @NonNull
    public static <T> BehaviorRelay<T> createDefault(@NonNull T t10) {
        BehaviorRelay<T> behaviorRelay = new BehaviorRelay<>();
        if (t10 == null) {
            throw new NullPointerException("defaultValue == null");
        }
        behaviorRelay.f50723p0.lazySet(t10);
        return behaviorRelay;
    }

    @Override // com.jakewharton.rxrelay3.Relay, io.reactivex.rxjava3.functions.Consumer
    public void accept(@NonNull T t10) {
        if (t10 == null) {
            throw new NullPointerException("value == null");
        }
        Lock lock = this.f50726s0;
        lock.lock();
        this.f50727t0++;
        this.f50723p0.lazySet(t10);
        lock.unlock();
        for (a<T> aVar : this.f50724q0.get()) {
            long j10 = this.f50727t0;
            if (!aVar.v0) {
                if (aVar.f50733u0) {
                    aVar.test(t10);
                } else {
                    synchronized (aVar) {
                        try {
                            if (!aVar.v0) {
                                if (aVar.f50734w0 != j10) {
                                    if (aVar.f50731s0) {
                                        AppendOnlyLinkedArrayList<T> appendOnlyLinkedArrayList = aVar.f50732t0;
                                        if (appendOnlyLinkedArrayList == null) {
                                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>();
                                            aVar.f50732t0 = appendOnlyLinkedArrayList;
                                        }
                                        appendOnlyLinkedArrayList.a(t10);
                                    } else {
                                        aVar.f50730r0 = true;
                                        aVar.f50733u0 = true;
                                        aVar.test(t10);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    public final void d(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f50724q0;
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

    @Nullable
    public T getValue() {
        return this.f50723p0.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public Object[] getValues() {
        Object[] objArr = f50722u0;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // com.jakewharton.rxrelay3.Relay
    public boolean hasObservers() {
        return this.f50724q0.get().length != 0;
    }

    public boolean hasValue() {
        return this.f50723p0.get() != null;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a<T> aVar = new a<>(observer, this);
        observer.onSubscribe(aVar);
        loop0: while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f50724q0;
            a<T>[] aVarArr = atomicReference.get();
            int length = aVarArr.length;
            a[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, (a<T>[]) aVarArr2)) {
                    break loop0;
                }
            } while (atomicReference.get() == aVarArr);
        }
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
                    if (!aVar.f50730r0) {
                        BehaviorRelay<T> behaviorRelay = aVar.f50729q0;
                        Lock lock = behaviorRelay.f50725r0;
                        lock.lock();
                        aVar.f50734w0 = behaviorRelay.f50727t0;
                        T t10 = behaviorRelay.f50723p0.get();
                        lock.unlock();
                        aVar.f50731s0 = t10 != null;
                        aVar.f50730r0 = true;
                        if (t10 != null) {
                            aVar.test(t10);
                            aVar.a();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    public T[] getValues(T[] tArr) {
        T t10 = this.f50723p0.get();
        if (t10 == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length != 0) {
            tArr[0] = t10;
            if (tArr.length == 1) {
                return tArr;
            }
            tArr[1] = null;
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) androidx.collection.a.b(tArr, 1));
        tArr2[0] = t10;
        return tArr2;
    }
}
