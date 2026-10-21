package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SortedListAdapterCallback<T2> extends SortedList.Callback<T2> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final RecyclerView.Adapter<?> f22881p0;

    public SortedListAdapterCallback(@SuppressLint({"UnknownNullness", "MissingNullability"}) RecyclerView.Adapter<?> adapter) {
        this.f22881p0 = adapter;
    }

    @Override // androidx.recyclerview.widget.SortedList.Callback
    public void onChanged(int i10, int i11) {
        this.f22881p0.notifyItemRangeChanged(i10, i11);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i10, int i11) {
        this.f22881p0.notifyItemRangeInserted(i10, i11);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i10, int i11) {
        this.f22881p0.notifyItemMoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i10, int i11) {
        this.f22881p0.notifyItemRangeRemoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i10, int i11, Object obj) {
        this.f22881p0.notifyItemRangeChanged(i10, i11, obj);
    }
}
