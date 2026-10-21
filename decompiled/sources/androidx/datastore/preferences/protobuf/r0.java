package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: loaded from: classes2.dex */
public class r0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f21118w0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f21119p0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f21122s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public volatile r0<K, V>.f f21123t0;
    public volatile r0<K, V>.b v0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public List<r0<K, V>.d> f21120q0 = Collections.emptyList();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Map<K, V> f21121r0 = Collections.emptyMap();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Map<K, V> f21124u0 = Collections.emptyMap();

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f21125p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f21126q0;

        public a() {
            this.f21125p0 = r0.this.f21120q0.size();
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f21126q0 == null) {
                this.f21126q0 = r0.this.f21124u0.entrySet().iterator();
            }
            return this.f21126q0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i10 = this.f21125p0;
            return (i10 > 0 && i10 <= r0.this.f21120q0.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return a().next();
            }
            List<r0<K, V>.d> list = r0.this.f21120q0;
            int i10 = this.f21125p0 - 1;
            this.f21125p0 = i10;
            return list.get(i10);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class b extends r0<K, V>.f {
        public b() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.r0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21129a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21130b = new b();

        /* JADX INFO: compiled from: SmallSortedMap.java */
        public static class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: compiled from: SmallSortedMap.java */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return c.f21129a;
            }
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class d implements Map.Entry<K, V>, Comparable<r0<K, V>.d> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final K f21131p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public V f21132q0;

        public d() {
            throw null;
        }

        public d(K k10, V v3) {
            this.f21131p0 = k10;
            this.f21132q0 = v3;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f21131p0.compareTo(((d) obj).f21131p0);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            K k10 = this.f21131p0;
            if (k10 != null ? k10.equals(key) : key == null) {
                V v3 = this.f21132q0;
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
        public final Object getKey() {
            return this.f21131p0;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f21132q0;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f21131p0;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v3 = this.f21132q0;
            return (v3 != null ? v3.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v3) {
            int i10 = r0.f21118w0;
            r0.this.b();
            V v6 = this.f21132q0;
            this.f21132q0 = v3;
            return v6;
        }

        public final String toString() {
            return this.f21131p0 + "=" + this.f21132q0;
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class e implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f21134p0 = -1;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f21135q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f21136r0;

        public e() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f21136r0 == null) {
                this.f21136r0 = r0.this.f21121r0.entrySet().iterator();
            }
            return this.f21136r0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i10 = this.f21134p0 + 1;
            r0 r0Var = r0.this;
            if (i10 >= r0Var.f21120q0.size()) {
                return !r0Var.f21121r0.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f21135q0 = true;
            int i10 = this.f21134p0 + 1;
            this.f21134p0 = i10;
            r0 r0Var = r0.this;
            return i10 < r0Var.f21120q0.size() ? r0Var.f21120q0.get(this.f21134p0) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f21135q0) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f21135q0 = false;
            int i10 = r0.f21118w0;
            r0 r0Var = r0.this;
            r0Var.b();
            if (this.f21134p0 >= r0Var.f21120q0.size()) {
                a().remove();
                return;
            }
            int i11 = this.f21134p0;
            this.f21134p0 = i11 - 1;
            r0Var.h(i11);
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class f extends AbstractSet<Map.Entry<K, V>> {
        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            r0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            r0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = r0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            r0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return r0.this.size();
        }
    }

    public r0(int i10) {
        this.f21119p0 = i10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(K k10) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f21120q0.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = k10.compareTo(this.f21120q0.get(i12).f21131p0);
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
            int iCompareTo2 = k10.compareTo(this.f21120q0.get(i13).f21131p0);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = k10.compareTo(this.f21120q0.get(i12).f21131p0);
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
        if (this.f21122s0) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry<K, V> c(int i10) {
        return this.f21120q0.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f21120q0.isEmpty()) {
            this.f21120q0.clear();
        }
        if (this.f21121r0.isEmpty()) {
            return;
        }
        this.f21121r0.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f21121r0.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> d() {
        return this.f21121r0.isEmpty() ? c.f21130b : this.f21121r0.entrySet();
    }

    public final SortedMap<K, V> e() {
        b();
        if (this.f21121r0.isEmpty() && !(this.f21121r0 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f21121r0 = treeMap;
            this.f21124u0 = treeMap.descendingMap();
        }
        return (SortedMap) this.f21121r0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f21123t0 == null) {
            this.f21123t0 = new f();
        }
        return this.f21123t0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return super.equals(obj);
        }
        r0 r0Var = (r0) obj;
        int size = size();
        if (size != r0Var.size()) {
            return false;
        }
        int size2 = this.f21120q0.size();
        if (size2 != r0Var.f21120q0.size()) {
            return entrySet().equals(r0Var.entrySet());
        }
        for (int i10 = 0; i10 < size2; i10++) {
            if (!c(i10).equals(r0Var.c(i10))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f21121r0.equals(r0Var.f21121r0);
        }
        return true;
    }

    public void f() {
        if (this.f21122s0) {
            return;
        }
        this.f21121r0 = this.f21121r0.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f21121r0);
        this.f21124u0 = this.f21124u0.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f21124u0);
        this.f21122s0 = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final V put(K k10, V v3) {
        b();
        int iA = a(k10);
        if (iA >= 0) {
            return this.f21120q0.get(iA).setValue(v3);
        }
        b();
        boolean zIsEmpty = this.f21120q0.isEmpty();
        int i10 = this.f21119p0;
        if (zIsEmpty && !(this.f21120q0 instanceof ArrayList)) {
            this.f21120q0 = new ArrayList(i10);
        }
        int i11 = -(iA + 1);
        if (i11 >= i10) {
            return e().put(k10, v3);
        }
        if (this.f21120q0.size() == i10) {
            r0<K, V>.d dVarRemove = this.f21120q0.remove(i10 - 1);
            e().put(dVarRemove.f21131p0, dVarRemove.f21132q0);
        }
        this.f21120q0.add(i11, new d(k10, v3));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? this.f21120q0.get(iA).f21132q0 : this.f21121r0.get(comparable);
    }

    public final V h(int i10) {
        b();
        V v3 = this.f21120q0.remove(i10).f21132q0;
        if (!this.f21121r0.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = e().entrySet().iterator();
            List<r0<K, V>.d> list = this.f21120q0;
            Map.Entry<K, V> next = it.next();
            list.add(new d(next.getKey(), next.getValue()));
            it.remove();
        }
        return v3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f21120q0.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += this.f21120q0.get(i10).hashCode();
        }
        return this.f21121r0.size() > 0 ? iHashCode + this.f21121r0.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f21121r0.isEmpty()) {
            return null;
        }
        return this.f21121r0.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f21121r0.size() + this.f21120q0.size();
    }
}
