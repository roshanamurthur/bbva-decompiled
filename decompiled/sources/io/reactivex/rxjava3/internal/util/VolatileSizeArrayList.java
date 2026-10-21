package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.annotations.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class VolatileSizeArrayList<T> extends AtomicInteger implements List<T>, RandomAccess {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ArrayList<T> f78094p0;

    public VolatileSizeArrayList() {
        this.f78094p0 = new ArrayList<>();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        ArrayList<T> arrayList = this.f78094p0;
        boolean zAdd = arrayList.add(t10);
        lazySet(arrayList.size());
        return zAdd;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@NonNull Collection<? extends T> collection) {
        ArrayList<T> arrayList = this.f78094p0;
        boolean zAddAll = arrayList.addAll(collection);
        lazySet(arrayList.size());
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f78094p0.clear();
        lazySet(0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f78094p0.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NonNull Collection<?> collection) {
        return this.f78094p0.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        boolean z10 = obj instanceof VolatileSizeArrayList;
        ArrayList<T> arrayList = this.f78094p0;
        return z10 ? arrayList.equals(((VolatileSizeArrayList) obj).f78094p0) : arrayList.equals(obj);
    }

    @Override // java.util.List
    public T get(int i10) {
        return this.f78094p0.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f78094p0.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f78094p0.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return get() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f78094p0.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f78094p0.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return this.f78094p0.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        ArrayList<T> arrayList = this.f78094p0;
        boolean zRemove = arrayList.remove(obj);
        lazySet(arrayList.size());
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@NonNull Collection<?> collection) {
        ArrayList<T> arrayList = this.f78094p0;
        boolean zRemoveAll = arrayList.removeAll(collection);
        lazySet(arrayList.size());
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@NonNull Collection<?> collection) {
        ArrayList<T> arrayList = this.f78094p0;
        boolean zRetainAll = arrayList.retainAll(collection);
        lazySet(arrayList.size());
        return zRetainAll;
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        return this.f78094p0.set(i10, t10);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return get();
    }

    @Override // java.util.List
    public List<T> subList(int i10, int i11) {
        return this.f78094p0.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f78094p0.toArray();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public String toString() {
        return this.f78094p0.toString();
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i10) {
        return this.f78094p0.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public <E> E[] toArray(@NonNull E[] eArr) {
        return (E[]) this.f78094p0.toArray(eArr);
    }

    public VolatileSizeArrayList(int i10) {
        this.f78094p0 = new ArrayList<>(i10);
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        ArrayList<T> arrayList = this.f78094p0;
        arrayList.add(i10, t10);
        lazySet(arrayList.size());
    }

    @Override // java.util.List
    public boolean addAll(int i10, @NonNull Collection<? extends T> collection) {
        ArrayList<T> arrayList = this.f78094p0;
        boolean zAddAll = arrayList.addAll(i10, collection);
        lazySet(arrayList.size());
        return zAddAll;
    }

    @Override // java.util.List
    public T remove(int i10) {
        ArrayList<T> arrayList = this.f78094p0;
        T tRemove = arrayList.remove(i10);
        lazySet(arrayList.size());
        return tRemove;
    }
}
