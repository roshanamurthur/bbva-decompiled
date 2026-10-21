package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j3 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41889p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ be f41890q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f41891r0;

    public /* synthetic */ j3(be beVar, String str, int i10) {
        this.f41889p0 = i10;
        this.f41890q0 = beVar;
        this.f41891r0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f41889p0;
        String str = this.f41891r0;
        be beVar = this.f41890q0;
        switch (i10) {
            case 0:
                beVar.a(str);
                break;
            default:
                beVar.i(str);
                break;
        }
    }
}
