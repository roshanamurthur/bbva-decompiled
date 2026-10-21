package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41885p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ aq f41886q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f41887r0;

    public /* synthetic */ j1(aq aqVar, Object obj, int i10) {
        this.f41885p0 = i10;
        this.f41886q0 = aqVar;
        this.f41887r0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f41885p0;
        Object obj = this.f41887r0;
        aq aqVar = this.f41886q0;
        switch (i10) {
            case 0:
                ((az) aqVar).i((bh) obj);
                break;
            default:
                ((co) aqVar).f((Runnable) obj);
                break;
        }
    }
}
