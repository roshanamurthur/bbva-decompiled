package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g3 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41734p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f41735q0;

    public /* synthetic */ g3(Object obj, int i10) {
        this.f41734p0 = i10;
        this.f41735q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f41734p0;
        Object obj = this.f41735q0;
        switch (i10) {
            case 0:
                ((be) obj).am();
                break;
            case 1:
                ((bt) obj).k();
                break;
            case 2:
                ((cc) obj).x();
                break;
            case 3:
                ((bz) obj).l();
                break;
            case 4:
                ((cn) obj).w();
                break;
            default:
                ((co) obj).m();
                break;
        }
    }
}
