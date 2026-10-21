package androidx.viewpager2.adapter;

/* JADX INFO: compiled from: FragmentStateAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends FragmentStateAdapter.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter.d f23956a;

    public b(FragmentStateAdapter.d dVar) {
        this.f23956a = dVar;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter.c, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        this.f23956a.b(true);
    }
}
