package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i3 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41872p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f41873q0;

    public /* synthetic */ i3(Object obj, int i10) {
        this.f41872p0 = i10;
        this.f41873q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f41872p0;
        Object obj = this.f41873q0;
        switch (i10) {
            case 0:
                ((be) obj).ai();
                break;
            case 1:
                ((bt) obj).l();
                break;
            case 2:
                ((cc) obj).D();
                break;
            case 3:
                ((bj) obj).M();
                break;
            case 4:
                ((cn) obj).K();
                break;
            case 5:
                ((co) obj).f();
                break;
            default:
                ((cz) obj).c();
                break;
        }
    }
}
