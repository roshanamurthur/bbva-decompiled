package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h5 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41859p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ bj f41860q0;

    public /* synthetic */ h5(bj bjVar, int i10) {
        this.f41859p0 = i10;
        this.f41860q0 = bjVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f41859p0;
        bj bjVar = this.f41860q0;
        switch (i10) {
            case 0:
                bjVar.D();
                break;
            default:
                bjVar.K();
                break;
        }
    }
}
