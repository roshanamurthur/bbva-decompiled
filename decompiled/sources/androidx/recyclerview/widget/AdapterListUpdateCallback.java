package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AdapterListUpdateCallback implements ListUpdateCallback {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final RecyclerView.Adapter f22529p0;

    public AdapterListUpdateCallback(@NonNull RecyclerView.Adapter adapter) {
        this.f22529p0 = adapter;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i10, int i11, Object obj) {
        this.f22529p0.notifyItemRangeChanged(i10, i11, obj);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i10, int i11) {
        this.f22529p0.notifyItemRangeInserted(i10, i11);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i10, int i11) {
        this.f22529p0.notifyItemMoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i10, int i11) {
        this.f22529p0.notifyItemRangeRemoved(i10, i11);
    }
}
