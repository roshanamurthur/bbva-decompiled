package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k4 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41972p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ be f41973q0;

    public /* synthetic */ k4(be beVar, int i10) {
        this.f41972p0 = i10;
        this.f41973q0 = beVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f41972p0;
        be beVar = this.f41973q0;
        switch (i10) {
            case 0:
                beVar.V();
                break;
            default:
                beVar.aA();
                break;
        }
    }
}
