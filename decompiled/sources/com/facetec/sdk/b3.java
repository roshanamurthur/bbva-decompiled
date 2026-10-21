package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b3 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f40447p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ be f40448q0;

    public /* synthetic */ b3(be beVar, int i10) {
        this.f40447p0 = i10;
        this.f40448q0 = beVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f40447p0;
        be beVar = this.f40448q0;
        switch (i10) {
            case 0:
                beVar.H();
                break;
            case 1:
                beVar.aL();
                break;
            default:
                beVar.aP();
                break;
        }
    }
}
