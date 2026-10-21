package androidx.viewpager2.adapter;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: FragmentStateAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter.d f23955a;

    public a(FragmentStateAdapter.d dVar) {
        this.f23955a = dVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i10) {
        this.f23955a.b(false);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i10) {
        this.f23955a.b(false);
    }
}
