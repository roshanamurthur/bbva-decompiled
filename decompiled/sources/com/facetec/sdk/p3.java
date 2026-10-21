package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p3 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42767p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ be f42768q0;

    public /* synthetic */ p3(be beVar, int i10) {
        this.f42767p0 = i10;
        this.f42768q0 = beVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42767p0;
        be beVar = this.f42768q0;
        switch (i10) {
            case 0:
                beVar.au();
                break;
            default:
                beVar.ay();
                break;
        }
    }
}
