package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {

    @Nullable
    ArrayMap<K, V>.a mEntrySet;

    @Nullable
    ArrayMap<K, V>.c mKeySet;

    @Nullable
    ArrayMap<K, V>.e mValues;

    public final class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NonNull
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ArrayMap.this.getSize();
        }
    }

    public final class b extends IndexBasedArrayIterator<K> {
        public b() {
            super(ArrayMap.this.getSize());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final K elementAt(int i10) {
            return ArrayMap.this.keyAt(i10);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final void removeAt(int i10) {
            ArrayMap.this.removeAt(i10);
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f2348p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f2349q0 = -1;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f2350r0;

        public d() {
            this.f2348p0 = ArrayMap.this.getSize() - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f2350r0) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i10 = this.f2349q0;
            ArrayMap arrayMap = ArrayMap.this;
            return ContainerHelpersKt.equal(key, arrayMap.keyAt(i10)) && ContainerHelpersKt.equal(entry.getValue(), arrayMap.valueAt(this.f2349q0));
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.f2350r0) {
                return ArrayMap.this.keyAt(this.f2349q0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.f2350r0) {
                return ArrayMap.this.valueAt(this.f2349q0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f2349q0 < this.f2348p0;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f2350r0) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i10 = this.f2349q0;
            ArrayMap arrayMap = ArrayMap.this;
            K kKeyAt = arrayMap.keyAt(i10);
            V vValueAt = arrayMap.valueAt(this.f2349q0);
            return (kKeyAt == null ? 0 : kKeyAt.hashCode()) ^ (vValueAt != null ? vValueAt.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f2349q0++;
            this.f2350r0 = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f2350r0) {
                throw new IllegalStateException();
            }
            ArrayMap.this.removeAt(this.f2349q0);
            this.f2349q0--;
            this.f2348p0--;
            this.f2350r0 = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v3) {
            if (this.f2350r0) {
                return ArrayMap.this.setValueAt(this.f2349q0, v3);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class f extends IndexBasedArrayIterator<V> {
        public f() {
            super(ArrayMap.this.getSize());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final V elementAt(int i10) {
            return ArrayMap.this.valueAt(i10);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final void removeAt(int i10) {
            ArrayMap.this.removeAt(i10);
        }
    }

    public ArrayMap() {
    }

    public static <T> boolean equalsSetHelper(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public boolean containsKey(@Nullable Object obj) {
        return super.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public boolean containsValue(@Nullable Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Set<Map.Entry<K, V>> entrySet() {
        ArrayMap<K, V>.a aVar = this.mEntrySet;
        if (aVar != null) {
            return aVar;
        }
        ArrayMap<K, V>.a aVar2 = new a();
        this.mEntrySet = aVar2;
        return aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V get(@Nullable Object obj) {
        return (V) super.get(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Set<K> keySet() {
        ArrayMap<K, V>.c cVar = this.mKeySet;
        if (cVar != null) {
            return cVar;
        }
        ArrayMap<K, V>.c cVar2 = new c();
        this.mKeySet = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public void putAll(@NonNull Map<? extends K, ? extends V> map) {
        ensureCapacity(map.size() + getSize());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V remove(@Nullable Object obj) {
        return (V) super.remove(obj);
    }

    public boolean removeAll(@NonNull Collection<?> collection) {
        int size = getSize();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != getSize();
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
        int size = getSize();
        for (int size2 = getSize() - 1; size2 >= 0; size2--) {
            if (!collection.contains(keyAt(size2))) {
                removeAt(size2);
            }
        }
        return size != getSize();
    }

    @Override // java.util.Map
    @NonNull
    public Collection<V> values() {
        ArrayMap<K, V>.e eVar = this.mValues;
        if (eVar != null) {
            return eVar;
        }
        ArrayMap<K, V>.e eVar2 = new e();
        this.mValues = eVar2;
        return eVar2;
    }

    public ArrayMap(int i10) {
        super(i10);
    }

    public ArrayMap(@Nullable SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }

    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(@NonNull Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return ArrayMap.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(@NonNull Collection<?> collection) {
            return ArrayMap.this.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return ArrayMap.equalsSetHelper(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            ArrayMap arrayMap = ArrayMap.this;
            int iHashCode = 0;
            for (int size = arrayMap.getSize() - 1; size >= 0; size--) {
                K kKeyAt = arrayMap.keyAt(size);
                iHashCode += kKeyAt == null ? 0 : kKeyAt.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @NonNull
        public final Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            ArrayMap arrayMap = ArrayMap.this;
            int iIndexOfKey = arrayMap.indexOfKey(obj);
            if (iIndexOfKey < 0) {
                return false;
            }
            arrayMap.removeAt(iIndexOfKey);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(@NonNull Collection<?> collection) {
            return ArrayMap.this.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(@NonNull Collection<?> collection) {
            return ArrayMap.this.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return ArrayMap.this.getSize();
        }

        @Override // java.util.Set, java.util.Collection
        @NonNull
        public final <T> T[] toArray(@NonNull T[] tArr) {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.getSize();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) androidx.collection.a.b(tArr, size));
            }
            for (int i10 = 0; i10 < size; i10++) {
                tArr[i10] = arrayMap.keyAt(i10);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        @Override // java.util.Set, java.util.Collection
        @NonNull
        public final Object[] toArray() {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.getSize();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = arrayMap.keyAt(i10);
            }
            return objArr;
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v3) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(@NonNull Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return ArrayMap.this.__restricted$indexOfValue(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @NonNull
        public final Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            ArrayMap arrayMap = ArrayMap.this;
            int i__restricted$indexOfValue = arrayMap.__restricted$indexOfValue(obj);
            if (i__restricted$indexOfValue < 0) {
                return false;
            }
            arrayMap.removeAt(i__restricted$indexOfValue);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(@NonNull Collection<?> collection) {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.getSize();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (collection.contains(arrayMap.valueAt(i10))) {
                    arrayMap.removeAt(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final boolean retainAll(@NonNull Collection<?> collection) {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.getSize();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (!collection.contains(arrayMap.valueAt(i10))) {
                    arrayMap.removeAt(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final int size() {
            return ArrayMap.this.getSize();
        }

        @Override // java.util.Collection
        @NonNull
        public final <T> T[] toArray(@NonNull T[] tArr) {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.getSize();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) androidx.collection.a.b(tArr, size));
            }
            for (int i10 = 0; i10 < size; i10++) {
                tArr[i10] = arrayMap.valueAt(i10);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        @Override // java.util.Collection
        @NonNull
        public final Object[] toArray() {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.getSize();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = arrayMap.valueAt(i10);
            }
            return objArr;
        }
    }
}
