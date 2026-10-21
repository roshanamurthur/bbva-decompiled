package io.reactivex.rxjava3.internal.queue;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MpscLinkedQueue<T> implements SimplePlainQueue<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<a<T>> f77897p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<a<T>> f77898q0;

    public static final class a<E> extends AtomicReference<a<E>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public E f77899p0;
    }

    public MpscLinkedQueue() {
        AtomicReference<a<T>> atomicReference = new AtomicReference<>();
        this.f77897p0 = atomicReference;
        AtomicReference<a<T>> atomicReference2 = new AtomicReference<>();
        this.f77898q0 = atomicReference2;
        a<T> aVar = new a<>();
        atomicReference2.lazySet(aVar);
        atomicReference.getAndSet(aVar);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.f77898q0.get() == this.f77897p0.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public boolean offer(T t10) {
        if (t10 == 0) {
            throw new NullPointerException("Null is not a valid element");
        }
        a<T> aVar = new a<>();
        aVar.f77899p0 = t10;
        this.f77897p0.getAndSet(aVar).lazySet(aVar);
        return true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue, io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        a<T> aVar;
        AtomicReference<a<T>> atomicReference = this.f77898q0;
        a<T> aVar2 = atomicReference.get();
        a<T> aVar3 = (a) aVar2.get();
        if (aVar3 != null) {
            T t10 = aVar3.f77899p0;
            aVar3.f77899p0 = null;
            atomicReference.lazySet(aVar3);
            return t10;
        }
        if (aVar2 == this.f77897p0.get()) {
            return null;
        }
        do {
            aVar = (a) aVar2.get();
        } while (aVar == null);
        T t11 = aVar.f77899p0;
        aVar.f77899p0 = null;
        atomicReference.lazySet(aVar);
        return t11;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public boolean offer(T t10, T t11) {
        offer(t10);
        offer(t11);
        return true;
    }
}
