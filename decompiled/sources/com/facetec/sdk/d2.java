package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d2 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41133p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ aq f41134q0;

    public /* synthetic */ d2(aq aqVar, int i10) {
        this.f41133p0 = i10;
        this.f41134q0 = aqVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f41133p0;
        aq aqVar = this.f41134q0;
        switch (i10) {
            case 0:
                ((ba) aqVar).u();
                break;
            case 1:
                ((bj) aqVar).J();
                break;
            case 2:
                ((bo) aqVar).A();
                break;
            case 3:
                ((c) aqVar).e();
                break;
            default:
                ((co) aqVar).g();
                break;
        }
    }
}
