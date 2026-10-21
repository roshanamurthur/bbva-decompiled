package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z2 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f43015p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ be f43016q0;

    public /* synthetic */ z2(be beVar, int i10) {
        this.f43015p0 = i10;
        this.f43016q0 = beVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f43015p0;
        be beVar = this.f43016q0;
        switch (i10) {
            case 0:
                beVar.aW();
                break;
            default:
                beVar.aJ();
                break;
        }
    }
}
