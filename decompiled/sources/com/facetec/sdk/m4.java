package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m4 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42400p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ be f42401q0;

    public /* synthetic */ m4(be beVar, int i10) {
        this.f42400p0 = i10;
        this.f42401q0 = beVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42400p0;
        be beVar = this.f42401q0;
        switch (i10) {
            case 0:
                beVar.aG();
                break;
            case 1:
                beVar.aV();
                break;
            case 2:
                beVar.ar();
                break;
            default:
                beVar.u();
                break;
        }
    }
}
