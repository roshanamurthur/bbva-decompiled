package flexjson;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class ChainedSet implements Set {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Set f68466p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final HashSet f68467q0 = new HashSet();

    public ChainedSet(Set set) {
        this.f68466p0 = set;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        return this.f68467q0.add(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        return this.f68467q0.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f68467q0.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f68467q0.contains(obj) || this.f68466p0.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f68467q0.containsAll(collection) || this.f68466p0.containsAll(collection);
    }

    public Set getParent() {
        return this.f68466p0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f68467q0.isEmpty() && this.f68466p0.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new ChainedIterator(this.f68467q0, this.f68466p0);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f68467q0.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        return this.f68467q0.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        return this.f68467q0.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f68466p0.size() + this.f68467q0.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        Object[] array = this.f68467q0.toArray();
        Object[] array2 = this.f68466p0.toArray();
        Object[] objArr = new Object[array.length + array2.length];
        System.arraycopy(array, 0, objArr, 0, array.length);
        System.arraycopy(array2, 0, objArr, array.length, array2.length);
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        throw new IllegalStateException("Not implemeneted");
    }
}
