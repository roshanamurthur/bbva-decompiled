package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b4 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f40449p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ be f40450q0;

    public /* synthetic */ b4(be beVar, int i10) {
        this.f40449p0 = i10;
        this.f40450q0 = beVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f40449p0;
        be beVar = this.f40450q0;
        switch (i10) {
            case 0:
                beVar.al();
                break;
            default:
                beVar.ax();
                break;
        }
    }
}
