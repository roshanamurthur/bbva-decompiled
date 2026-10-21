package androidx.fragment.app;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ List f21702p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ b0.e f21703q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ c f21704r0;

    public d(c cVar, ArrayList arrayList, b0.e eVar) {
        this.f21704r0 = cVar;
        this.f21702p0 = arrayList;
        this.f21703q0 = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.f21702p0;
        b0.e eVar = this.f21703q0;
        if (list.contains(eVar)) {
            list.remove(eVar);
            this.f21704r0.getClass();
            eVar.f21685a.a(eVar.f21687c.mView);
        }
    }
}
