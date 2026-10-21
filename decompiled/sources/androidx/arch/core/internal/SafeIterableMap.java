package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public c<K, V> f1727p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public c<K, V> f1728q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final WeakHashMap<SupportRemove<K, V>, Boolean> f1729r0 = new WeakHashMap<>();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f1730s0 = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class IteratorWithAdditions extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public c<K, V> f1731p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f1732q0 = true;

        public IteratorWithAdditions() {
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public final void a(@NonNull c<K, V> cVar) {
            c<K, V> cVar2 = this.f1731p0;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f1737s0;
                this.f1731p0 = cVar3;
                this.f1732q0 = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1732q0) {
                return SafeIterableMap.this.f1727p0 != null;
            }
            c<K, V> cVar = this.f1731p0;
            return (cVar == null || cVar.f1736r0 == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (this.f1732q0) {
                this.f1732q0 = false;
                this.f1731p0 = SafeIterableMap.this.f1727p0;
            } else {
                c<K, V> cVar = this.f1731p0;
                this.f1731p0 = cVar != null ? cVar.f1736r0 : null;
            }
            return this.f1731p0;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static abstract class SupportRemove<K, V> {
        public abstract void a(@NonNull c<K, V> cVar);
    }

    public static class a<K, V> extends d<K, V> {
        @Override // androidx.arch.core.internal.SafeIterableMap.d
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f1737s0;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.d
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f1736r0;
        }
    }

    public static class b<K, V> extends d<K, V> {
        @Override // androidx.arch.core.internal.SafeIterableMap.d
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f1736r0;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.d
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f1737s0;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NonNull
        public final K f1734p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NonNull
        public final V f1735q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public c<K, V> f1736r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public c<K, V> f1737s0;

        public c(@NonNull K k10, @NonNull V v3) {
            this.f1734p0 = k10;
            this.f1735q0 = v3;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f1734p0.equals(cVar.f1734p0) && this.f1735q0.equals(cVar.f1735q0);
        }

        @Override // java.util.Map.Entry
        @NonNull
        public final K getKey() {
            return this.f1734p0;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public final V getValue() {
            return this.f1735q0;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f1734p0.hashCode() ^ this.f1735q0.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v3) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f1734p0 + "=" + this.f1735q0;
        }
    }

    public static abstract class d<K, V> extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public c<K, V> f1738p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public c<K, V> f1739q0;

        public d(c<K, V> cVar, c<K, V> cVar2) {
            this.f1738p0 = cVar2;
            this.f1739q0 = cVar;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public final void a(@NonNull c<K, V> cVar) {
            c<K, V> cVarC = null;
            if (this.f1738p0 == cVar && cVar == this.f1739q0) {
                this.f1739q0 = null;
                this.f1738p0 = null;
            }
            c<K, V> cVar2 = this.f1738p0;
            if (cVar2 == cVar) {
                this.f1738p0 = b(cVar2);
            }
            c<K, V> cVar3 = this.f1739q0;
            if (cVar3 == cVar) {
                c<K, V> cVar4 = this.f1738p0;
                if (cVar3 != cVar4 && cVar4 != null) {
                    cVarC = c(cVar3);
                }
                this.f1739q0 = cVarC;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f1739q0 != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.f1739q0;
            c<K, V> cVar2 = this.f1738p0;
            this.f1739q0 = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    @NonNull
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b bVar = new b(this.f1728q0, this.f1727p0);
        this.f1729r0.put(bVar, Boolean.FALSE);
        return bVar;
    }

    @Nullable
    public Map.Entry<K, V> eldest() {
        return this.f1727p0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (size() != safeIterableMap.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = safeIterableMap.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @Nullable
    public c<K, V> get(K k10) {
        c<K, V> cVar = this.f1727p0;
        while (cVar != null && !cVar.f1734p0.equals(k10)) {
            cVar = cVar.f1736r0;
        }
        return cVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f1727p0, this.f1728q0);
        this.f1729r0.put(aVar, Boolean.FALSE);
        return aVar;
    }

    @NonNull
    public SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions() {
        SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions = new IteratorWithAdditions();
        this.f1729r0.put(iteratorWithAdditions, Boolean.FALSE);
        return iteratorWithAdditions;
    }

    @Nullable
    public Map.Entry<K, V> newest() {
        return this.f1728q0;
    }

    public V putIfAbsent(@NonNull K k10, @NonNull V v3) {
        c<K, V> cVar = get(k10);
        if (cVar != null) {
            return cVar.f1735q0;
        }
        c<K, V> cVar2 = new c<>(k10, v3);
        this.f1730s0++;
        c<K, V> cVar3 = this.f1728q0;
        if (cVar3 == null) {
            this.f1727p0 = cVar2;
            this.f1728q0 = cVar2;
            return null;
        }
        cVar3.f1736r0 = cVar2;
        cVar2.f1737s0 = cVar3;
        this.f1728q0 = cVar2;
        return null;
    }

    public V remove(@NonNull K k10) {
        c<K, V> cVar = get(k10);
        if (cVar == null) {
            return null;
        }
        this.f1730s0--;
        WeakHashMap<SupportRemove<K, V>, Boolean> weakHashMap = this.f1729r0;
        if (!weakHashMap.isEmpty()) {
            Iterator<SupportRemove<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVar);
            }
        }
        c<K, V> cVar2 = cVar.f1737s0;
        if (cVar2 != null) {
            cVar2.f1736r0 = cVar.f1736r0;
        } else {
            this.f1727p0 = cVar.f1736r0;
        }
        c<K, V> cVar3 = cVar.f1736r0;
        if (cVar3 != null) {
            cVar3.f1737s0 = cVar2;
        } else {
            this.f1728q0 = cVar2;
        }
        cVar.f1736r0 = null;
        cVar.f1737s0 = null;
        return cVar.f1735q0;
    }

    public int size() {
        return this.f1730s0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(Constant.BRACKET_OPEN);
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(Constant.BRACKET_CLOSE);
        return sb2.toString();
    }
}
