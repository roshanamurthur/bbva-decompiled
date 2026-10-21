package androidx.databinding;

import androidx.collection.ArrayMap;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableArrayMap<K, V> extends ArrayMap<K, V> implements ObservableMap<K, V> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient MapChangeRegistry f20533p0;

    @Override // androidx.databinding.ObservableMap
    public void addOnMapChangedCallback(ObservableMap.OnMapChangedCallback<? extends ObservableMap<K, V>, K, V> onMapChangedCallback) {
        if (this.f20533p0 == null) {
            this.f20533p0 = new MapChangeRegistry();
        }
        this.f20533p0.add(onMapChangedCallback);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public void clear() {
        if (isEmpty()) {
            return;
        }
        super.clear();
        MapChangeRegistry mapChangeRegistry = this.f20533p0;
        if (mapChangeRegistry != null) {
            mapChangeRegistry.notifyCallbacks(this, 0, null);
        }
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V put(K k10, V v3) {
        super.put(k10, v3);
        MapChangeRegistry mapChangeRegistry = this.f20533p0;
        if (mapChangeRegistry != null) {
            mapChangeRegistry.notifyCallbacks(this, 0, k10);
        }
        return v3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.ArrayMap
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            int iIndexOfKey = indexOfKey(it.next());
            if (iIndexOfKey >= 0) {
                removeAt(iIndexOfKey);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // androidx.collection.SimpleArrayMap
    public V removeAt(int i10) {
        MapChangeRegistry mapChangeRegistry;
        K kKeyAt = keyAt(i10);
        V v3 = (V) super.removeAt(i10);
        if (v3 != null && (mapChangeRegistry = this.f20533p0) != null) {
            mapChangeRegistry.notifyCallbacks(this, 0, kKeyAt);
        }
        return v3;
    }

    @Override // androidx.databinding.ObservableMap
    public void removeOnMapChangedCallback(ObservableMap.OnMapChangedCallback<? extends ObservableMap<K, V>, K, V> onMapChangedCallback) {
        MapChangeRegistry mapChangeRegistry = this.f20533p0;
        if (mapChangeRegistry != null) {
            mapChangeRegistry.remove(onMapChangedCallback);
        }
    }

    @Override // androidx.collection.ArrayMap
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int size = getSize() - 1; size >= 0; size--) {
            if (!collection.contains(keyAt(size))) {
                removeAt(size);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // androidx.collection.SimpleArrayMap
    public V setValueAt(int i10, V v3) {
        K kKeyAt = keyAt(i10);
        V v6 = (V) super.setValueAt(i10, v3);
        MapChangeRegistry mapChangeRegistry = this.f20533p0;
        if (mapChangeRegistry != null) {
            mapChangeRegistry.notifyCallbacks(this, 0, kKeyAt);
        }
        return v6;
    }
}
