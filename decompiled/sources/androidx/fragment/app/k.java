package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f21728p0;

    public k(ArrayList arrayList) {
        this.f21728p0 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w.b(this.f21728p0, 4);
    }
}
