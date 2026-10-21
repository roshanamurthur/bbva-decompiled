package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.google.android.material.internal.MaterialCheckable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UiThread
public class CheckableGroup<T extends MaterialCheckable<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f44769a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f44770b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OnCheckedStateChangeListener f44771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f44772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44773e;

    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(@NonNull Set<Integer> set);
    }

    public class a implements MaterialCheckable.OnCheckedChangeListener<T> {
        public a() {
        }

        @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
        public final void onCheckedChanged(Object obj, boolean z10) {
            MaterialCheckable<T> materialCheckable = (MaterialCheckable) obj;
            CheckableGroup checkableGroup = CheckableGroup.this;
            if (z10) {
                if (!checkableGroup.a(materialCheckable)) {
                    return;
                }
            } else if (!checkableGroup.b(materialCheckable, checkableGroup.f44773e)) {
                return;
            }
            OnCheckedStateChangeListener onCheckedStateChangeListener = checkableGroup.f44771c;
            if (onCheckedStateChangeListener != null) {
                onCheckedStateChangeListener.onCheckedStateChanged(checkableGroup.getCheckedIds());
            }
        }
    }

    public final boolean a(@NonNull MaterialCheckable<T> materialCheckable) {
        int id = materialCheckable.getId();
        HashSet hashSet = this.f44770b;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        MaterialCheckable<T> materialCheckable2 = (MaterialCheckable) this.f44769a.get(Integer.valueOf(getSingleCheckedId()));
        if (materialCheckable2 != null) {
            b(materialCheckable2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return zAdd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addCheckable(T t10) {
        this.f44769a.put(Integer.valueOf(t10.getId()), t10);
        if (t10.isChecked()) {
            a(t10);
        }
        t10.setInternalOnCheckedChangeListener(new a());
    }

    public final boolean b(@NonNull MaterialCheckable<T> materialCheckable, boolean z10) {
        int id = materialCheckable.getId();
        HashSet hashSet = this.f44770b;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z10 && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return zRemove;
    }

    public void check(@IdRes int i10) {
        OnCheckedStateChangeListener onCheckedStateChangeListener;
        MaterialCheckable<T> materialCheckable = (MaterialCheckable) this.f44769a.get(Integer.valueOf(i10));
        if (materialCheckable == null || !a(materialCheckable) || (onCheckedStateChangeListener = this.f44771c) == null) {
            return;
        }
        onCheckedStateChangeListener.onCheckedStateChanged(getCheckedIds());
    }

    public void clearCheck() {
        OnCheckedStateChangeListener onCheckedStateChangeListener;
        boolean z10 = !this.f44770b.isEmpty();
        Iterator it = this.f44769a.values().iterator();
        while (it.hasNext()) {
            b((MaterialCheckable) it.next(), false);
        }
        if (!z10 || (onCheckedStateChangeListener = this.f44771c) == null) {
            return;
        }
        onCheckedStateChangeListener.onCheckedStateChanged(getCheckedIds());
    }

    @NonNull
    public Set<Integer> getCheckedIds() {
        return new HashSet(this.f44770b);
    }

    @NonNull
    public List<Integer> getCheckedIdsSortedByChildOrder(@NonNull ViewGroup viewGroup) {
        Set<Integer> checkedIds = getCheckedIds();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof MaterialCheckable) && checkedIds.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @IdRes
    public int getSingleCheckedId() {
        if (this.f44772d) {
            HashSet hashSet = this.f44770b;
            if (!hashSet.isEmpty()) {
                return ((Integer) hashSet.iterator().next()).intValue();
            }
        }
        return -1;
    }

    public boolean isSelectionRequired() {
        return this.f44773e;
    }

    public boolean isSingleSelection() {
        return this.f44772d;
    }

    public void removeCheckable(T t10) {
        t10.setInternalOnCheckedChangeListener(null);
        this.f44769a.remove(Integer.valueOf(t10.getId()));
        this.f44770b.remove(Integer.valueOf(t10.getId()));
    }

    public void setOnCheckedStateChangeListener(@Nullable OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.f44771c = onCheckedStateChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f44773e = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f44772d != z10) {
            this.f44772d = z10;
            clearCheck();
        }
    }

    public void uncheck(@IdRes int i10) {
        OnCheckedStateChangeListener onCheckedStateChangeListener;
        MaterialCheckable<T> materialCheckable = (MaterialCheckable) this.f44769a.get(Integer.valueOf(i10));
        if (materialCheckable == null || !b(materialCheckable, this.f44773e) || (onCheckedStateChangeListener = this.f44771c) == null) {
            return;
        }
        onCheckedStateChangeListener.onCheckedStateChanged(getCheckedIds());
    }
}
