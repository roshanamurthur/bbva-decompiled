package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i2 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41870p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f41871q0;

    public /* synthetic */ i2(Object obj, int i10) {
        this.f41870p0 = i10;
        this.f41871q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f41870p0;
        Object obj = this.f41871q0;
        switch (i10) {
            case 0:
                ((bb) obj).l();
                break;
            case 1:
                ((cc) obj).V();
                break;
            case 2:
                ((az) obj).t();
                break;
            case 3:
                ((bj) obj).E();
                break;
            case 4:
                ((bz) obj).d();
                break;
            default:
                ((cn) obj).N();
                break;
        }
    }
}
