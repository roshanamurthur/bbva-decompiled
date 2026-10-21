package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t0 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42859p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f42860q0;

    public /* synthetic */ t0(Object obj, int i10) {
        this.f42859p0 = i10;
        this.f42860q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42859p0;
        Object obj = this.f42860q0;
        switch (i10) {
            case 0:
                ((al) obj).t();
                break;
            case 1:
                ((be) obj).an();
                break;
            case 2:
                ((bt) obj).j();
                break;
            case 3:
                ((bo) obj).t();
                break;
            default:
                ((co) obj).i();
                break;
        }
    }
}
