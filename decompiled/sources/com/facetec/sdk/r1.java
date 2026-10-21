package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42802p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f42803q0;

    public /* synthetic */ r1(Object obj, int i10) {
        this.f42802p0 = i10;
        this.f42803q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42802p0;
        Object obj = this.f42803q0;
        switch (i10) {
            case 0:
                az.c((bh) obj);
                break;
            case 1:
                ((bt) obj).h();
                break;
            case 2:
                ((cc) obj).w();
                break;
            case 3:
                ((cy) obj).j();
                break;
            case 4:
                ((bj) obj).N();
                break;
            case 5:
                ((cn) obj).E();
                break;
            default:
                ((co) obj).e();
                break;
        }
    }
}
