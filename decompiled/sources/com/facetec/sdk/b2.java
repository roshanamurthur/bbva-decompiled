package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b2 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f40445p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f40446q0;

    public /* synthetic */ b2(Object obj, int i10) {
        this.f40445p0 = i10;
        this.f40446q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f40445p0;
        Object obj = this.f40446q0;
        switch (i10) {
            case 0:
                ((ba) obj).C();
                break;
            case 1:
                ((bh) obj).w();
                break;
            case 2:
                ((bv) obj).g();
                break;
            default:
                ((c) obj).a();
                break;
        }
    }
}
