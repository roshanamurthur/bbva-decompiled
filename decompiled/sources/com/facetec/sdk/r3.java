package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r3 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42805p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ be f42806q0;

    public /* synthetic */ r3(be beVar, int i10) {
        this.f42805p0 = i10;
        this.f42806q0 = beVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42805p0;
        be beVar = this.f42806q0;
        switch (i10) {
            case 0:
                beVar.ak();
                break;
            default:
                beVar.aq();
                break;
        }
    }
}
