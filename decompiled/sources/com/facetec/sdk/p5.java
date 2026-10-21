package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p5 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42771p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f42772q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f42773r0;

    public /* synthetic */ p5(Object obj, Object obj2, int i10) {
        this.f42771p0 = i10;
        this.f42772q0 = obj;
        this.f42773r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f42771p0;
        Object obj = this.f42773r0;
        Object obj2 = this.f42772q0;
        switch (i10) {
            case 0:
                ((bk) obj2).c((Runnable) obj);
                break;
            default:
                ((dr.a) obj2).c();
                break;
        }
    }
}
