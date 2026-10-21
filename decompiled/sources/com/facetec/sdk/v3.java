package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v3 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42921p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ be f42922q0;

    public /* synthetic */ v3(be beVar, int i10) {
        this.f42921p0 = i10;
        this.f42922q0 = beVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f42921p0;
        be beVar = this.f42922q0;
        switch (i10) {
            case 0:
                beVar.aF();
                break;
            default:
                beVar.aM();
                break;
        }
    }
}
