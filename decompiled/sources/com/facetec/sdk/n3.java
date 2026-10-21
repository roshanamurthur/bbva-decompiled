package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n3 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42653p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f42654q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f42655r0;

    public /* synthetic */ n3(Object obj, boolean z10, int i10) {
        this.f42653p0 = i10;
        this.f42655r0 = obj;
        this.f42654q0 = z10;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42653p0;
        boolean z10 = this.f42654q0;
        Object obj = this.f42655r0;
        switch (i10) {
            case 0:
                ((be) obj).j(z10);
                break;
            default:
                ((co) obj).a(z10);
                break;
        }
    }
}
