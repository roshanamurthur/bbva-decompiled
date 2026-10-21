package androidx.coordinatorlayout.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class DirectedAcyclicGraph<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pools.SimplePool f19840a = new Pools.SimplePool(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SimpleArrayMap<T, ArrayList<T>> f19841b = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<T> f19842c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet<T> f19843d = new HashSet<>();

    public final void a(T t10, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t10)) {
            return;
        }
        if (hashSet.contains(t10)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t10);
        ArrayList<T> arrayList2 = this.f19841b.get(t10);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                a(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(t10);
        arrayList.add(t10);
    }

    public void addEdge(@NonNull T t10, @NonNull T t11) {
        SimpleArrayMap<T, ArrayList<T>> simpleArrayMap = this.f19841b;
        if (!simpleArrayMap.containsKey(t10) || !simpleArrayMap.containsKey(t11)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = simpleArrayMap.get(t10);
        if (arrayList == null) {
            arrayList = (ArrayList) this.f19840a.acquire();
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            simpleArrayMap.put(t10, arrayList);
        }
        arrayList.add(t11);
    }

    public void addNode(@NonNull T t10) {
        SimpleArrayMap<T, ArrayList<T>> simpleArrayMap = this.f19841b;
        if (simpleArrayMap.containsKey(t10)) {
            return;
        }
        simpleArrayMap.put(t10, null);
    }

    public void clear() {
        SimpleArrayMap<T, ArrayList<T>> simpleArrayMap = this.f19841b;
        int size = simpleArrayMap.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListValueAt = simpleArrayMap.valueAt(i10);
            if (arrayListValueAt != null) {
                arrayListValueAt.clear();
                this.f19840a.release(arrayListValueAt);
            }
        }
        simpleArrayMap.clear();
    }

    public boolean contains(@NonNull T t10) {
        return this.f19841b.containsKey(t10);
    }

    @Nullable
    public List getIncomingEdges(@NonNull T t10) {
        return this.f19841b.get(t10);
    }

    @Nullable
    public List<T> getOutgoingEdges(@NonNull T t10) {
        SimpleArrayMap<T, ArrayList<T>> simpleArrayMap = this.f19841b;
        int size = simpleArrayMap.getSize();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListValueAt = simpleArrayMap.valueAt(i10);
            if (arrayListValueAt != null && arrayListValueAt.contains(t10)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(simpleArrayMap.keyAt(i10));
            }
        }
        return arrayList;
    }

    @NonNull
    public ArrayList<T> getSortedList() {
        ArrayList<T> arrayList = this.f19842c;
        arrayList.clear();
        HashSet<T> hashSet = this.f19843d;
        hashSet.clear();
        SimpleArrayMap<T, ArrayList<T>> simpleArrayMap = this.f19841b;
        int size = simpleArrayMap.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            a(simpleArrayMap.keyAt(i10), arrayList, hashSet);
        }
        return arrayList;
    }

    public boolean hasOutgoingEdges(@NonNull T t10) {
        SimpleArrayMap<T, ArrayList<T>> simpleArrayMap = this.f19841b;
        int size = simpleArrayMap.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListValueAt = simpleArrayMap.valueAt(i10);
            if (arrayListValueAt != null && arrayListValueAt.contains(t10)) {
                return true;
            }
        }
        return false;
    }
}
