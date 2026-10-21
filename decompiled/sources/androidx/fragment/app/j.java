package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ FragmentTransitionImpl f21725p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ View f21726q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Rect f21727r0;

    public j(FragmentTransitionImpl fragmentTransitionImpl, View view, Rect rect) {
        this.f21725p0 = fragmentTransitionImpl;
        this.f21726q0 = view;
        this.f21727r0 = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21725p0.getBoundsOnScreen(this.f21726q0, this.f21727r0);
    }
}
