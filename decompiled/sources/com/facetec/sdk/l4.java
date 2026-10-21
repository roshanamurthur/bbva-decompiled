package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l4 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42243p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ be f42244q0;

    public /* synthetic */ l4(be beVar, int i10) {
        this.f42243p0 = i10;
        this.f42244q0 = beVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42243p0;
        be beVar = this.f42244q0;
        switch (i10) {
            case 0:
                beVar.aE();
                break;
            case 1:
                beVar.aR();
                break;
            default:
                beVar.aC();
                break;
        }
    }
}
