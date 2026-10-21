package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42817p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f42818q0;

    public /* synthetic */ s1(Object obj, int i10) {
        this.f42817p0 = i10;
        this.f42818q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42817p0;
        Object obj = this.f42818q0;
        switch (i10) {
            case 0:
                az.b((bh) obj);
                break;
            case 1:
                ((be) obj).at();
                break;
            case 2:
                ((bt) obj).t();
                break;
            case 3:
                ((cc) obj).v();
                break;
            case 4:
                ((cy) obj).b();
                break;
            case 5:
                ((bz) obj).c();
                break;
            case 6:
                ((cn) obj).y();
                break;
            default:
                ((co) obj).p();
                break;
        }
    }
}
