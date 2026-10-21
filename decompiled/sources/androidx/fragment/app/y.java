package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* JADX INFO: compiled from: FragmentTransitionImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f21794p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f21795q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f21796r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f21797s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f21798t0;

    public y(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f21794p0 = i10;
        this.f21795q0 = arrayList;
        this.f21796r0 = arrayList2;
        this.f21797s0 = arrayList3;
        this.f21798t0 = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i10 = 0; i10 < this.f21794p0; i10++) {
            ViewCompat.setTransitionName((View) this.f21795q0.get(i10), (String) this.f21796r0.get(i10));
            ViewCompat.setTransitionName((View) this.f21797s0.get(i10), (String) this.f21798t0.get(i10));
        }
    }
}
