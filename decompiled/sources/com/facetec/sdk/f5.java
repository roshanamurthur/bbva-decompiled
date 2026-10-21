package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f5 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41537p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ aq f41538q0;

    public /* synthetic */ f5(aq aqVar, int i10) {
        this.f41537p0 = i10;
        this.f41538q0 = aqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f41537p0;
        aq aqVar = this.f41538q0;
        switch (i10) {
            case 0:
                ((bj) aqVar).x();
                break;
            case 1:
                ((bo) aqVar).C();
                break;
            case 2:
                ((bz) aqVar).m();
                break;
            case 3:
                ((cn) aqVar).G();
                break;
            default:
                ((co) aqVar).r();
                break;
        }
    }
}
