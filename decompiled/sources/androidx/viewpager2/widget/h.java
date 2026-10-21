package androidx.viewpager2.widget;

/* JADX INFO: compiled from: ViewPager2.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends ViewPager2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager2.g f24012a;

    public h(ViewPager2.g gVar) {
        this.f24012a = gVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        this.f24012a.b();
    }
}
