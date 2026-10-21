package com.esotericsoftware.kryo.util;

import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Pool<T> {
    private final Queue<T> freeObjects;
    private int peak;

    public interface Poolable {
        void reset();
    }

    public class a extends LinkedBlockingQueue<T> {
        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
        public final boolean add(T t10) {
            return offer(t10);
        }
    }

    public class b extends LinkedList<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f40056p0;

        public b(int i10) {
            this.f40056p0 = i10;
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
        public final boolean add(T t10) {
            if (size() >= this.f40056p0) {
                return false;
            }
            super.add(t10);
            return true;
        }
    }

    public class c extends ArrayDeque<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f40057p0;

        public c(int i10) {
            this.f40057p0 = i10;
        }

        @Override // java.util.ArrayDeque, java.util.Deque, java.util.Queue
        public final boolean offer(T t10) {
            if (size() >= this.f40057p0) {
                return false;
            }
            super.offer(t10);
            return true;
        }
    }

    public static class d<T> implements Queue<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Queue<SoftReference<T>> f40058p0;

        public d(Queue<SoftReference<T>> queue) {
            this.f40058p0 = queue;
        }

        @Override // java.util.Queue, java.util.Collection
        public final boolean add(T t10) {
            return false;
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            return false;
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f40058p0.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return false;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection collection) {
            return false;
        }

        @Override // java.util.Queue
        public final T element() {
            return null;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return null;
        }

        @Override // java.util.Queue
        public final boolean offer(T t10) {
            return this.f40058p0.add(new SoftReference<>(t10));
        }

        @Override // java.util.Queue
        public final T peek() {
            return null;
        }

        @Override // java.util.Queue
        public final T poll() {
            T t10;
            do {
                SoftReference<T> softReferencePoll = this.f40058p0.poll();
                if (softReferencePoll == null) {
                    return null;
                }
                t10 = softReferencePoll.get();
            } while (t10 == null);
            return t10;
        }

        @Override // java.util.Queue
        public final T remove() {
            return null;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection collection) {
            return false;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            return false;
        }

        @Override // java.util.Collection
        public final int size() {
            return this.f40058p0.size();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return null;
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return false;
        }

        @Override // java.util.Collection
        public final <E> E[] toArray(E[] eArr) {
            return null;
        }
    }

    public Pool(boolean z10, boolean z11) {
        this(z10, z11, Integer.MAX_VALUE);
    }

    public void clean() {
        Queue<T> queue = this.freeObjects;
        if (queue instanceof d) {
            d dVar = (d) queue;
            dVar.getClass();
            dVar.f40058p0.removeIf(new com.esotericsoftware.kryo.util.a(0));
        }
    }

    public void clear() {
        this.freeObjects.clear();
    }

    public abstract T create();

    public void free(T t10) {
        if (t10 == null) {
            throw new IllegalArgumentException("object cannot be null.");
        }
        reset(t10);
        if (!this.freeObjects.offer(t10)) {
            Queue<T> queue = this.freeObjects;
            if (queue instanceof d) {
                Iterator<SoftReference<T>> it = ((d) queue).f40058p0.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == null) {
                        it.remove();
                        break;
                    }
                }
                this.freeObjects.offer(t10);
            }
        }
        this.peak = Math.max(this.peak, this.freeObjects.size());
    }

    public int getFree() {
        return this.freeObjects.size();
    }

    public int getPeak() {
        return this.peak;
    }

    public T obtain() {
        T tPoll = this.freeObjects.poll();
        return tPoll != null ? tPoll : create();
    }

    public void reset(T t10) {
        if (t10 instanceof Poolable) {
            ((Poolable) t10).reset();
        }
    }

    public void resetPeak() {
        this.peak = 0;
    }

    public Pool(boolean z10, boolean z11, int i10) {
        Queue<T> bVar;
        if (z10) {
            bVar = new a(i10);
        } else {
            bVar = z11 ? new b(i10) : new c(i10);
        }
        this.freeObjects = z11 ? new d(bVar) : bVar;
    }
}
