package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;

/* JADX INFO: compiled from: NestedAdapterWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ViewTypeStorage.ViewTypeLookup f23078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final StableIdStorage.StableIdLookup f23079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView.Adapter<RecyclerView.ViewHolder> f23080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f23081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f23083f;

    /* JADX INFO: compiled from: NestedAdapterWrapper.java */
    public interface b {
    }

    public s(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter, b bVar, ViewTypeStorage viewTypeStorage, StableIdStorage.StableIdLookup stableIdLookup) {
        a aVar = new a();
        this.f23083f = aVar;
        this.f23080c = adapter;
        this.f23081d = bVar;
        this.f23078a = viewTypeStorage.createViewTypeWrapper(this);
        this.f23079b = stableIdLookup;
        this.f23082e = adapter.getItemCount();
        adapter.registerAdapterDataObserver(aVar);
    }

    /* JADX INFO: compiled from: NestedAdapterWrapper.java */
    public class a extends RecyclerView.AdapterDataObserver {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onChanged() {
            s sVar = s.this;
            sVar.f23082e = sVar.f23080c.getItemCount();
            c cVar = (c) sVar.f23081d;
            cVar.f22963a.notifyDataSetChanged();
            cVar.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11) {
            s sVar = s.this;
            c cVar = (c) sVar.f23081d;
            cVar.f22963a.notifyItemRangeChanged(i10 + cVar.c(sVar), i11, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i10, int i11) {
            s sVar = s.this;
            sVar.f23082e += i11;
            c cVar = (c) sVar.f23081d;
            cVar.f22963a.notifyItemRangeInserted(i10 + cVar.c(sVar), i11);
            if (sVar.f23082e <= 0 || sVar.f23080c.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            ((c) sVar.f23081d).b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            Preconditions.checkArgument(i12 == 1, "moving more than 1 item is not supported in RecyclerView");
            s sVar = s.this;
            c cVar = (c) sVar.f23081d;
            int iC = cVar.c(sVar);
            cVar.f22963a.notifyItemMoved(i10 + iC, i11 + iC);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i10, int i11) {
            s sVar = s.this;
            sVar.f23082e -= i11;
            c cVar = (c) sVar.f23081d;
            cVar.f22963a.notifyItemRangeRemoved(i10 + cVar.c(sVar), i11);
            if (sVar.f23082e >= 1 || sVar.f23080c.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            ((c) sVar.f23081d).b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onStateRestorationPolicyChanged() {
            ((c) s.this.f23081d).b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11, @Nullable Object obj) {
            s sVar = s.this;
            c cVar = (c) sVar.f23081d;
            cVar.f22963a.notifyItemRangeChanged(i10 + cVar.c(sVar), i11, obj);
        }
    }
}
