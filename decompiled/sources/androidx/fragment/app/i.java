package androidx.fragment.app;

import androidx.collection.ArrayMap;

/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ b0.e f21721p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ b0.e f21722q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f21723r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ ArrayMap f21724s0;

    public i(b0.e eVar, b0.e eVar2, boolean z10, ArrayMap arrayMap) {
        this.f21721p0 = eVar;
        this.f21722q0 = eVar2;
        this.f21723r0 = z10;
        this.f21724s0 = arrayMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w.a(this.f21721p0.f21687c, this.f21722q0.f21687c, this.f21723r0, this.f21724s0, false);
    }
}
