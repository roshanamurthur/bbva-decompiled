package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f3 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41533p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f41534q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f41535r0;

    public /* synthetic */ f3(Object obj, Object obj2, int i10) {
        this.f41533p0 = i10;
        this.f41534q0 = obj;
        this.f41535r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f41533p0;
        Object obj = this.f41535r0;
        Object obj2 = this.f41534q0;
        switch (i10) {
            case 0:
                ((be) obj2).h((FaceTecIDScanNextStep) obj);
                break;
            case 1:
                ((co) obj2).b((aq.b) obj);
                break;
            default:
                ((v) obj2).a((Runnable) obj);
                break;
        }
    }
}
