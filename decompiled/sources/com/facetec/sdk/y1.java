package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42988p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f42989q0;

    public /* synthetic */ y1(Object obj, int i10) {
        this.f42988p0 = i10;
        this.f42989q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42988p0;
        Object obj = this.f42989q0;
        switch (i10) {
            case 0:
                ((ba) obj).v();
                break;
            case 1:
                ((bt) obj).p();
                break;
            case 2:
                ((cc) obj).U();
                break;
            case 3:
                ((bj) obj).A();
                break;
            case 4:
                ((bz) obj).e();
                break;
            default:
                ((cn) obj).J();
                break;
        }
    }
}
