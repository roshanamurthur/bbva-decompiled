package androidx.databinding;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableArrayList<T> extends ArrayList<T> implements ObservableList<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient ListChangeRegistry f20532p0 = new ListChangeRegistry();

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t10) {
        super.add(t10);
        int size = size() - 1;
        ListChangeRegistry listChangeRegistry = this.f20532p0;
        if (listChangeRegistry != null) {
            listChangeRegistry.notifyInserted(this, size, 1);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends T> collection) {
        int size = size();
        boolean zAddAll = super.addAll(collection);
        if (zAddAll) {
            int size2 = size() - size;
            ListChangeRegistry listChangeRegistry = this.f20532p0;
            if (listChangeRegistry != null) {
                listChangeRegistry.notifyInserted(this, size, size2);
            }
        }
        return zAddAll;
    }

    @Override // androidx.databinding.ObservableList
    public void addOnListChangedCallback(ObservableList.OnListChangedCallback onListChangedCallback) {
        if (this.f20532p0 == null) {
            this.f20532p0 = new ListChangeRegistry();
        }
        this.f20532p0.add(onListChangedCallback);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ListChangeRegistry listChangeRegistry;
        int size = size();
        super.clear();
        if (size == 0 || (listChangeRegistry = this.f20532p0) == null) {
            return;
        }
        listChangeRegistry.notifyRemoved(this, 0, size);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T remove(int i10) {
        T t10 = (T) super.remove(i10);
        ListChangeRegistry listChangeRegistry = this.f20532p0;
        if (listChangeRegistry != null) {
            listChangeRegistry.notifyRemoved(this, i10, 1);
        }
        return t10;
    }

    @Override // androidx.databinding.ObservableList
    public void removeOnListChangedCallback(ObservableList.OnListChangedCallback onListChangedCallback) {
        ListChangeRegistry listChangeRegistry = this.f20532p0;
        if (listChangeRegistry != null) {
            listChangeRegistry.remove(onListChangedCallback);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public void removeRange(int i10, int i11) {
        super.removeRange(i10, i11);
        int i12 = i11 - i10;
        ListChangeRegistry listChangeRegistry = this.f20532p0;
        if (listChangeRegistry != null) {
            listChangeRegistry.notifyRemoved(this, i10, i12);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T set(int i10, T t10) {
        T t11 = (T) super.set(i10, t10);
        ListChangeRegistry listChangeRegistry = this.f20532p0;
        if (listChangeRegistry != null) {
            listChangeRegistry.notifyChanged(this, i10, 1);
        }
        return t11;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i10, T t10) {
        super.add(i10, t10);
        ListChangeRegistry listChangeRegistry = this.f20532p0;
        if (listChangeRegistry != null) {
            listChangeRegistry.notifyInserted(this, i10, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        boolean zAddAll = super.addAll(i10, collection);
        if (zAddAll) {
            int size = collection.size();
            ListChangeRegistry listChangeRegistry = this.f20532p0;
            if (listChangeRegistry != null) {
                listChangeRegistry.notifyInserted(this, i10, size);
            }
        }
        return zAddAll;
    }
}
