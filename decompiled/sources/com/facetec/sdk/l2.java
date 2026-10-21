package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l2 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42239p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f42240q0;

    public /* synthetic */ l2(Object obj, int i10) {
        this.f42239p0 = i10;
        this.f42240q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42239p0;
        Object obj = this.f42240q0;
        switch (i10) {
            case 0:
                ((bb) obj).o();
                break;
            case 1:
                ((bt) obj).q();
                break;
            case 2:
                ((cc) obj).T();
                break;
            case 3:
                ((az) obj).r();
                break;
            case 4:
                ((bj) obj).H();
                break;
            case 5:
                ((bz) obj).i();
                break;
            case 6:
                ((cn) obj).z();
                break;
            default:
                ((co) obj).t();
                break;
        }
    }
}
