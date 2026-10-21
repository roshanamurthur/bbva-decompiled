package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.f;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: SmallSortedMap.java */
/* JADX INFO: loaded from: classes12.dex */
public class d<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f81444u0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f81445p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public List<d<K, V>.b> f81446q0 = Collections.emptyList();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Map<K, V> f81447r0 = Collections.emptyMap();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f81448s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public volatile d<K, V>.C0445d f81449t0;

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0444a f81450a = new C0444a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f81451b = new b();

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SmallSortedMap.java */
        public static class C0444a implements Iterator<Object> {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: compiled from: SmallSortedMap.java */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return a.f81450a;
            }
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class b implements Comparable<d<K, V>.b>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final K f81452p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public V f81453q0;

        public b() {
            throw null;
        }

        public b(K k10, V v3) {
            this.f81452p0 = k10;
            this.f81453q0 = v3;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            K k10 = this.f81452p0;
            if (k10 != null ? k10.equals(key) : key == null) {
                V v3 = this.f81453q0;
                Object value = entry.getValue();
                if (v3 == null) {
                    if (value == null) {
                        return true;
                    }
                } else if (v3.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f81453q0;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f81452p0;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v3 = this.f81453q0;
            return (v3 != null ? v3.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v3) {
            int i10 = d.f81444u0;
            d.this.b();
            V v6 = this.f81453q0;
            this.f81453q0 = v3;
            return v6;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f81452p0);
            String strValueOf2 = String.valueOf(this.f81453q0);
            return f.c(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, "=", strValueOf2);
        }

        @Override // java.lang.Comparable
        public int compareTo(d<K, V>.b bVar) {
            return getKey().compareTo(bVar.getKey());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f81452p0;
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class c implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f81455p0 = -1;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f81456q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f81457r0;

        public c() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f81457r0 == null) {
                this.f81457r0 = d.this.f81447r0.entrySet().iterator();
            }
            return this.f81457r0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f81455p0 + 1 < d.this.f81446q0.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f81456q0) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f81456q0 = false;
            int i10 = d.f81444u0;
            d dVar = d.this;
            dVar.b();
            if (this.f81455p0 >= dVar.f81446q0.size()) {
                a().remove();
                return;
            }
            int i11 = this.f81455p0;
            this.f81455p0 = i11 - 1;
            dVar.d(i11);
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            this.f81456q0 = true;
            int i10 = this.f81455p0 + 1;
            this.f81455p0 = i10;
            d dVar = d.this;
            return i10 < dVar.f81446q0.size() ? dVar.f81446q0.get(this.f81455p0) : a().next();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class C0445d extends AbstractSet<Map.Entry<K, V>> {
        public C0445d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = d.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            d.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            d.this.put((Comparable) entry.getKey(), (Object) entry.getValue());
            return true;
        }
    }

    public d(int i10) {
        this.f81445p0 = i10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    public final int a(K k10) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f81446q0.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = k10.compareTo(this.f81446q0.get(i12).getKey());
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = k10.compareTo(this.f81446q0.get(i13).getKey());
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = k10.compareTo(this.f81446q0.get(i12).getKey());
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    public final void b() {
        if (this.f81448s0) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap<K, V> c() {
        b();
        if (this.f81447r0.isEmpty() && !(this.f81447r0 instanceof TreeMap)) {
            this.f81447r0 = new TreeMap();
        }
        return (SortedMap) this.f81447r0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        b();
        if (!this.f81446q0.isEmpty()) {
            this.f81446q0.clear();
        }
        if (this.f81447r0.isEmpty()) {
            return;
        }
        this.f81447r0.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f81447r0.containsKey(comparable);
    }

    public final V d(int i10) {
        b();
        V value = this.f81446q0.remove(i10).getValue();
        if (!this.f81447r0.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = c().entrySet().iterator();
            List<d<K, V>.b> list = this.f81446q0;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f81449t0 == null) {
            this.f81449t0 = new C0445d();
        }
        return this.f81449t0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? this.f81446q0.get(iA).getValue() : this.f81447r0.get(comparable);
    }

    public Map.Entry<K, V> getArrayEntryAt(int i10) {
        return this.f81446q0.get(i10);
    }

    public int getNumArrayEntries() {
        return this.f81446q0.size();
    }

    public Iterable<Map.Entry<K, V>> getOverflowEntries() {
        return this.f81447r0.isEmpty() ? a.f81451b : this.f81447r0.entrySet();
    }

    public boolean isImmutable() {
        return this.f81448s0;
    }

    public void makeImmutable() {
        if (this.f81448s0) {
            return;
        }
        this.f81447r0 = this.f81447r0.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f81447r0);
        this.f81448s0 = true;
    }

    public V put(K k10, V v3) {
        b();
        int iA = a(k10);
        if (iA >= 0) {
            return this.f81446q0.get(iA).setValue(v3);
        }
        b();
        boolean zIsEmpty = this.f81446q0.isEmpty();
        int i10 = this.f81445p0;
        if (zIsEmpty && !(this.f81446q0 instanceof ArrayList)) {
            this.f81446q0 = new ArrayList(i10);
        }
        int i11 = -(iA + 1);
        if (i11 >= i10) {
            return c().put(k10, v3);
        }
        if (this.f81446q0.size() == i10) {
            d<K, V>.b bVarRemove = this.f81446q0.remove(i10 - 1);
            c().put(bVarRemove.getKey(), bVarRemove.getValue());
        }
        this.f81446q0.add(i11, new b(k10, v3));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return d(iA);
        }
        if (this.f81447r0.isEmpty()) {
            return null;
        }
        return this.f81447r0.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f81447r0.size() + this.f81446q0.size();
    }
}
