package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41850p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f41851q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f41852r0;

    public /* synthetic */ h1(Object obj, Object obj2, int i10) {
        this.f41850p0 = i10;
        this.f41851q0 = obj;
        this.f41852r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f41850p0;
        Object obj = this.f41852r0;
        Object obj2 = this.f41851q0;
        switch (i10) {
            case 0:
                at.a((at.c) obj2, (at.a) obj);
                break;
            default:
                ((bo) obj2).d((Runnable) obj);
                break;
        }
    }
}
