package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v2 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42919p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ be f42920q0;

    public /* synthetic */ v2(be beVar, int i10) {
        this.f42919p0 = i10;
        this.f42920q0 = beVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42919p0;
        be beVar = this.f42920q0;
        switch (i10) {
            case 0:
                beVar.aj();
                break;
            case 1:
                beVar.av();
                break;
            default:
                beVar.aK();
                break;
        }
    }
}
