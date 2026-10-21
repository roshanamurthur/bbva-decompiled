package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n4 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42656p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ be f42657q0;

    public /* synthetic */ n4(be beVar, int i10) {
        this.f42656p0 = i10;
        this.f42657q0 = beVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f42656p0;
        be beVar = this.f42657q0;
        switch (i10) {
            case 0:
                beVar.aD();
                break;
            case 1:
                beVar.aI();
                break;
            default:
                beVar.aH();
                break;
        }
    }
}
