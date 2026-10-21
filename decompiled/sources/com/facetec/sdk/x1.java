package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class x1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42955p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f42956q0;

    public /* synthetic */ x1(Object obj, int i10) {
        this.f42955p0 = i10;
        this.f42956q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f42955p0;
        Object obj = this.f42956q0;
        switch (i10) {
            case 0:
                ((ba) obj).x();
                break;
            case 1:
                ((be) obj).aT();
                break;
            case 2:
                ((bt) obj).x();
                break;
            case 3:
                ((cc) obj).W();
                break;
            case 4:
                ((bj) obj).z();
                break;
            default:
                ((cn) obj).D();
                break;
        }
    }
}
