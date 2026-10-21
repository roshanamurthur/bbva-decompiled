package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class SharedValues {
    public static final int UNSET = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseIntArray f19799a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<Integer, HashSet<WeakReference<SharedValuesListener>>> f19800b = new HashMap<>();

    public interface SharedValuesListener {
        void onNewValue(int i10, int i11, int i12);
    }

    public void addListener(int i10, SharedValuesListener sharedValuesListener) {
        HashMap<Integer, HashSet<WeakReference<SharedValuesListener>>> map = this.f19800b;
        HashSet<WeakReference<SharedValuesListener>> hashSet = map.get(Integer.valueOf(i10));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            map.put(Integer.valueOf(i10), hashSet);
        }
        hashSet.add(new WeakReference<>(sharedValuesListener));
    }

    public void clearListeners() {
        this.f19800b.clear();
    }

    public void fireNewValue(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f19799a;
        int i12 = sparseIntArray.get(i10, -1);
        if (i12 == i11) {
            return;
        }
        sparseIntArray.put(i10, i11);
        HashSet<WeakReference<SharedValuesListener>> hashSet = this.f19800b.get(Integer.valueOf(i10));
        if (hashSet == null) {
            return;
        }
        Iterator<WeakReference<SharedValuesListener>> it = hashSet.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            SharedValuesListener sharedValuesListener = it.next().get();
            if (sharedValuesListener != null) {
                sharedValuesListener.onNewValue(i10, i11, i12);
            } else {
                z10 = true;
            }
        }
        if (z10) {
            ArrayList arrayList = new ArrayList();
            for (WeakReference<SharedValuesListener> weakReference : hashSet) {
                if (weakReference.get() == null) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
    }

    public int getValue(int i10) {
        return this.f19799a.get(i10, -1);
    }

    public void removeListener(int i10, SharedValuesListener sharedValuesListener) {
        HashSet<WeakReference<SharedValuesListener>> hashSet = this.f19800b.get(Integer.valueOf(i10));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (WeakReference<SharedValuesListener> weakReference : hashSet) {
            SharedValuesListener sharedValuesListener2 = weakReference.get();
            if (sharedValuesListener2 == null || sharedValuesListener2 == sharedValuesListener) {
                arrayList.add(weakReference);
            }
        }
        hashSet.removeAll(arrayList);
    }

    public void removeListener(SharedValuesListener sharedValuesListener) {
        Iterator<Integer> it = this.f19800b.keySet().iterator();
        while (it.hasNext()) {
            removeListener(it.next().intValue(), sharedValuesListener);
        }
    }
}
