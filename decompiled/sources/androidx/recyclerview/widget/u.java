package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: RecyclerView.java */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements b.InterfaceC0101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f23086a;

    public u(RecyclerView recyclerView) {
        this.f23086a = recyclerView;
    }

    public final void a(int i10) {
        RecyclerView recyclerView = this.f23086a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.m(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }
}
