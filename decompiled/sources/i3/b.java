package i3;

import androidx.viewpager2.adapter.FragmentStateAdapter;

/* JADX INFO: compiled from: FragmentStateAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f69500p0;

    public b(FragmentStateAdapter fragmentStateAdapter) {
        this.f69500p0 = fragmentStateAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentStateAdapter fragmentStateAdapter = this.f69500p0;
        fragmentStateAdapter.v0 = false;
        fragmentStateAdapter.b();
    }
}
