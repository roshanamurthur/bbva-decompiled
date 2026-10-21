package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y5 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42994p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ aq f42995q0;

    public /* synthetic */ y5(aq aqVar, int i10) {
        this.f42994p0 = i10;
        this.f42995q0 = aqVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42994p0;
        aq aqVar = this.f42995q0;
        switch (i10) {
            case 0:
                ((bo) aqVar).x();
                break;
            case 1:
                ((c) aqVar).d();
                break;
            case 2:
                ((cn) aqVar).L();
                break;
            default:
                ((ct) aqVar).e();
                break;
        }
    }
}
